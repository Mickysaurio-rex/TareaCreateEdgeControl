package pages.todoIst;

import controls.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button menuPerfilButton = new Button(By.xpath("//button[@class=\"reactist_menubutton top_bar_btn settings_btn\"]"));

    public Button logoutButton = new Button(By.id(":r14:"));
}
