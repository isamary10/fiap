# Criar um algoritmo que apresente na tela os números de 1 a 50 em ordem decrescente.

num1 = int(input('Digite um número: '))
num2 = int(input('Digite outro número maior que o primeiro: '))
contador = 0
while num1 <= num2:
    print(f'Descendo... {num2}')
    num2 -= 1