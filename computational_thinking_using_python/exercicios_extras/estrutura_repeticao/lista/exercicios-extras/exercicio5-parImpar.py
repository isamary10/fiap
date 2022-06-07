#Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
# Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.

numbers = []
par = []
impar = []
cont = 1
for i in range(20):
    numbers.append(int(input(f"Digite o {cont}° número: ")))
    cont += 1

for number in numbers:
    if (number % 2 == 0):
        par.append(number)
    else:
        impar.append(number)

print(numbers)
print(f"Os números pares são {par}")
print(f"Os números impares são {impar}")