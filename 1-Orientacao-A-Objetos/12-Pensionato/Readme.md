# 12 - Desafio Pensionato

Exercício de fixação focado na aplicação prática de Vetores de Referência, manipulação de índices como regras de negócio e controle de referências nulas em memória.

## Sobre o Exercício

O programa simula a gestão de aluguel de quartos em um pensionato com 10 unidades (identificadas de 0 a 9). O usuário informa a quantidade de estudantes que vão alugar quartos e, para cada um, registra o nome, e-mail e o número do quarto escolhido. Ao final, o sistema gera um relatório das ocupações ordenado pelo número do quarto.

## Conceitos Aplicados

* **Vetores de Referência (`Rent[]`):** Uso de arrays para armazenar instâncias de objetos na memória Heap, em vez de dados primitivos isolados.
* **Mapeamento por Índice:** O número do quarto digitado é utilizado diretamente como a posição do objeto no vetor, garantindo ordenação natural e acesso direto.
* **Tratamento de Referências Nulas (`null`):** Checagem de posições não alocadas para listar apenas os quartos efetivamente ocupados.
* **Encapsulamento e `toString()`:** Atributos protegidos na classe `Rent` com método de exibição customizado para os dados do aluguel.
