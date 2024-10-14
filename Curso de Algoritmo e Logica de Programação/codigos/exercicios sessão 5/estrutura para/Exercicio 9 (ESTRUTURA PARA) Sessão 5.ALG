Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
n, i, quantidade, R, S, C, totalcobaias : inteiro
coba : caracter
percentualR, percentualS, percentualC : real


Inicio
escreva("Quantos casos de teste serao digitados?: ")
leia(n)


R <- 0
S <- 0
C <- 0

para i de 1 ate n faca
     escreval("Quantidade de cobaias: ")
     leia(quantidade)
     escreval("Tipo de cobaia: ")
     leia(coba)

     escolha coba
     caso "R"
          R <- R + quantidade
     caso "S"
          S <- S + quantidade
     caso "C"
          C <- C + quantidade
     outrocaso
          escreval("Outro caso")
     fimescolha
fimpara

totalcobaias <- R + S + C
percentualR <- R / totalcobaias * 100
percentualS <- S / totalcobaias * 100
percentualC <- C / totalcobaias * 100

escreva("RELATORIO FINAL: ")
escreval("Total: ", totalcobaias)
escreval("total de coelhos: ", C)
escreval("total de ratos: ", R)
escreval("total de sapos: ", S)
escreval("Percentual de coelhos: ", percentualC:4:2)
escreval("Percentual de ratos: ", percentualR:4:2)
escreval("Percentual de sapos: ", percentualS:4:2)


Fimalgoritmo