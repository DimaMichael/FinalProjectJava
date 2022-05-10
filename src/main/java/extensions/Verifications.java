package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Number Of Elements") //Hard Coded
    public static void numberOfElements(String elems, String expected){
        assertEquals(elems, expected);
    }
//    @Step("Verify Number Of Elements") //Need to check about a element, get Error
//    public static void numberOfElements(WebElement elems, String expected){
//        assertEquals(elems.getText(), expected);
//    }

    @Step("Verify Visibility Of Elements")
    public static void visibilityOfElements(List<WebElement> elems) {
        for (WebElement elem : elems) {
            softAssert.assertTrue(elem.isDisplayed(), "Sorry" + elem.getText() + "not displayed");
        }
        softAssert.assertAll("Some elements were not displayed");
    }
    @Step("Verify Element Visually")
    public static void visualElement(String expectedImageName){
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File" + findFailed);
            fail("Error Comparing Image File" + findFailed);
        }
    }

    @Step("Verify Element Displayed")//Need to check
    public static void existenceOfElement(WebElement elem)
    {
        assertTrue(elem.isDisplayed());
    }

    @Step("Verify Element Not Displayed")//Need to check
    public static void notExistenceOfElement(WebElement elem)
    {
        assertFalse(elem.isDisplayed());
    }

    @Step("Verify Text With Text")
    public static void verifyText(String actual, String expected)
    {
        assertEquals(actual, expected);
    }

    @Step("Verify Number With Number")
    public static void verifyNumber(int actual, int expected)
    {
        assertEquals(actual, expected);
    }

}
