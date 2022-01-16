package week2.day;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DropDowns {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.id("dropdown1"));
			Select sel = new Select(element);
			sel.selectByIndex(1);
			WebElement elem = driver.findElement(By.name("dropdown2"));
			Select sele= new Select(elem);
			sele.selectByVisibleText("Appium");
			WebElement element2 = driver.findElement(By.id("dropdown3"));
			Select selem = new Select (element2);
			selem.selectByValue("4");
			WebElement element3 = driver.findElement(By.className("dropdown"));
			Select selects = new Select (element3);
			List<WebElement> allOptions = selects.getOptions();
			System.out.println(allOptions);
			WebElement element4 = driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']"));
			element4.sendKeys("Selenium");
		
		
		}

	}