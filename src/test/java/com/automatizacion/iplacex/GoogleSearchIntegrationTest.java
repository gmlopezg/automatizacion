package com.automatizacion.iplacex;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchIntegrationTest {
    @Test
    public void testConexionGoogle() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Necesario para servidores de CI

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        assertTrue(title.contains("Google"));

        driver.quit();
    }
}