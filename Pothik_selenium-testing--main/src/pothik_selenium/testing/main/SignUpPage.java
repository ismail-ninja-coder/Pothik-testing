/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pothik_selenium.testing.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Ismail Hossain
 */
public class SignUpPage {
    
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/POTHIK/signup.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("Abujafor");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("abujafor@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("J@affshs000");
        Thread.sleep(3000);
        driver.findElement(By.name("number")).sendKeys("01767606822");
        Thread.sleep(3000);
        WebElement dropdownElement = driver.findElement(By.name("Fplace"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Mountain");
        Thread.sleep(3000);
        driver.findElement(By.name("address")).sendKeys("Sylhet");
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();
        String actual = driver.getTitle();
        System.out.println("" + actual);
        Thread.sleep(3000);
        String expected = "POTHIK";
        driver.close();
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Test Successfull");
        } else {
            System.out.println("Test faile!!");
        }
    }

}

