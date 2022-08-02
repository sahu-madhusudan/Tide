package com.mindtree.tide;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Tide {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//mindc1may361//eclipse-workspace//Tide//drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://tide.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		WebElement hover=driver.findElement(By.xpath("//a[contains(text(),'Shop Products')]"));
		Actions action=new Actions(driver);
		action.moveToElement(hover).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement hover2=driver.findElement(By.xpath("//a[contains(text(),'Our Commitment')]"));
		action.moveToElement(hover2).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement hover3=driver.findElement(By.xpath("//a[contains(text(),'Our Commitment')]"));
		
		action.moveToElement(hover3).perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tide Clean Breeze Liquid Laundry Detergent");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[contains(text(),'Find Retailers')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'VIEW')]")).click();
		
		driver.findElement(By.xpath("//span[@class='ps-lightbox-close']")).click();
		
		
	}

}
