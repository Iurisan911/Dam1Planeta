    
def espejo(n):
    reves=0
    while n>0:
        resto=n%10
        reves=(reves*10)+resto
        n=n//10
    return reves




if __name__=='__main__':
    m=int(input("Dame un numero: "))
    digito=int(input("Dime un digito: "))

    n=espejo(m)
    ca=""
    c=0
    while n>0:
        resto=n%10
        c+=1
        if (resto==digito):
           print(c,end=" ")
        n=n//10
    print (ca)