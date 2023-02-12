package com.obsquara.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public WebDriver driver;
	

	public void intialisebrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Manu\\git\\SeleniumAutomation\\SeleniumAutomation\\src\\main\\java\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
 public void getTitlecommands() {
	 String title = driver.getTitle();
	 String actualTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	 System.out.println( title );
	 if(title.equals(actualTitle)){
		 System.out.println(" title are eqaul");
	 }
	 else {
		 System.out.println(" Title not equal");
	 }
	}
 public void getURLcommand() {
	 String url= driver.getCurrentUrl();
 }
	public static void main(String[] args) {

		BaseClass base= new BaseClass();
		base.intialisebrowser();
        base. getTitlecommands();
        base.getURLcommand();
        
	}

}
