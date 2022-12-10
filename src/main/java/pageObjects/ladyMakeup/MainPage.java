package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class MainPage {
    @FindBy(how = How.ID, using = "flashMessage")
    public WebElement hello_userName;

    @FindBy(how = How.XPATH, using = "//span[@class='text-uppercase d-none d-lg-inline']") //*ASK* Need do a new "Nav bar page"?
    public WebElement btn_cart;

    @FindBy(how = How.XPATH, using = "//div[@class='collapse navbar-collapse']/ul/li")
    public List<WebElement> list_informationBar;

}
