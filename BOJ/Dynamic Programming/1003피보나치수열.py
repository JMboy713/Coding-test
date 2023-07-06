T=int(input())
L=[]
for i in range(T):
    L.append(int(input()))
end=max(L)+1
array=[]
array.append([1,0])
array.append([0,1])


for i in range(2,end+1):
    ape=[]
    for j in range(2):
        ape.append(array[i-1][j]+array[i-2][j])
    array.append(ape)

for i in L:
    print(array[i][0],array[i][1])