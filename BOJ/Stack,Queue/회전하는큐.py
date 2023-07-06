from collections import deque

N,M=map(int,input().split())

array=deque([i+1 for i in range(N)])
output=list(map(int,input().split()))

count=0
for i in output:
    if array.index(i)<=(len(array)//2):
        while array[0]!=i:
            array.append(array.popleft())
            count+=1
    else:
         while array[0]!=i:
            array.appendleft(array.pop())
            count+=1
    array.popleft()

print(count)


