import sys

N=int(sys.stdin.readline())

top=list(map(int,sys.stdin.readline().split()))
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
