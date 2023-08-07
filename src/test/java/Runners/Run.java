package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/BusquedaMultiplesFiltros_Test.feature",
                    "src/test/resources/CuidadoDelHogarSupermercado_Test.feature",
                    "src/test/resources/OfertasRelampago_Test.feature",
                    "src/test/resources/OfertasSupermercado_Test.feature",
                    "src/test/resources/OrdenarProductosLimpieza_Test.feature",
                    "src/test/resources/ResultadosPorRelevancia_Text.feature",
                    "src/test/resources/VerOfertasCuartoElemento_Test.feature",
                    "src/test/resources/VerOfertasQuintoElemento_Test.feature",
                    "src/test/resources/VerOfertasTercerElemento_Test.feature",
                    "src/test/resources/VeTodasLasOfertas_Test.feature"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber/report.html"} // Opciones de reportes, puedes ajustar según tus necesidades

)
//primero extendemos la clase
public class Run extends AbstractTestNGCucumberTests {
}
