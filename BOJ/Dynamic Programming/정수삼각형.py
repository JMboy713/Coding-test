N=int(input())
array=[]
for i in range(N):
    array.append(list(map(int,input().split())))
if N>=2:
    array[1][0]+=array[0][0]
    array[1][1]+=array[0][0]
if len(array)>2:
    for i in range(2,len(array)):
        for j in range(i+1):
            if j==0:
                array[i][j]+=array[i-1][j]
            elif j==i:
                array[i][j]+=array[i-1][j-1]
            else:
                array[i][j]+=max(array[i-1][j],array[i-1][j-1])
else:
    pass

print(max(array[-1]))

    

