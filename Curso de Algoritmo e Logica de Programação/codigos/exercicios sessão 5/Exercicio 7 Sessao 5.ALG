Algoritmo "semnome"

Var
Alcool, Gasolina, Diesel, verificacao : inteiro

Inicio

Alcool <- 0
Gasolina <- 0
Diesel <- 0

escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
leia(verificacao)

enquanto verificacao <> 4 faca
    se (verificacao = 1) entao
       Alcool <- Alcool + 1
       escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
       leia(verificacao)
    senao
         se (verificacao = 2) entao
            Gasolina <- Gasolina + 1
            escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
            leia(verificacao)
         senao
              se (verificacao = 3) entao
                 Diesel <- Diesel + 1
                 escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
                 leia(verificacao)
              fimse
         fimse
    fimse
fimenquanto

escreval("MUITO OBRIGADO!")
escreval("Alcool: ", Alcool)
escreval("Gasolina: ", Gasolina)
escreval("Diesel: ", Diesel)


Fimalgoritmo