Algoritmo "semnome"

Var

idade, contador, soma : inteiro
media : real

Inicio


escreva("Digite as idades: ")
leia(idade)

soma <- 0
contador <- 0


enquanto idade > 0 faca
    soma <- soma + idade
    contador <- contador + 1

    escreva("Digite as idades: ")
    leia(idade)
    
fimenquanto

media <- soma / contador

escreva("MEDIA = ",media:4:2)







Fimalgoritmo