import sys

input=sys.stdin.readline

def main():
    N=int(input())
    max_pay=[0 for i in range(N)]

    T=[]
    P=[]
    for _ in range(N):
        time,pay=map(int,input().split())
        T.append(time)
        P.append(pay)

    maximum=find_max(N,T,P,max_pay)
    print(maximum)

def find_max(N,T,P,max_pay):
    maximum=0
    for i in range(len(T)):
        cost=T[i]-1 # 걸리는 시간.
        if N>(i+cost): # 가능하다면  맥스값으로 바꾸자. 
            if i>0:
                maximum=max(max_pay[:i])
            max_pay[i+cost]=max(max_pay[i+cost],maximum+P[i])

    
    return(max(max_pay))

if __name__=="__main__":
    main()

'''
7
3 10
5 20
1 10
1 20
2 15
4 40
2 200

45

# example 4

10
5 50
4 40
3 30
2 20
1 10
1 10
2 20
3 30
4 40
5 50

90
'''