
# dp를 이용한 풀이. 
'''N=int(input())

def solution(n):
	if n==0 or n==1:
		return 1
	block=[0 for i in range(n)]
	block[0]=1
	block[1]=1
	for i in range(2,n):
		if (i+1)%2==0:
			block[i]=min(block[i-1]+1,block[i//2])
		else:
			block[i]=block[i-1]+1
	return block

print(solution(N))'''


# 탑다운 방식을 사용해보자. 
N=int(input())

def solution(n):
	if n==1:
		return 1
	else:
		answer=0
		while n!=0:
			# 순간이동이 가능할 때
			if n%2==0:
				#print("순간이동")
				n=n/2
			# 순간이동이 불가능할 때
			else:
				# 걷기
				n-=1
				answer+=1
		return answer

print(solution(N))