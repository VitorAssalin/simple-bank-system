# ☕ Projeto Bank - Java Básico

Projeto prático desenvolvido durante o curso introdutório de Java para iniciantes no YouTube, ministrado pelo **Thiago Aguiar**, focado nos fundamentos da linguagem e na aplicação prática dos pilares da Programação Orientada a Objetos (POO).

[![Repositório de Estudos](https://img.shields.io/badge/GitHub-Estudos%20Java%20Iniciante-181717?style=for-the-badge&logo=github)](https://github.com/VitorAssalin/estudos-java-iniciante)
[![YouTube](https://img.shields.io/badge/YouTube-Assistir%20à%20Aula-red?style=for-the-badge&logo=youtube)](https://www.youtube.com/watch?v=_lNxxTGuAJc&list=PLJ0AcghBBWSi6nK2CUkw9ngvwWB1gE8mL&index=39)

---

## 📌 Sobre o Projeto

O **Bank** é uma aplicação Java via console que simula as operações essenciais de uma agência bancária. O sistema permite criar contas dinamicamente, realizar depósitos e saques com validação de saldo em tempo real, além de consolidar o saldo total sob custódia da agência ao encerrar as operações.

---

## ⚙️ Funcionalidades

- **Abertura de Contas:** Registro de novas contas com auto-incremento automático do número da conta (`1`, `2`, ...).
- **Validação de Titular:** Limitação do nome do cliente a um comprimento máximo de 12 caracteres via manipulação de strings.
- **Depósito:** Entrada de valores monetários com atualização imediata do saldo.
- **Saque Seguro:** Operação condicionada ao saldo disponível em conta (impede saques descobertos).
- **Balanço Geral:** Listagem detalhada de todas as contas abertas e soma acumulada do capital total da agência no fechamento do caixa.

---

## 🧱 Arquitetura e Conceitos Aplicados

O projeto foi estruturado com foco em boas práticas de POO e separação de responsabilidades:

- **`Account`:** Entidade que encapsula os dados da conta (agência, número, titular e saldo), garantindo integridade de estado e regras de negócio de saque/depósito.
- **`Bank`:** Classe agregadora responsável pela gestão da agência, gerador sequencial de contas e consolidação do saldo total por meio de coleções dinâmicas (`List` / `ArrayList`).
- **`App`:** Ponto de entrada (`main`) que orquestra os menus de interação com o usuário via `Scanner`.
- **`Log`:** Mecanismo desacoplado para exibição e rastreamento das transações.
- **Sobrescrita de Métodos (`@Override`):** Customização do método `toString()` da classe `Account` para formatação limpa das saídas.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 14+)
- **Coleções:** `java.util.List` e `java.util.ArrayList`
- **Entrada/Saída:** `java.util.Scanner` e Console I/O

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
    git clone [https://github.com/VitorAssalin/estudos-java-iniciante.git](https://github.com/VitorAssalin/estudos-java-iniciante.git)

---

##  💡 Próximos Passos

[X] Implementar a classe `Scanner` para permitir interação direta do usuário via terminal.


[X] Explorar e aplicar novos conceitos de Orientação a Objetos (POO).


[ ] Adicionar uma tela interativa com o JOptionPane.


[ ] Adicionar novas tecnologias e ferramentas para evoluir a arquitetura do projeto. 