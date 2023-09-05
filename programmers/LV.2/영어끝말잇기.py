n=2
words=["hello", "one", "even", "never", "now", "world", "draw"]


def solution(n, words):
	length=len(words)
	word_stack=[]
	for i in range(length):
		if i==0:
			word_stack.append(words[i])

		elif words[i] in word_stack or words[i][0]!=word_stack[-1][-1]:
			person=(i%n)+1
			if (i+1)%n==0:
				turn=((i+1)//n)
			else:
				turn=((i+1)//n)+1
			return [person,turn]
		else:
			word_stack.append(words[i])
	return [0,0]

print(solution(n,words))
		
