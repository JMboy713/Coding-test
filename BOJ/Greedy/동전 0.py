N,K=map(int,input().split())
coin=[]
for i in range(N):
    coin.append(int(input()))


result=0
for i in range(len(coin)-1,0,-1):
    count=(K//coin[i])
    result+=count
    K=K%coin[i]
print(result)