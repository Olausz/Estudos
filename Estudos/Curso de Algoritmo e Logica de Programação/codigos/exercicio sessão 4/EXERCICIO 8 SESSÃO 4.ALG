Algoritmo "semnome"

Var

temp_un : caractere

calc_C, calc_F, temp : real

Inicio

escreval("Digite a medida de conversão, C para Celsius e F para fahrenheit")
leia(temp_un)
escreval("Digite a temperatura: ")
leia(temp)

escolha(temp_un)
caso "C"
     calc_C <-  5 / 9 * (temp - 32)
     escreval("Sua temperatura convertida de Fahrenheit para Celsius foi: ",calc_C:8:2)
caso "F"
     calc_F <- (temp * 9 / 5 ) + 32
     escreval("Sua temperatura convertida de Celsius para Fahrenheit foi: ",calc_F:8:2)
outrocaso
         escrevaL("Opção inválida")
fimescolha

Fimalgoritmo