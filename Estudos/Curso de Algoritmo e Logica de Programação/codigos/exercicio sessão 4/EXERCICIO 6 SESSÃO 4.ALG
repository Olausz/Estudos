Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 

Var
glicose : real

Inicio

escreva("Digite a quantidade de glicose: ")
leia(glicose)


se (glicose <= 100) entao
   escreva("Nivel normal de glicose")
senao
     se (glicose <= 140) entao
        escreva("Nivel elevado de glicose")
        senao
             escreva("Nivel mostra diabetes.")

        fimse
fimse

Fimalgoritmo