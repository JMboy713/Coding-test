import sys
input=sys.stdin.readline

def main():
    T=int(input())
    for i in range(T):
        N=int(input())
        dist=[0 for _ in range(N)]
        Li=sorted(map(int,input().split()),reverse=True)
        if N%2==0:
            dist=evencase(N,Li,dist)
        else:
            dist=oddcase(N,Li,dist)
        ans=minimum_level(dist)
        print(ans)

def evencase(N,Li,dist):
    for i in range((N//2)):
        min1=Li.pop()
        min2=Li.pop()
        dist[i]=min1
        dist[-(i+1)]=min2
    return dist

def oddcase(N,Li,dist):
    for i in range((N//2)+1):
        if len(Li)==1:
            min1=Li.pop()
            dist[i]=min1
        else:
            min1=Li.pop()
            min2=Li.pop()
            dist[i]=min1
            dist[-(i+1)]=min2
    return dist

def minimum_level(dist):
    answer=[]
    for j in range(len(dist)-1):
        answer.append(abs(dist[j+1]-dist[j])) 
    return max(answer)

if __name__=="__main__":
    main()