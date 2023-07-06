N=int(input())
A=sorted(map(int,input().split()))
M=int(input())
B=list(map(int,input().split()))

for i in B:
    start=0
    end=len(A)-1
    while start<=end:
        mid=(start+end)//2
        if A[mid]==i:
            print(1)
            break
        elif A[mid]<i:
            start=mid+1
            
        elif A[mid]>i:
            end=mid-1

    if start>end:
        print(0)
    