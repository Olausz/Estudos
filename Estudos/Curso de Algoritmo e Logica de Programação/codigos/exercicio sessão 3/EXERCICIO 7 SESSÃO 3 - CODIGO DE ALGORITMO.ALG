Algoritmo "semnome"

Var
nome : caractere
valor_por_hora : real
horas_trabalhadas: inteiro
pagamento : real


Inicio
escreva("Nome: ")
leia(nome)
escreva("Valor por hora: ")
leia(valor_por_hora)
escreva("Horas Trabalhadas: ")
leia(horas_trabalhadas)

pagamento <- valor_por_hora * horas_trabalhadas

escreva("O Pagamento de ", nome, " Deve ser no Valor de: ",pagamento," reais")

Fimalgoritmo