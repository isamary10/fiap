lista = []
lista.append(20)
lista.append('python')
lista.append(True)
print(lista)

nova_lista = [123, 'frio', False, 'calor']
nova_lista.append('estágio')
print(nova_lista)

print(lista + nova_lista)

nova_lista.append(lista)
print(nova_lista)

print(nova_lista[5][1])
lista.append('corinthians')
print(nova_lista)

nova_lista.append(lista)
print(nova_lista)

print('python' in lista)

livros = ['Java', 'Python', 'SQL Server', 'Ruby on Rails']
print(livros)

livros.insert(0, 'Oracle')
print(livros)

livros.pop(2)
print(livros)

livros.remove('SQL Server')
print(livros)

livros.reverse()
print(livros)

livros.append('JavaScript')
livros.append('C#')
livros.append('Jango')
print(livros)

livros.extend(['Scrum', 'Chatbot', 'UX'])
print(livros)

# print(ord('s'))

livros.sort()
print(livros)

# print(chr(5))
numeros = [2, 6, 10, 86, 95, 12, 47, 22]
print(numeros.count(2))

outros_num = [4, 8, 10, 11]
numeros.extend(outros_num)
print(numeros)

numeros.extend([13])
print(numeros)