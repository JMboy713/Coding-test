N=int(input())
arr=[0]*(N+1)
result=[0]*(N+1)
for i in range(1,N+1):
    a=int(input())
    arr[i]=a
    result[i]=a


if N==1:
    print(arr[-1])
else:

    result[2]+=result[1]

    for i in range(3,N+1):
        result[i]=max(result[i-3]+arr[i-1]+result[i],result[i-2]+result[i])

    print(result[-1])
