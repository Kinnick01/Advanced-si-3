package com.example.si3;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;



public class MainPageTest {

    ChromeDriver driver;


    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/krausadam/Desktop/codecool/Advanced/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void submitform() {
        driver.findElement(By.id("firstName")).sendKeys("piros");
        driver.findElement(By.id("lastName")).sendKeys("pottyos roka");
        driver.findElement(By.id("userEmail")).sendKeys("macska@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]")).click();
        driver.findElement(By.id("userNumber")).sendKeys("0123456789");


       /* driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.id("dateOfBirthInput")).clear();
        driver.findElement(By.id("dateOfBirthInput")).sendKeys("2002 01 11");*/

       /* driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[1]"));
        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/select/option[1]"));
        driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[1]"));*/

        driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]")).sendKeys("Math" + Keys.TAB);
       // driver.findElement(By.xpath("//*[@id=\"hobbies-checkbox-2\"]")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("majom, vagyok utca 12");
        driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]")).sendKeys("NCR" + Keys.TAB);
        driver.findElement(By.xpath("//*[@id=\"react-select-4-input\"]")).sendKeys("Delhi" + Keys.TAB);
        driver.findElement(By.id("submit")).click();
    }

}
