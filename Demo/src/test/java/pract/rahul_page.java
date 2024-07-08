package pract;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class rahul_page {
	WebDriver d;
	@BeforeTest
	public void open_browser() {
		
		d=new FirefoxDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}	@Test
		public void radio_button() throws InterruptedException{
	List <WebElement>ele =d.findElements(By.cssSelector(".radioButton"));
		for(WebElement e:ele) {
			if (e.getAttribute("value")=="radio2") {
				e.click();
				
				}
			
		}
		}
	@Test
	public void check_box() throws Exception {
		List <WebElement>ele =d.findElements(By.xpath("//div[@id=\"checkbox-example\"]//label"));
			for(WebElement e1:ele) {
				Thread.sleep(2000);
				System.out.println(e1.isDisplayed());
				System.out.println(e1.getAttribute("value"));
				if(e1.getAttribute("value")=="option3");
				e1.click();
	}
	}		@Test
		public void switch_alert() {
			d.findElement(By.id("name")).sendKeys("basava");
			d.findElement(By.id("alertbtn")).click();
			Alert a=d.switchTo().alert();
			System.out.println(a.getText());
			a.dismiss();
	
		}	@Test
	public void dropdown() {
			WebElement e2=d.findElement(By.cssSelector("#dropdown-class-example"));
			Select s=new Select(e2);
			s.selectByValue("option2");

	}	@Test
		public void switch_window() throws Exception {
			d.findElement(By.cssSelector("#openwindow")).click();
			String c_w=d.getWindowHandle();
			Set<String> wins=d.getWindowHandles();
			for(String w:wins) {
				if (w!=c_w) {
					d.switchTo().window(w);
					d.switchTo().window(c_w);
					Thread.sleep(2000);
				String t=d.findElement(By.xpath("//a[@class='blinkingText']")).getText();
				System.out.println(t);
				}
			}
			List<WebElement> s= d.findElements(By.tagName("h2"));
			for(WebElement str:s) {
				System.out.println(str.getText());
			}
			
			
		}
		

@AfterTest()
public void teardown() {
	d.quit();
}}
