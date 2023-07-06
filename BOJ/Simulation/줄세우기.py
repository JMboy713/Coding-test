P=int(input())
last_answer=[]
for i in range(P):
    array=list(map(int,input().split()))
    last=0
    answer=0
    for j in range(len(array)):
        if last>array[j]:
            answer+=(j-1)
        else:
            last=array[j]
    
    print(i+1,'',answer)