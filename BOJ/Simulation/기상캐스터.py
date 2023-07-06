H,W=map(int,input().split())
forecast=[]
for i in range(H):
    forecast.append(input())
answer=[]
for i in forecast:
    cloud=-1
    array=[]
    for j in i:
        if j!='c' and cloud==-1:
            array.append(cloud)
        elif j=='c':
            cloud=0
            array.append(cloud)
        else:
            cloud+=1
            array.append(cloud)
    answer.append(array)

for i in answer:
    ans=(list(map(str,i)))
    print(' '.join(ans))