def is_decimal(n):
	a=int(n**0.5)
	for i in range(2,a+1):
		if n%i==0:
			return False
		else:
			continue
	return True


def solution(brown,yellow):
	if is_decimal(yellow):
		width=(yellow+2)
		height=3
		return [width,height]
	else:
		# 2로 나눴을 때 가능한 숫자만 높이로 지정한다. 
		max_height=(int(yellow//2))
		for h in range(1,max_height+1):
			if yellow%h==0:
				garo=int((yellow/h)+2)
				sero=h+2
				if garo*sero-yellow==brown:
					return [garo,sero]

print(solution(12,4))
		