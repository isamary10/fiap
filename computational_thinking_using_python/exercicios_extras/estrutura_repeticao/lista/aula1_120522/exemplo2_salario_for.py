#EXERCÍCIO A SER REVISADO POIS NÃO ESTA FUNCIONANDO
salarios = [0,0,0,0]
soma = 0
qtd = 0
for i in salarios:
    salarios[i] = float(input('Salário: '))
    salarios.append(salarios[i])
    qtd += 1
print(salarios)
