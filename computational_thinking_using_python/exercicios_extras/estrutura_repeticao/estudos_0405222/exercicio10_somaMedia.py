#Criar um algoritmo que efetue a leitura de 10 valores numéricos inteiros e,
# ao final, apresente na tela a soma e a média dos valores lidos.
num = int(input('Digite a quantidade para o calculo: '))
contador = 0
soma = 0

while contador < num:
    num1 = int(input('Digite um número: '))
    soma += num1
    contador += 1
media = soma / num
print(f'A soma dos {num} números é de {soma}')
print(f'A média é de {media}')

