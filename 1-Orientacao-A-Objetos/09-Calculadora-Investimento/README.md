# 09 - Calculadora de Investimento (`static`)

Exercício prático em Java focado no uso de **membros estáticos (`static`)**, **constantes (`static final`)** e separação de responsabilidades em classes utilitárias.

---

##  Sobre o Exercício

O objetivo foi construir um programa que calcula o retorno final de um investimento financeiro com base no número de anos e em uma taxa de rendimento fixa em 10.5% ao ano. 

A regra de negócio foi isolada em uma classe utilitária, permitindo executar os cálculos diretamente sem a necessidade de instanciar objetos (`new`).

---

##  Conceitos Aplicados

* **Atributos Estáticos e Constantes (`static final`):** Fixação da taxa anual (`ANNUAL_RATE`).
* **Métodos Estáticos (`static`):** Funções utilitárias acessadas diretamente pelo nome da classe (`InvestmentCalculator.total(...)`).
* **Composição de Métodos:** Encadeamento de chamadas internas (`totalRate`) para organizar o cálculo final.
* **Encapsulamento por Pacotes:** Divisão limpa entre a camada de execução (`investment.application`) e a camada de utilitários (`investment.util`)
