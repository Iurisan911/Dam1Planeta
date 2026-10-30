def espejo(n):
    reves=0
    while n>0:
        resto=n%10
        reves=(reves*10)+resto
        n=n//10
    return reves

if __name__=='__main__':
    numero=int(input("Dame un numero: "))
    print (espejo(numero))