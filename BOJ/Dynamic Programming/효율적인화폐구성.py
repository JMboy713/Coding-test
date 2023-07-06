N,M=map(int,input().split())
array=[]
for i in range(N):
    array.append(int(input()))
# 할당할 리스트 만들어주기
answer=[10001]*(M+1)

answer[0]=0
for i in range(N):
    for j in range(array[i],M+1):
        answer[j]=min(answer[j],answer[j-array[i]]+1)

if answer[M]==10001:
    print(-1)
else:
    print(answer[M])
