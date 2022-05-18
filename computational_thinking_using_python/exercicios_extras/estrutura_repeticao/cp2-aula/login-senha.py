user = 'Teste 123'
pwd = 123
cont = 1
continuar = True

while continuar:
    cont = 1
    while cont <= 3:
        login = input('Login: ')
        senha = input('Senha: ')
        if login == user and senha == pwd:
            print('Login efetuado com sucesso!')
            continuar = False
            break
        else:
            cont += 1
            print('Login ou senha incorreta. Digite novamente o login e senha novamente.')
    if cont > 3:
        print('Número de tentativas excedido :(')
        print('Redefina sua senha...')
        user = input('Login: ')
        pwd = input('Senha: ')
