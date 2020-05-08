package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class stepdef {

	WebDriver driver;

	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Marcellin\\eclipse-workspace\\com.facebook\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String s1, String s2) {
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user click login button")
	public void user_click_login_button() {
		//driver.quit();
	}

}
