#Criar um algoritmo que apresente o quadrado dos números inteiros de 15 a 200

num1 = int(input('Digite um número: '))
num2 = int(input('Digite outro número maior que o primeiro: '))

while num1 < num2:
    resultado = num1 * num1
    print(f'O quadrado do número {num1} é {resultado}')
    num1 += 1