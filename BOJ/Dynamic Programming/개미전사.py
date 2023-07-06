# N=int(input())
# K=list(map(int,input().split()))
# a=[0]*101
# for i in range(N):
#     if i==1 or i==2:
#         a[i]=K[i]
#     else:
#         a[i]=max(a[i-1],a[i-2]+K[i],a[i-3]+K[i])
# print(max(a))

n = int(input())
# 모든 식량 정보 입력 받기
array = list(map(int, input().split()))

# 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
d = [0] * 100

# 다이나믹 프로그리맹 진행(바텀업)
d[0] = array[0]
d[1] = max(array[0], array[1])
for i in range(2,n):
    d[i] = max(d[i-1],d[i-2]+array[i])
    
# 계산된 결과 출력
print(max(d))