# APSPedroRogerio

Enunciado da APS:
"Descricao:
Implementar um software em java que demonstre a utilizacao de 3 design patterns em um mesmo contexto.
 As regras de negocio em si nao sao relevantes para o trabalho de forma que podem se resumir a prints na tela
 tal qual fazemos em sala. O que deve ser entregue e sera avaliado: - O codigo do trabalho no github. 
- Um texto(arquivo README.md) tambem no github explicando como utilizou cada padrao e qual vantagem conseguida
 ao utiliza-lo. O trabalho pode ser em dupla, lembre-se de descrever no mesmo arquivo readme.md o usuario do
 github e a qual componente do grupo ele esta associado. Por ex: pikachu_maluco2005@hotmail.com = Jose da Silva.
 Dica: Da pra ver que comitou o que la no github"

====================================
DESCRICAO DA UTILIZACAO E VANTAGENS
====================================

No primeiro caso, utilizamos o pattern Strategy. A  classe Servidor tem a responsablidade de definnir o comportamento
que fai modificar a forma como recebe seus proventos no final do mes. Entre outros comportamentos a instancia pode 'trabalhar'
normalmente o que definara salario integral, pode 'aposentar' determinando o recebimento  do salario de outra  formma ou ainda afastar
em licenca, 'licenciar', determinando outro modo de receber.

No segundo caso, Avaliacao, notamos que nao depende do objeto  o conhecimento da mudanca de comportamento originada pelo resultado
da avaliacao. Essa alteracao de comportamento geralmente escapa ao controle do servidor. E causada por outra fonte. Por isso a utili-
zacao do pattern State, que permite a retirada da responsabilidade da alteracao do comportamento da instancia.

Usuario: rogeriogm@unipam.edu.br = Rogerio Matoso.
Usuario:  pedrohff@unipam.edu.br = Pedro Fernandes.
