# [level 2] n^2 배열 자르기 - 87390 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/87390) 

### 성능 요약

메모리: 18.1 MB, 시간: 31.73 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌3

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">정수 <code style="user-select: auto;">n</code>, <code style="user-select: auto;">left</code>, <code style="user-select: auto;">right</code>가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.</p>

<ol style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">n</code>행 <code style="user-select: auto;">n</code>열 크기의 비어있는 2차원 배열을 만듭니다.</li>
<li style="user-select: auto;"><code style="user-select: auto;">i = 1, 2, 3, ..., n</code>에 대해서, 다음 과정을 반복합니다.

<ul style="user-select: auto;">
<li style="user-select: auto;">1행 1열부터 <code style="user-select: auto;">i</code>행 <code style="user-select: auto;">i</code>열까지의 영역 내의 모든 빈 칸을 숫자 <code style="user-select: auto;">i</code>로 채웁니다.</li>
</ul></li>
<li style="user-select: auto;">1행, 2행, ..., <code style="user-select: auto;">n</code>행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.</li>
<li style="user-select: auto;">새로운 1차원 배열을 <code style="user-select: auto;">arr</code>이라 할 때, <code style="user-select: auto;">arr[left]</code>, <code style="user-select: auto;">arr[left+1]</code>, ..., <code style="user-select: auto;">arr[right]</code>만 남기고 나머지는 지웁니다.</li>
</ol>

<p style="user-select: auto;">정수 <code style="user-select: auto;">n</code>, <code style="user-select: auto;">left</code>, <code style="user-select: auto;">right</code>가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">1 ≤ <code style="user-select: auto;">n</code> ≤ 10<sup style="user-select: auto;">7</sup></li>
<li style="user-select: auto;">0 ≤ <code style="user-select: auto;">left</code> ≤ <code style="user-select: auto;">right</code> &lt; n<sup style="user-select: auto;">2</sup></li>
<li style="user-select: auto;"><code style="user-select: auto;">right</code> - <code style="user-select: auto;">left</code> &lt; 10<sup style="user-select: auto;">5</sup></li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">n</th>
<th style="user-select: auto;">left</th>
<th style="user-select: auto;">right</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">5</td>
<td style="user-select: auto;"><code style="user-select: auto;">[3,2,2,3]</code></td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">14</td>
<td style="user-select: auto;"><code style="user-select: auto;">[4,3,3,3,4,4,4,4]</code></td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #1</strong></p>

<ul style="user-select: auto;">
<li style="user-select: auto;">다음 애니메이션은 주어진 과정대로 1차원 배열을 만드는 과정을 나타낸 것입니다.</li>
</ul>

<p style="user-select: auto;"><img src="https://grepp-programmers.s3.amazonaws.com/production/file_resource/103/FlattenedFills_ex1.gif" title="" alt="ex1" style="user-select: auto;"></p>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #2</strong></p>

<ul style="user-select: auto;">
<li style="user-select: auto;">다음 애니메이션은 주어진 과정대로 1차원 배열을 만드는 과정을 나타낸 것입니다.</li>
</ul>

<p style="user-select: auto;"><img src="https://grepp-programmers.s3.amazonaws.com/production/file_resource/104/FlattenedFills_ex2.gif" title="" alt="ex2" style="user-select: auto;"></p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges