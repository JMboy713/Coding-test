from math import gcd

def solution(arr):
	if len(arr)==1:
		return arr[0]
	else:
		a=arr.pop(0)
		answer=a
		
		for i in arr:
			b=gcd(answer,i)
			answer=(i*answer)//b
		return answer
