package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TelaPrincipalPage {

    WebDriver driver;

    public TelaPrincipalPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Elements
    @FindBy(linkText = "Melhores Atacantes do tipo Normal")
    private WebElement buttonMelhoresAtacantesNormal;
    @FindBy(linkText = "Melhor Lista de Atacantes")
    private WebElement buttonMelhorListaAtacantes;
    @FindBy(css = "input[placeholder='Search...']")
    private WebElement inputPokemon;
    @FindBy(css = "ul[class^='best-attackers_navigation']")
    private WebElement tableNiveis;
    @FindBy(linkText = "Melhores Atacantes do tipo Fogo")
    private WebElement buttonMelhoresAtacantesFogo;

    //Methods
    public void clickMelhoresAtacantesNormal(){
        buttonMelhoresAtacantesNormal.click();
    }

    public void clickMelhorListaAtacantes(){
        buttonMelhorListaAtacantes.click();
    }

    public void clickMelhoresAtacantesFogo(){
        buttonMelhoresAtacantesFogo.click();
    }

    public void searchPokemon(String name){
        inputPokemon.sendKeys(name);
        List<WebElement> listResults = driver.findElements(By.partialLinkText(name));
        listResults.get(0).click();
    }

    public boolean listarTodosNiveis(int expectedSize){
        List<WebElement> listNiveis = tableNiveis.findElements(By.tagName("strong"));
        listNiveis.forEach(element -> System.out.println(element.getText()));
        return listNiveis.size() == expectedSize;
    }
}
