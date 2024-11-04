Algoritmo "semnome"

Var

i, n, num1, num2 : inteiro
divisao: real
Inicio

escreva("Quantos casos voce vai digitar?: ")
leia(n)

para i de 1 ate n faca
     escreva("Escreva o numerador: ")
     leia(num1)
     escreva("Escreva o denominador: ")
     leia(num2)

     se (num2 = 0) entao
        escreva("DIVISAO IMPOSSIVEL")
     senao
          divisao <- num1 / num2
          escreval("DIVISÃO: ", divisao:4:2)
     fimse
fimpara

Fimalgoritmo