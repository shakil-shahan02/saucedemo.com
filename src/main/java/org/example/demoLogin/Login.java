package org.example.demoLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {
        // OPEN THE CHROME BROWSER
        System.setProperty("webdriver.chrome.driver","E://SQA//Web testing with selenium//selenium jars and drivers//drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // MAX THE CHROME BROWSER
        driver.manage().window().maximize();
        // NAVIGATE TO THE URL
        driver.get("https://www.saucedemo.com/");
        //Enter valid username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Enter valid password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Click on login
        driver.findElement(By.id("login-button")).click();
        //getCurrentUrl
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        //Verify Url
        String desired_url = "https://www.saucedemo.com/inventory.html";
        if(currentUrl.equals(desired_url))
        {
            System.out.println("Passed!");
        }
        else{
            System.out.println("Failed!");
        }
        //Verify Title
        //getTitle
        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        String desiredTitle = "Swag Labs";
        if(currentTitle.equals(desiredTitle))
        {
            System.out.println("Passed!");
        }
        else{
            System.out.println("Failed!");
        }
        driver.close();
    }
}
