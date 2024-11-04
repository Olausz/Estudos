Algoritmo "semnome"

Var
x, y, soma, i, troca : inteiro


Inicio

escreval("Digite dois numeros: ")
leia(x)
leia(y)

se x > y entao
   troca <- x
   x <- y
   y <- troca
fimse

soma <- 0

para i de x+1 ate y-1 faca
     se i % 2 <> 0 entao
        soma <- soma + i
     fimse
fimpara

escreva("SOMA DOS IMPARES: ",soma)




Fimalgoritmo