package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.*;

public class Steps extends TestCase {
    private WebDriver driver;

    HomePage homePage;
    BusquedaPage busquedaPage;

    OfertasPage ofertasPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        ofertasPage = new OfertasPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("ingresa a la pagina de principal mercado libre")
    public void ingresa_a_la_pagina_de_principal_mercado_libre() throws InterruptedException {
        homePage.visit("https://www.mercadolibre.com.mx/");
        Thread.sleep(2000);
        homePage.click(By.xpath("//button[@type='button' and @data-testid='action:understood-button' and contains(@class, 'cookie-consent-banner-opt-out__action--key-accept')]"));
    }

    @When("ingresa el texto celulares")
    public void ingresa_el_texto_celulares() {
        homePage.searchCelulares();
    }

    @And("click en buscar")
    public void click_en_buscar() throws InterruptedException {
        busquedaPage = new BusquedaPage(driver);
        homePage.clickBtnsearch();
        Thread.sleep(10000);
    }


    @And("usuario ve los resultados de la busqueda")
    public void usuario_ve_los_resultados_de_la_busqueda() {
        busquedaPage.searchResults();
    }

    @And("click en filtro samsung y nuevo")
    public void click_en_filtro_samsung() {
        busquedaPage.applyFilters();
    }

    @Then("usuario ve los resultado filtrados")
    public void usuario_ve_los_resultado_filtrados()  {
        busquedaPage.resultsFiltered();

    }

    //Step BusquedaPorRelevancia_Test.Feature---------------------------------------

    @Then("usuario ve los resultados ordenados por relevancia")
    public void usuarioVeLosResultadosOrdenadosPorRelevancia() {
        busquedaPage.resultsMasRelevantes();
    }

    //Steps VerTodasLasOfertas_Test.feature----------------------------------------

    @When("click en ofertas")
    public void clickEnOfertas() throws InterruptedException {
        ofertasPage.goOfertas();
        Thread.sleep(20000);
    }

    @Then("el usuario ve todas las ofertas")
    public void elUsuarioVeTodasLasOfertas() {
        ofertasPage.seeOfertas();
    }

// Steps OfertasRelampago_Test.feature------------------------------------------------
    @And("click en ofertas relampago")
    public void clickEnOfertasRelampago() {
        ofertasPage.clickOfertasRelampago();
    }

    @Then("el usuario ve las ofertas relampago")
    public void elUsuarioVeLasOfertasRelampago() {
        assertTrue(ofertasPage.seeOfertasRelampago());
    }
//Steps VerOfertasTercerElemento_Test.feature
    @And("click en la tercera categoria de la cinta")
    public void clickEnLaTerceraCategoriaDeLaCinta() {
        ofertasPage.clickTercerElementoOFertas();
    }

    @Then("el usuario ve los resultados correspondientes a la tercera categoria")
    public void elUsuarioVeLosResultadosCorrespondientesALaTerceraCategoria() {
        ofertasPage.seeOfertasTercerElemento();
    }
// Steps VerOfertasCuartoElemento_Test.feature

    @And("click en la cuarta categoria de la cinta")
    public void clickEnLaCuartaCategoriaDeLaCinta() {
        ofertasPage.clickCuartoElementoOFertas();
    }

    @Then("el usuario ve los resultados correspondientes a la cuarta categoria")
    public void elUsuarioVeLosResultadosCorrespondientesALaCuartaCategoria() {
        ofertasPage.seeOfertasCuartoElemento();
    }

//Steps VerOfertasQuintoElemento_Test.feature
    @And("click en la quinta categoria de la cinta")
    public void clickEnLaQuintaCategoriaDeLaCinta() {
        ofertasPage.clickQuintoElementoOFertas();
    }

    @Then("el usuario ve los resultados correspondientes a la quinta categoria")
    public void elUsuarioVeLosResultadosCorrespondientesALaQuintaCategoria() {
        ofertasPage.seeOfertasQuintoElemento();
    }

    //Steps CuidadoDelHogarSupermercado_test.feature

    @When("click en categorias")
    public void clickEnCategorias() {
        ofertasPage.clickCategorias();
    }

    @And("click en supermercado")
    public void clickEnSupermercado() {
        ofertasPage.clickSupermercado();
    }

    @And("click en cuidados del hogar")
    public void clickEnCuidadosDelHogar() {
        ofertasPage.clickCuidadosHogar();
    }

    @Then("el usuario ve los resultados correspondientes a cuidado del hogar")
    public void elUsuarioVeLosResultadosCorrespondientesACuidadoDelHogar() {
        ofertasPage.seeCuidadosHogar();
    }

//Steps OrdenarProductosLimpieza_Test.feature
    @And("click en productos de limpieza")
    public void clickEnProductosDeLimpieza() {
        ofertasPage.clickProductosLimpieza();
    }

    @And("click en ordenar por mayor precio")
    public void clickEnOrdenarPorMayorPrecio() {
        ofertasPage.clickListaOrdernar();
    }

    @Then("el usuario ve los productor odenador por mayor precio")
    public void elUsuarioVeLosProductorOdenadorPorMayorPrecio() {
        ofertasPage.seeMayorPrecio();
    }

    //Steps OfertasSupermercado_Test.feature
    @And("click en ofertas de supermercado")
    public void clickEnOfertasDeSupermercado() {
        ofertasPage.clickOfertasSuper();
    }

    @Then("el usuario ve los resultados correspondientes a ofertas de supermercado")
    public void elUsuarioVeLosResultadosCorrespondientesAOfertasDeSupermercado() {
        ofertasPage.seeOfertasSuper();
    }
}

