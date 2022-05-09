# Um professor possui 3 turmas, e cada turma possui 5 alunos.
# Criar um algoritmo que leia a nota dos alunos de cada uma das turmas
# e apresente a média das notas por turma.

qtd_aluno = 0
contador1 = 0
contador2 = 0
notas = 0
soma = 0
qtd_turma = int(input('Digite a quantidade de turma: '))
while contador1 < qtd_turma:
    contador1 += 1
    qtd_aluno = int(input(f'Digite a quantidade de alunos da turma {contador1}: '))
    contador2 = 0
    while contador2 < qtd_aluno:
        contador2 += 1
        notas = float(input(f'Digite a nota do aluno {contador2}: '))
        soma += notas
        media = soma / qtd_aluno
    print(f'A média da turma {contador1} é de {media:.2f}')
