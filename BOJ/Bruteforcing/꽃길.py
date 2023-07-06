import sys
import numpy as np

input=sys.stdin.readline

N=int(input())
G=[list(map(int,input().split())) for _ in range(N)]

cost=[]

for i in range(1,N-1): # 1~5열까지 
    c=[]
    for j in range(1,N-1):
        price=(G[i-1][j]+G[i+1][j]+G[i][j]+G[i][j-1]+G[i][j+1])
        c.append(price)
    cost.append(c)

Bool_garden=np.array([[True for _ in range(N-1)] for _ in range(N-1)])

for _ in range(3):
    minimum=201
    for i in range(len(cost)):
        for j in range(len(cost)):
            if cost[i][j]<minimum:
                row=i
                col=j
    if row==1 and col==1:
        cost[row][col]=201
        
            










    



'''
6
1 0 2 3 3 4
1 1 1 1 1 1
0 0 1 1 1 1
3 9 9 0 1 99
9 11 3 1 0 3
12 3 0 0 0 1

12
'''