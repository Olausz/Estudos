Algoritmo ""

Var
preco_produto : real
quantidade : inteiro
dinheiro_recebido : real
troco : real
dinheiro_gasto: real


Inicio

escreva("Preço unitariodo produto: ")
leia(preco_produto)
escreva("Quantidade Comprada: ")
leia(quantidade)
escreva("Dinheiro recebido: ")
leia(dinheiro_recebido)

dinheiro_gasto <- preco_produto * quantidade
troco <- dinheiro_recebido - dinheiro_gasto

escreva("TROCO: ", troco)


Fimalgoritmo