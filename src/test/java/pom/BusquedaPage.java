package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class BusquedaPage extends Base {

    public BusquedaPage(WebDriver driver) {
        super(driver);
    }

    By lblSearchResults = By.xpath("//h1[@class='ui-search-breadcrumb__title shops-custom-primary-font' and contains(text(), 'Celulares')]");

    By btnSamsungFilter = By.xpath("//span[@class='ui-search-filter-name shops-custom-secondary-font' and contains(text(), 'Samsung')]");

    By btnNuevoFilter = By.xpath("//span[@class='ui-search-filter-name shops-custom-secondary-font' and contains(text(), 'Nuevo')]");

    By lblNuevoFilter = By.xpath("//div[@class='andes-tag__label' and text()='Nuevo']");

    By lblSamsungFilter = By.xpath("//div[@class='andes-tag__label' and text()='Samsung']\n");

    // By lblMasRelevantes = By.xpath("//span[@class='andes-dropdown__display-values' and @id=':R5cad9:-display-values' and text()='Más relevantes']");
    By lblMasRelevantes = By.xpath("//span[@class='andes-dropdown__display-values' and text()='Más relevantes']");
    //Acciones

    public void searchResults (){
        isDisplayed(lblSearchResults);

    }

    public void applyFilters(){
        click(btnSamsungFilter);
        click(btnNuevoFilter);
    }

    public void resultsFiltered(){
        isDisplayed(lblSamsungFilter);
        isDisplayed(lblNuevoFilter);
    }

    public void resultsMasRelevantes () {
        isDisplayed(lblMasRelevantes);
    }

}
