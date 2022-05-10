package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class LadyMakeupDB extends CommonOps {

    @Test(description = "Test01 - Login to LadyMakeup with DB Credentials")
    @Description("This test login with DB credentials and verifies the hello header")
    public void test01_loginDBAndVerifyHeader(){
        WebFlows.loginDB();
        Verifications.verifyTextInElement(ladyMakeupMain.hello_userName, "Hello DimArbazi!");
    }

}
