package curso.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class StepsDefinitions {

	private WebDriverWait wait;
	WebElement lupa;
	WebElement input;
	WebDriver driver;
	
	@Before("@testeGabriel, @testeJuca")
	public void antes(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/gabrielazuirson/Downloads/chromedriver");
		//home/gabrielazuirson/workaula/selenium/chromedriver		

		driver = new ChromeDriver();		
		driver.get("https://try.discourse.org");
		wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After("@testeGabriel, @testeJuca")
	public void depois(){
		driver.close();
	}

	@Dado("O usuário esteja na página try.discourse.org")
	public  void dado(){
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "/home/gabrielazuirson/Downloads/chromedriver");
//		//home/gabrielazuirson/workaula/selenium/chromedriver		
//
//		driver = new ChromeDriver();		
//		driver.get("https://try.discourse.org");
//		wait = new WebDriverWait(driver, 10);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		//return driver;
	}

	@Quando("Clicar na lupa do canto superior direito")
	public void quandoLupa(){
		WebElement botao = driver.findElement(By.cssSelector("#search-button"));		
		botao.click();
	}

	@Quando("Digitar movies")
	public void quandoMovies(){
		input = driver.findElement(By.cssSelector("#search-term"));		
		input.sendKeys("movies");
	}

	@Quando("Clicar em show more")
	public void quandoShowMore(){
		wait.until(ExpectedConditions.visibilityOf(input));
		WebElement showMore = driver.findElement(By.cssSelector(".widget-link.filter"));		
		showMore.click();
	}

	@Quando("Clicar em Advanced Research")
	public void quandoAdvanced(){
		WebElement advanced = driver.findElement(By.cssSelector(".search-advanced-btn.btn"));		
		advanced.click();
	}

	@Quando("Inserir no campo Posted By o valor \"erick\"")
	public void quandoPosted(){
		WebElement postedby = driver.findElement(By.cssSelector("[name='user-selector-renamed']"));		
		postedby.sendKeys("erick");
	}

	@Quando("Clicar em fantasticfears")
	public void quandoFantastic(){
		WebElement selecionar = driver.findElement( By.cssSelector("[title='Erick Guan']"));		
		selecionar.click();
	}

	@Quando("Clicar no botão azul com icone da lupa")
	public void quandoLupaAzul(){
		lupa = driver.findElement(By.cssSelector(".search-container .btn-primary"));		
		lupa.click();	
	}

	@Então("O sistema retornará apenas 1 resultado")
	public void entaoResultado(){
		wait.until(ExpectedConditions.elementToBeClickable(lupa));
		WebElement contador = driver.findElement(By.cssSelector(".result-count"));	
		Assert.assertEquals("1 result for movies @fantasticfears", contador.getText());
	}


}
