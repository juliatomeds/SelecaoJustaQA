package pageObjects;

import org.openqa.selenium.By;

public class PageObjects {

//  Seção Login
	public static final By botaoSignIn = By.className("login");
	public static final By campoEmailLogin = By.xpath("(//input[@name='email'])[1]");
	public static final By campoSenhaLogin = By.xpath("//input[@name='passwd']");
	public static final By botaoLogin = By.id("SubmitLogin");
	
//  Seção minha conta
	public static final By textoMinhaConta = By.xpath("//h1[contains(text(),'My account') and @class='page-heading']");

//  Seção Produto
	public static final By search = By.xpath("//*[@id='search_query_top']");
	public static final By botaoSearch = By.xpath("//*[@name='submit_search']");
	public static final By botaoBlusa = By.xpath("//*[contains(text(),'Faded Short Sleeve T-shirts') and @class='product-name']");
	public static final By botaoAddToCart = By.xpath("//*[text()='Add to cart']");
	public static final By botaoPChekout1 = By.xpath("//*[contains(text(),'Proceed to checkout')]");
	public static final By botaoPChekout2 = By.xpath("(//*[contains(text(),'Proceed to checkout')])[2]");
	public static final By botaoPChekout3 = By.xpath("(//*[contains(text(),'Proceed to checkout')])[2]");
	public static final By botaoPChekout4 = By.xpath("(//*[contains(text(),'Proceed to checkout')])[2]");
	public static final By botaoAgreeTerms = By.xpath("//*[@class='checker']");

//	Seção 03.Adress
	public static final By alterarDeliveryAddress = By.xpath("(//*[contains(text(),'Update')])[2]");
	public static final By alterarBillingAddress = By.xpath("(//*[contains(text(),'Update')])[3]");
	
//	Seção YOUR ADDRESS
	public static final By campoNomeEndereço = By.id("firstname");
	public static final By campoSobrenomeEndereço = By.id("lastname");
	public static final By campoEndereço = By.id("address1");
	public static final By campoCidade = By.id("city");
	public static final By selecionarEstado = By.id("id_state");
	public static final By campoCEP = By.id("postcode");
	public static final By selecionarPaís = By.id("id_country");
	public static final By campoCelular = By.id("phone_mobile");
	public static final By campoTelefone = By.id("phone");
	public static final By botaoRegistrar = By.id("submitAccount");
	public static final By botaoSalvar = By.xpath("//*[contains(text(),'Save')]");
	
//	Forma de Pagamento
	public static final By payByCheck = By.xpath("(//*[@class='cheque'])");
	public static final By payByBankWire = By.xpath("(//*[@class='bankwire'])");
	public static final By confirmMyOder = By.xpath("//*[contains(text(),'I confirm my order')]");	
}
