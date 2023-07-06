import sys

input=sys.stdin.readline

N=int(input())
if N==1:
    print(1)
elif N==2:
    print(2)
else:
    array=[0 for _ in range(N)]
    array[0]=1
    array[1]=2

    for i in range(2,N):
        array[i]=(array[i-1]+array[i-2])%15746


    print(array[-1])