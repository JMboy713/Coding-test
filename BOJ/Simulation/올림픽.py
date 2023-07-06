N,K=map(int,input().split())

ranking=[]
for i in range(N):
    rank=list(map(int,input().split()))
    ranking.append(rank)
ranking.sort(key=lambda x:(x[1],x[2],x[3]),reverse=True)

result=0
for i in range(N):
    if ranking[i][0]==K:
        result=(i)

for i in range(N):
    if ranking[i][1:]==ranking[result][1:]:
        result=i
        break

            

print(result+1)