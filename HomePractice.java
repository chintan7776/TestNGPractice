import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomePractice {
    WebDriver driver;

    @Test(priority = 0)
    void openBrowser(){
        System.out.println("Open Browser");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CHINTAN\\SeleniumLearningSep\\TestNGPractice\\src\\test\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }
    @Test(priority = 1)
    void select_item(){
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();

    }
    @Test(priority = 2)
    void desktops(){
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }
    @Test(priority = 3)
    void add_to_cart() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p/a")).click();

    }
    @Test(priority = 4)
    void shopping_cart() {
        driver.findElement(By.id("updatecart")).click();
    }
    @Test(priority = 5)
    void terms() {
        driver.findElement(By.id("termsofservice")).click();

    }
    @Test(priority = 6)
    void checkout() {
        driver.findElement(By.id("checkout")).click();
    }
    @Test(priority = 7)
    void guest() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();
    }
    @Test(priority = 8)
    void ship() throws InterruptedException {
        driver.findElement(By.id("ShipToSameAddress")).click();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("chintan");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("patel");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("chintanpatel7776@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("India");
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Nadiad");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("1maitri socity");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("387001");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9825322981");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shipping-address-select\"]/option[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shippingoption_0\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"paymentmethod_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();

    }
    @Test(priority = 9)
    void payment() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"CardholderName\"]")).sendKeys("chintan");
        driver.findElement(By.xpath("//*[@id=\"CardNumber\"]")).sendKeys("259585926252");
        driver.findElement(By.xpath("//*[@id=\"ExpireMonth\"]")).sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"ExpireYear\"]")).sendKeys("2025");
        driver.findElement(By.xpath("//*[@id=\"CardCode\"]")).sendKeys("256");
        driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
    }






}
