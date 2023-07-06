import sys
input=sys.stdin.readline().rstrip()

def main():
    mingyeom=input
    minimum=find_min(mingyeom)
    maximum=find_max(mingyeom)
    print(maximum)
    print(minimum)




def find_min(text):
    number=''
    plus=0
    for i in text:
        if i=='M':
            plus+=1
        else:
            if plus>0:
                plus=(10**(plus-1))
                number+=str(plus)
                plus=0
            number+='5'
    if plus!=0:
        plus=(10**(plus-1))
        number+=str(plus)
    return int(number)

def find_max(text):
    number=''
    plus=0
    for i in range(len(text)):
        if text[i]=='M':
            plus+=1
        elif text[i]=='K':
            plus=(5*(10**plus))
            number+=str(plus)
            plus=0
        
    for i in range(plus):
        number+='1'
    return int(number)    


if __name__=="__main__":
    main()


'''
MKKMMK
    
505500
155105
'''