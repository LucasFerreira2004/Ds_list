# DSList

DSList é um projeto desenvolvido com **Spring Boot** que implementa os conceitos de **Embedded IDs**, **MVC** e **containerização do banco de dados PostgreSQL via Docker**. O projeto também utiliza perfis de projeto para configurar diferentes ambientes, incluindo um banco de dados em memória para testes.

## Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **H2 Database**
- **Docker**
- **DTOs (Data Transfer Objects)**

## Funcionalidades Implementadas

- Utiliza **Embedded IDs** para composição de chaves primárias.
- Aplica o padrão **MVC** para separação de responsabilidades.
- Containerização do banco de dados **PostgreSQL** com **Docker**.
- Implementa perfis de projeto:
  - **Testes:** utiliza banco de dados em memória (**H2**).
  - **Desenvolvimento:** utiliza banco de dados relacional **PostgreSQL** via Docker.
- Utiliza **DTOs** para troca de informações entre os services e os controllers.

## Configuração do Ambiente

### Requisitos
- **Java 17** ou superior
- **Docker** e **Docker Compose**
- **Maven**

### Configuração do Banco de Dados

Para rodar o banco de dados **PostgreSQL** no ambiente de desenvolvimento, utilize o Docker Compose:

```sh
docker-compose up -d
```

Caso precise parar os containers:

```sh
docker-compose down
```

### Executando a Aplicação

Com o banco de dados configurado, execute o projeto com o seguinte comando:

```sh
./mvnw spring-boot:run
```

## Estrutura do Projeto

```
 dslist/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/example/dslist/
 │   │   │   ├── controllers/   # Controllers MVC
 │   │   │   ├── entities/      # Entidades do banco de dados
 │   │   │   ├── dto/           # Data Transfer Objects
 │   │   │   ├── repositories/  # Camada de persistência
 │   │   │   ├── services/      # Camada de serviço
 │   │   ├── resources/         # Arquivos de configuração (application.properties)
 │   ├── test/                
 ├── docker-compose.yml         # Configuração do PostgreSQL via Docker
 ├── pom.xml                    # Dependências e configurações do Maven
 ├── README.md                  # Documentação do projeto
```

## Contato

Caso tenha dúvidas ou sugestões, fique à vontade para contribuir!

---

Esse README fornece uma visão clara e objetiva sobre o projeto, incluindo as tecnologias utilizadas, funcionalidades e instruções de configuração.

