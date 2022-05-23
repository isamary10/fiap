salario = [0, 0, 0, 0]
soma = 0
i = 0

while i < len(salario):
    salario[i] = float(input('Salário: '))
    soma += salario[0]
    i += 1
media = soma / len(salario)
print(f'Média salarial: {media:.2f}')

i = 0
while i < len(salario):
    if salario[i] < media:
        print(f'Salário abaixo da média: R$ {salario[i]:.2f}')
    i += 1


