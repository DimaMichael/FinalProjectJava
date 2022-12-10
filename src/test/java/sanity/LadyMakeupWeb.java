package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class LadyMakeupWeb extends CommonOps {

    @Test(description = "Test01 - Verify Hello Header")
    @Description("This test login and verifies the hello header")
    public void test01_verify_HelloHeader(){
        WebFlows.login("DimArbazi", "123456Dima!");
        Verifications.verifyTextInElement(ladyMakeupMain.hello_userName, "Hello DimArbazi!");
    }

    @Test(description = "Test02 - Verify Move To MakeupBoxes")
    @Description("This test verifies the navigate to MakeupBoxes page")
    public void test02_moveTo_makeupBoxes() throws InterruptedException {
        WebFlows.makeupChoose();
        Verifications.verifyTextInElement(makeupBoxesPage.product_title, "CASES FOR COSMETICS, MAKE-UP TABLES");
    }

    @Test(description = "Test03 - Verify Order Item")
    @Description("This test verifies the order item")
    public void test03_verify_orderItem() throws InterruptedException {
        WebFlows.orderItem();
        Verifications.verifyTextInElement(makeupBoxesPage.text_numberOfProducts, "1");
    }
    @Test(description = "Test04 - Verify Order Item Deletion")
    @Description("This test verifies the item deletion")
    public void test04_verify_orderItemDeletion() throws InterruptedException {
        WebFlows.deleteItem();
        Verifications.verifyTextInElement(ladyMakeupCartPage.text_verifyItemDeleted, "The product has been removed");
    }

    @Test(description = "Test05 - Verify Information Bar")
    @Description("This test verifies the information bar are displayed (using soft assertion")
    public void test05_verify_informationBar() throws InterruptedException {
        Verifications.visibilityOfElements(ladyMakeupMain.list_informationBar);
    }

    @Test(description = "Test06 - Verify Logo Image")
    @Description("This test verifies the logo image (using sikuli tool")
    public void test06_verify_logoImage() throws InterruptedException {
        Verifications.visualElement("LadymakeupLogo");
    }

    @Test(description = "Test07 - Verify Item Amount ", dataProvider = "data-provider-items", dataProviderClass = utilities.ManageDDT.class)
    @Description("This test verifies amount of same item")
    public void test07_verify_itemAmount(String amount , String expected) throws InterruptedException {
        WebFlows.chooseManyItems(amount);
        Verifications.verifyTextInElement(ladyMakeupCartPage.text_numberOfProductsInCart, expected);
    }



}
