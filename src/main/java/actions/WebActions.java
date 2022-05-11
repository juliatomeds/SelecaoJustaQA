package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.PageObjects;
import utils.Utils;

public class WebActions {

	WebDriver driver;
	WebDriverWait wait;
	Utils utils;
	
	public WebActions(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 5);
		utils = new Utils(driver);
	}

	public void acessarSite(String string) {
		driver.get("http://automationpractice.com/");
		wait.until(ExpectedConditions.titleIs("My Store"));
	}

	public void efetuarLogin(String email, String senha) {
		wait.until(ExpectedConditions.presenceOfElementLocated(PageObjects.botaoSignIn));
		driver.findElement(PageObjects.botaoSignIn).click();
		driver.findElement(PageObjects.campoEmailLogin).sendKeys(email);
		driver.findElement(PageObjects.campoSenhaLogin).sendKeys(senha);
		driver.findElement(PageObjects.botaoLogin).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(PageObjects.textoMinhaConta));
	}

	public void iniciarCompraProduto() {
		driver.findElement(PageObjects.search).sendKeys("Faded Short Sleeve T-shirts");
		driver.findElement(PageObjects.botaoSearch).click();
		driver.findElement(PageObjects.botaoBlusa).click();
		driver.findElement(PageObjects.botaoAddToCart).click();
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.botaoPChekout1)));
		driver.findElement(PageObjects.botaoPChekout1).click();
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.botaoPChekout2)));
		driver.findElement(PageObjects.botaoPChekout2).click(); 
	}

	public void alterarEndereco() {
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.alterarDeliveryAddress)));
		driver.findElement(PageObjects.alterarDeliveryAddress).click();
		driver.findElement(PageObjects.campoNomeEndereço).clear();
		driver.findElement(PageObjects.campoSobrenomeEndereço).clear();
		driver.findElement(PageObjects.campoEndereço).clear();
		driver.findElement(PageObjects.campoCidade).clear();
		driver.findElement(PageObjects.campoCEP).clear();
		driver.findElement(PageObjects.campoTelefone).clear();
		driver.findElement(PageObjects.campoCelular).clear();
		
		driver.findElement(PageObjects.campoNomeEndereço).sendKeys("Gabriela");
		driver.findElement(PageObjects.campoSobrenomeEndereço).sendKeys("Da Silva");
		driver.findElement(PageObjects.campoEndereço).sendKeys("Avenida Caxanga");
		driver.findElement(PageObjects.campoCidade).sendKeys("Recife");
		driver.findElement(PageObjects.campoCEP).sendKeys("51110");
		driver.findElement(PageObjects.campoTelefone).sendKeys("123456789");
		driver.findElement(PageObjects.campoCelular).sendKeys("123456789");
		
		utils.selecionarElementoporTexto(PageObjects.selecionarEstado, "Alabama");
		utils.selecionarElementoporTexto(PageObjects.selecionarPaís, "United States");	
		driver.findElement(PageObjects.botaoSalvar).click(); 
	}

	public void finalizarCompraProduto() {
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.botaoPChekout3)));
		driver.findElement(PageObjects.botaoPChekout3).click(); 
		driver.findElement(PageObjects.botaoAgreeTerms).click();
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.botaoPChekout4)));
		driver.findElement(PageObjects.botaoPChekout4).click(); 
	}

	public void efetuarPagamento(String formadepagamento) {
		if (formadepagamento == "cheque") {
			wait.until((ExpectedConditions.elementToBeClickable(PageObjects.payByCheck)));
			driver.findElement(PageObjects.payByCheck).click();
			wait.until((ExpectedConditions.elementToBeClickable(PageObjects.confirmMyOder)));
			driver.findElement(PageObjects.confirmMyOder).click();			
		}else {
			wait.until((ExpectedConditions.elementToBeClickable(PageObjects.payByBankWire)));
			driver.findElement(PageObjects.payByBankWire).click();
			wait.until((ExpectedConditions.elementToBeClickable(PageObjects.confirmMyOder)));
			driver.findElement(PageObjects.confirmMyOder).click();			
		}
	}

	public void alterarEnderecoCobranca() {
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.alterarBillingAddress)));
		driver.findElement(PageObjects.alterarBillingAddress).click();
		driver.findElement(PageObjects.campoNomeEndereço).clear();
		driver.findElement(PageObjects.campoSobrenomeEndereço).clear();
		driver.findElement(PageObjects.campoEndereço).clear();
		driver.findElement(PageObjects.campoCidade).clear();
		driver.findElement(PageObjects.campoCEP).clear();
		driver.findElement(PageObjects.campoTelefone).clear();
		driver.findElement(PageObjects.campoCelular).clear();
		
		driver.findElement(PageObjects.campoNomeEndereço).sendKeys("Gabriela");
		driver.findElement(PageObjects.campoSobrenomeEndereço).sendKeys("Da Silva");
		driver.findElement(PageObjects.campoEndereço).sendKeys("Avenida Caxanga");
		driver.findElement(PageObjects.campoCidade).sendKeys("Recife");
		driver.findElement(PageObjects.campoCEP).sendKeys("51110");
		driver.findElement(PageObjects.campoTelefone).sendKeys("123456789");
		driver.findElement(PageObjects.campoCelular).sendKeys("123456789");
		
		utils.selecionarElementoporTexto(PageObjects.selecionarEstado, "Alabama");
		utils.selecionarElementoporTexto(PageObjects.selecionarPaís, "United States");	
		driver.findElement(PageObjects.botaoSalvar).click(); 		
	}

	public void finalizarShipping() {
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.botaoPChekout3)));
		driver.findElement(PageObjects.botaoPChekout3).click(); 
		driver.findElement(PageObjects.botaoAgreeTerms).click();
		wait.until((ExpectedConditions.elementToBeClickable(PageObjects.botaoPChekout4)));
		driver.findElement(PageObjects.botaoPChekout4).click(); 
	}

}
