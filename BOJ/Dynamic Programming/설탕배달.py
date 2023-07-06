import sys
input=sys.stdin.readline


def delivery(array,N):
    for i in range(3,N+1):
        if i>=3:
            array[i]=min(array[i],array[i-3]+1)
        if i>=5:
            array[i]=min(array[i],array[i-5]+1)
    if array[N]==5001:
        print(-1)
    else:
        print(array[N])

if __name__=="__main__":
    N=int(input())
    array=[5001]*(N+1)
    array[0]=0
    delivery(array,N)

