package meuapp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    @Test
    public void testWebPage() {
        System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver"); // Substitua pelo caminho do seu chromedriver
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080/meuapp/webapp");
            WebElement heading = driver.findElement(By.tagName("h1"));
            assertEquals("Bem-vindo ao Meu App!", heading.getText());
        } finally {
            driver.quit();
        }
    }
}
