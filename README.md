# Aula de Cucumber + selenium

## CONCEITO DE TESTES FUNCIONAIS

O teste funcional
O teste funcional também é conhecido como teste da caixa-preta, sendo usado para entender como o sistema se comportaria durante a navegação de um usuário. Especialmente se ele usasse dados de entrada diferentes dos especificados pelo programa, como um preenchimento incorreto num cadastro. Nesse caso, verifica-se se o software avisa o usuário ou se aceita o erro, se dá falha e por aí vai.

O teste também pode identificar problemas com o funcionamento da interface, programas de navegação que iniciam ou abrem lentamente uma página após alguma alteração do usuário, softwares que não encerram ou não atualizam devido a configuração modificadas na interface, links direcionando para páginas ou seções erradas etc.

Lembrando que é interessante o desenvolvedor ou testador passar-se por um usuário, buscando identificar quais as incongruências mais comuns que eles cometem em algumas páginas, como o citado preenchimento errado ou não adequação às normas de confecção de uma senha (se respeita ou não o limite de caracteres, se usa símbolos e maiúsculas como foi pedido etc.), por exemplo. Não que seja culpa do usuário, mas é frequente ocorrer divergências na hora de se preencher formulários, pois cada sistema tem um padrão que poderá não servir no outro. Exemplo: numa loja o usuário precisa colocar o nome como login, já em outra deve ser um e-mail e por aí vai. Ele pode tentar pôr o e-mail em todas, e se conseguir, é sinal de o sistema que não deveria aceitar falhou. Direcionamento de links para domínios ou páginas erradas também é um erro que nesse caso atrapalharia o usuário, mas que pode ser identificado no teste funcional.

Quanto mais informações e dados de entrada o testador puder avaliar, melhor as chances de eliminar os erros no sistema. Contudo, pode-se utilizar uma pequena amostragem das falhas mais comuns que ocorrem no tipo de software testado para que sejam verificadas.


## BOA REFERÊNCIA
https://henriqueluz.com.br/2015/01/18/automatizando-testes-funcionais-com-selenium-cucumber/

## OBSERVAR A PIRÂMIDADE DE TESTES
https://martinfowler.com/bliki/TestPyramid.html


