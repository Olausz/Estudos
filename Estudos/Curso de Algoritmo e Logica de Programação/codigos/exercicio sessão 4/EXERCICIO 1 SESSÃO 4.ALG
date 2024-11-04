Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 

Var
 nota1 : real
 nota2 : real
 nota_final : real


Inicio

escreva("Digite a primeira nota:  ")
leia(nota1)

escreva("Digite a segunda nota: ")
leia(nota2)

nota_final <- nota1 + nota2

se nota_final > 60.0 entao
   escreval("Sua nota final:",nota_final:5:1)
   
   escreval(" Status: APROVADO")
senao
      escreval("Sua nota final:",nota_final:5:1)

   escreval(" Status: REPROVADO")
fimse
   

Fimalgoritmo