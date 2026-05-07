package com.automatizacion.iplacex;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaAceptacionTest {

    @Test
    public void validarPortalDisponible() {
        // GHERKIN: Dado que el usuario accede al navegador
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        // GHERKIN: Cuando carga la página de inicio
        driver.get("https://www.google.com"); // Usaremos Google como simulador de "nuestra app"

        // GHERKIN: Entonces el título debe contener la palabra clave de aceptación
        String title = driver.getTitle();

        // Esta es la regla de negocio: "El portal debe estar plenamente identificado"
        assertTrue(title.contains("Google"), "El portal no cumple con el criterio de aceptación");

        driver.quit();
    }
}