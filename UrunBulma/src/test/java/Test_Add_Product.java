import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product extends BaseTest{

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage;

    @Test
    @Order(1)
    public void login(){
        homePage=new HomePage(driver);
        productPage=new ProductPage(driver);

        //Assertions.assertTrue(homePage.isOnLoginPage(),
         //    "Login yapılmadı.!!");
        homePage.searchBox().search("bilgisayar");
        Assertions.assertTrue(productPage.isOnProductPage(),
                "Ürün sayfasında değil.!!");
    }



    @Test
    @Order(2)
    public void select_page(){

        productPage.selectPage(2);
        Assertions.assertTrue(productPage.isOnProductPage(),
                "2. sayfada değil.!!");


    }

    @Test
    @Order(3)
    public void select_product(){
        productDetailPage=new ProductDetailPage(driver);
        productPage.selectProduct(2);

        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Ürün detay sayfasında değil.");


    }

    @Test
    @Order(4)
    public void add_product_to_card(){
        productDetailPage.addToCard();

    }

    @Test
    @Order(5)
    public void add_product_count(){
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Ürün sayısı artmadı.");


    }

    @Test
    @Order(6)
    public void delete_product_to_card(){
        cardPage=new CardPage(driver);
        homePage.goToCard();
        homePage.deleteCard();
        Assertions.assertTrue(cardPage.checkIfProductDelete(),
                "Sepet boş.!!");


    }


}
