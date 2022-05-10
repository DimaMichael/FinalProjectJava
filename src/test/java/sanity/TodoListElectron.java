package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;

@Listeners(utilities.Listeners.class)
public class TodoListElectron extends CommonOps {

    @Test(description = "Test01 - Add And Verify New Task")
    @Description("This Test adds a new task and verifies it in the list of tasks")
    public void test01_AddAndVerifyNewTask(){
        ElectronFlows.addNewTask("Learn Java");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(), 1);
    }

    @Test(description = "Test02 - Add And Verify New Task")
    @Description("This Test adds a new task and verifies it in the list of tasks")
    public void test02_AddAndVerifyNewTask(){
        ElectronFlows.addNewTask("Learn Java");
        ElectronFlows.addNewTask("Learn Python");
        ElectronFlows.addNewTask("Learn C#");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTasks(), 3);
    }
}
