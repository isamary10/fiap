num1 = int(input('Digite o primeiro numero: '))
num2 = int(input('Digite o segundo numero: '))

if num1 < num2:
    print('Erro... O primeiro numero deve ser maior que o segundo numero')
else:
    while num1 >= num2:
        print(f'Contador: {num1}')
        num1 -= 1