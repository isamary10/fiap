qtd_num = int(input('Digite a quantidade de números para o calculo das operações: '))
contador = 0
calculo = 0

while contador < qtd_num:
    contador += 1
    operador = input('Digite o operador (+, -, *, /): ')
    num = int(input(f'Digite o número {contador}: '))

    if operador == "+":
        calculo += num
        print(f'O valor do calculo é {calculo}')
    elif operador == "-":
        calculo -= num
        print(f'O valor do calculo é {calculo}')
    elif operador == "*":
        calculo *= num
        print(f'O valor do calculo é {calculo}')
    else:
        calculo /= num
        print(f'O valor do calculo é {calculo}')







