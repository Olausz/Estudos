Algoritmo "semnome"

Var
i, n: inteiro
vet: vetor [0..9] de real
media, soma: real


Inicio

escreva("Quantos elementos serao usados: ")
leia(n)

para i de 0 ate n-1 faca
     escreva("Digite os numeros para o vetor: ")
     leia(vet[i])
fimpara

soma <- 0

para i de 0 ate n-1 faca
     soma <- soma + vet[i]
fimpara

media <- soma / n
escreva("MEDIA DO VETOR =", media)
escreval
escreval("ELEMENTOS ABAIXO DA MEDIA: ")
para i de 0 ate n-1 faca
     se (vet[i] < media) entao
        escreval(vet[i]:3:1)
     fimse
fimpara



Fimalgoritmo