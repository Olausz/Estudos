Algoritmo "semnome"

Var
d1, d2, d3 :real



Inicio

escreval("Digite as 3 distancias: ")

leia(d1)
leia(d2)
leia(d3)

se (d1 > d2) e (d1 > d2) entao
   escreva("A Maior distancia é: ",d1)
senao
     se (d2 > d3) entao
        escreva("A Maior distancia é: ",d2)
     senao
          escreva("A Maior distancia é: ",d3)
     fimse
fimse

Fimalgoritmo