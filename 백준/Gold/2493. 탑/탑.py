import sys

N=int(input())

top=list(map(int,input().split()))
stack=[]
result=[]


for idx,num in enumerate(top):
    if stack==[]:
        result.append(0)
    else:
        if stack[-1][1]>num:            
            result.append(stack[-1][0]+1)
        else:
            while stack[-1][1]<num:
                stack.pop()
                if stack==[]:
                    break
            if stack==[]:
                result.append(0)
            else:
                result.append(stack[-1][0]+1)
    stack.append([idx,num])

print(*result)
