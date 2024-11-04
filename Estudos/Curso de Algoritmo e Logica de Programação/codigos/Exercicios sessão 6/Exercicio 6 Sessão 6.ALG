Algoritmo "semnome"

Var
i, n, soma: inteiro
vetorA: vetor [0..9] de inteiro
vetorB: vetor [0..9] de inteiro
vetorC: vetor [0..9] de inteiro

Inicio

escreva("Digite o tamanho do vetor: ")
leia(n)
escreval("DIGITE OS VALORES DO VETOR A ")
para i de 0 ate n-1 faca
     leia(vetorA[i])
fimpara

escreval("DIGITE OS VALORES DO VETOR B ")
para i de 0 ate n-1 faca
     leia(vetorB[i])
fimpara



para i de 0 ate n-1 faca
     vetorC[i] <- vetorA[i] + vetorB[i]
fimpara
escreva("VETOR RESULTANTE:")
para i de 0 ate n-1 faca
     escreva(vetorC[i])
fimpara





Fimalgoritmo