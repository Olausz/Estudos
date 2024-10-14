Algoritmo "semnome"

Var
hora1, hora2, duracao : inteiro

Inicio

escreva("Digite a hora inicial do jogo: ")
leia(hora1)
escreva("Digite a hora final do jogo: ")
leia(hora2)

se hora1 < hora2 entao
   duracao <- hora2 - hora1
senao
     duracao <- 24 - hora1 + hora2
fimse

escreva("O JOGO DUROU: ", duracao," HORAS ")

Fimalgoritmo