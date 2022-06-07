#Faça um Programa que peça as quatro notas de 10 alunos,
# calcule e armazene num vetor a média de cada aluno,
# imprima o número de alunos com média maior ou igual a 7.0.

qtdAluno = 1
cont = 1
media = 0
while qtdAluno <= 3:
    notas = []
    medias = []
    soma = 0
    media = soma / 4
    medias.append(media)
    cont = 1
    for nota in notas:
        soma += notas
    while cont <= 4:
        notas.append(float(input(f"Digite a {cont}° nota do {qtdAluno}° aluno: ")))
        cont += 1
    qtdAluno += 1
print(notas)
print(medias)