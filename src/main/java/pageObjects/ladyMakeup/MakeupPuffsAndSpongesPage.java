package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MakeupPuffsAndSpongesPage {

    @FindBy(how = How.XPATH, using = "//a[@product_id='46685']")
    public WebElement btn_orderPuff;

}
