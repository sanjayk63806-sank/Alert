package learnautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show'}")).click();
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		
		

	}

}
