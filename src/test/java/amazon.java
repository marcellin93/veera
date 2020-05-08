import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\Desktop\\adact\\veera\\driver1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone ");
driver.findElement(By.xpath("//input[@value='Go']")).click();
driver.findElement(By.xpath("//span[text()='Apple iPhone XR (128GB) - Black']")).click();
}
}