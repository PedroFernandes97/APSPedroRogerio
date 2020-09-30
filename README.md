# APSPedroRogerio

Enunciado da APS:
"Descricao:
Implementar um software em java que demonstre a utilizacao de 3 design patterns em um mesmo contexto.
 As regras de negocio em si nao sao relevantes para o trabalho de forma que podem se resumir a prints na tela
 tal qual fazemos em sala. O que deve ser entregue e sera avaliado: - O codigo do trabalho no github. 
- Um texto(arquivo README.md) tambem no github explicando como utilizou cada padrao e qual vantagem conseguida
 ao utiliza-lo. O trabalho pode ser em dupla, lembre-se de descrever no mesmo arquivo readme.md o usuario do
 github e a qual componente do grupo ele esta associado. Por ex: pikachu_maluco2005@hotmail.com = Jose da Silva.
 Dica: Da pra ver quem comitou o que la no github"

                                        ====================================
                                        DESCRICAO DA UTILIZACAO E VANTAGENS
                                        ====================================
Strategy
No primeiro caso, utilizamos o pattern Strategy. A  classe Servidor tem a responsablidade de definnir o comportamento
que vai modificar a forma como recebe seus proventos no final do mes. Entre outros comportamentos a instancia pode 'trabalhar'
normalmente o que definira salario integral, pode 'aposentar' determinando o recebimento  do salario com paridade ou ainda afastar
em licenca, 'licenciar', determinando outro modo de receber. O strategy permite que a classe defina o comportamento que ira adotar.

State
No segundo caso, Avaliacao, notamos que nao depende do objeto  o conhecimento da mudanca de comportamento originada pelo resultado
da avaliacao. Essa alteracao de comportamento escapa ao controle do servidor. E causada por outra fonte, a 'Avaliação' que
altera um estado da instância. Esse estado, o resultado da avaliação irá influenciar em um comportamento especifico da instância,
progressão ou promoção, ou nenhum. Por isso a utilizacao do pattern State, que permite a retirada da responsabilidade da alteracao
do comportamento da instancia.

Template
Criamos um cenario de uma hipotetica troca de dados entre as classes ModoDeReceber, Avalliação e Pagamento, para a composição da
folha de pagamento dos servidores. O pattern adotado foi o Template, visto que os metodos devem ser processados na sequencia correta 
para que o relatorio seja gerado sem erros e enviado aos setores de RH e Contabilidade. O metoodo que é de responsabilidade do RH e 
da contabilidade é  apenas o 'receberRelatorio', que foi encappsulado como protected. FolhaPagamento é um pacote a parte.

Usuario: rogeriogm@unipam.edu.br = Rogerio Matoso.
Usuario: pedrohff@unipam.edu.br = Pedro Fernandes.
