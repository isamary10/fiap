x = range(5, 50, 2)
for n in x:
    print(n)

intervalo = range(5,10,2)
lista = list(intervalo)
print(lista)

tupla = tuple(intervalo)
print(tupla)

# Range é imutável, não é possível alterar o valor dele, a alteração só é possível se rodado novamente
# intervalo[0] = 56
# print(intervalo)

