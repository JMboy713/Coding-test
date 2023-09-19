def solution(n):
	if n==1:
		return 1
	elif n==2:
		return 2
	else:
		block=[0 for _ in range(n)]
		block[0]=1
		block[1]=2
		for i in range(2,n):
			block[i]=block[i-1]+block[i-2]
		return block[-1]%1234567