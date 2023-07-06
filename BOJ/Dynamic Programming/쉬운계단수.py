import sys

input=sys.stdin.readline

N=int(input())

ans=[0 for _ in range(N)]
ans[0]=9
ans[1]=17
for i in range(2,N):
    ans[i]=ans[i-1]+18
print(ans[N-1]%1000000000)
