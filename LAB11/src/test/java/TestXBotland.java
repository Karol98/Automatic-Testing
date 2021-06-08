import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestXBotland {

    WebDriver driver;
    private static Logger logger = LogManager.getLogger(TestXBotland.class);

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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
        logger.info("Get on https://botland.com.pl/");
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/span[2]/span/a")).click();
        logger.error("The form item was not found or is not clickable");
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/iframe"));
        driver.switchTo().frame(frame);
        WebElement frame2 = driver.findElement(By.xpath("/html/body/iframe[1]"));
        driver.switchTo().frame(frame2);
        logger.info("Changed frame into form frame");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div/input")).sendKeys("Mariusz");
        logger.error("The name item was not found");
        driver.findElement(By.xpath("//*[@id=\"2627input\"]")).sendKeys("Mariusz@email.com");
        logger.error("The email item was not found");
        driver.findElement(By.xpath("//*[@id=\"2631input\"]")).sendKeys("Testing with selenium");
        logger.error("The form input was not found");
        driver.findElement(By.xpath("//div[@class=\"CheckBoxContainer\"]"));
        logger.error("The form input was not found");
        driver.findElement(By.xpath("//*[@id=\"2633area\"]")).sendKeys("Example text");
        logger.error("The form input was not found");
        logger.info("The test was succesful");
    }

    @Test
    public void performSomeTask() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
