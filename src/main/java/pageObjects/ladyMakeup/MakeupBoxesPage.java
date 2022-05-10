package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MakeupBoxesPage {
    @FindBy(how = How.ID, using = "title_product_listing")
    public WebElement product_title;

    @FindBy(how = How.XPATH, using = "//a[@product_id='33643']")
    public WebElement btn_order;

    @FindBy(how = How.XPATH, using = "//strong[@class='cart-total-product-count font-dark']")
    public WebElement text_numberOfProducts;

}
