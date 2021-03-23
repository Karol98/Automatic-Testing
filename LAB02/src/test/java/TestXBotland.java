import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestXBotland {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void close() {
        driver.close();
    }

    @Test
    public void FillOutTheContactForm() {
        driver.manage().window().maximize();
        driver.navigate().to("https://botland.com.pl/");
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/span[2]/span/a")).click();
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/iframe"));
        driver.switchTo().frame(frame);
        WebElement frame2 = driver.findElement(By.xpath("/html/body/iframe[1]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div/input")).sendKeys("Mariusz");
        driver.findElement(By.id("2627input")).sendKeys("Mariusz@email.com");
        driver.findElement(By.id("2631input")).sendKeys("Testing with selenium");
        driver.findElement(By.id("2633area")).sendKeys("Example text");
    }

    @Test
    public void AddSomeStuffToCart() {
        driver.manage().window().maximize();
        driver.navigate().to("https://botland.com.pl/");
        driver.findElement(By.xpath("//*[@id=\"exCollapsingNavbar291\"]/ul/li[2]/div[1]/span[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[3]/div/div[1]/section/a/span/img")).click();
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/section[1]/div/div[2]/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/section[1]/div/div[2]/div/div[2]/form/div/div[3]/button")).click();
    }

    @Test
    public void SortProductsByPrice() {
        driver.manage().window().maximize();
        driver.navigate().to("https://botland.com.pl/");
        driver.findElement(By.xpath("//*[@id=\"exCollapsingNavbar291\"]/ul/li[2]/div[1]/span[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[5]/div/div[2]/a")).click();
        driver.findElement(By.xpath("/html/body/main/section/div[2]/div[2]/section/section/div[2]/div/div[2]/div/div/div")).click();
        driver.findElement(By.xpath("//*[@id=\"js-product-list-top\"]/div[2]/div/div/div/ul/li[4]")).click();
    }
}
