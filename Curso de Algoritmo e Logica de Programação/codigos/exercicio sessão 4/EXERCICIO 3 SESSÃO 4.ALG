Algoritmo "semnome"

Var

num1, num2, num3 : inteiro

Inicio

escreva("Digite o primeiro valor: ")
leia(num1)
escreva("Digite o segundo valor: ")
leia(num2)
escreva("Digite o terceiro valor: ")
leia(num3)


se (num1 < num2) e (num1 < num3) entao
   escreva("Menor:",num1)
senao
     se num2 < num3 entao
        escreva("Menor:",num2)
     senao
          escreva("Menor:",num3)
     fimse
fimse
     

Fimalgoritmo