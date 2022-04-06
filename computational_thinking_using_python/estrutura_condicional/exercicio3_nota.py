nota1 = int(input('Digite a primeira nota: '))
nota2 = int(input('Digite a segunda nota: '))
nota3 = int(input('Digite a terceira nota: '))
faltas = int(input('Digite a quantidade de faltas: '))
media = (nota1 + nota2 + nota3) / 3

if media >= 6 and faltas <= 18:
    print('Parabéns, você esta aprovado!')
elif media == 5 and faltas <= 18:
    print('Você ficou de exame')
    exame = int(input('Digite o valor da media: '))
    nova_media = (media + exame) / 2
    if nova_media >= 6
        print('Você foi aprovado.')
    else:
        print('Você foi reprovado!')
else:
    print('Você foi reprovado')