'''
n개의 서로 다른 양의 정수 a1, a2, ..., 
an으로 이루어진 수열이 있다.
ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다.
자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 
(ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.
'''
def two_numbers_sum(array,i,j,x):
	answer=0
	while j>i:
		if array[i]+array[j]==x:
			answer+=1
			if abs(x-i)>=abs(j-x):
				i+=1
			else:
				j-=1
		elif array[i]+array[j]>=x:
			j-=1
		else:
			i+=1
	return answer


if __name__=='__main__':
	n=int(input())
	array=sorted(map(int,input().split()))
	x=int(input())
	i=0
	j=n-1
	print(two_numbers_sum(array,i,j,x))

