listamodelo = [""] * 5
listaconsumo = [0] * 5
listalitro = []
calculo = 0
precos = []
gasolina = 6.89
cont = 0

while cont < 5:
    print(f"Veículo {cont + 1}: ")
    modelo = input('Nome:')
    consumo = float(input("KM por litro: "))
    listamodelo[cont] = modelo
    listaconsumo[cont] = consumo
    cont +=1
print(listamodelo)
print(listaconsumo)

maximo = max(listaconsumo)
listaconsumo.index(maximo)

for consumo in listaconsumo:
    listalitro.append(1000/consumo)
for litro in listalitro:
    precos.append(litro * gasolina)

print("-----------------------------------")
print(f"Relatório Final")
print(f"Modelo: {listamodelo[0]} - Consumo: {listaconsumo[0]} - Litros: {listalitro[0]} - Preço: {precos[0]}")
print(f"Modelo: {listamodelo[1]} - Consumo: {listaconsumo[1]} - Litros: {listalitro[1]} - Preço: {precos[1]}")
print(f"Modelo: {listamodelo[2]} - Consumo: {listaconsumo[2]} - Litros: {listalitro[2]} - Preço: {precos[2]}")
print(f"Modelo: {listamodelo[3]} - Consumo: {listaconsumo[3]} - Litros: {listalitro[3]} - Preço: {precos[3]}")
print(f"Modelo: {listamodelo[4]} - Consumo: {listaconsumo[4]} - Litros: {listalitro[4]} - Preço: {precos[4]}")
print(f"O modelo de carro mais econômico é o", listamodelo[listaconsumo.index(maximo)])