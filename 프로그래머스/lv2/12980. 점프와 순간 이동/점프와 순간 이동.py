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
				n-=1
				answer+=1
		return answer
