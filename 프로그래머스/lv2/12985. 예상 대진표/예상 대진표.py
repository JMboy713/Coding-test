def solution(n,a,b):
	if a<b:
		answer = 1
		while a%2!=1 or (a+1!=b):
			answer+=1
			a=((a-1)//2+1)
			b=((b-1)//2+1)
	else:
		answer = 1
		while b%2!=1 or (b+1!=a):
			answer+=1
			a=((a-1)//2+1)
			b=((b-1)//2+1)
	return answer