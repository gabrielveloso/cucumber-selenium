#language: pt
Funcionalidade: pesquisar por movies Erick
	
	@testeJuca
	Cenário: selecionar @fantasticfears
		Dado O usuário esteja na página try.discourse.org
		Quando Clicar na lupa do canto superior direito
		E Digitar movies,
		E Clicar em show more,
		E Clicar em Advanced Research,
		E Inserir no campo Posted By o valor "erick"
		E Clicar em fantasticfears
		E Clicar no botão azul com icone da lupa
		Então O sistema retornará apenas 1 resultado
		
	@testeGabriel
	Cenário: selecionar gabriel
		Dado O usuário esteja na página try.discourse.org
		Quando Clicar na lupa do canto superior direito
		E Digitar movies,
		E Clicar em show more,
		E Clicar em Advanced Research,
		E Inserir no campo Posted By o valor "erick"
		E Clicar em fantasticfears
		E Clicar no botão azul com icone da lupa
		Então O sistema retornará apenas 1 resultado