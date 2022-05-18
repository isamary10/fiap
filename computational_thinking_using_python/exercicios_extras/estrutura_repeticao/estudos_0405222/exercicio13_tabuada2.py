#Criar um algoritmo que apresente na tela a tabuada dos números de 1 a 9

contador = 1
resultado = 1

while contador <= 10:
    tabuada = resultado * contador
    contador += 1
    resultado += 1
    print(tabuada)
