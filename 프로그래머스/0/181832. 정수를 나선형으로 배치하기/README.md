# [level 0] 정수를 나선형으로 배치하기 - 181832 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181832) 

### 성능 요약

메모리: 70.8 MB, 시간: 0.10 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 07일 14:59:33

### 문제 설명

<p style="user-select: auto !important;">양의 정수 <code style="user-select: auto !important;">n</code>이 매개변수로 주어집니다. <code style="user-select: auto !important;">n</code> × <code style="user-select: auto !important;">n</code> 배열에 1부터 <code style="user-select: auto !important;">n</code><sup style="user-select: auto !important;">2</sup> 까지 정수를 인덱스 [0][0]부터 시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">제한사항</h5>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;">1 ≤ <code style="user-select: auto !important;">n</code> ≤ 30</li>
</ul>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예</h5>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">n</th>
<th style="user-select: auto !important;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">5</td>
<td style="user-select: auto !important;">[[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">입출력 예 설명</h5>

<p style="user-select: auto !important;">입출력 예 #1</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><p style="user-select: auto !important;">예제 1번의 <code style="user-select: auto !important;">n</code>의 값은 4로 4 × 4 배열에 다음과 같이 1부터 16까지 숫자를 채울 수 있습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">행 \ 열</th>
<th style="user-select: auto !important;">0</th>
<th style="user-select: auto !important;">1</th>
<th style="user-select: auto !important;">2</th>
<th style="user-select: auto !important;">3</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">12</td>
<td style="user-select: auto !important;">13</td>
<td style="user-select: auto !important;">14</td>
<td style="user-select: auto !important;">5</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">16</td>
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">6</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">9</td>
<td style="user-select: auto !important;">8</td>
<td style="user-select: auto !important;">7</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">따라서 [[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]를 return 합니다.</p></li>
</ul>

<p style="user-select: auto !important;">입출력 예 #2</p>

<ul style="user-select: auto !important;">
<li style="user-select: auto !important;"><p style="user-select: auto !important;">예제 2번의 <code style="user-select: auto !important;">n</code>의 값은 5로 5 × 5 배열에 다음과 같이 1부터 25까지 숫자를 채울 수 있습니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">행 \ 열</th>
<th style="user-select: auto !important;">0</th>
<th style="user-select: auto !important;">1</th>
<th style="user-select: auto !important;">2</th>
<th style="user-select: auto !important;">3</th>
<th style="user-select: auto !important;">4</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">0</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">5</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">16</td>
<td style="user-select: auto !important;">17</td>
<td style="user-select: auto !important;">18</td>
<td style="user-select: auto !important;">19</td>
<td style="user-select: auto !important;">6</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">15</td>
<td style="user-select: auto !important;">24</td>
<td style="user-select: auto !important;">25</td>
<td style="user-select: auto !important;">20</td>
<td style="user-select: auto !important;">7</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">14</td>
<td style="user-select: auto !important;">23</td>
<td style="user-select: auto !important;">22</td>
<td style="user-select: auto !important;">21</td>
<td style="user-select: auto !important;">8</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">4</td>
<td style="user-select: auto !important;">13</td>
<td style="user-select: auto !important;">12</td>
<td style="user-select: auto !important;">11</td>
<td style="user-select: auto !important;">10</td>
<td style="user-select: auto !important;">9</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">따라서 [[1, 2, 3, 4, 5], [16, 17, 18, 19, 6], [15, 24, 25, 20, 7], [14, 23, 22, 21, 8], [13, 12, 11, 10, 9]]를 return 합니다.</p></li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges