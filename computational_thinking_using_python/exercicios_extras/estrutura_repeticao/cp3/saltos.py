saltos = [0] * 5
soma = 0
continuar = True
cont = 0
nomes = []

while continuar:
    nomes.append(input('Atleta: '))
    for i in range(5):
        saltos[i] = float(input(f"{i + 1}° Salto: "))
        soma = saltos[i] + soma
    media = soma / 5
    escolha = input('Deseja incluir mais atleta (s/n)? ')
    if escolha == "s" or escolha == "S":
        continuar = True
    else:
        continuar = False

print('-----------------------------------------------')
for nome in nomes:
    print('Resultado final:')
    print(f"Atleta: {nome}")
    print(f"Saltos: {saltos[0]} - {saltos[1]} - {saltos[2]} - {saltos[3]} - {saltos[4]}")
    print(f"Média dos saltos: {media} m")
    print('-----------------------------------------------')

