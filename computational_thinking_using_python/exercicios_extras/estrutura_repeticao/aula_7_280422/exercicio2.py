num = int(input('Digite um número: '))
cont = 1
soma = 0

while cont <= num:
    if cont % 2 == 0:
        soma += 1/cont
    else:
        soma -= 1/cont
    cont += 1

print(soma)