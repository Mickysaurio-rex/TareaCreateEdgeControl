package testTodoIst;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoIst.LoginSection;
import pages.todoIst.MainPage;
import pages.todoIst.MenuSection;
import singletonSession.Session;

public class TestBaseTodoIst {
    protected LoginSection loginSection = new LoginSection();
    protected MainPage mainPage = new MainPage();
    protected MenuSection menuSection = new MenuSection();

    @BeforeEach
    public void openBrowser(){
        Session.getSession().goTo("https://todoist.com/es");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }
}
