import sys

input=sys.stdin.readline


def check_voca(string):
	stack=[]
	for i in string:
		if stack==[]:
			stack.append(i)
		else:
			if stack[-1]==i:
				stack.pop(-1)
			else:
				stack.append(i)
	# print(stack)
	if stack==[]:
		return True








if __name__=="__main__":
	N=int(input())
	count=0
	for _ in range(N):
		line=input().rstrip()
		if check_voca(line):
			count+=1
	print(count)
		