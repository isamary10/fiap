limite = float(input('Digite o valor do limite: '))
total = 0

escolha = input('Gostaria de efetuar alguma compra (s/n): ')
while escolha == 's' or escolha == 'S':
    preco = float(input('Digite o preço do produto: '))
    if preco <= limite:
        print('Compra aprovada!')
        total += preco
        limite -= preco
        print(f'Seu limite para uso é de {limite:.2f}')
        escolha = input('Deseja continuar comprando (s/n): ')
        if escolha != 's':
            break
    else:
        print('Compra não autorizada! Saldo insuficiente.')
        print(f'Seu limite é de {limite:.2f}')
        escolha = input('Gostaria de continuar comprando (s/n): ')
        if escolha != 's':
            break

print('=======================================')
if total > 0:
    print(f'Total da compra foi de {total:.2f}')
print('=======================================')
print(f'Obrigada e volte sempre!')
print(f'O seu limite é de {limite:.2f}.')
