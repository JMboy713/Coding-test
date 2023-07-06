import sys
from itertools import combinations
input=sys.stdin.readline


def start_link(comb):
    diff=[]
    for i in comb:
        team1=0
        for j in i:
            for k in i:
                team1+=power[j-1][k-1]
        team2=0
        t2=list(set(team)-set(i))
        for t in t2:
            for q in t2:
                team2+=power[t-1][q-1]
        diff.append(abs(team1-team2))
    return (min(diff))

if __name__=="__main__":
    N=int(input())
    power=[list(map(int,input().split())) for _ in range(N)]
    team=[i+1 for i in range(N)]
    comb=list(combinations(team,N//2))
    print(start_link(comb))




'''
6
0 1 2 3 4 5
1 0 2 3 4 5
1 2 0 3 4 5
1 2 3 0 4 5
1 2 3 4 0 5
1 2 3 4 5 0

2
'''