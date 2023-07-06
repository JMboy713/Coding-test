import sys
input=sys.stdin.readline

def main():
    N=int(input())
    A=sorted(map(int,input().split()))
    B=list(map(int,input().split()))
    B.sort(reverse=True)
    answer=find_min(N,A,B)
    print(answer)

def find_min(N,A,B):
    answer=0
    for i in range(N):
        answer+=A[i]*B[i]
    return (answer)

if __name__=="__main__":
    main()
