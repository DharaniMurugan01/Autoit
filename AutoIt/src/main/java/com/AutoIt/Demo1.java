package com.AutoIt;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo1{
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pdf2doc.com/");
        WebElement btn=driver.findElement(By.xpath("(//span[@class='button__text'])[1]"));
		btn.click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("D:\\demo1.exe");
        Thread.sleep(5000);
        System.out.println("Successfully uploaded");
        driver.quit(); 
        }
}

