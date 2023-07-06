import sys
input=sys.stdin.readline

def recur(num):
    if num==N: # 선
        print(' '.join(map(str,rs)))
        return
    for i in range(1,N+1):
        if ch[i]==False:
            ch[i]=True
            rs.append(i)
            recur(num+1)
            ch[i]=False
            rs.pop()

if __name__=="__main__":
    N=int(input()) # N=숫자 갯수
    rs=[]
    ch=[False]*(N+1)
    recur(0)