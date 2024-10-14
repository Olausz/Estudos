Algoritmo "semnome"


Var
salario, salario_aumento, aumento : real


Inicio

escreva("Digite o salario do funcionario: ")
leia(salario)

se (salario <= 1000) entao
   aumento <- salario * 0.20
   salario_aumento <- salario + aumento
   escreval("Novo Salario: ",salario_aumento)
   escreval("Aumento: ",aumento)
   escreval("Porcentagem = 20%")
senao
     se (salario <= 3000) entao
           aumento <- salario * 0.15
           salario_aumento <- salario + aumento
           escreval("Novo Salario: ",salario_aumento)
           escreval("Aumento: ",aumento)
           escreval("Porcentagem = 15%")
     senao
          se (salario <= 8000) entao
             aumento <- salario * 0.10
             salario_aumento <- salario + aumento
             escreval("Novo Salario: ",salario_aumento)
             escreval("Aumento: ",aumento)
             escreval("Porcentagem = 10%")
          senao
              aumento <- salario * 0.5
              salario_aumento <- salario + aumento
              escreval("Novo Salario: ",salario_aumento)
              escreval("Aumento: ",aumento)
              escreval("Porcentagem = 5%")

          fimse

     fimse
     
fimse



Fimalgoritmo