# [level 2] 멀리 뛰기 - 12914 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12914) 

### 성능 요약

메모리: 10.2 MB, 시간: 0.43 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는<br style="user-select: auto;">
(1칸, 1칸, 1칸, 1칸)<br style="user-select: auto;">
(1칸, 2칸, 1칸)<br style="user-select: auto;">
(1칸, 1칸, 2칸)<br style="user-select: auto;">
(2칸, 1칸, 1칸)<br style="user-select: auto;">
(2칸, 2칸)<br style="user-select: auto;">
의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 예를 들어 4가 입력된다면, 5를 return하면 됩니다.</p>

<h5 style="user-select: auto;">제한 사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">n은 1 이상, 2000 이하인 정수입니다.</li>
</ul>

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">5</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">3</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1<br style="user-select: auto;">
위에서 설명한 내용과 같습니다.</p>

<p style="user-select: auto;">입출력 예 #2<br style="user-select: auto;">
(2칸, 1칸)<br style="user-select: auto;">
(1칸, 2칸)<br style="user-select: auto;">
(1칸, 1칸, 1칸)<br style="user-select: auto;">
총 3가지 방법으로 멀리 뛸 수 있습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges