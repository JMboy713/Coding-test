def d(n):
    if check[n]==False:
        check[n]=True
        string=str(n)
        for i in string:
            n+=int(i)
        if n in array:
            array.remove(n)
        if n<10000:
            d(n)
    
    
if __name__=="__main__":
    array=[i for i in range(1,10001)]
    check=[False for i in range(1,10001)]
    for i in array:
        d(i)
    print(*array)        