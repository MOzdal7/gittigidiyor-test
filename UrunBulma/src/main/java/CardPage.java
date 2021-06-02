import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CardPage extends BasePage{

    By cardPrize=By.id("new-price");
    public CardPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductDelete() {
        return getPrize()==0;
    }

    private double getPrize(){
        String prize=find(cardPrize).getText();
        return Double.parseDouble(prize);

    }


}
