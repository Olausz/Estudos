Algoritmo "semnome"

Var

i, N, cont: inteiro

vet: vetor [0..9] de inteiro




Inicio

escreva("Quantos numeros você va digita? ")
leia(N)

para i de 0 ate N-1 faca
     escreva("Digite os numeros: ")
     leia(vet[i])
fimpara

cont <- 0

para i de 0 ate N-1 faca
     se (vet[i] % 2 <> 1) entao
     cont <- cont + 1
     fimse
fimpara

escreval
escreva("NUMEROS PARES:")
para i de 0 ate N-1 faca
     escreva(vet[i])
fimpara

escreval
escreva("QUANTIDADE DE PARES =", cont)



Fimalgoritmo