import sys
input=sys.stdin.readline

N=int(input())
array=[]
for i in range(N):
    start,end=map(int,input().split())
    array.append([start,end])

array.sort(key=lambda x: (x[1]))
ans=[]

for i in range(len(array)):
    count=1
    last=array[i][1]
    for j in range(i,len(array)):
        if last<=array[j][0]:
            count+=1
            last=array[j][1]
    ans.append(count)

print((ans))


'''
3
1 3
2 4
3 5

2
'''
