package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoryNavbarPage {
    @FindBy(how = How.ID, using = "nav-cat-3")
    public WebElement btn_accessories;

    @FindBy(how = How.ID, using = "nav-cat-4")
    public WebElement btn_eyes;

    @FindBy(how = How.ID, using = "nav-cat-5")
    public WebElement btn_lips;

    @FindBy(how = How.ID, using = "nav-cat-6")
    public WebElement btn_face;

    @FindBy(how = How.ID, using = "nav-cat-7")
    public WebElement btn_nails;

    @FindBy(how = How.ID, using = "nav-cat-9")
    public WebElement btn_sets;

    @FindBy(how = How.ID, using = "nav-cat-10")
    public WebElement btn_books;


}
