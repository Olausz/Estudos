Algoritmo "semnome"

Var
i, n, maior_pos, maior_valor: inteiro
vet: vetor [0..9] de inteiro


Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
     escreva("Digite um numero: ")
     leia(vet[i])
fimpara

maior_valor <- vet[i]
maior_pos <- 0

para i de 0 ate n-1 faca
     se (vet[i] >= maior_valor) entao
        maior_valor <- vet[i]
        maior_pos <- i
     fimse
fimpara

escreval
escreval("MAIOR VALOR =", maior_valor)
escreval("MAIOR POSIÇÃO =", maior_pos)



Fimalgoritmo