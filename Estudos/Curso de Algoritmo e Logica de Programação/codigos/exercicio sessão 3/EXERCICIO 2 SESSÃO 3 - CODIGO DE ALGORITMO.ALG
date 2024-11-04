Algoritmo "semnome"

Var

base_retangulo : real
altura_retangulo: real
area : real
perimetro : real
diagonal : real

Inicio
escreva("Base do retangulo: ")
leia(base_retangulo)
escreva("Altura do retangulo: ")
leia(altura_retangulo)

area <- base_retangulo * altura_retangulo
perimetro <- (2 * base_retangulo) + (2 * altura_retangulo)
diagonal <- RaizQ(Exp(base_retangulo, 2) + Exp(altura_retangulo, 2))


escreval("AREA = ",area:8:4)
escreval("PERIMETRO = ",  perimetro:8:4)
escreval("DIAGONAL = ",  diagonal:8:4)

Fimalgoritmo