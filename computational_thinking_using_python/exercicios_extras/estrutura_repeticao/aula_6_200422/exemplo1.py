executa = input('Executar o bloco (sim/nao): ')
contador = 0

while executa == 'sim':
    executa = input('Executar o bloco (sim/nao): ')
    contador += 1

print(f'O bloco foi executado {contador} vezes')