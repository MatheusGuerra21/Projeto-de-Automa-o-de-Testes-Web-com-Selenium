package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;
import java.util.List;

public class PokemonStatusPage {

    WebDriver driver;

    public PokemonStatusPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Elements
    @FindBy(css = "li a[href='/pt/move/205']")
    private WebElement textPrimeiroMovimento;
    @FindBy(css = "li a[href='/pt/move/251']")
    private WebElement textSegundoMovimento;
    @FindBy(id = "max-cp-chart")
    private WebElement tabelaPCMaximo;

    //Methods

    public String primeiroMovimentoPikachu() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(textPrimeiroMovimento).perform();
        Thread.sleep(5000);
        actions.scrollToElement(tabelaPCMaximo).perform();
        Thread.sleep(5000);
        return textPrimeiroMovimento.getText();
    }

    public String segundoMovimentoPikachu(){
        return textSegundoMovimento.getText();
    }
}
