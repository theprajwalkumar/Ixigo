package Ixigotask;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ixigo {
	WebDriver driver;
	
	@BeforeClass
	public void BeforeClass1() {
		System.out.println("This will execute before class");
	}
	
	@BeforeMethod 
	public void Starter() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		
	}
	
	@Test
	public void SearchFlights() throws InterruptedException {
		WebElement From=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div"));
		From.click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("Mumbai");
		Thread.sleep(3000);
		List<WebElement>auto=driver.findElements(By.xpath("//li[@class='flex items-center relative hover:bg-primary-over px-20 py-10 gap-10 group list-sm max-w-screen-sm gap-15 py-15 px-20 ']"));
		auto.size();
		int count =auto.size();
		System.out.println(count);
		auto.get(0).click();
		
		
		WebElement To=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div"));
		To.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input")).sendKeys("Ranchi");
		Thread.sleep(3000);
		List<WebElement>auto1=driver.findElements(By.xpath("//li[@class='flex items-center relative hover:bg-primary-over px-20 py-10 gap-10 group list-sm max-w-screen-sm gap-15 py-15 px-20 ']"));
		auto1.size();
		int count1=auto1.size();
		System.out.println(count1);
		Thread.sleep(3000);
	    auto1.get(10).click();
	    
	    Thread.sleep(5000);
	    
	    
	    while(true) {
	    	String Expected_Date="August 2024";
	    	String Date_Picker=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[1]/button[2]/span[1]")).getText();
	    	System.out.println(Date_Picker);
	    	if(Expected_Date.equals(Date_Picker)) {
	    		break;
	    	}
	    	else {
	    		Thread.sleep(5000);
	    		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[1]/button[3]")).click();
	    	}
	    }
	    
	    Thread.sleep(5000);
	    
	    driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[24]")).click();
		
	    
	    
	    WebElement SearchFlights=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/button"));
	    SearchFlights.click();
		}
	
	
	
	
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();
		
		
	}
	
	@AfterClass
	public void AfterClasss1() {
		System.out.println("This will execute after class");
	}

}
