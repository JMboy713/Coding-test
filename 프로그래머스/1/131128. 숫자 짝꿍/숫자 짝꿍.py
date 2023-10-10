def solution(X, Y):
    Xnumber={i:0 for i in range(0,10,1)}
    Ynumber={i:0 for i in range(0,10,1)}

        
    for i in X:
        Xnumber[int(i)]+=1
    for i in Y:
        Ynumber[int(i)]+=1
    answer='' 
    for i in range(9,-1,-1):
        a=min(Xnumber[i],Ynumber[i])        
        for j in range(a):
            answer+=str(i)
            
    if answer=='':
        return '-1'
    elif answer[0]=='0':
        return '0'
    else: 
        return answer
    
    
    
    
