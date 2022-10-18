# Left To Right Sum - Tests

Exercicio proposto para pratica do teste funcional. 

## Exercicio ##

![Enunciado](Exercicio-TesteFuncional.pdf?raw=true "Teste Funcional")

## Build ##

* JDK 17 
* Maven 3.8.6
* Jupiter 5.8.1

### JAVA e Maven ###
Para maiores informações dos ciclos de vidas e passos envolvendo o Maven:

* https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html

#### JAVA_HOME e MAVEN_HOME ####
Baixe a JDK 1.7 em qualquer site e rode :

* export JAVA_HOME= < Path do JDK17 baixado >
* export MAVEN_HOME= < Path do Maven baixado >

#### Rodar os testes ####

* cd < path para o projeto >
* $MAVEN_HOME/bin/mvn test

#### Validar o build ####

* cd < path para o projeto >
* $MAVEN_HOME/bin/mvn compile

#### Gerar o jar ####

* cd < path para o projeto >
* $MAVEN_HOME/bin/mvn package


#### Atualizar um jar ####

* jar cfm <nome-do-jar>.jar <arquivo-a-atualizar> <arquivos-.class>

* * c = indica que quer criar um jar file
* * f = output deve ir para um arquivo (no caso o arquivo jar que estamos criando)
* * m = mergear info dentro do jar

## Executar o programa ##

* navegue até a pasta target/, onde se encontra o left_right_app-1.0.jar
