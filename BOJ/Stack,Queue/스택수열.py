import sys

N=int(sys.stdin.readline())
stack=[] # 12345678넣을거
result=[] # 입력값 ( 충족해야하는 수열 )

output=[] # +,- 를 넣을 리스트
for i in range(N):
    result.append(int(sys.stdin.readline()))

head=0
for i in range(1,N+1):
    stack.append(i)
    output.append('+')
    if stack[-1]==result[head]:
        while stack[-1]==result[head]:
            stack.pop()
            output.append('-')
            head+=1
            if stack==[]:
                break

if output.count('-')==output.count('+'):
    for i in output:
        print(i)
else:
    print("NO")
        

