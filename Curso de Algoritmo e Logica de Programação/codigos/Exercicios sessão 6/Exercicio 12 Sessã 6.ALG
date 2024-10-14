Algoritmo "semnome"

Var
i, n, contH, contM : inteiro
menorA, maiorA, media, soma: real
vetS: vetor [0..99] de caracter
vetA: vetor [0..99] de real


Inicio

escreva("Quantas pessoas serão digitadas? ")
leia(n)

para i de 0 ate n-1 faca
     escreval("Altura da",i+1,"a pessoa")
     leia(vetA[i])
     escreval("Genero da",i+1,"a pessoa")
     leia(vetS[i])
fimpara

maiorA <- vetA[i]
menorA <- vetA[i]
soma <- 0
contH <- 0
contM <- 0

para i de 0 ate n-1 faca
     se vetA[i] > maiorA entao
        maiorA <- vetA[i]
     fimse
fimpara

para i de 0 ate n-1 faca
     se vetA[i] < menorA entao
        menorA <- vetA[i]
     fimse
fimpara

para i de 0 ate n-1 faca
     se vetS[i] = "M" entao
        contH <- contH + 1
     senao
          soma <- soma + vetA[i]
          contM <- contM + 1
     fimse
fimpara

media <- soma / contM

escreval
escreval("Menor altura: ", menorA:4:2)
escreval("Manor Altura: ", maiorA:4:2)
escreval("A Media de altura entre as mulheres =", media:4:2)
escreval("Numero de homens =", contH)
Fimalgoritmo