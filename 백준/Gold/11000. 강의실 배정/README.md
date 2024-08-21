# [Gold V] 강의실 배정 - 11000 

[문제 링크](https://www.acmicpc.net/problem/11000) 

### 성능 요약

메모리: 81184 KB, 시간: 712 ms

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 제출 일자

2024년 8월 21일 22:49:14

### 문제 설명

<p style="user-select: auto !important;">수강신청의 마스터 김종혜 선생님에게 새로운 과제가 주어졌다. </p>

<p style="user-select: auto !important;">김종혜 선생님한테는 S<sub style="user-select: auto !important;">i</sub>에 시작해서 T<sub style="user-select: auto !important;">i</sub>에 끝나는 N개의 수업이 주어지는데, 최소의 강의실을 사용해서 모든 수업을 가능하게 해야 한다. </p>

<p style="user-select: auto !important;">참고로, 수업이 끝난 직후에 다음 수업을 시작할 수 있다. (즉, T<sub style="user-select: auto !important;">i</sub> ≤ S<sub style="user-select: auto !important;">j</sub> 일 경우 i 수업과 j 수업은 같이 들을 수 있다.)</p>

<p style="user-select: auto !important;">수강신청 대충한 게 찔리면, 선생님을 도와드리자!</p>

### 입력 

 <p style="user-select: auto !important;">첫 번째 줄에 N이 주어진다. (1 ≤ N ≤ 200,000)</p>

<p style="user-select: auto !important;">이후 N개의 줄에 S<sub style="user-select: auto !important;">i</sub>, T<sub style="user-select: auto !important;">i</sub>가 주어진다. (0 ≤ S<sub style="user-select: auto !important;">i</sub> < T<sub style="user-select: auto !important;">i</sub> ≤ 10<sup style="user-select: auto !important;">9</sup>)</p>

### 출력 

 <p style="user-select: auto !important;">강의실의 개수를 출력하라.</p>

