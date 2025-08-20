package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MelhoresAtacantesFogo;
import pages.MelhoresAtacantesNormal;
import pages.PokemonStatusPage;
import pages.TelaPrincipalPage;
import utils.DriverFactory;

public class PokemonTests {

    WebDriver driver;

    @Before
    public void setup() {
        // Preparar Driver
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.getChromeDriver();
        driver.get("https://db.pokemongohub.net/pt");
    }

    @Test
    public void melhoresAtacantesTipoNormal() {
        // Teste Automatizado
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.clickMelhoresAtacantesNormal();
        //Assert
        MelhoresAtacantesNormal melhoresAtacantesNormal = new MelhoresAtacantesNormal(driver);
        melhoresAtacantesNormal.validateTextTitle("Melhores Atacantes do tipo Normal em Pokémon GO");
        melhoresAtacantesNormal.printAllTable();
    }

    @Test
    public void melhoresAtacantesTipoFogo() {
        // Teste Automatizado
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.clickMelhoresAtacantesFogo();
        //Assert
        MelhoresAtacantesFogo melhoresAtacantesFogo = new MelhoresAtacantesFogo(driver);
        melhoresAtacantesFogo.validateTextTitle("Melhores Atacantes do tipo Fogo em Pokémon GO");
        melhoresAtacantesFogo.printAllTable();
    }

    @Test
    public void validatePikachuMoves() throws InterruptedException {
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.searchPokemon("Pik");
        //Assert
        PokemonStatusPage pokemonStatusPage = new PokemonStatusPage(driver);
        Assert.assertEquals("Trovoada de Choques", pokemonStatusPage.primeiroMovimentoPikachu());
        Assert.assertEquals("Ataque Selvagem", pokemonStatusPage.segundoMovimentoPikachu());
    }

    @Test
    public void validateNiveisLista(){
        TelaPrincipalPage telaPrincipalPage = new TelaPrincipalPage(driver);
        telaPrincipalPage.clickMelhorListaAtacantes();
        Assert.assertTrue(telaPrincipalPage.listarTodosNiveis(7));
    }

    @After
    public void close() {
        // Fechar Tudo
        driver.quit();
    }
}
