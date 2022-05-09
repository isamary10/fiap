#Criar um algoritmo que calcule e apresente na tela a tabuada do 8 (1 a 10).

tabuada = int(input('Tabuada: '))
num = int(input('Digite um número: '))
contador = 1

while contador <= num:
    resultado = contador * tabuada
    print(f'{tabuada} * {contador} = {resultado}')
    contador += 1