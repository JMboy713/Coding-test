# [level 2] 다음 큰 숫자 - 12911 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12911) 

### 성능 요약

메모리: 10.3 MB, 시간: 0.01 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.</li>
<li style="user-select: auto;">조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.</li>
<li style="user-select: auto;">조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.</li>
</ul>

<p style="user-select: auto;">예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.</p>

<p style="user-select: auto;">자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.</p>

<h5 style="user-select: auto;">제한 사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">n은 1,000,000 이하의 자연수 입니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">78</td>
<td style="user-select: auto;">83</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">15</td>
<td style="user-select: auto;">23</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예#1<br style="user-select: auto;">
문제 예시와 같습니다.<br style="user-select: auto;">
입출력 예#2<br style="user-select: auto;">
15(1111)의 다음 큰 숫자는 23(10111)입니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges