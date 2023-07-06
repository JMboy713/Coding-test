# import sys
# input=sys.stdin.readline

# def plus_ott():
#     dp = [1] * 10001

#     for i in range(2, 10001):
#         dp[i] += dp[i - 2]
        
#     for i in range(3, 10001):
#         dp[i] += dp[i - 3]
    
#     return dp

# if __name__=="__main__":
#     T=int(input())
#     dp=plus_ott()
#     for _ in range(T):
#         n = int(input())
#         print(dp[1:15])

num = int(input())
lst = [int(input()) for i in range(num)]
d = [1]*10001
d[1] = 1
d[2] = 2
d[3] = 3
for i in range(4, 10001):
    d[i] += d[i-2]
    d[i] += d[i-3]

for i in lst:
    print(d[0:15])