import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By addToCardLocator=By.id("add-to-basket");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCardLocator);
    }

    public void addToCard() {
        click(addToCardLocator);
    }
}
