from collections import deque

def solution(s):
    x=len(s)
    answer=0
    arr=deque(s)
    for i in range(x):
        stack=[]
        for j in arr:
            if len(stack)==0:
                stack.append(j)
            else:
                if stack[-1]=='[' and j==']':
                    stack.pop()
                elif stack[-1]=='(' and j==')':
                    stack.pop()
                elif stack[-1]=='{' and j=='}':
                    stack.pop()
                else:
                    stack.append(j)
        if stack==[]:
            answer+=1
        arr.append(arr.popleft())

                    
    return answer