package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.ID, using = "_login")
    public WebElement txt_username;

    @FindBy(how = How.ID, using = "_password")
    public WebElement txt_password;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement btn_login;

}
