print('Qual a sua ocorrência?')
print('''1 - Falta de Toner
2 - Necessita de limpeza
3 - Troca de cabo ou conector
4 - Quebrada ou inutilizada''')

problemas = ["1 - Falta de toner", "2 - Necessita de limpeza", "3 - Troca de cabo ou conector", "4 - Quebrada ou inutilizada"]
votos = [0]*4
defeitos = 0

while True:
    #Validar a entrada do usuário
    while True:
        opcao = int(input('Digite uma opção: '))
        if opcao < 0 or opcao > 4:
            print('Opção inválida')
        else:
            break
    if opcao == 0:
        break
    elif opcao == 1:
        votos[0] += 1
        defeitos += 1
    elif opcao == 2:
        votos[1] += 1
        defeitos += 1
    elif opcao == 3:
        votos[2] += 1
        defeitos += 1
    elif opcao == 4:
        votos[3] += 1
        defeitos += 1

cont = 0
maiorDefeito = ''
defeito = 0
perc = 0

for voto in votos:
    print(f'Problema: {problemas[cont]} / Votos: {voto} / Porcentagem {(voto*100)/sum(votos):.2f}')
    if voto > defeito:
        defeito = voto
        maiorDefeito = problemas[cont]
        perc = (voto*100)/sum(votos)
    cont += 1

print(f'Total de ocorrências: {sum(votos)}')
print(f'O problema com mais ocorrência foi o {maiorDefeito}, com {defeito} votos, correspondendo a {perc:.2f}% dos votos.')