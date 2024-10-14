Algoritmo "Exercico 1 Sessão 3 - Codigo de Algoritmos"

Var
largura : real
comprimento : real
valor_do_metro_quadrado : real
area_terreno : real
preco_terreno : real
Inicio

escreva("Digite a largura do terreno: ")
leia(largura)
escreva("Digite o comprimento do terreno: ")
leia(comprimento)
escreva("Digite o valor do metro quadrado: ")
leia(valor_do_metro_quadrado)

area_terreno <- largura * comprimento
preco_terreno <- area_terreno * valor_do_metro_quadrado

escreval("Area do terreno = ",area_terreno:8:2)
escreval("Preco do terreno = ",preco_terreno:8:2)

Fimalgoritmo