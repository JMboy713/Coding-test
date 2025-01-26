from copy import deepcopy
def main():
    result = 999
    for stage in range(1,n):
        for k in range(m):
            if k < m-1:# 우측에서 온걸 가져올건데 우측것만 아니면 좋겠어.
                dp[stage][k][2] = min(dp[stage][k][2],dp[stage-1][k+1][1] + zido[stage][k],dp[stage-1][k+1][0] + zido[stage][k])
            if k > 0: # 좌측에서 온걸 가져올건데 좌측것만 아니면 좋겠어.
                dp[stage][k][0] = min(dp[stage][k][0],dp[stage-1][k-1][1] + zido[stage][k],dp[stage-1][k-1][2] + zido[stage][k])
            # 바로 아래로 내려올건데 바로 아래서 내려온게 아니었음 좋겠어.
            dp[stage][k][1] = min(dp[stage][k][1],dp[stage-1][k][0] + zido[stage][k],dp[stage-1][k][2] + zido[stage][k])
    for i in dp[-1]:
        result = min(result,min(i))
    return result


if __name__ == '__main__':
    n,m = map(int,input().split())
    zido = [list(map(int,input().split())) for _ in range(n)]
    dp = [[[i,i,i] for i in zido[0]]]
    for i in range(n-1):
        dp.append([[999,999,999] for _ in  range(m)])
    # for i in dp:
    #     print(i)
    # print('asdasda',dp[-1])
    # exit()
    result = main()
    print(result)

# k 가 0이면 0이랑 1
# k 가 len-1이면 len-1 이랑 len-2
'''
6 4
5 8 5 1
3 5 8 4
9 77 65 5
2 1 5 2
5 98 1 5
4 95 67 58
'''