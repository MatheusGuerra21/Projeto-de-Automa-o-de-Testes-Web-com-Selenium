package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverWaits;

import java.util.List;

public class MelhoresAtacantesFogo {
    WebDriver driver;
    DriverWaits driverWaits;

    public MelhoresAtacantesFogo(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driverWaits = new DriverWaits(driver);
    }

    //Elements
    @FindBy(css = "header[style='background: var(--type-fire);']")
    private WebElement titlePage;

    //Methods
    public void validateTextTitle(String text){
        driverWaits.waitTextInElement(titlePage, text);
    }

    public void printAllTable(){
        WebElement table = driver.findElement(By.tagName("tbody"));
        driverWaits.waitElementFound(table);

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        int rowCount = rows.size();

        for (int i = 0; i < rowCount; i++) {
            List<WebElement> currentRows = driver.findElements(By.tagName("tbody")).get(0).findElements(By.tagName("tr"));
            String rowText = currentRows.get(i).getText();
            System.out.println(rowText);
        }
    }
}
