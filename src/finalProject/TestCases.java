package finalProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCases extends Before {

//	@Test (priority=1) 
//	public void signUp () throws InterruptedException {
//driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
//Thread.sleep(3000);
//
//driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Lujain");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Nahya");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//		driver.get(
//				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
//
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//
//		Thread.sleep(3000);
//
//		String welcomeMsg = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span")).getText();
//
//		System.out.println(welcomeMsg);
//		Boolean check = welcomeMsg.contains("Welcome");
//
//
//		Assert.assertEquals(check, true);
//
//		
//		Assert.assertAll();
//	}
//	@Test ()
//	public void searchRandomly () {
//		String [] clothes = {"Jacket", "t-shirt", "jeans for men", "jeans for women","pants"};
//		Random rand= new Random ();
//		int Randomcl = rand.nextInt(5);
//
//		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(clothes[Randomcl]);
//		System.out.println(clothes[Randomcl]); }
//
//
//
//
//
//	@Test ()
//	public void checkout () throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//Thread.sleep(3000);
//
//		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//driver.findElement(By.name("company")).sendKeys("IT Company");
//
//driver.findElement(By.name("street[0]")).sendKeys("Wasfi Altall");
//driver.findElement(By.name("postcode")).sendKeys("56454");
//		Select drpCountry = new Select(driver.findElement(By.name("country_id")));
//
//		drpCountry.selectByVisibleText("Jordan");
//		driver.findElement(By.name("city")).sendKeys(" Amman");
//
//driver.findElement(By.name("telephone")).sendKeys("0787878787");
//Thread.sleep(3000);
//
//
//driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//Thread.sleep(3000);
//
//driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
//Thread.sleep(3000);
//String Total=driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[1]/td/span")).getText();
//String Expected="$571.00";
//Assert.assertEquals(Total, Expected);
//Assert.assertAll();
//	}
//	@Test ()
//	public void AnotherAssertPrice() throws InterruptedException {		
//
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]"));
//driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]")).click();
//		String total= driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[2]/div/span/span")).getText();
//		String Expected="$571.00";
//		Assert.assertEquals(total, Expected);
//		Assert.assertAll();
//	}
//	@Test ()
//	public void myAccount () throws InterruptedException {
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//Thread.sleep(3000);
//for(int i=0;i<5;i++) {
//	Thread.sleep(1000);
//
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
//		Thread.sleep(3000);
//
//	
//		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
//		Thread.sleep(5000);
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")).click();
//
////		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//	driver.findElement(By.id("co-shipping-method-form"));
//	Thread.sleep(2000);
//
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	Actions actions = new Actions(driver);
//
//	WebElement button=driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button"));
//
////	WebElement button = driver.findElement(By.cssSelector(".button.action.continue.primary"));
//actions.moveToElement(button).click().build().perform();
//
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div"));
//		Thread.sleep(2000);
//
//
//		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
//		Thread.sleep(2000);
//
//		driver.get("https://magento.softwaretestingboard.com/");}}
//	@Test ()
//	public void AssertReOrders() throws InterruptedException{
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//Thread.sleep(3000);
//Thread.sleep(1000);
//
//driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
//driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
//Thread.sleep(1000);
//
//driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
//Thread.sleep(3000);
//
//
//driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]")).click();
//Thread.sleep(3000);
//		String Total=driver.findElement(By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[1]/td/span")).getText();
//		String Expected="$552.00";
//		Assert.assertEquals(Total, Expected);
//		Assert.assertAll();

