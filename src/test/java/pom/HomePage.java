package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Elementos de la página
    By btnCookies = By.xpath("//button[@type='button' and @data-testid='action:understood-button' and contains(@class, 'cookie-consent-banner-opt-out__action--key-accept')]");
    By txtSearchbox = By.xpath("//input[@class='nav-search-input' and @id='cb1-edit']");
    By btnSearch = By.xpath("//button[@class='nav-search-btn']");

//Acciones

    public void searchCelulares (){
        type("celulares", txtSearchbox);
    }
    public void clickBtnsearch (){
        click(btnSearch);
    }


}
