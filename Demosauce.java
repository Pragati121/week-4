package Firstprogram;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demosauce {
    static WebDriver driver;

    public static void setup() {
        System.setProperty("webdriver.Chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    public static void LoginMethod() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
    }
public static void addToCart() {
    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
}

public static void main(String[] args) {
        setup();
        LoginMethod();
        addToCart();

    }
}






