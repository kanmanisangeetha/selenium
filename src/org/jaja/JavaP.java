package org.jaja;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JavaP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geccko.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeliniumFromAlertTask\\driver\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.chairish.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("FlowerLamp");
		WebElement submit=driver.findElement(By.xpath("//span[@class='js-submit-icon cicon cicon-search-fill']"));
		submit.click();
		WebElement lam=driver.findElement(By.xpath("//span[@class='js-submit-icon cicon cicon-search-fill']"));
		lam.click();
		WebElement l=driver.findElement(By.xpath("//span[@class='js-submit-icon cicon cicon-search-fill']"));
		l.click();

		
		
}
}




