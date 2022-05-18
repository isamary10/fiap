#Crie um programa que leia 5 nomes e exiba a quantidade de nomes que começam com vogal
nomes = ['Isa', 'Eduardo', 'Rita', 'Diogo', 'Amaral']
vogais = ['A', 'E', 'I', 'O',  'U']
lista = []
for nome in nomes:
    for vogal in vogais:
        if nome[0] == vogal:
            lista.append(nome)
print(f'A quandidade dos nomes que começam com vogal são {len(lista)}')
print(f'Os nomes que começão com vogais são {lista}')