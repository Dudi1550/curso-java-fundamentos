# 13 - Aumento de Salário de Funcionários (Listas e POO)

Exercício de fixação focado na aplicação prática de **Listas (`List<Employee>`)**, encapsulamento, busca com **Stream / Expressões Lambda** e prevenção de duplicidade de ID.

## Sobre o Exercício

O programa lê um número $N$ e, em seguida, os dados (`id`, `name`, `salary`) de $N$ funcionários. 
- **Validação de ID:** Não é permitida a digitação de IDs repetidos durante o cadastro.
- **Aumento Salarial:** O sistema solicita o ID de um funcionário para efetuar um aumento percentual no salário. Caso o ID informado não exista, uma mensagem de alerta é exibida.
- **Listagem:** Ao final, o programa imprime a lista atualizada de todos os funcionários com seus respectivos salários ajustados.

## Conceitos Aplicados

* **Coleções (`List` e `ArrayList`):** Armazenamento dinâmico de instâncias de objetos na memória.
* **Stream / Lambda Expressions:** Uso de `stream().filter().findFirst()` para busca e manipulação eficiente de objetos na lista.
* **Encapsulamento e Métodos de Negócio:** Delegação da regra de aumento salarial diretamente para o método `increaseSalary(double percentage)` na classe `Employee`.
* **Funções Auxiliares:** Implementação da função `hasId` para validação e garantia de chave única.
