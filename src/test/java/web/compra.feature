#language: pt
Funcionalidade: Fluxo de Compra

#1 - Eu, como Herói, desejo realizar a compra de produto e alterar o endereço de entrega;
  @CT1
  Delineação do Cenário: Comprar produto e alterar endereco de entrega
  	Dado que eu acessei o site automationpractice
  	E que eu efetuei o login
  	Quando realizar compra de um produto
  	Então devo alterar endereco de entrega
  	Então devo efetuar pagamento com a <forma de pagamento> desejada
  	
  	Exemplos:
  	|forma de pagamento |
  	|"cheque"						|
  	
#2 - Eu, como Herói, desejo realizar a compra de produto alterando o endreço de cobrança;
  @CT2
  Delineação do Cenário: Comprar produto e alterar endereco de cobranca
  	Dado que eu acessei o site automationpractice
  	E que eu efetuei o login
  	Quando realizar compra de um produto
  	Então devo alterar endereco de cobranca
  	Então devo efetuar pagamento com a <forma de pagamento> desejada
  	
  	Exemplos:
  	|forma de pagamento |
  	|"Bank Wire"				|
  	
#3 - Eu, como Herói, desejo realizar a compra e efeturar o pagamento com cheque.  	
  @CT3
  Delineação do Cenário: Comprar produto e efetuar pagamento com cheque
  	Dado que eu acessei o site automationpractice
  	E que eu efetuei o login
  	Quando realizar compra de um produto
  	Então devo efetuar pagamento com a <forma de pagamento> desejada
  	
  	Exemplos:
  	|forma de pagamento |
  	|"cheque"						|