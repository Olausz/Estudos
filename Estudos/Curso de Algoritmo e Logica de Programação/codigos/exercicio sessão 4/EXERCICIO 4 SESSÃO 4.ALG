Algoritmo "semnome"



Var

minutos, minutos_novos : inteiro
valor_novo, valor_original : real

Inicio

escreva("Digite a quantidade de minutos: ")
leia(minutos)

valor_original <- 50.0

se (minutos > 100) entao
   minutos_novos <- abs(100 - minutos)
   valor_novo <- (minutos_novos * 2) + valor_original
   escreva("Valor a pagar: R$", valor_novo:4:2)
senao
     escreva("Valor a pagar: R$", valor_original:4:2)
fimse


Fimalgoritmo