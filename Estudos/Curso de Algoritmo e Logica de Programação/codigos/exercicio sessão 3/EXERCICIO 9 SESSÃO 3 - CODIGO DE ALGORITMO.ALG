Algoritmo "semnome"

Var
medidaA : real
medidaB : real
medidaC : real
areaQuadrado : real
areaTriangulo : real
areaTrapezio : real



Inicio

escreva("Digite a medida A: ")
leia(medidaA)
escreva("Digite a medida B: ")
leia(medidaB)
escreva("Digite a medida C: ")
leia(medidaC)

areaQuadrado <- medidaA ^ 2
areaTriangulo <- (medidaA * medidaB) / 2
areaTrapezio <- ((medidaA  + medidaB) * medidaC) / 2

escreval("AREA DO QUADRADO: ", areaQuadrado:8:4)
escreval("AREA DO TRIANGULO: ", areaTriangulo:8:4)
escreval("AREA DO TRAPEZIO: ", areaTrapezio:8:4)



Fimalgoritmo