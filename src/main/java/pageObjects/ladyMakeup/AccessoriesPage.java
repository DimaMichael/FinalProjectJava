package pageObjects.ladyMakeup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccessoriesPage {
    @FindBy(how = How.XPATH, using = "//ul[@id='in_category_nav']/li[2]")  //li[@data-category-id='60']/a
    public WebElement btn_makeup_boxes;

    @FindBy(how = How.XPATH, using = "//li[@data-category-id='61']/a")
    public WebElement btn_cosmetic_bags;

    @FindBy(how = How.XPATH, using = "//ul[@id='in_category_nav']/li[4]")  //li[@data-category-id='67']/a
    public WebElement btn_puffs_and_sponges;

    @FindBy(how = How.XPATH, using = "//li[@data-category-id='80']/a")
    public WebElement btn_chairs;
}

