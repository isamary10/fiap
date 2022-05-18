print('(+) Adição')
print('(-) Subtração')
print('(*) Multiplicação')
print('(/) Divisão')
print('(=) Resultado')

num = int(input('Número: '))
op = input('Digite a operação (| + | - | * | / | = |): ')
result = num
maior = num
menor = num

while op != '=':
    num = int(input('Digite um novo número: '))

    if num > maior:
        maior = num
    if num < menor:
        menor = num

    if op == '+':
        result += num
    elif op == '-':
        result -= num
    elif op == '*':
        result *= num
    elif op == '/':
        result /= num
    op = input('Digite a operação (| + | - | * | / | = |): ')
print(f'Maior: {maior}')
print(f'Menor: {menor}')
print(f'Resultado: {result}')