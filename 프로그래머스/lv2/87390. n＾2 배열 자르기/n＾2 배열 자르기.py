def solution(n, left, right):
	arr=[]
	for i in range(left,right+1):
		num=(i%n)+1
		if num==0:
			num=n
		elif num<(i//n)+1:
			num=(i//n)+1
		arr.append(num)
	
	return arr

            