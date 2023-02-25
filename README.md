
# Workshop
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/KaianLuciano/workshop-springboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Workshop é um WorkShop feito com o intuito de consolidar meus conhecimentos.

A aplicação consiste na produção de pedidos, aonde os dados inseridos são armazenados temporariamente no banco de dados de teste H2, podem ser feitas também
a atualização de dados, deleção, procurar por todos (Usúarios, pedidos, itens do pedido, categoria etc.) e procurar por ID.

# Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2
- Postman

## Layout da Aplicação
![Aplicação](https://github.com/KaianLuciano/assets/blob/main/Estrutura.png)

## Banco de Dados
![H2](https://github.com/KaianLuciano/assets/blob/main/H2main.png)

## Postman (Associações funcionando)
São feitas no Postman, os testes de associações, exceções personalizadas etc.

![Postman](https://github.com/KaianLuciano/assets/blob/main/Associação.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/KaianLuciano/assets/blob/main/UML.png)

# Como executar o projeto

Pré-requisitos: Java 17, SQL, STS(SpringToolsSuite) - Eclipse, Git.

## 1) Clonar Repositório
git clone https://github.com/KaianLuciano/workshop-springboot3-jpa

## 2) Abrir o projeto no Spring Tools

## 3) Executar a aplicação conforme as instruções abaixo.
![PassoApasso](https://github.com/KaianLuciano/assets/blob/main/PassoApasso.png)

## 4) Escreva (localhost:8080/h2-console) no navegador, logo em seguida aperte Connect.
![LocalHost](https://github.com/KaianLuciano/assets/blob/main/LocalHost.png)

# Como testar associações, exceções etc no Postman.
## Basta colocar localhost:8080/order/{id desejado} na barra de pesquisa conforme a imagem;
Obs: Para testar exceções basta digitar um ID inexistente.

![PostmanTest](https://github.com/KaianLuciano/assets/blob/main/PostmanTest.png)

# Autor

Kaian Luciano Alves Dos Santos

https://www.linkedin.com/in/kaian-luciano-92a5b9227/
