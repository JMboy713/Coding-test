import sys
import heapq

def push(array):
    arr = []
    return_array = []
    for num in array:
        if num == 0 and not arr:
            return_array.append(0)
        elif num == 0:
            return_array.append(heapq.heappop(arr))
        else:
            heapq.heappush(arr, num)
    return return_array

if __name__ == "__main__":
    N = int(sys.stdin.readline())
    array = []
    for i in range(N):
        array.append(int(sys.stdin.readline()))
    heap = push(array)
    for num in heap:
        print(num)
