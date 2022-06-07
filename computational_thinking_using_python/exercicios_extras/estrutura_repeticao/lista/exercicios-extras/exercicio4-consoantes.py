#Faça um Programa que leia um vetor de 10 caracteres,
# e diga quantas consoantes foram lidas. Imprima as consoantes.

caracteres = []
consoantes = ["b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "w", "y", "z"]
cont = 1
while cont < 11:
    caracteres.append(input(f"Digite o {cont}° caracter: "))
    cont += 1

for i in range(len(caracteres)):
    caracteres[i] = caracteres[i].lower()
print(caracteres)

for caract in caracteres:
    for cons in consoantes:
        if caract == cons:
            print(caract)