package curso.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAlegria {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/gabrielazuirson/Downloads/chromedriver");
		//home/gabrielazuirson/workaula/selenium/chromedriver
		
		
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://form.jotformz.com/72358004584659");
//		WebElement fale = driver.findElement(By.cssSelector("a[href*=\"https://www.ufpe.br/agencia/fale-conosco\"]"));		
//		System.out.print(fale.getText());		
//		fale.click();

//		WebElement body = driver.findElement(By.cssSelector("body"));		
//		System.out.println(body.getAttribute("class"));	
//		
//		WebElement dolar = driver.findElement(By.cssSelector(".dolar"));		
//		System.out.println(dolar.getText());	
//		
//		WebElement signo = driver.findElement(By.cssSelector(".widget-horoscopo__title"));		
//		System.out.println(signo.getText());	


		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement botao = driver.findElement(By.cssSelector("#jfCard-welcome-start"));		
		botao.click();
		
		WebElement campo1 = driver.findElement(By.cssSelector("#first_5"));		
		campo1.sendKeys("teste");
		
		
		WebElement campo2 = driver.findElement(By.cssSelector("#last_5"));		
		campo2.sendKeys("teste2");
		
		WebElement botao2 = driver.findElement(By.cssSelector(".jfInput-button.forNext.u-right"));		
		botao2.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".jfRadio-labelText")));
		WebElement radio1 = driver.findElement(By.cssSelector(".jfRadio-labelText"));		
		radio1.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#cid_8 .jfInput-button.forNext.u-right")));
		WebElement botaoNext = driver.findElement(By.cssSelector("#cid_8 .jfInput-button.forNext.u-right"));		
		botaoNext.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#input_2")));
		WebElement email = driver.findElement(By.cssSelector("#input_2"));		
		email.sendKeys("juca@ufpe.br");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#cid_2 .jfInput-button.forNext.u-right")));
		WebElement botaoEmail = driver.findElement(By.cssSelector("#cid_2 .jfInput-button.forNext.u-right"));		
		botaoEmail.click();
		
		WebElement add = driver.findElement(By.cssSelector("#input_4_addr_line1"));		
		add.sendKeys("juca@ufpe.br");
		
		WebElement add2 = driver.findElement(By.cssSelector("#input_4_addr_line2"));		
		add2.sendKeys("juca@ufpe.br");
		
		WebElement cid = driver.findElement(By.cssSelector("#input_4_city"));		
		cid.sendKeys("juca@ufpe.br");
		
		WebElement estado = driver.findElement(By.cssSelector("#input_4_state"));		
		estado.sendKeys("juca@ufpe.br");
		
		WebElement postal = driver.findElement(By.cssSelector("#input_4_postal"));		
		postal.sendKeys("454654");
		
		//wait.until(ExpectedConditions.elementToBe(By.cssSelector("#input_4_country")));
		WebElement country = driver.findElement(By.cssSelector(".jfDropdown-search"));		
		country.sendKeys("Albania");
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-value='Albania']")));
		WebElement select = driver.findElement(By.cssSelector("[data-value='Albania']"));		
		select.click();
		
		//wait.until(ExpectedConditions.visibilityOf(select));
		
		driver.close();

	}

}
