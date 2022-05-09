#Criar um algoritmo que leia o número de horas trabalhadas diárias (NH)
#de um funcionário por um período de 20 dias (ele trabalhou todos os 20 dias)
#e apresente na tela o total de horas trabalhadas por ele nesse período.

dias = int(input('Digite a quntidade de dias trabalhados: '))
nome = input('Digite o nome do funcionário: ')
total = 0
soma = 0
contador = 1
while contador <= dias:
    nh = int(input(f'Digite a quantidade de horas trabalhadas no dia {contador}: '))
    contador += 1
    total += nh
print(f'{nome} trabalhou o total de {total} horas no período de {dias} dias.')