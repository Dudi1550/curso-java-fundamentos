# 10 - Calculadora de Combustível (Etanol vs Gasolina)

Exercício de fixação em Java focado na utilização de **membros estáticos (`static`)**, **constantes (`static final`)** e formatação de saída de dados no console.

##  Sobre o Exercício

O objetivo deste projeto foi criar um utilitário que auxilia o motorista a decidir se compensa mais abastecer com etanol ou gasolina, baseando-se na regra de rendimento de 70%. Além disso, o programa calcula a estimativa de custo total da viagem com base na distância e no consumo do veículo.

Toda a lógica de cálculo foi abstraída em uma classe utilitária, permitindo o uso direto dos métodos sem a necessidade de instanciar objetos.


##  Conceitos Aplicados

* **Constantes (`static final`):** Utilização da taxa de proporção fixa de 70% (`ETHANOL_RATIO = 0.70`) para a tomada de decisão.
* **Métodos Estáticos (`static`):** Criação de métodos utilitários (`isEthanolAdvantageous` e `tripCost`) para processar os cálculos diretamente.
* **Modularização:** Separação entre a interação com o usuário (`ethanol.application`) e a lógica de negócio (`ethanol.util`).


