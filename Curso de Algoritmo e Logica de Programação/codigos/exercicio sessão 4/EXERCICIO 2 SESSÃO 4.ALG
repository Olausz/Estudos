Algoritmo "semnome"

Var
a, b, c, delta, x1, x2 : real



Inicio

escreva("Digite o coeficiente a: ")
leia(a)
escreva("Digite o coeficiente b: ")
leia(b)
escreva("Digite o coeficiente c: ")
leia(c)

delta <- (b ^ 2) - 4 * a * c

se (delta <= 0) entao
   escreva("Raiz invalida")
senao
     x1 <- (-b + RaizQ(delta)) / (2 * a)
     x2 <- (-b - RaizQ(delta)) / (2 * a)
     
     escreval("X1: ", x1:4:4)
     escreval("X2: ", x2:4:4)
fimse

Fimalgoritmo