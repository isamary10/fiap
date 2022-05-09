# Criar um algoritmo que leia um valor N e apresente na tela todos os
# valores inteiros entre 1 e N. Considere que o valor de N será sempre maior que zero.

num = int(input('Digite um número: '))
contador = 1

# if num <= 0:
#    print('O valor precisa ser maior que 0')
#    num = int(input('Por favor, digite outro número: '))
while contador <= num and num > 0:
    print(contador)
    contador += 1
