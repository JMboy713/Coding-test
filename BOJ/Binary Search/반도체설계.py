n=int(input())
port=list(map(int,input().split()))
ans=0
ans2=0
for i in range(n):
    if port[i]<=i:
        ans+=1
    elif port[i]>=i:
        ans2+=1
print(max(ans,ans2))