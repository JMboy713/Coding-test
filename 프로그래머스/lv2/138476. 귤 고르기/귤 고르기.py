def solution(k, tangerine):
	counter={}
	for i in tangerine:
		if i in counter:
			counter[i]+=1
		else:
			counter[i]=1

	sorted_counter=sorted(counter.items(), key=lambda item:item[1],reverse=True)
	array=[]
	for i in sorted_counter:
		for _ in range(i[1]):
			array.append(i[0])
	
	ans=array[:k]
	ans=set(ans)
	return len(ans)
	
	