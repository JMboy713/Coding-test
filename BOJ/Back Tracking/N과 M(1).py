import sys
input=sys.stdin.readline

N,M=map(int,input().split()) # N=숫자 갯수 , M=선택개수
rs=[]
ch=[False]*(N+1)

def recur(num):
    if num==M: # 선
        print(' '.join(map(str,rs)))
        return
    for i in range(1,N+1):
        if ch[i]==False:
            ch[i]=True
            rs.append(i)
            recur(num+1)
            ch[i]=False
            rs.pop()

recur(0)

'''
#0, N=4,M=2
1~N까지 반복문을 돈다.
ch[i]를 방문하지 않았다면 방문으로 바꾸고 결과에 추가한다. 
재귀하여서 num(선택된 갯수 확인)을 1 늘리고 다시 돈다. 
방문하지 않았다면 append [1]에서 [1,2]로 된다음 num이 2로 증가. M과 같기때문에 print한다.
그 다음 수([2])를 위해 미방문으로 바꾸고 pop한다.다 끝났다면 [1]로 돌아와서 [1]을 미방문으로 바꾸고 팝한다. 
반복문 실행. 

'''