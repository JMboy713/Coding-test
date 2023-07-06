N=int(input())
line=list(map(int,input().split()))
result=[0]*N

for i in range(N):# 1~N까지 반복문
    zero=0 # 0의 갯수
    for j in range(N):
        if zero==line[i]and result[j]==0: # 0의 갯수와 왼쪽 서있는 사람의 갯수를 맞춰준다. and result[j]가 0이다.
            result[j]=i+1 # 결과값에 i+1을 넣는다.
            break
        elif(result[j] == 0): # 0이긴 한데 왼쪽에 서있는 사람의 수가 안맞는다면
            zero+=1 # 왼쪽에 서있는 사람의 수를 늘린다.

print(*result)