N=int(input())
array=[]
for i in range(N):
    L=list(map(int,input().split()))
    array.append(L)

for i in range(1,len(array)):
    array[i][0]+=min(array[i-1][1],array[i-1][2])
    array[i][1]+=min(array[i-1][0],array[i-1][2])
    array[i][2]+=min(array[i-1][1],array[i-1][0])

print(min(array[-1]))



