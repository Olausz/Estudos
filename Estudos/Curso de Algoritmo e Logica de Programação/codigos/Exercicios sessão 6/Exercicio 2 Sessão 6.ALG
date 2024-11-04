Algoritmo "semnome"

Var

i, N: inteiro
soma, media: real

vet: vetor [0..9] de real

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(N)

para i de 0 ate N-1 faca
     escreva("DIGITE OS NUMEROS: ")
     leia(vet[i])
fimpara

escreval
escreva("Valores:")
para i de 0 ate N-1 faca
     escreva(" ", vet[i]:3:1, " ")
fimpara

soma <- 0

escreval
escreva("SOMA:")
para i de 0 ate N-1 faca
     soma <- soma + vet[i]
fimpara
escreva(" ", soma:3:1)

escreval
escreva("MEDIA:")
media <- soma / (N)
escreva(" ", media:3:1)


Fimalgoritmo