# 반복문을 progress 가 어떤 원소가 있을때까지 계속 돌린다. 
# 0번재 값이 100이 되면 뒤의 원소가 100이 되었는지 확인한다. 
# 100인 거는 다 꺼낸다. 
# 꺼낸 갯수 만큼 return 의 리스트에 append 한다.

def solution(progresses, speeds):
    answer = []
    while progresses:
        count=0
        if progresses[0]>=100:
            while progresses[0]>=100:
                progresses.pop(0)
                speeds.pop(0)
                count+=1
                if progresses==[]:
                    break
            answer.append(count)
            
        if progresses==[]:
            break
        for i in range(len(progresses)):
            progresses[i]+=speeds[i]
            
    return answer