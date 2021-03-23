import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUnsplash {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void close() {
        driver.quit();
    }

    @Test
    public void findMercedesPhotos() {
        driver.manage().window().maximize();
        driver.navigate().to("https://unsplash.com/");
        driver.findElement(By.name("searchKeyword")).sendKeys("Mercedes");
        driver.findElement(By.className("_3cOFI")).click();
    }

    @Test
    public void downloadPhotoOfTheDayInSmallSize() {
        driver.manage().window().maximize();
        driver.navigate().to("https://unsplash.com/");
        driver.findElement(By.className("_2Mc8_")).click();
        driver.findElement(By.className("fpkc9")).click();
        driver.findElement(By.className("VGpNw")).click();
    }

    @Test
    public void goToUserProfileFirstPhotoAndFollowHim() {
        driver.manage().window().maximize();
        driver.navigate().to("https://unsplash.com/");
        driver.findElement(By.className("c_6Je")).click();
        driver.findElement(By.className("_1O9Y0")).click();
        driver.findElement(By.className("_1CBrG")).click();
    }
}
