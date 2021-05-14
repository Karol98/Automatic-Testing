import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.CompletableFuture;

public class TestZalando {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }

    //kquaadxyixlu@10minut.xyz
    //Testing123
    @Test
    public void should_loggin_to_testing_account() {
        //Asynchroniczny task czeka 10 sec na pojawienie się prośby o akceptacje cookies i akceptuje ją
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"uc-btn-accept-banner\"]"))).click();
            return 0;
        });
        driver.manage().window().maximize();
        driver.navigate().to("https://www.zalando.pl/mezczyzni-home/");
        completableFuture.defaultExecutor();
        driver.findElement(By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"login.email\"]")).sendKeys("kquaadxyixlu@10minut.xyz");
        driver.findElement(By.xpath("//*[@id=\"login.password\"]")).sendKeys("Testing123");
        driver.findElement(By.xpath("//div[@class=\"z-coast-reef_modal_loginWrapper\"]/div[2]/div/form/div[3]/button")).click();
    }
}