//	}
//		
//
//	@Test()
//	public void choosingItemsRandomly () throws InterruptedException {
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lujain.nahya64@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("LujainNahya66");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//Thread.sleep(4000);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//String [] basket = {"https://magento.softwaretestingboard.com/radiant-tee.html","https://magento.softwaretestingboard.com/breathe-easy-tank.html","https://magento.softwaretestingboard.com/argus-all-weather-tank.html","https://magento.softwaretestingboard.com/hero-hoodie.html","https://magento.softwaretestingboard.com/fusion-backpack.html"};
//
//		 String [] size = {"XS", "S", "M", "L","XL"};
//
//         Random random = new Random();
//			int Randomsize = random.nextInt(5);
//
//
//			for(int j=0;j<basket.length;j++) {
//
//			if(j==0) {
//
//for (int i=0; i<3;i++) {
//	driver.get(basket[0]);
//
//	Thread.sleep(3000);
//	
//
//	 String [] Color= {"Blue", "Orange", "Purple" };
//		int Randomcolor = random.nextInt(3);
//		WebElement color=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//		List <WebElement> rColor = color.findElements(By.tagName("div"));
//		Thread.sleep(3000);
//		WebElement stop=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//		List <WebElement> Stop = stop.findElements(By.tagName("div"));
//		Thread.sleep(3000);
//
//		Stop.get(Randomsize).click();
//		Thread.sleep(3000);
//
//		rColor.get(Randomcolor).click();
//		Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//Thread.sleep(3000);
//
//}
//driver.navigate().back();
//Thread.sleep(3000);
//
//			}
//			if(j==1) {
//				
//			for (int i=0; i<2;i++) {
//				driver.get(basket[1]);
//
//				Thread.sleep(3000);
//
//				WebElement stop=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//				List <WebElement> Stop = stop.findElements(By.tagName("div"));
//				 String [] RSColor= {"Purple", "White", "Yellow" };
//					int RandomScolor = random.nextInt(3);
//					WebElement Scolor=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//					List <WebElement> SColor = Scolor.findElements(By.tagName("div"));
//					Thread.sleep(3000);
//
//					Stop.get(Randomsize).click();
//					Thread.sleep(3000);
//					SColor.get(RandomScolor).click();
//					Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//			Thread.sleep(3000);
//}
//			driver.navigate().back();
//			Thread.sleep(3000);
//}
//				if(j==2) {
//					
//						
//						for (int i=0; i<4;i++) {
//							driver.get(basket[2]);
//
//							Thread.sleep(3000);
//							WebElement stop=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//							List <WebElement> Stop = stop.findElements(By.tagName("div"));
//							 String [] cgray= {"Gray" };
//								int RandomSgray = random.nextInt(1);
//
//							WebElement Gray=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//							List <WebElement> gray = Gray.findElements(By.tagName("div"));
//							Thread.sleep(3000);
//
//							Stop.get(Randomsize).click();
//							Thread.sleep(3000);
//
//							gray.get(RandomSgray).click();
//							Thread.sleep(3000);
//							driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//							Thread.sleep(3000);
//}
//						driver.navigate().back();
//						Thread.sleep(3000);
//}
//				
//					if(j==3) {
//						
//						for (int i=0; i<1;i++) {
//							driver.get(basket[3]);
//
//							Thread.sleep(3000);
//
//							WebElement stop=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[1]/div"));
//							List <WebElement> Stop = stop.findElements(By.tagName("div"));
//							Thread.sleep(3000);
//
//							 String [] RHColor= {"Black", "Gray", "Green" };
//								int RandomHcolor = random.nextInt(3);
//								WebElement Hcolor=driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//								List <WebElement> HColor = Hcolor.findElements(By.tagName("div"));
//								Thread.sleep(3000);
//
//								Stop.get(Randomsize).click();
//								Thread.sleep(3000);
//								HColor.get(RandomHcolor).click();
//								Thread.sleep(3000);
//						driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//						Thread.sleep(3000);
//					}driver.navigate().back();
//					Thread.sleep(3000);
//}
//					if(j==4) {
//						for(int i=0; i<5; i++)
//						{
//							driver.get(basket[4]);
//
//							Thread.sleep(3000);
//
//							driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//							Thread.sleep(3000);
//						}
//						driver.navigate().back();
//						Thread.sleep(3000);
//
//					}
//
//
//	}
//	}
}
