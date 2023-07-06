import time

N=int(input())
NN=list(map(int,input().split()))
M=int(input())
MM=sorted(map(int,input().split()))
answer=[]


def binary_search(array,target,start,end):
    while start<=end:
        mid=(start+end)//2
        if array[mid]>target:
            start=mid+1
        elif array[mid]<target:
            end=mid-1
        else:
            return mid
    return None

for i in MM:
    result=binary_search(NN,i,0,N)
    if result!=None:
        print('yes',end='')
    else:
        print('no',end='')


