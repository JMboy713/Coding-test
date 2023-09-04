s='baabaa'


def solution(s):
	stack=[]
	text=list(s)
	stack.append(text.pop(0))
	for i in text:
		if stack!=[]:
			if i ==stack[-1]:
				stack.pop()
			else:
				stack.append(i)
		else:
			stack.append(i)
	if stack==[]:
		return 1
	else:
		return 0

print(solution(s))

# 확인