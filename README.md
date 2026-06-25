# Inventory Management System

Sistema backend em Java para controle de estoque e insumos industriais, com foco em manutenção. Aplica Orientação a Objetos com baixo acoplamento, alta coesão e tratamento centralizado de exceções.

---

## Sobre o projeto

Desenvolvido a partir da experiência prática no setor industrial, este sistema organiza o fluxo de entrada e saída de materiais de almoxarifado com foco em integridade dos dados e consulta rápida. A arquitetura aplica princípios sólidos de POO para garantir manutenibilidade e extensibilidade do código.

---

## Funcionalidades

- Cadastro técnico de itens e peças de reposição
- Registro de movimentações de entrada e saída do almoxarifado
- Monitoramento de níveis de estoque para apoio na reposição de materiais
- Persistência dos dados em `estoque.json`

---

## Tecnologias utilizadas

- **Java (JDK 17+)**
- **JDBC / SQL** — persistência e gerenciamento de dados
- **JSON** — armazenamento local do estado do estoque

---

## Conceitos de POO aplicados

- **Encapsulamento** — atributos privados com acesso controlado via getters e setters
- **Herança** — reutilização de atributos e comportamentos entre classes relacionadas
- **Tratamento de exceções** — captura e gestão centralizada de erros operacionais
- **Baixo acoplamento / Alta coesão** — módulos independentes com responsabilidades bem definidas

---

## Estrutura do projeto

```
src/
└── (classes de domínio, repositório e controle de fluxo)
estoque.json        # Base de dados local
README.md
```

---

## Como executar

```bash
# Clone o repositório
git clone https://github.com/EnukNogueira/inventory-management-system.git
cd inventory-management-system

# Abra no IntelliJ IDEA ou compile via terminal
# JDK 17 ou superior necessário
javac src/**/*.java
java Main
```

---

## Autor

**Enuk Nogueira** — Desenvolvedor focado em Engenharia de Dados e Automação de Processos

[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/enuknogueira/)
[![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)](https://github.com/EnukNogueira)
