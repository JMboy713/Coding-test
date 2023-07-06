T=int(input())
case=[]
for i in range(T):
    case.append(int(input()))

array=[0]*12
array[1]=1
array[2]=2
array[3]=4

for i in range(4,12):
    array[i]=array[i-1]+array[i-2]+array[i-3]
print(array)
for i in case:
    print(array[i])


