# 14 - Controle de Estoque com Listas e Streams

Exercício de fixação focado na evolução do controle de estoque, aplicando **Listas dinâmicas (`List<Product>`)**, manipulação de objetos em memória e busca utilizando **Stream e Expressões Lambda**.

## Sobre o Exercício

O programa gerencia a entrada e a atualização de estoque de produtos em um sistema dinâmico:
- **Cadastro Dinâmico:** Lê um número $N$ de itens e cadastra seus respectivos dados (`id`, `name`, `quantity`) em uma lista.
- **Busca por Código:** Solicita o ID de um produto específico para realizar a movimentação de estoque.
- **Entrada de Mercadoria:** Incrementa a quantidade existente no estoque chamando o método de negócio do produto.
- **Tratamento de Exceções:** Caso o ID informado não seja localizado na lista, o programa exibe uma mensagem de aviso.

## Conceitos Aplicados

* **Coleções (`List` e `ArrayList`):** Armazenamento dinâmico de instâncias de produtos sem limitação fixa de tamanho.
* **Stream / Expressões Lambda:** Uso de `stream().filter().findFirst()` para pesquisar e extrair elementos da lista de forma moderna e declarativa.
* **Encapsulamento e Métodos de Negócio:** Delegação da regra de incremento de estoque (`addQuantity(int amount)`) para a própria classe `Product`.
* **Substituição de Estado:** Evolução de um modelo de produto único para manipulação de coleções de objetos complexos.
