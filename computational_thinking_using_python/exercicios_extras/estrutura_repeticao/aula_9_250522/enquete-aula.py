# Você foi contratado para desenvolver um programa que leia o resultado da enquete
# e informe ao final o resultado da mesma. O programa deverá ler os valores até ser
# informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos valores
# além dos válidos para o programa (0 a 6). Os valores referentes a cada uma das opções
# devem ser armazenados numa lista. Após os dados terem sido completamente informados,
# o programa deverá calcular o percentual de cada um dos concorrentes e informar o vencedor da enquete

print('Qual o melhor Sistema Operacional para uso em servidores?')
print('''1 - Windows Server
2 - Unix
3 - Linux
4 - Netware
5 - MaxOS
6 - Outro''')
opcoes = ["Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"]
votos = [0]*6

while True:
    #Validar a entrada do usuário
    while True:
        opcao = int(input('Digite uma opção: '))
        if opcao < 0 or opcao > 6:
            print('Opção inválida')
        else:
            break
    if opcao == 0:
        break
    votos[opcao - 1] += 1
    # elif opcao == 1:
    #     votos[0] += 1
    # elif opcao == 2:
    #     votos[1] += 1
    # elif opcao == 3:
    #     votos[2] += 1
    # elif opcao == 4:
    #     votos[3] += 1
    # elif opcao == 5:
    #     votos[4] += 1
    # elif opcao == 6:
    #     votos[5] += 1

print('Sistema operacional     Votos  %')
print('--------------------------------')

cont = 0
melhor = 0
vencedor = ''
perc = 0

for voto in votos:
    print(f'Sitema: {opcoes[cont]} / Votos: {voto} / Porcentagem {(voto*100)/sum(votos):.2f}')
    if voto > melhor:
        melhor = voto
        vencedor = opcoes[cont]
        perc = (voto*100)/sum(votos)
    cont += 1

print(f'Total de votos: {sum(votos)}')
print(f'O Sistema Operacional mais votado foi o {vencedor}, com {melhor} votos, correspondendo a {perc:.2f} dos votos.')