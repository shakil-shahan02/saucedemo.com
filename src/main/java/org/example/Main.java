package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver","E://SQA//Web testing with selenium//selenium jars and drivers//drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // MAX THE CHROME BROWSER
        driver.manage().window().maximize();
        // NAVIGATE TO THE URL
        driver.get("https://www.google.com");
        //NUMBER OF LINKS BY TAG NAME
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        //NAME OF LINKS
        for(WebElement l:link){
            System.out.println(l.getText());
        }
        // BY CLASS
        //driver.findElement(By.className("gLFyf")).sendKeys("automation");
        // OR
        //WebElement search = driver.findElement(By.className("gLFyf"));
        //search.sendKeys("Automation");
        //driver.findElement(By.name("q")).sendKeys("automation");
        //By Textlink
        //driver.findElement(By.linkText("Gmail")).click();
        // CLOSE THE BROWSER
        //driver.close();
    }
}