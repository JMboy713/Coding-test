from itertools import combinations

N,S=map(int,input().split())
array=list(map(int,input().split()))

count=0
for i in range(1,N+1):
    comb=combinations(array,i)
    for j in comb:
        if sum(j)==S:
            count+=1

print(count)
