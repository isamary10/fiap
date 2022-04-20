qtd_num = int(input('Quantidade: '))
contador = 1
soma = 0

while contador <= qtd_num:
    num = int(input('Digite um número: '))
    soma += num
    contador += 1

print(f'O total da soma é {soma}')