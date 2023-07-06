from collections import deque

T=int(input()) # 테스트 케이스 수
for i in range(T):
    func=input() # 함수 (RDD)입력
    number=int(input()) # 배열 개수 입력
    array=deque(eval(input())) # deque를 입력받음. 문자열처럼 받는 list를 list로 바꾸기 위해 eval 함수 사용.
    status=True # True=정방향, false=역방향을 표시하기 위함 ( reverse 대체 )

    for i in func: # 함수 실행
        if i=="R": # R일경우
            status=not status # 방향을 바꿔준다. 
        elif i=="D":
            if status==True: # 정방향일경우
                if array!=deque([]): # 빈 리스트가 아니라면
                    array.popleft() # 앞에서 뺀다.
                else:
                    array="error" # 예외처리
                    break
            else:
                if array!=deque([]): # 빈리스트가 아니라면
                    array.pop() # reverse로 뒤집었다 치면 맨 뒤가 맨 앞이기 때문에 맨 뒤를 pop한다.
                else:
                    array="error"
                    break
    
    if array=="error": # 예외처리
        print(array)
    else:
        if array==deque([]): # 빈 리스트면 빈 리스트를 출력
            print("[]")
        else:
            result=['['] # 추후 추가해주기 위해 [ 만들기
            answer=[] # 정답 넣을 곳
            if status==True: # 정방향일 경우
                for i in array: 
                    answer.append(str(i))# 순서대로 꺼내서 넣음
            else: # 역방향일경우
                for i in range(len(array)-1,-1,-1): # 
                    answer.append(str(array[i]))#순서대로 꺼내서 넣음
            answer=','.join(answer) # ,로 join시켜줌
            result.append(answer)# [ answer되게 만듬
            result.append(']')# ] 추가
            print(''.join(result)) #공백없이 join해서 print해줌