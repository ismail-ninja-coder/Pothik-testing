/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pothik_selenium.testing.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Ismail Hossain
 */
public class LoginPage {
  public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/POTHIK/login.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("jafor");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("123");
        Thread.sleep(3000);
        
        driver.findElement(By.id("submit")).click();
        String actual = driver.getTitle();
        System.out.println(""+actual);
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
