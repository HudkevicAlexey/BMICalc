import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
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
    public void obeseCategoryKg() {
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
    public void overweightCategoryKg() {
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
    public void underweightCategoryKg() {
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

    @Test
    public void starvationCategoryKg() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Starvation", "Random chimp event");
        driver.quit();
    }

    @Test
    public void underweightCategoryPounds() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));
        dropdown.selectByVisibleText("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("52");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Underweight", "Random chimp event");
        driver.quit();
    }

    @Test
    public void starvationCategoryPounds() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));
        dropdown.selectByVisibleText("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("51");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Starvation", "Random chimp event");
        driver.quit();
    }

    @Test
    public void normalCategoryPounds() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));
        dropdown.selectByVisibleText("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("70");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Normal", "Random chimp event");
        driver.quit();

    }

    @Test
    public void overweightCategoryPounds() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));
        dropdown.selectByVisibleText("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("90");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Overweight", "Random chimp event");
        driver.quit();

    }

    @Test
    public void obeseCategoryPounds() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));
        dropdown.selectByVisibleText("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("110");
        driver.findElement(By.name("ht")).sendKeys("185");
        driver.findElement(By.name("cc")).click();
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(normal, "Your category is Obese", "Random chimp event");
        driver.quit();
    }

    @Test
    public void valueConverterCheckHeight() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("110");
        Select dropdown = new Select(driver.findElement(By.name("opt2")));
        dropdown.selectByVisibleText("1′");
        Select dropdown2 = new Select(driver.findElement(By.name("opt3")));
        dropdown2.selectByVisibleText("1″");
        driver.findElement(By.name("desc")).getText();
        String normal = driver.findElement(By.name("ht")).getAttribute("value");
        Assert.assertEquals(normal, "33", "Random chimp event");
        driver.quit();
    }

    @Test
    public void valueConverterCheckWeight() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("110");
        Select dropdown = new Select(driver.findElement(By.name("opt1")));
        dropdown.selectByVisibleText("pounds");
        String normal = driver.findElement(By.name("wg")).getAttribute("value");
        Assert.assertEquals(normal, "242", "Random chimp event");
        driver.quit();
    }

}