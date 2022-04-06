peso = float(input('Digite seu peso: '))
altura = float(input('Digite sua altura: '))
imc = peso / (altura * altura)

if imc < 26:
    print('Grau de obesidade: Normal')
elif imc >= 26 and imc < 30:
    print('Grau de obesidade: Obeso')
else:
    print('Grau de obesidade: Obeso Mórbido')