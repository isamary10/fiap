#Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

numbers = []
for i in range(5):
    numbers.append(input(f"Digite o número na posição {i} : "))
print(numbers)