# [level 1] 정수 제곱근 판별 - 12934 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12934) 

### 성능 요약

메모리: 10.3 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 27일 12:19:47

### 문제 설명

<p style="user-select: auto !important;">임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.<br style="user-select: auto !important;">
n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.</p>

<h5 style="user-select: auto !important;">제한 사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">n은 1이상,  50000000000000 이하인 양의 정수입니다.</li>
</ul>

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">n</th>
<th style="text-align: center; user-select: auto !important;">return</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">121</td>
<td style="text-align: center; user-select: auto !important;">144</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="text-align: center; user-select: auto !important;">-1</td>
</tr>
</tbody>
      </table>
<h6 style="user-select: auto !important;">입출력 예 설명</h6>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예#1</strong><br style="user-select: auto !important;">
121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.</p>

<p style="user-select: auto !important;"><strong style="user-select: auto !important;">입출력 예#2</strong><br style="user-select: auto !important;">
3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges