import sys
input=sys.stdin.readline
def main():
    n,m=map(int,input().split())
    ans=toto(n,m)
    print(ans)


def toto(n,m):
    minimum_cost=[]
    for i in range(n):
        pi,li=map(int,input().split())
        subject=sorted(map(int,input().split()),reverse=True)
        if li>pi:
            minimum_cost.append(1)
        else:
            minimum_cost.append(subject[li-1])
    minimum_cost.sort()
    count=0
    for i in minimum_cost:
        if m>=i:
            m-=i
            count+=1
        else:
            break
    return count


if __name__=="__main__":
    main()