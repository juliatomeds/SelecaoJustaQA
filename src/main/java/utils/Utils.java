package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utils {
	
	private WebDriver driver;
	WebDriverWait wait;
	
	public Utils(WebDriver Driver) {
		this.driver = Driver;
	}
	
	public void selecionarElementoporTexto(By by, String Texto) {
		Select select = new Select(driver.findElement(by));
		select.selectByVisibleText(Texto);
	}
	
	public void selecionarElementoporValor(By by, String Valor) {
		Select select = new Select(driver.findElement(by));
		select.selectByValue(Valor);
	}

}
