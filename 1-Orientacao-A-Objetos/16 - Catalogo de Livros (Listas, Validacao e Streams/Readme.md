# 16 - Catalogo de Livros da Biblioteca (Listas, Validacao e Streams)

Exercicio de fixacao focado na eliminacao de duplicidades no cadastro, limpeza de buffer de leitura e filtragem por limite de preco com **Listas (`List<Book>`)** e **Streams**.

## Sobre o Exercicio

O programa gerencia o catalogo de uma biblioteca com as seguintes etapas:
- **Validacao de ISBN:** Impede o cadastro de dois livros com o mesmo ISBN usando a funcao auxiliar `hasIsbn`.
- **Leitura Segura:** Tratamento do buffer do `Scanner` para leitura correta de strings compostas.
- **Filtro de Orcamento:** Solicita um valor maximo (`maxPrice`) e gera uma sublista contendo apenas os livros dentro do limite de preco especificado.

## Conceitos Aplicados

* **Validacao Dinamica:** Verificacao de duplicidade de chaves antes da instanciacao do objeto na lista.
* **Stream Pipeline:** Uso de `stream().filter().collect(Collectors.toList())` para filtrar elementos por condicao numerica (`price <= maxPrice`).
* **Funcoes Auxiliares Estaticas:** Metodo auxiliar `hasIsbn` utilizando `findFirst()` e comparacao com `null`.
