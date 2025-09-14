# CRUD Simples em Laravel

Projeto de estudo para criar um sistema de cadastro de computadores.

**Tecnologias:** PHP, Laravel, PostgreSQL.

---

## Como Executar

1.  **Clone o repositório e entre na pasta:**

    ```bash
    git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
    cd seu-repositorio
    ```

2.  **Instale as dependências:**

    ```bash
    composer install
    ```

3.  **Configure o ambiente:**

    -   Copie o arquivo `.env.example` para `.env`:
        ```bash
        cp .env.example .env
        ```
    -   No arquivo `.env`, configure suas credenciais do banco de dados PostgreSQL.

4.  **Gere a chave da aplicação:**

    ```bash
    php artisan key:generate
    ```

5.  **Crie as tabelas e popule o banco:**

    ```bash
    php artisan migrate --seed
    ```

6.  **Inicie o servidor:**

    ```bash
    php artisan serve
    ```
