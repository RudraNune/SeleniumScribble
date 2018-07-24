package basicClasses;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BasicSettings {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "W:/Selenium/browser drivers/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//To open a browser and get title
		/*driver.get("https://www.ebay.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());*/
		
		 
		//Validation 
		
		/*if(driver.getTitle().equals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay")){
			System.out.println("Validation passed for Title");
		}else{
			System.out.println("Validation failed for title");
		}*/
		
		//window functions
		/*driver.get("https://www.google.com/");
		driver.navigate().to("https://www.ebay.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		//Alert Handling
		/*driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		System.out.println("Alert Message:"+alertmsg);
		alert.accept();
		String alertmsg2 = alert.getText();
		System.out.println("Alert Message of 2nd window:"+alertmsg2);
		alert.accept();*/
		
		
		//Browser Dropdowns
		/*driver.get("https://www.ebay.com/");
		Select select1 = new Select(driver.findElement(By.id("gh-cat")));
		//WebElement e1 = driver.findElement(By.id("gh-cat-box"));
		//System.out.println(e1);
		List<WebElement> catlist = select1.getOptions(); 
		//System.out.println(catlist.get(1).getText());
		//select1.selectByVisibleText("Art");
		System.out.println(driver.findElement(By.id("gh-cat")).getText());
		System.out.println(catlist.size());
		// to print all the values of dropdown
		//for(int i=0; i<catlist.size(); i++){
		//	System.out.println(catlist.get(i).getText());
		//}
		*/
		
		//File Upload & Download
		/*driver.get("https://encodable.com/uploaddemo/");
		driver.findElement(By.id("uploadname1")).sendKeys("C:/Users/Rudra/Documents/Tc1.java");*/
		
		//Mouse moveover
		/*driver.get("http://demoqa.com/menu/");
		driver.findElement(By.id("ui-id-2")).click();
		   
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//*[@id='navigate']/ul/li[1]/a"))).build().perform();
		//action.moveToElement(driver.findElement(By.linkText("About us"))).build().perform();
		//System.out.println("xx");
		//System.out.println("element is:"+driver.findElement(By.xpath("//*[@id='navigate']/ul/li[1]/a")).getText());
		driver.findElement(By.xpath("//div[@id='tabs-2']//a[text()='Home']")).click();*/
		
	
		//Download
		File folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_director", folder.getAbsolutePath());
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		System.out.println(folder);
		
		
		
		
	}
	

	

}
