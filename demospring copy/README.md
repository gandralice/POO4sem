# 🛠️ Projeto Manutenção de Máquinas

Sistema web para **gestão de máquinas industriais e suas manutenções**, permitindo o controle de serviços realizados por técnicos responsáveis.

---

## 📋 Funcionalidades

- Cadastro de diferentes tipos de máquinas:
  - Compressor
  - Furadeira
  - Empilhadeira
- Registro de manutenções por máquina
- Associação de técnico (funcionário) responsável pela manutenção
- Listagem detalhada com histórico de serviços realizados
- Interface amigável usando HTML + Bootstrap

---

## 🚀 Tecnologias Utilizadas

| Tecnologia      | Descrição                           |
| --------------- | ----------------------------------- |
| Java 17         | Linguagem principal                 |
| Spring Boot     | Framework backend                   |
| Spring Data JPA | Acesso e persistência de dados      |
| Thymeleaf       | Template engine para HTML dinâmico  |
| MySQL           | Banco de dados relacional           |
| Bootstrap 5     | Estilização e layout responsivo     |
| Maven           | Gerenciador de dependências e build |

---

## 💾 Banco de Dados

### Tabelas principais:

- `maquina`
- `manutencao`
- `funcionario`

Relacionamentos:

- Cada **manutenção** está ligada a uma **máquina**
- Cada **manutenção** também está associada a um **funcionário (técnico responsável)**

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/seu-usuario/projeto-manutencao.git
   cd projeto-manutencao

   ```

2. **Configure o banco de dados MySQL:**

   Crie um banco de dados no MySQL e atualize o arquivo src/main resources/application.properties com suas credenciais:

   ```bash
    spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
    spring.datasource.username=usuario
    spring.datasource.password=senha
    spring.jpa.hibernate.ddl-auto=update

   ```

3. **Execute a aplicação:**

   ./mvnw spring-boot:run

4. **Acesse no navegador:**

   http://localhost:8080/maquinas/list
