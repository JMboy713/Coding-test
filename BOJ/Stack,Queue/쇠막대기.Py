import sys
input=sys.stdin.readline

pipe=input().rstrip()
stack=[]
result=0
pipe_count=0

for i in pipe:

    if i=='(':
        stack.append('(')
        pipe_count+=1
    else:
        if stack[-1]=='(':
            stack.append(')')
            pipe_count-=1
            result+=(pipe_count)
            
        else:
            result+=1
            stack.append(')')
            pipe_count-=1
print(result)
            