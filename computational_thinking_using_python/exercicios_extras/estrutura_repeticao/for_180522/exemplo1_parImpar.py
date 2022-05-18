#Crie um programa que exiba, em ordem crescente os números pares de 10 a 100
# e em ordem descrecente os números impares de 10 a 100.

print('VALORES PARES')
for par in range(10, 101, 2):
    print(par)

print('VALORES IMPARES')
for impar in range(99, 10, -2):
    print(impar)