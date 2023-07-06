from itertools import combinations

N,M,K=map(int,input().split())
beers = [list(map(int, input().split())) for _ in range(K)]
beers2 = sorted(beers,key=lambda x: (x[1],x[0]))

V=[]
C=[]
for i in beers2:
    V.append(i[0])
    C.append(i[1])
a=combinations(V,3)
ans=[]
for i in a:
    if sum(i)>=M:
        ans.append(i)
if ans==[]:
    print(-1)
else:
    answer=0
    for i in ans:
        for j in range(N):
            ind=V.index(i[j])
            if answer<C[ind]:
                answer=C[ind]
    print(answer)
        