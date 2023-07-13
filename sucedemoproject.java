package Saucedemo;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class sucedemoproject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Laxmi Jadhav\\Documents\\TESTING\\Automation Testing\\Browser Extension\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		Thread.sleep(2000);
		
		//addcart
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		
		//basket
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		Thread.sleep(2000);
		
		//checkout
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
		Thread.sleep(2000);
		
		//checkout information
		//name
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("smith");
		Thread.sleep(2000);
		
		//last name
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("jhonson");
		Thread.sleep(2000);
		//zip
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("500001");
		Thread.sleep(2000);
		//continue button
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
		Thread.sleep(2000);
		
		//finish
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
		Thread.sleep(2000);
		
		//back home
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
