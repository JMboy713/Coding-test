N=int(input())
distance=list(map(int,input().split()))
cost=list(map(int,input().split()))
answer=0


for i in range(0,len(cost)-1):
    if cost[i]<cost[i+1]:
        cost[i+1]=cost[i]

for i in range(len(distance)):
    answer+=(cost[i]*distance[i])

print(answer)