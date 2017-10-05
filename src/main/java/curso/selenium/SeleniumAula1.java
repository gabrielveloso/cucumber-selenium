package curso.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAula1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/gabrielazuirson/Downloads/chromedriver");
		//home/gabrielazuirson/workaula/selenium/chromedriver		

		WebDriver driver = new ChromeDriver();		
		driver.get("https://try.discourse.org");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement botao = driver.findElement(By.cssSelector("#search-button"));		
		botao.click();

		WebElement input = driver.findElement(By.cssSelector("#search-term"));		
		input.sendKeys("movies");

		wait.until(ExpectedConditions.visibilityOf(input));

		WebElement showMore = driver.findElement(By.cssSelector(".widget-link.filter"));		
		showMore.click();

		WebElement advanced = driver.findElement(By.cssSelector(".search-advanced-btn.btn"));		
		advanced.click();

		WebElement postedby = driver.findElement(By.cssSelector("[name='user-selector-renamed']"));		
		postedby.sendKeys("erick");

		WebElement selecionar = driver.findElement( By.cssSelector("[title='Erick Guan']"));		
		selecionar.click();


		WebElement lupa = driver.findElement(By.cssSelector(".search-container .btn-primary"));		
		lupa.click();	
		wait.until(ExpectedConditions.elementToBeClickable(lupa));

		WebElement contador = driver.findElement(By.cssSelector(".result-count"));		
		
		System.out.println(contador.getText());
	}

}
