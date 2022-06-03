package com.company;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\mirackasap\\Desktop\\Selenium\\executables\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://gobito.akademi.ws/page/90/login");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // Login
            driver.findElement(By.name("username")).sendKeys("onur");
            driver.findElement(By.name("password")).sendKeys("Onr_090807");

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // QservExam Ekleme
            driver.findElement(By.xpath("//img[@class='sc-fHuLdG jbkWec']")).click();
            driver.findElement(By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeSmall']")).click();
            driver.findElement(By.xpath("//p[@class='sc-dwfUTVA gioTxt']")).click();
            driver.findElement(By.xpath("//img[@src='/page/90/assets/img/providers/QServExam.png']")).click();

        }

    }


