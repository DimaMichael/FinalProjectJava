package workflows;

import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import org.python.antlr.ast.Str;
import utilities.CommonOps;

import java.util.List;


public class WebFlows extends CommonOps {

    @Step("Business Flow: Login to Web")
    public static void login(String user, String pass) {
        UIActions.updateText(ladyMakeupLogin.txt_username, user); 
        UIActions.updateText(ladyMakeupLogin.txt_password, pass); 
        UIActions.click(ladyMakeupLogin.btn_login);
    }

    @Step("Business Flow: Login to Web with DB Credentials")
    public static void loginDB() {
        String query = "SELECT name, password FROM Employees WHERE id='4'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(ladyMakeupLogin.txt_username, cred.get(0));
        UIActions.updateText(ladyMakeupLogin.txt_password, cred.get(1));
        UIActions.click(ladyMakeupLogin.btn_login);
    }

    @Step("Business Flow: Choose a Makeup")
    public static void makeupChoose() throws InterruptedException {
        UIActions.mouseHover(ladyMakeupCategoryNavbar.btn_accessories);
        UIActions.click(ladyMakeupAccessories.btn_makeup_boxes);
    }

    @Step("Business Flow: Order Item")
    public static void orderItem() throws InterruptedException {
        UIActions.click(makeupBoxesPage.btn_order);

    }

    @Step("Business Flow: Delete Last Item")
    public static void deleteItem() throws InterruptedException {
        UIActions.click(ladyMakeupMain.btn_cart);
        Thread.sleep(2000);
        UIActions.click(ladyMakeupCartPage.btn_deleteItem);
        Thread.sleep(2000);
        UIActions.alertAccept();
    }

    @Step("Business Flow: Choose 4 Items ") 
    public static void chooseManyItems(String amount) throws InterruptedException {
        UIActions.mouseHover(ladyMakeupCategoryNavbar.btn_accessories);
        UIActions.click(ladyMakeupAccessories.btn_puffs_and_sponges);
        UIActions.click(makeupPuffsAndSpongesPage.btn_orderPuff);
        UIActions.click(ladyMakeupMain.btn_cart);
        UIActions.updateDropDown(ladyMakeupCartPage.btn_amountOfProducts, amount);
        UIActions.click(ladyMakeupCartPage.btn_saveChanges);
        UIActions.click(ladyMakeupCartPage.btn_deleteItem);
        UIActions.alertAccept();
    }
    
   @Step("Business Flow: Search And Verify Item") 
   public static void searchAndVerifyItem(String itemName ,String shouldExist) {
       UIActions.updateText(ladyMakeupMain.txt_search, itemName);
       UIActions.click(ladyMakeupMain.btn_searchSubmit);
       if (shouldExist.equalsIgnoreCase("not exist"))
           Verifications.existenceOfElement(ladyMakeupMain.txt_afterSearchNotExist);
       else if (shouldExist.equalsIgnoreCase("exist"))
           Verifications.notExistenceOfElement(ladyMakeupMain.txt_afterSearchNotExist);
       else
           throw new RuntimeException("Invalid Expected Output in Data Driven testing");
   }
}
