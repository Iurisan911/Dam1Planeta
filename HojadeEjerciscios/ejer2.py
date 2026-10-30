
suma=0
media=0
intentos=0

while (suma<10000):
    n=int(input("dame un numero: "))
    intentos+=1
    suma+=n

media=suma/intentos

print(f'Cantidad final: {suma}\nIntentos: {intentos}\nMedia: {media}')