N=int(input())
body=[]
for i in range(N):
    body.append(list(map(int,input().split())))
ranking=[]
for i in body:
    rank=1
    for j in body:
        if i[0]<j[0] and i[1]<j[1]:
            rank+=1
    ranking.append(rank)

for i in ranking:
    print(i,end=' ')



