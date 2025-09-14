# CRUD de Receitas Médicas com Laravel

Um sistema CRUD (Create, Read, Update, Delete) para o gerenciamento de receitas médicas, construído com o framework PHP Laravel. Este projeto foi desenvolvido como parte de um estudo sobre Programação Orientada a Objetos.

_Este projeto é um fork de [enzormramos/crud_receita](https://github.com/enzormramos/crud_receita)._

## Objetivo

A aplicação visa demonstrar a implementação de operações básicas de banco de dados em um contexto real, utilizando as melhores práticas do padrão MVC e as ferramentas oferecidas pelo Laravel.

## Funcionalidades

-   Criação de novas receitas médicas, associando paciente e medicamentos.
-   Listagem de todas as receitas emitidas.
-   Edição e atualização de receitas existentes.
-   Exclusão de receitas do sistema.

## Tecnologias Utilizadas

-   **PHP**
-   **Laravel**
-   **Blade:** Para a construção das views.
-   **Eloquent ORM:** Para o mapeamento objeto-relacional.
-   **MySQL/MariaDB**

## Como Executar

1.  **Pré-requisitos:**

    -   PHP
    -   Composer
    -   Um servidor de banco de dados.

2.  **Passos:**
    -   Entre na pasta `laravel_crud_medical_prescription`.
    -   Instale as dependências: `composer install`.
    -   Copie `.env.example` para `.env` e configure as credenciais do banco.
    -   Gere uma chave de aplicação: `php artisan key:generate`.
    -   Execute as migrações do banco: `php artisan migrate`.
    -   Inicie o servidor: `php artisan serve`.
