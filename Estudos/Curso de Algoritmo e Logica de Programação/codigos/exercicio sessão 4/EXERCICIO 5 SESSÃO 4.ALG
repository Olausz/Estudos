Algoritmo "semnome"


Var

dinheiro_cliente, valor_produto, preco_total, troco, diferenca : real
quantidade : inteiro


Inicio

escreva("Pre�o unitario do produto: ")
leia(valor_produto)
escreva("Quantidade: ")
leia(quantidade)
escreva("Dinheiro Recebido: ")
leia(dinheiro_cliente)

preco_total <- valor_produto * quantidade
troco <- dinheiro_cliente - preco_total


se (dinheiro_cliente < preco_total) entao
   escreval("N�o sera possivel efetuar a compra")
   
   escreval("Falta: ",abs(troco)," reais")
senao
     se (troco = 0) entao
        escreva("N�o tera troco")
        senao
             escreva("Troco: ",troco," Reais")
        fimse
fimse




Fimalgoritmo