#Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
notas = []
cont = 1
soma = 0
media = 0
for i in range(4):
    notas.append(float(input(f"Digite a {cont}° nota: ")))
    cont += 1

for nota in notas:
    soma += nota

media = soma / 4
print(f"As notas foram {notas}")
print(f"A média das notas é {media:.2f}")
