Algoritmo "semnome"

Var
codigo, quantidade : inteiro
valor, valor_total : real


Inicio

escreval("Informe o codigo do produto: ")
leia(codigo)
escreval("Informe a quantidade: ")
leia(quantidade)

escolha codigo
caso 1
     valor_total <- quantidade * 5
     escreva("Valor a pagar: ",valor_total:4:2," reais")
caso 2
     valor_total <- quantidade * 3.50
     escreva("Valor a pagar: ",valor_total:4:2," reais")
caso 3
     valor_total <- quantidade * 4.80
     escreva("Valor a pagar: ",valor_total:4:2," reais")
caso 4
     valor_total <- quantidade * 8.90
     escreva("Valor a pagar: ",valor_total:4:2," reais")
caso 5
     valor_total <- quantidade * 7.32
     escreva("Valor a pagar: ",valor_total:4:2," reais")
outrocaso
     escreva("Codigo invalido")
fimescolha
     
     




Fimalgoritmo