Algoritmo "semnome"

Var

i, n, mais_velho: inteiro
vetNome : vetor [0..9] de caracter
vetIdade : vetor [0..9] de inteiro

Inicio

escreva("Quantas pessoas voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
     escreval("Dados da",i,"a pessoa")
     escreval("nome: ")
     leia(vetNome[i])
     escreval("idade: ")
     leia(vetIdade[i])
fimpara

mais_velho <- 0

para i de 0 ate n-1 faca
     se vetIdade[i] > mais_velho entao
        mais_velho <- vetIdade[i]
     fimse
fimpara

para i de 0 ate n-1 faca
     se vetIdade[i] = mais_velho entao
        escreval("MAIS VELHO: ", vetNome[i])
     fimse
fimpara


     



Fimalgoritmo