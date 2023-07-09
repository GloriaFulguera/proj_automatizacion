package primerAutomatizacion.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver=driver;
	}
	public WebDriver chromeConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Se abre el navegador y se amplia la ventana");
		
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}
		catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public void visit(String url) {
		driver.get(url);
	}
	
}
