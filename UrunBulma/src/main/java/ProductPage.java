import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{

    By cpuType=By.id("İşlemci Serisi");

    By productNameLocator=By.id("product_id_690424748");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(cpuType);
    }

    public void selectPage(int i) {
        getAllProducts().get(i).click();
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
       return findAll(productNameLocator);
    }

}
