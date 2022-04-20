preco = float(input('Digite o valor do produto: '))
valor_total = 0

while preco != -1:
    preco = float(input('Digite o valor do produto: '))
    valor_total += preco


print(f'O valor total da compra foi de R${valor_total}')