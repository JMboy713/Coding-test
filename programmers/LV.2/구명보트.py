'''def solution(people, limit):
	people.sort()
	answer=0
	while len(people)>1:
		if people[0]+people[-1]>limit:
			people.pop()
			answer+=1
		else:
			answer+=1
			people.pop(0)
			people.pop()
	answer+=len(people)
	return answer'''

from collections import deque

def solution(people, limit):
	people.sort()
	people=deque(people)
	answer=0
	while len(people)>1:
		if people[0]+people[-1]>limit:
			people.pop()
			answer+=1
		else:
			answer+=1
			people.popleft()
			people.pop()
	answer+=len(people)
	return answer

people=list(map(int,input().split(',')))
limit=int(input())
print(solution(people,limit))