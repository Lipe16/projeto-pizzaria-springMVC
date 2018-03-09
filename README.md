# projeto-pizzaria-springMVC
Projeto java de um app de pizzaria utilizando spring (fontes aprendidos no curso)

  O projeto utiliza spring, banco de dados, hibernate, bootstrap, Jquary... Neste projeto é apresentando de maneira simples a estrutura do spring e como ele trabalha.

O projeto foi feito na IDE eclipse utilizando maven, então ao baixar o projeto basta dar um 'maven update' para baixar todas as dependencias e para executalo utilizei o Jetty pois com ele não preciso instalar um servidor mais robusto na minha máquina como Tom Cat.

Como o projeto é protegido com login, quando executar ele é bom que tenha um banco de dados com nome 'pizzaria' e o hibernate cuida do resto pra você desde que configure ele direitinho com endereço, usuario e senha do seu banco de dados... Feito isso depois que executar o projeto e o hibernate criar as tabelas insira lá manualmente um usuario, senha e o tipo de permissão para ele, por exemplo

Usuario: admin
o spring faz criptografia de senha ao colocar no BD, a senha abaixo é admin criptografada
senha: $2a$10$qyw55m6.b3VV19Ie87Z16.HJSFOQHlxF9MrX6uk78/K00iArsmPU.

coloque também a permissão "Pizzaria para esse usuario", para fazer isso você vai ter que inserir o valor "pizzaria" na tabela permissao e usar id desse valor na tabela usuario_permissao com id do usuario que você criou ou pode ser admin mesmo

https://image.ibb.co/mmD3Nn/BDTabelapermissao.png
https://image.ibb.co/eKZzv7/BDTabelapermissao_Usuario.png
https://image.ibb.co/hgrq2n/BDTabela_Usuario.png


https://image.ibb.co/bEE2hn/autenticacao.png
https://image.ibb.co/k7UPv7/Internacionalizacao.png
https://image.ibb.co/iDHYoS/Pizzaria_Spring.png
https://image.ibb.co/gfWtoS/populanto_Tabelas.png