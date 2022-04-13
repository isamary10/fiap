x = int(input('Digite o primeiro número: '))
y = int(input('Digite o segundo número: '))
cont = 0

while x >= y:
    x -= y
    cont += 1
print(f'Resposta: {cont}')