package Sauce_Demo_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemoAutomation {

    public static void main(String args[]){
        //Launch Browser
        WebDriver driver = new ChromeDriver();

        //Open url
        driver.get("https://saucedemo.com/");
        driver.manage().window().maximize();
        //name
        driver.findElement(By.name("user-name")).sendKeys("standard_user");

        //password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //login
        driver.findElement(By.id("login-button")).click();
        /* using Css Selectors and Xpath */

        //adding item 1
        driver.findElement(By.cssSelector(".inventory_item_name")).click();
        driver.findElement(By.cssSelector("#add-to-cart")).click();
        // back to home screen
        driver.findElement(By.cssSelector("#back-to-products")).click();
        // adding item 2
        driver.findElement(By.xpath("//div[normalize-space()='Test.allTheThings() T-Shirt (Red)']")).click();
        driver.findElement(By.cssSelector("#add-to-cart")).click();
        //back to home screen
        driver.findElement(By.cssSelector("#back-to-products")).click();
        //adding item 3
        driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Bolt T-Shirt']")).click();
        driver.findElement(By.cssSelector("#add-to-cart")).click();
        //back to home screen
        driver.findElement(By.cssSelector("#back-to-products")).click();
        // cheking items in cart
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();
        //adding more item to cart
        driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
        driver.findElement(By.cssSelector("a[id='item_0_title_link'] div[class='inventory_item_name ']")).click();
        driver.findElement(By.cssSelector("#add-to-cart")).click();
        driver.findElement(By.cssSelector("#back-to-products")).click();
        // again checking cart
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();

        //proceeding to checkout
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Sergio");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Marqina");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("208021");
        driver.findElement(By.xpath("//button[@id='continue']")).click();

        //final checkout
        driver.findElement(By.xpath("//button[@id='finish']")).click();
//        Thread.onSpinWait();
        driver.quit();
    }
}
