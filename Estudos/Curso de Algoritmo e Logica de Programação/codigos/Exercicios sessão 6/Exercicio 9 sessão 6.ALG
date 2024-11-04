Algoritmo "semnome"

Var

i, n, soma, cont: inteiro
media: real
vet: vetor [0..99] de inteiro

Inicio

escreva("Quantos elementos terão no vetor? ")
leia(n)

para i de 0 ate n-1 faca
     escreva("Digite um numero: ")
     leia(vet[i])
fimpara

soma <- 0
cont <- 0

para i de 0 ate n-1 faca
     se vet[i] % 2 = 0 entao
        soma <- soma + vet[i]
        cont <- cont + 1
     fimse
fimpara

se cont = 0 entao
   escreval("Nenhum par")
senao
    media <- soma / cont
    escreval("A Media dos pares é: ", media:3:1)
fimse



Fimalgoritmo