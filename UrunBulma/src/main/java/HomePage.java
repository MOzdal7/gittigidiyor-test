import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class HomePage extends BasePage{

    SearchBox searchBox;
    //By cardCountLocator=By.id("product-specs-quantity");
    By cardCountLocator=new By.ByCssSelector("product-specs-quantity");
    By cardContainerLocator=By.id("gg-d-12 pl0");
    By cardProductDelete=By.id("btn-delete btn-update-item");
    By order=By.id("Siparişlerim");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isOnLoginPage() {
        return isDisplayed(order);
    }

    public void goToCard() {
        click(cardContainerLocator);
    }

    public void deleteCard() {
        click(cardProductDelete);

    }

    public boolean isProductCountUp() {
        return getCardCount()>0;
    }

    private int getCardCount(){
          String count=  find(cardCountLocator).getText();
          return Integer.parseInt(count);
    }


}
