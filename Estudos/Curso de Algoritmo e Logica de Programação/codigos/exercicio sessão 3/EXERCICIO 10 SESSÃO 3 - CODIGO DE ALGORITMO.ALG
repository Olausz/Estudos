Algoritmo "semnome"

Var

duracao : inteiro
minutos : inteiro
hora : inteiro
segundos : inteiro
resto: inteiro



Inicio

escreva("Digite a duracao em segundos: ")
leia(duracao)

hora <- duracao \ 3600
resto <- duracao % 3600

minutos <- resto \ 60
segundos <- resto % 60


escreval(hora, ":", minutos, ":", segundos)



Fimalgoritmo