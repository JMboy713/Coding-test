import sys

input=sys.stdin.readline

n=int(input())

wine=[int(input()) for _ in range(n)]
maximum=[0 for _ in range(n+1)]

if n<=2:
    print(sum(wine))
else:
    maximum[1]=wine[0]
    maximum[2]=wine[0]+wine[1]

    for i in range(3,n+1):
        first_value=maximum[i-3]+wine[i-2]+wine[i-1]
        second_value=wine[i-1]+maximum[i-2]
        last_value=wine[i-1]+wine[i-2]+maximum[i-4]
        maximum[i]=max(first_value,second_value,last_value)

    print(max(maximum))

# 두잔 연속으로 안먹을때.     
# 6 1000 1000 1 1 1000 1000