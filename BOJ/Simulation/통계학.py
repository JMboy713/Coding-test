import sys
from collections import Counter

N=int(sys.stdin.readline())
array = [int(sys.stdin.readline()) for i in range(N)]
array.sort()

def arithmaetic_mean(a):
    print(int(round((sum(a)/N),0)))

def median(a,n):
    
    print(a[n//2])


def many(a):
    cnt_a=Counter(a).most_common()
    if len(cnt_a)>1 and cnt_a[0][1]==cnt_a[1][1]:
        print(cnt_a[1][0])
    else:
        print(cnt_a[0][0])

    # 시간초과
    # b=set(a)
    # how_many=[]
    # maxm=0
    # for i in b:
    #     if a.count(i)>maxm:
    #         how_many=[]
    #         how_many.append(i)
    #         maxm=a.count(i)
    #     elif a.count(i)==maxm:
    #         how_many.append(i)


    # if len(how_many)>1:
    #     how_many.sort()
    #     print(how_many[1])
    # else:
    #     print(how_many[0])


    

def Range(a):
    print(max(a)-min(a))

arithmaetic_mean(array)
median(array,N)
many(array)
Range(array)