n = int(input('Digite um numero: '))
cont = 0

while cont < n * 2:
    if cont % 2 == 0:
        print(f'Cont: {cont}')
    cont += 1

# n = 4
# cont = 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
# n * 2 = 4

# (0 < 8) = true / (0 % 2 == 0) = true = 0
# (1 < 8) = true / (1 % 2 == 0) = false = 1
# (2 < 8) = true / (2 % 2 == 0) = true = 2
# (3 < 8) = true / (3 % 2 == 0) = false = 3
# (4 < 8) = true / (4 % 2 == 0) = true = 4
# (5 < 8) = true / (5 % 2 == 0) = false = 5
# (6 < 8) = true / (6 % 2 == 0) = true = 6
# (7 < 8) = true / (7 % 2 == 0) = false = 7
# (8 < 8) = false