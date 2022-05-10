package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

public class UIActions extends CommonOps {

    @Step("Click on Element")
    public static void click(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("Update Text Element")
    public static void updateText(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Insert Key")
    public static void insertKey(WebElement elem,Keys value){
        elem.sendKeys(value);
    }

    @Step("Update DropDown Element")
    public static void updateDropDown(WebElement elem, String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }
    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1){
        action.moveToElement(elem1).click().perform();
    }
    @Step("Alert Accept Element")
    public static void alertAccept(){
        Alert popup = driver.switchTo().alert();
        popup.accept();
    }

}
