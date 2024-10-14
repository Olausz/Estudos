Algoritmo "semnome"

Var
n, i : inteiro
num1, num2, num3, media: real


Inicio

escreval("Quantos casos voce vai digitar?: ")
leia(n)

para i de 1 ate n faca
     escreva("Digite 3 numeros: ")
     leia(num1, num2, num3)
     media <- ((num1 * 2) + (num2 * 3) + (num3 * 5)) / 10
     escreval("MEDIA = ", media)
fimpara


Fimalgoritmo