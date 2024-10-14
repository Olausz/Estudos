Algoritmo "semnome"

Var
x, y : inteiro


Inicio

escreva("Digite o valor de X: ")
leia(x)
escreva("Digite o valor de Y: ")
leia(y)

enquanto (x <> 0) ou (y <> 0) faca
    se (X > 0) e (Y > 0) entao
      escreval("Q1")
      escreva("Digite o valor de X: ")
      leia(x)
      escreva("Digite o valor de Y ")
      leia(y)
   senao
      se (X < 0) e (Y > 0) entao
         escreval("Q2)
         escreva("Digite o valor de X: ")
         leia(x)
         escreva("Digite o valor de Y ")
         leia(y)
      senao
         se (X < 0) e (Y < 0) entao
            escreval("Q3")
            escreva("Digite o valor de X: ")
            leia(x)
            escreva("Digite o valor de Y ")
            leia(y)
         senao
            se (X > 0) e (Y < 0) entao
               escreval("Q4")
               escreva("Digite o valor de X: ")
               leia(x)
               escreva("Digite o valor de Y ")
               leia(y)
            fimse
         fimse
      fimse
   fimse
fimenquanto

Fimalgoritmo