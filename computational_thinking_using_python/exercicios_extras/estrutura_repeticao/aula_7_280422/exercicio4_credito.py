limite = float(input('Digite o valor do crédito: '))
valor = float(input('Digite o preço do produto: '))
total = 0

while valor <= limite:
    total += valor
    limite -= valor
    print(f'Limite: {limite:.2f}')
    continuar = input('Deseja continuar a compra (s/n)?')
    if continuar == 's':
        valor = float(input('Digite o preço do produto: '))
        if valor > limite:
            print(f'Infelizmente você não tem limite para essa compra. Seu limite é de {limite:.2f}')
    else:
        print('Compra finalizada')

print(f'O valor total da compra foi de {total}')
