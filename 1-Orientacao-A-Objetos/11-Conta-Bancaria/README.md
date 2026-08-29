# 11 - Simulador de Conta Bancária

Exercício de fixação focado na aplicação prática de **Encapsulamento**, **Construtores**, **Sobrecarga** e manipulação de saldo bancário via console.

## Sobre o Exercício

O programa simula o cadastro e as operações básicas de uma conta bancária. Durante a abertura da conta, o usuário pode optar por realizar ou não um depósito inicial. Após o cadastro, o sistema executa operações de depósito e saque, aplicando uma taxa fixa de $ 5.00 a cada saque efetuado.

## Conceitos Aplicados

* **Encapsulamento (`private`):** Atributos protegidos contra alterações diretas. O número da conta possui apenas o método `get`, impedindo que seja modificado após a criação.
* **Sobrecarga de Construtores:** Permite instanciar a conta com ou sem o valor de depósito inicial.
* **Métodos de Negócio:** Responsáveis por atualizar o saldo de forma segura (`makeDeposit` e `makeWithdraw`).
