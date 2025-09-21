# Projeto Manutenção de Máquinas

Sistema web para **gestão de máquinas industriais e suas manutenções**, permitindo o controle de serviços realizados por técnicos responsáveis.

---

## Funcionalidades

- Cadastro de diferentes tipos de máquinas:
  - Compressor
  - Furadeira
  - Empilhadeira
- Registro de manutenções por máquina
- Associação de técnico (funcionário) responsável pela manutenção
- Listagem detalhada com histórico de serviços realizados
- Interface amigável usando HTML + Bootstrap

---

## Tecnologias Utilizadas

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

## Banco de Dados

### Tabelas principais:

- `maquina`
- `manutencao`
- `funcionario`
