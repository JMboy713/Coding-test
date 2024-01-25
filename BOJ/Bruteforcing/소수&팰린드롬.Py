import sys
input=sys.stdin.readline().rstrip()


def palindrom(N):
	length=len(N)
	for i in range(length//2):
		if N[i]!=N[(length-i-1)]:
			return False # palindrom 이 아님.
	return True


def Prime_number(N):
	number=int(N)
	for i in range(2,int(number**0.5)+1):
		if number%i==0:
			return False # 소수가 아님
	return True


if __name__=="__main__":
	N=input
	while True:
		N=str(N)
		if int(N)==1:
			N=2
			break
		elif (palindrom(N) and Prime_number(N)):
			break
		else:
			N=int(N)+1
	print(int(N))
		
		
		


	