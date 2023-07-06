N=int(input())
array=[0]*91
array[1]=1
array[2]=1
for i in range(3,N+1):
    array[i]=array[i-1]+array[i-2]
print(array[N])




