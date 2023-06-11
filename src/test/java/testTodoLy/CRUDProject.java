package testTodoLy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import singletonSession.Session;

public class CRUDProject extends TestBase{

    WebDriver navegador = Session.getSession().getBrowser();
    @Test
    public void verifyCrudTestProject()throws InterruptedException{
        mainPage.loginButton.click();

        loginSection.emailTxtBox.setText("miguel123@upb.com");
        loginSection.pwdTxtBox.setText("12345");
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR!! login was not successfully, review credentials");
        //create
        String name = "miguel hola 1";
        barProjects.addNewProject.click();
        barProjects.barNameProject.setText(name);
        barProjects.addButton.click();
        barProjects.setDivProjectName(name);
        Thread.sleep(2000);
        Assertions.assertTrue(barProjects.divProjectName.isControlDisplayed(),
                "ERROR!! project was not created");

        //update
        String nameupdate= "miguel update hola 1";
        barProjects.divProjectName.click();
        barProjects.menuIcon.click();
        barProjects.editButton.click();
        barProjects.nameProjectBar.clearText();
        barProjects.nameProjectBar.setText(nameupdate);
        barProjects.setDivProjectName(nameupdate);
        barProjects.saveName.click();
        Thread.sleep(2000);
        Assertions.assertTrue(barProjects.divProjectName.isControlDisplayed(),
                "ERROR!! project was not updated");

        //delete
        barProjects.divProjectName.click();
        barProjects.menuIcon.click();
        barProjects.deleteProject.click();
        navegador.switchTo().alert().accept();
        Thread.sleep(2000);
        Assertions.assertTrue(!barProjects.divProjectName.isControlDisplayed(),
                "ERROR!! project was not deleted");

    }
}
