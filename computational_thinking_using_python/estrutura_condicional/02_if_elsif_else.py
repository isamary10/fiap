idade = int(input('Digite a sua idade: '))

if idade < 12:
    print('Você é uma criança, vá brincar!')
elif idade > 18:
    print('Você é adolescente, se controle!')
elif idade < 60:
    print('Você é um adulto cheio de responsabilidades!')
else:
    print('O Sr. é um idoso com alma jovem!')