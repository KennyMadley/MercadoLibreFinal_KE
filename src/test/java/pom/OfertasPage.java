package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class OfertasPage extends Base{
    public OfertasPage(WebDriver driver) {
        super(driver);
    }
    //Elementos de la página

    By btnOfertas = By.xpath("//a[@href='https://www.mercadolibre.com.mx/ofertas#nav-header' and @class='nav-menu-item-link' and text()='Ofertas']");

    By lblOfertas = By.xpath("//h1[@class='header_title' and text()='Ofertas']\n");

    By btnOfertasRelampago = By.xpath("//p[@class='title' and text()='Ofertas relámpago']\n");

    By lblOfertasRelampago = By.xpath("//span[@class='applied_filter__text' and text()='Oferta relámpago']");

    By btnTercerElemento = By.xpath("//div[@role='group' and @class='andes-carousel-snapped__slide'][1]");

    By lblTercerElemento = By.xpath("//div[@role='group' and @class='andes-carousel-snapped__slide' and div[@class='carousel_item selected']]\n");

    By btnCuartoElemento = By.xpath("//div[@role='group' and @class='andes-carousel-snapped__slide' and @aria-label='4 de 18']");

    By lblCuartoElemento = By.xpath("//div[@role='group' and @class='andes-carousel-snapped__slide' and @aria-label='4 de 18' and div[@class='carousel_item selected']]");

    By btnQuintoElemento = By.xpath("//div[@role='group' and @class='andes-carousel-snapped__slide' and @aria-label='5 de 18']");

    By lblQuintoElemento = By.xpath("//div[@role='group' and @class='andes-carousel-snapped__slide' and @aria-label='5 de 18' and div[@class='carousel_item selected']]");

    By btnCategorias = By.xpath("//li[@class='nav-menu-item'][1]");
    By btnSupermercado = By.xpath("//ul[@class='nav-categs-departments' and @data-js='nav-categs-departments']/li[@class='nav-categs-departments__list nav-categs-departments__list--static']/a[text()='Supermercado']\n");

    By btnCuidadosHogar = By.xpath("//div[@class='carousel__item__6']");

    By lblCuidadosHogar = By.xpath("//h1[@class='ui-search-breadcrumb__title shops-custom-primary-font']\n");

    By btnProdLimpieza = By.xpath("//span[@class='ui-search-filter-name shops-custom-secondary-font' and contains(text(), 'Productos de Limpieza')]");

    By btnListaOrdenar = By.xpath("//button[@class='andes-dropdown__trigger' and @aria-labelledby=':R5cad9:-label :R5cad9:-display-values']\n");

    By btnMayorPrecio = By.xpath("//span[@class='andes-list__item-primary' and text()='Mayor precio']");

    By lblFiltroMayorPrecio = By.xpath("//div[@class='ui-search-view-options__group']//*[contains(text(), 'Mayor precio')][2]");

    By btnOfertasSuper = By.xpath("//a[@class='subcategory__link'][1]");

    By lblOfertasSuper = By.xpath("//div[@class='andes-tag__label' and text()='Desde 10% OFF']");
    //Acciones de la página

    public void goOfertas (){
        click(btnOfertas);
    }
    public void seeOfertas (){
        isDisplayed(lblOfertas);
    }

    public void clickOfertasRelampago(){
        click(btnOfertasRelampago);
    }

    public boolean seeOfertasRelampago (){
        return isDisplayed(lblOfertasRelampago);
    }

    public void clickTercerElementoOFertas(){
        click(btnTercerElemento);
    }
    public void seeOfertasTercerElemento (){
        isDisplayed(lblTercerElemento);
    }
    public void clickCuartoElementoOFertas(){
        click(btnCuartoElemento);
    }
    public void seeOfertasCuartoElemento (){
        isDisplayed(lblCuartoElemento);
    }

    public void clickQuintoElementoOFertas (){
        click(btnQuintoElemento);
    }

    public void seeOfertasQuintoElemento(){
        isDisplayed(lblQuintoElemento);
    }

    public void clickCategorias (){
        click(btnCategorias);
    }
    public void clickSupermercado (){
        Wait(btnSupermercado);
        click(btnSupermercado);
    }

    public void clickCuidadosHogar(){
        click(btnCuidadosHogar);
    }
    public void seeCuidadosHogar (){
        isDisplayed(lblCuidadosHogar);
    }

    public void clickProductosLimpieza(){
        click(btnProdLimpieza);
    }

    public void clickListaOrdernar(){
        click(btnListaOrdenar);
        Wait(btnMayorPrecio);
        click(btnMayorPrecio);
    }
    public void seeMayorPrecio(){
        isDisplayed(lblFiltroMayorPrecio);
    }

    public void clickOfertasSuper(){
        click(btnOfertasSuper);
    }
    public void seeOfertasSuper (){
        isDisplayed(lblOfertasSuper);
    }
}

