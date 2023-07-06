import sys
input=sys.stdin.readline

def main():
    N,K=map(int,input().split())
    kids=list(map(int,input().split()))
    answer=kindergarden(N,K,kids)
    print(answer)

def kindergarden(N,K,kids):
    cost=[]
    for i in range(len(kids)-1):
        cost.append(kids[i+1]-kids[i])
    cost.sort()
    for _ in range(K-1):
        cost.pop()
    return (sum(cost))

if __name__=="__main__":
    main()
    


'''
#입력
5 3
1 3 5 6 10
#출력
3
'''