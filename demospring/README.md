# Projeto de Cadastro de Máquinas com Spring Boot

Este é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos, focado em aplicar conceitos de herança e polimorfismo com o framework Spring Boot.

## Objetivo

O sistema implementa um CRUD (Create, Read, Update, Delete) para gerenciar um catálogo de máquinas industriais. A principal característica do projeto é o uso de uma classe abstrata `Maquina` e classes filhas que herdam seus atributos, como `Compressor`, `Furadeira` e `Empilhadeira`, cada uma com seus próprios campos específicos.

## Funcionalidades

- **Listagem de Máquinas:** Visualiza todas as máquinas cadastradas em uma única tabela.
- **Cadastro por Tipo:** Formulários específicos para adicionar novos compressores, furadeiras e empilhadeiras.
- **Exclusão de Máquinas:** Permite remover uma máquina do catálogo.
- **Persistência de Dados:** Utiliza Spring Data JPA para mapear as classes para uma única tabela no banco de dados, com uma coluna discriminadora para diferenciar os tipos.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Web:** Para a criação de controllers e rotas.
- **Spring Data JPA:** Para a persistência de dados.
- **Thymeleaf:** Como motor de templates para gerar as páginas HTML.
- **MySQL:** Banco de dados utilizado para armazenar os dados.
- **Maven:** Para gerenciamento de dependências.

## Como Executar

1.  **Pré-requisitos:**

    - JDK 17 ou superior.
    - Maven 3.x.
    - Um servidor de banco de dados MySQL em execução.

2.  **Configuração:**

    - Crie um banco de dados no MySQL chamado `poo`.
    - As configurações de conexão com o banco de dados podem ser ajustadas no arquivo `src/main/resources/application.properties`.

3.  **Execução:**
    - Navegue até a raiz do diretório `demospring` e execute o seguinte comando no terminal:
      ```bash
      ./mvnw spring-boot:run
      ```
    - A aplicação estará disponível em `http://localhost:8080/maquinas/list`.
