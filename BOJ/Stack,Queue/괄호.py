from collections import deque

T=int(input())
result=[]

for i in range(T):
    array=deque()
    PS=input()
    for j in PS:
        if j=='(':
            array.append(j)
        elif j==')':
            if array==deque([]):
                array.append(')')
                break
            else:
                array.popleft()

    if array==deque([]):
        result.append("YES")
    else:
        result.append("NO")

for i in result:
    print(i)
