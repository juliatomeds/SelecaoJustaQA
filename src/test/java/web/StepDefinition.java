package web;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import actions.WebActions;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class StepDefinition {
	
	WebDriver driver;
	WebActions actions;
	String email="candidato@justa.com.vc";
	String senha= "tamojusto";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		actions = new WebActions(driver);	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Dado("que eu acessei o site automationpractice")
	public void que_eu_acessei_o_site_automationpractice() {
		actions.acessarSite("http://automationpractice.com/");
	}

	@Dado("que eu efetuei o login")
	public void que_eu_efetuei_o_login() {
		actions.efetuarLogin(email,senha);
	}

	@Quando("realizar compra de um produto")
	public void realizar_compra_de_um_produto() {
		actions.iniciarCompraProduto();
	}

	@Então("devo alterar endereco de entrega")
	public void devo_alterar_endereco_de_entrega() {
		actions.alterarEndereco();
	}
	
	@Então("devo alterar endereco de cobranca")
	public void devo_alterar_endereco_de_cobranca() {
		actions.alterarEnderecoCobranca();
	}
	
	@Então("devo efetuar pagamento com a {string} desejada")
	public void devo_efetuar_pagamento(String formadepagamento) {
		actions.finalizarShipping();
		actions.efetuarPagamento(formadepagamento);
	}
}
