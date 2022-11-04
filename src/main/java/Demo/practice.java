package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Browser is opened");
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://snapmint:ciHns$@NKSa@qa2.snapmint.com/merchant-demo");
		System.out.println("URL is opened");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		WebElement Username= driver.findElement(By.xpath(""));
//		Username.sendKeys("");
//		WebElement password =driver.findElement(By.xpath(""));
//		password.sendKeys("");
		WebElement mobile =driver.findElement(By.xpath("//input[@id='new-mobile']"));
		mobile.sendKeys("9231456785");
		System.out.println("Mob no. entered");
		
		WebElement merchantid =driver.findElement(By.xpath("//input[@name='merchant_id']"));
		merchantid.clear();
		Thread.sleep(1500);
		merchantid.sendKeys("114");
		System.out.println("Merchant id Entered");
		Thread.sleep(1500);
		
		WebElement ordervalue =driver.findElement(By.xpath("//input[@name='order_value']"));
		ordervalue.clear();
		Thread.sleep(1500);
		ordervalue.sendKeys("10000");
		System.out.println("Orderid Entered");
		Thread.sleep(1500);
		
		WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
		email.clear();
		Thread.sleep(1500);
		email.sendKeys("xyubs@snapmint.com");
		System.out.println("Email Entered");
		Thread.sleep(1500);
		
		WebElement checksum =driver.findElement(By.xpath("//input[@id='checksum_btn']"));
		checksum.click();
		System.out.println("CheckSum Button clicked");
		Thread.sleep(1500);
		
		WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(1500);
		System.out.println("Submit button clicked");
		Thread.sleep(6000);
		
		WebElement OTP =driver.findElement(By.xpath("//input[@id='first']"));
		OTP.sendKeys("1010");
		System.out.println("OPT Entered");
		Thread.sleep(1500);
		
		WebElement Verifybutton =driver.findElement(By.xpath("//button[@class='buttonbox fw-600 pd-wd-stylr']"));
		Verifybutton.click();
		System.out.println("Verify Button is clicked");
		Thread.sleep(1500);
		
		WebElement Name =driver.findElement(By.xpath("( //input[contains(@class,'input-box')])[1]"));
		Name.sendKeys("Ashish");
		System.out.println("First Name Entered");
		Thread.sleep(1500);
		
		WebElement lastname =driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("Patil");
		System.out.println("Last name Entered");
		Thread.sleep(1500);
		
		WebElement houseno =driver.findElement(By.xpath("(//input[@class='input-box'])[3]"));
		houseno.sendKeys("46 Indore");
		System.out.println("House no Entered");
		Thread.sleep(1500);
		
		WebElement Area= driver.findElement(By.xpath("//input[@name='address_line_2']"));
		Area.sendKeys("Near Sharma Jalabi");
		System.out.println("Area Entered");
		Thread.sleep(1500);
		
		WebElement pincode =driver.findElement(By.xpath("//input[@name='zipcode']"));
		pincode.sendKeys("452010");
		System.out.println("Pincode is entered");
		Thread.sleep(1500);
		
		WebElement DeliverAddress =driver.findElement(By.xpath("//button[@class='btn blue-btn snap_deliver_btn']"));
		DeliverAddress.click();
		System.out.println("Deliver Address Clicked");
		Thread.sleep(1500);
		
		WebElement Pancard =driver.findElement(By.xpath("//input[@id='pan']"));
	    Pancard.sendKeys("NZTPK7009D");
	    System.out.println("Pancard Entered");
	    Thread.sleep(6000);
	    
	    WebElement Gender =driver.findElement(By.xpath(""));
	    Gender.isSelected();
	    System.out.println("Gender Applied");
	    Thread.sleep(1500);
	    
	    WebElement day =driver.findElement(By.xpath("//div[text()='Day']"));
	    day.sendKeys("12");
	    System.out.println("Day Entered");
	    Thread.sleep(1500);
	    
	    WebElement Month =driver.findElement(By.xpath("//div[text()='Month']"));
	    Month.sendKeys("July");
	    System.out.println("Monthh Entered");
	    Thread.sleep(1500);
	    
	    WebElement Year=driver.findElement(By.xpath("//div[text()='Year']"));
	    Year.sendKeys("1997");
	    System.out.println("Year Entered");
	    Thread.sleep(1500);
	    
	    WebElement Next =driver.findElement(By.xpath("//button[text()='Next']"));
	    Next.click();
	    System.out.println("Next Button Clicked");
	    Thread.sleep(1500);
	    
	    
	    
	    
	    
	    
		}
		

	}


