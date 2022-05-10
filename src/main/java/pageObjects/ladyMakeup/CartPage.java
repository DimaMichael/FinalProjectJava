package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {
    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-sm d-block']")
    public WebElement btn_deleteItem;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success']")
    public WebElement text_verifyItemDeleted;

    @FindBy(how = How.XPATH, using = "//div/span[@class='text-muted']")
    public WebElement text_numberOfProductsInCart;

    @FindBy(how = How.XPATH, using = "//select[@class='form-control qty-select d-inline-block']")
    public WebElement btn_amountOfProducts;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-sm btn-primary']")
    public WebElement btn_saveChanges;


}
