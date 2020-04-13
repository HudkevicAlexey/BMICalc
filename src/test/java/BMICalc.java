import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BMICalc {
    @Test
    public void normalCategoryKg() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String test = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(test, "Your category is Normal", "Random chimp event");
        driver.quit();
    }
    @Test
    public void obeseCategoryKg () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("110");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String test = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(test, "Your category is Obese", "Random chimp event");
        driver.quit();
    }
    @Test
    public void overweightCategoryKg () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("90");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Overweight", "Random chimp event");
        driver.quit();
    }
    @Test
    public void underweightCategoryKg (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("60");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Underweight", "Random chimp event");
        driver.quit();
    }

}
