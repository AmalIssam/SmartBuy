import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SmartBuy {
	public WebDriver driver ;
	@BeforeTest	
	public void before_test() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://smartbuy-me.com/smartbuystore/");
		driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[2]/a")).click();
		driver.manage().window().maximize();
		
		
		}
	@Test
	public void test_items_num() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//هاي مشان يعمل ويت للانو السيلينيوم سريع
		System.out.println("amal");
	}
}

