import sys
input=sys.stdin.readline

def main():
    N=int(input())
    K=int(input())
    if K>=N:
        print(0)
    else:
        sensor=sorted(map(int,input().split()))
        dist=[]

        for i in range(N-1):
            dist.append(sensor[i+1]-sensor[i])
        dist.sort()

        for _ in range(K-1):
            dist.pop()

        print(sum(dist))

if __name__=="__main__":
    main()


'''
6
2
1 6 9 3 6 7

5
'''