nomes = []
for _ in range(5):
    nome = input('Nome: ')
    nomes.append(nome)

qtd = 0
for nome in nomes:
    if(nome[0] == 'A') or (nome[0] == 'E') or (nome[0] == 'i') or (nome[0] == 'O') or (nome[0] == 'U'):
       qtd += 1
print(f'{qtd} dos nomes começam com vogal')