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
    public void should_fill_out_contact_form() {
        driver.manage().window().maximize();
        driver.navigate().to("https://botland.com.pl/");
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/span[2]/span/a")).click();
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/iframe"));
        driver.switchTo().frame(frame);
        WebElement frame2 = driver.findElement(By.xpath("/html/body/iframe[1]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div/input")).sendKeys("Mariusz");
        driver.findElement(By.xpath("//*[@id=\"2627input\"]")).sendKeys("Mariusz@email.com");
        driver.findElement(By.xpath("//*[@id=\"2631input\"]")).sendKeys("Testing with selenium");
        driver.findElement(By.xpath("//div[@class=\"CheckBoxContainer\"]"));
        driver.findElement(By.xpath("//*[@id=\"2633area\"]")).sendKeys("Example text");
    }
}
