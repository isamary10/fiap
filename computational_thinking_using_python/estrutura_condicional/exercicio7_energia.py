kw = float(input('Quantidade de kw consumido: '))
horas = float(input('Quantidade de horas consumido: '))


if kw < 150:
    valor = 0.20
elif kw >= 150 and kw < 500:
    valor = 0.25
else:
    valor = 0.30

conta = horas * valor

if conta < 11.90:print('O valor a pagar é de R$', conta)
    print('O valor da sua conta foi de 11.90')
else:
    print('o valor da sua conta foi de:', conta)
print('O valor a pagar é de R$', conta)