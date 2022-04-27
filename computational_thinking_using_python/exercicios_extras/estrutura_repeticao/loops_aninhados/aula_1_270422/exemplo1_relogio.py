#from time import sleep
#biblioteca math

escolha = True
hora = 0
while escolha == True:
    h = int(input('Digite a hora do alarme: '))
    m = int(input('Digite o minuto do alarme: '))
    s = int(input('Digite o segundo do alarme: '))

    while hora < 24:
        min = 0
        while min < 60:
            seg = 0
            while seg < 60:
                print(f'{hora:02}:{min:02}:{seg:02}')
                #sleep(1)
                if hora == h and min == m and seg == s:
                    print('ALARME')
                    break
                seg += 1
            if hora == h and min == m:
                break
            min += 1
        if hora == h:
            break
        hora += 1

    continuar = input('Deseja continuar (s/n)? ')
    if continuar == "s" or continuar == "S":
        escolha = True
    else:
        escolha = False

