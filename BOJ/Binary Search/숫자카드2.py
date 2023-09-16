import sys
from collections import Counter

input=sys.stdin.readline

from bisect import bisect_left, bisect_right



def card2_soultion(N,n,M,m):
	"""_summary_

	Args:
		M (_int_): 숫자 카드의 개수
		n (_list_): 숫자 카드에 적혀있는 정수
		N (_int_): 구해야 할 숫자 카드 개수	
		m (_list_): 구해야할 숫자 카드	
	"""
	count=Counter(n)
	dic=dict(count)
	ans=[]
	for i in m:
		ans.append(dic.get(i,0))
	return ans


if __name__=="__main__":
	N=int(input())
	n=sorted(map(int,input().split()))
	M=int(input())
	m=list(map(int,input().split()))
	print(*card2_soultion(N,n,M,m))
"""
def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_index - left_index
for i in range(len(m)):
    print(count_by_range(n, m[i], m[i]), end=' ')
"""