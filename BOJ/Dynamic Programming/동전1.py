import sys
input=sys.stdin.readline

N,M=map(int,input().split())
array=[0 for _ in range(M+1)]
array[0]=1
for i in range(N):
    coin=int(input())
    for i in range(coin,len(array)):
        array[i]+=(array[i-coin])

print(array[-1])