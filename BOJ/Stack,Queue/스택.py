import sys

N=int(sys.stdin.readline())
stack=[]


for i in range(N):
    array=list(map(str,sys.stdin.readline().split()))
    if array[0]=="push":
        stack.append(array[1])
    elif array[0]=="pop":
        if stack!=[]:
            print(stack.pop())
        else:
            print(-1)
    elif array[0]=="size":
        print(len(stack))
    elif array[0]=="empty":
        if (len(stack)==0):
            print(1)
        else:
            print(0)
    else:
        if stack!=[]:
            print(stack[-1])
        else:
            print(-1)
    