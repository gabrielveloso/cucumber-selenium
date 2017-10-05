package curso.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAula2 {

	public static WebDriver abrirSite(){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/gabrielazuirson/Downloads/chromedriver");
		//home/gabrielazuirson/workaula/selenium/chromedriver		

		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.viajanet.com.br/");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void cenario1(WebDriver driver){
		WebElement botao = driver.findElement(By.cssSelector("#iptRoundTrip"));		
		botao.click();
		WebElement origem = driver.findElement(By.cssSelector("#inptorigin"));	
		origem.sendKeys("Recife");

		WebElement destino = driver.findElement(By.cssSelector("#inptdestination"));	
		destino.sendKeys("Salvador");
		
		
		WebElement dataPartida = driver.findElement(By.cssSelector("#departureDate"));		 
		 
		dataPartida.click();
		
		WebElement escolher = driver.findElement(By.cssSelector(".pika-single.is-bound.ida.is-hidden .pika-button.pika-day.btn-18102017"));	
		
		// .pika-button.pika-day.btn-18102017
		 
		
		escolher.click();
		
		
		
		/*if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver)
			.executeScript("var s = document.getElementById(\"departureDate\"); "
					+ "s.value = '21/12/2017'");
		}*/
		
		WebElement dataVolta = driver.findElement(By.cssSelector("#arrivalDate"));
		dataVolta.click();
		
		//dataPartida.click();
		//dataPartida.click();
		//departureDate
		
		
		//driver.close();
		
		//WebElement dataPartida = driver.findElement(By.cssSelector("#departureDate"));		 
		 
		//dataPartida.click();

	}

	public static void main(String[] args) {

		WebDriver driver = abrirSite();
		
		cenario1(driver);

		/*WebDriverWait wait = new WebDriverWait(driver, 10);
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

		System.out.println(contador.getText());*/
	}

}



