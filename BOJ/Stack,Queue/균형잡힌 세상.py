
result=[]
while True:
    string=input()
    stack=[]
    
    if string=='.': # 종료 조건
        break

    for i in string:
        if i=='[':
            stack.append('[')
        elif i==']':
            if stack!=[]:
                if stack[-1]=='[':
                    stack.pop()
                else:
                    stack.append(']')
            else:
                stack.append(']')
            

        elif i=='{':
            stack.append('{')
        elif i=='}':
            if stack!=[]:
                if stack[-1]=='{':
                    stack.pop()
                else:
                    stack.append('}')
            else:
                stack.append('}')
                

        elif i=='(':
            stack.append('(')
        elif i==')':
            if stack!=[]:
                if stack[-1]=='(':
                    stack.pop()
                else:
                    stack.append(')')
            else:
                stack.append(')')
                
    if stack==[]:
        result.append('yes')
    else:
        result.append('no')


for i in result:
    print(i)


