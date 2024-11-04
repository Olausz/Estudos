Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var

i, n: inteiro
media: real
vetNome: vetor  [0..99] de caracter
vetNota1: vetor  [0..99] de real
vetNota2: vetor  [0..99] de real


Inicio

escreva("Quantos alunos serão digitados? ")
leia(n)

para i de 1 ate n faca
     escreval("Digite o nome, primeira e segunda nota do aluno numero",i)
     leia(vetNome[i])
     leia(vetNota1[i])
     leia(vetNota2[i])
fimpara

media <- 6

para i de 0 ate n faca
     se ((vetNota1[i] + vetNota2[i]) / 2 >= 6) entao
        escreval("Alunos Aprovados: ", vetNome[i])
     fimse
fimpara



Fimalgoritmo