import sys
input=sys.stdin.readline
def main():
    N,M=map(int,input().split())
    arr=list(map(int,input().split()))
    answer=two_pointer(arr,N,M)
    print(answer)

def two_pointer(arr,N,M):
    count=0
    start=0
    end=1
    while start<=end and end<N+1:
        if sum(arr[start:end])==M:
            count+=1
            end+=1
        elif sum(arr[start:end])<M:
            end+=1
        else:
            start+=1

    return (count)

if __name__=="__main__":
    main()

# for i in range(len(arr)):
#     number=0
#     if arr[i]>M:
#         continue
#     elif arr[i]==M:
#         count+=1
#         continue
#     else:
#         while number<M and i<N:
#             number+=arr[i]
#             i+=1
#             if number==M:
#                 count+=1

# print(count)

