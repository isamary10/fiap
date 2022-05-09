#Criar um algoritmo que apresente os valores da conversão de polegadas para centímetros,
# de 3 em 3, iniciando a contagem em 1 polegada e terminando em 13 polegadas.
# Uma polegada equivale a aproximadamente 2,54 centímetros

polegada = 2.54
qtd = 13
contador = 1

while contador <= qtd:
    cm = contador * polegada
    print(f'{contador} polegadas em cm é {cm}')
    contador += 3
