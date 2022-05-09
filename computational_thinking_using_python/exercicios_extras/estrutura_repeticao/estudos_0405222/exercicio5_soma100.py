#Criar um algoritmo que apresente na tela o total
# da soma dos cem primeiros números inteiros positivos (1 + 2 + 3 + ... + 98 + 99 + 100).
num = int(input('Digite um número: '))
contador = 0
resultado = 0

while contador < num:
    contador += 1
    resultado += contador
print(f'A soma é de {resultado}')