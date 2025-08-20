package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DriverWaits {

    WebDriverWait wait;

    public DriverWaits(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitElementFound(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitTextInElement(WebElement element, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
}
