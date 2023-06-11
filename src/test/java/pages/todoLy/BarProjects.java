package pages.todoLy;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class BarProjects {
    public Button addNewProject = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox barNameProject = new TextBox(By.id("NewProjNameInput"));
    public Button addButton = new Button((By.id("NewProjNameButton")));

    public Label divProjectName ;

    public void setDivProjectName(String nameProject){
        divProjectName = new Label(By.xpath("(//li//td[text()='"+nameProject+"'])[last()]"));
    }

    public Button menuIcon = new Button(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Button editButton = new Button(By.xpath("//ul[contains(@style,'block')]//a[text()='Edit']"));
    public TextBox nameProjectBar = new TextBox(By.xpath("//td/div/input[@id=\"ItemEditTextbox\"]"));
    public Button saveName = new Button(By.xpath("//td/div/img[@id=\"ItemEditSubmit\"]"));
    public Button deleteProject = new Button(By.id("ProjShareMenuDel"));


}
