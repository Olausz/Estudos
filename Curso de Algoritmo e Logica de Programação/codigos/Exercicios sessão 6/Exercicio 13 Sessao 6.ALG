Algoritmo "semnome"

Var

i, n, lucro10, lucro20, lucroMais: inteiro
valorTotalC,valorTotalV, lucroTotal: real

vetorN: vetor [0..99] de caracter
vetorV: vetor [0..99] de real
vetorC: vetor [0..99] de real


Inicio
escreva("Serao digitados quantos produtos? ")
leia(n)

para i de 0 ate n-1 faca
escreval("Produto ",i+1)
escreval("Nome:")
leia(vetorN[i])
escreval("Preco de compra: ")
leia(vetorC[i])
escreval("Preco de venda: ")
leia(vetorV[i])
fimpara

lucro10 <- 0
lucro20 <- 0
lucroMais <- 0
valorTotalC <- 0
valorTotalV <- 0

para i de 0 ate n-1 faca
     se (vetorV[i] - vetorC[i] <  (vetorC[i] * 0.10)) entao
        lucro10 <- lucro10 + 1
        valorTotalC <- valorTotalC + vetorC[i]
        valorTotalV <- valorTotalV + vetorV[i]
     senao
         se (vetorV[i] - vetorC[i] <  (vetorC[i] * 0.20)) entao
             lucro20 <- lucro20 + 1
             valorTotalC <- valorTotalC + vetorC[i]
             valorTotalV <- valorTotalV + vetorV[i]
         senao
              lucroMais <- lucroMais + 1
              valorTotalC <- valorTotalC + vetorC[i]
              valorTotalV <- valorTotalV + vetorV[i]
         fimse
     fimse
fimpara

lucroTotal <- valorTotalV - valorTotalC

escreval
escreval("RELATORIO:")
escreval("Lucro Abaixo de 10%: ", lucro10)
escreval("Lucro entre 10% e 20%: ", lucro20)
escreval("Lucro Acima de 20%: ", lucroMais)
escreval("Valor total de compra: ", valorTotalC)
escreval("Valor total de venda: ", valorTotalV)
escreval("Lucro Total: ", lucroTotal)





Fimalgoritmo