# 일정 금액 지불 -> 10일 회원. 
# 회원은 1가지 제품을 할인. 
# 할인 제품은 하루에 하나만 구매가능. 
# 자신이 원하는 제품과 수량이 10일 연속일 경우 회원가입을 하려 한다
# want : 원하는 제품, number : 수량, discount : 할인하는 제품. 
# 할인받을 수 있는 회원등록 날짜의 총 일수를 return 하시오.  없다면 0을 return 

# discount 를 순회 
# queue 의 자료 구조를 이용해보자. 
# 1.반복문을 돌려서 want 에 없는것이 나온다면 array를 비운다. ( 연속이 안되기 때문)
# 2. 반목문을 돌려서 want 에 있는것이 있다면 array 에 넣는다. 
# 2-1 . array의 index에 해당하는 num에 숫자를 +1 해준다.
# 3. 10개가 되었을때 필요한 number와 같다면 +1 해준다. 이후 array 에서 leftpop()을 해준다.
from collections import deque

def solution(want, number, discount):
    array=deque([])
    num=[0 for _ in range(len(want))]
    result=0
    for i in discount:
        # 1,2
        if i in want:
            array.append(i)
            num[want.index(i)]+=1
            
            if len(array)==10:
                if number==num:
                    result+=1
                left=array.popleft()
                num[want.index(left)]-=1
        else:
            array=deque([])
            num=[0 for _ in range(len(want))]
        
    return result
        
            
        
            
            
    
    
    