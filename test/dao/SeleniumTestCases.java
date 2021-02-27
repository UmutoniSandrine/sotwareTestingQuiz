package dao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author bitwayiki
 */
public class SeleniumTestCases {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/bitwayiki/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:41190/Student_RegistrationV1/");
        driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("21112");
        driver.findElement(By.xpath("//*[@id=\"j_idt6\"]/table/tbody/tr[2]/td[2]/input")).sendKeys("Mutesi");
        driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[3]/td[2]/select")).sendKeys("Female");
        driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("2000-01-09");
        driver.findElement(By.xpath("/html/body/div[2]/form/table/tbody/tr[5]/td[2]/input")).click();
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[5]/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[4]/td[5]/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/table/tbody/tr/td/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr/td/input")).click();
        
      // driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr/td/form/input[2]")).click();

    }

}
