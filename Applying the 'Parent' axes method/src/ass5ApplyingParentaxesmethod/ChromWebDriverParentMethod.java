package ass5ApplyingParentaxesmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriverParentMethod {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://itmeo.com/");

		// Maximize current window
		driver.manage().window().maximize();

	}

	/**
	 * Test using 'Parent' axes method, Type of XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// ex1 ------- 'Parent' axes method
		WebElement textMethod1 = driver.findElement(By.xpath("//img//parent::div[@class='logo']"));
		System.out.println("ex1 DONE Successfully the location of WebElement is =" + textMethod1.getLocation());

		// ex2 ------- 'Parent' axes method With contains() method
		WebElement textMethod2 = driver
				.findElement(By.xpath("//a[text()='UI & dashboards']//parent::li[contains(@class,'tags-nav__item')]"));
		System.out.println("ex2 DONE Successfully the location of WebElement is =" + textMethod2.getLocation());

		// ex3 ------- 'Parent' axes method with AND operation
		WebElement textMethod3 = driver.findElement(
				By.xpath("//img//parent::a[contains(@class,'product-hunt') and contains(@target,'_blank')]"));
		System.out.println("ex3 DONE Successfully the location of WebElement is =" + textMethod3.getLocation());

		// ex4 ------- 'Parent' axes method with OR operation
		WebElement textMethod4 = driver
				.findElement(By.xpath("//img//parent::a[@class='product-hunt' or @class='_blank']"));
		System.out.println("ex4 DONE Successfully the location of WebElement is =" + textMethod4.getClass());
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
