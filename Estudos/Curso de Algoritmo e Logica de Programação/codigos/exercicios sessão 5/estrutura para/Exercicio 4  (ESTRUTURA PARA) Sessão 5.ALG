Algoritmo "semnome"

Var
x, n, i, cont_d, cont_f : inteiro


Inicio
escreva("quantos numeros vc vai digitar: ")
leia(n)

cont_d <- 0
cont_f <- 0

para i de 1 ate n faca
     escreva("Digite um numero: ")
     leia(x)
     se (x >= 10) e (x <= 20) entao
        cont_d <- cont_d + 1
     senao
          cont_f <- cont_f + 1
     fimse
fimpara

escreva(cont_d, " DENTRO")
escreval(cont_f, " FORA")


Fimalgoritmo