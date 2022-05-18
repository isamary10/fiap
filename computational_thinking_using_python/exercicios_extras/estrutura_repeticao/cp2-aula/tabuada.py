import os
os.system('clear')

continuar = 's'
while continuar == 's':
    num = int(input('Qual a tabuada que gostaria de calcular? '))
    cont = 1
    while cont <= 10:
        print(f'{num} * {cont} = {num * cont}')
        cont += 1
    continuar = input('Você gostaria de continuar (s/n)? ')
print('FIM')