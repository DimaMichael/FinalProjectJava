package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.ladyMakeup.*;

public class ManagePages extends Base{

    public static void initLadyMakeup(){
        ladyMakeupLogin = PageFactory.initElements(driver, pageObjects.ladyMakeup.LoginPage.class);
        ladyMakeupMain = PageFactory.initElements(driver, pageObjects.ladyMakeup.MainPage.class);
        ladyMakeupCategoryNavbar = PageFactory.initElements(driver, CategoryNavbarPage.class);
        ladyMakeupAccessories = PageFactory.initElements(driver, AccessoriesPage.class);
        makeupBoxesPage = PageFactory.initElements(driver, MakeupBoxesPage.class);
        ladyMakeupCartPage = PageFactory.initElements(driver, CartPage.class);
        makeupPuffsAndSpongesPage = PageFactory.initElements(driver, MakeupPuffsAndSpongesPage.class);
    }

    public static void initMortgage() {
        mortgageMain = new pageObjects.mortgage.MainPage(mobileDriver);
    }

    public static void initToDo() {
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }

    public static void initCalculator() {
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }

}
