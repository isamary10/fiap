#Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

numbers = []

for i in range(10):
    numbers.append(float(input(f"Digite o número da posição {i}: ")))
numbers.reverse()
print(numbers)