import sys
input=sys.stdin.readline

def compare(M,S):
	count=0
	for i in range(M):
		string=input()
		if string in S:
			count+=1
	return count
    

if __name__=="__main__":
	N,M=map(int,input().split())
	S=[]
	for i in range(N):
		S.append(input())
	print(compare(M,S))















'''
5 11
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh
baekjoon
codeplus
codeminus
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink

4
'''