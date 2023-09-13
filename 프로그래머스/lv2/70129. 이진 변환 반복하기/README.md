# [level 2] 이진 변환 반복하기 - 70129 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/70129) 

### 성능 요약

메모리: 10.3 MB, 시간: 1.34 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌1

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.</p>

<ol style="user-select: auto;">
<li style="user-select: auto;">x의 모든 0을 제거합니다.</li>
<li style="user-select: auto;">x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.</li>
</ol>

<p style="user-select: auto;">예를 들어, <code style="user-select: auto;">x = "0111010"</code>이라면, x에 이진 변환을 가하면 <code style="user-select: auto;">x = "0111010" -&gt; "1111" -&gt; "100"</code> 이 됩니다.</p>

<p style="user-select: auto;">0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">s의 길이는 1 이상 150,000 이하입니다.</li>
<li style="user-select: auto;">s에는 '1'이 최소 하나 이상 포함되어 있습니다.</li>
</ul>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">s</th>
<th style="user-select: auto;">result</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;"><code style="user-select: auto;">"110010101001"</code></td>
<td style="user-select: auto;"><code style="user-select: auto;">[3,8]</code></td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;"><code style="user-select: auto;">"01110"</code></td>
<td style="user-select: auto;"><code style="user-select: auto;">[3,3]</code></td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;"><code style="user-select: auto;">"1111111"</code></td>
<td style="user-select: auto;"><code style="user-select: auto;">[4,1]</code></td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">"110010101001"이 "1"이 될 때까지 이진 변환을 가하는 과정은 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">회차</th>
<th style="user-select: auto;">이진 변환 이전</th>
<th style="user-select: auto;">제거할 0의 개수</th>
<th style="user-select: auto;">0 제거 후 길이</th>
<th style="user-select: auto;">이진 변환 결과</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">"110010101001"</td>
<td style="user-select: auto;">6</td>
<td style="user-select: auto;">6</td>
<td style="user-select: auto;">"110"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">"110"</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">"10"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">"10"</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">"1"</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto;">
<li style="user-select: auto;">3번의 이진 변환을 하는 동안 8개의 0을 제거했으므로, <code style="user-select: auto;">[3,8]</code>을 return 해야 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #2</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">"01110"이 "1"이 될 때까지 이진 변환을 가하는 과정은 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">회차</th>
<th style="user-select: auto;">이진 변환 이전</th>
<th style="user-select: auto;">제거할 0의 개수</th>
<th style="user-select: auto;">0 제거 후 길이</th>
<th style="user-select: auto;">이진 변환 결과</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">"01110"</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">"11"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">"11"</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">"10"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">"10"</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">"1"</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto;">
<li style="user-select: auto;">3번의 이진 변환을 하는 동안 3개의 0을 제거했으므로, <code style="user-select: auto;">[3,3]</code>을 return 해야 합니다.</li>
</ul>

<p style="user-select: auto;">입출력 예 #3</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">"1111111"이 "1"이 될 때까지 이진 변환을 가하는 과정은 다음과 같습니다.</li>
</ul>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">회차</th>
<th style="user-select: auto;">이진 변환 이전</th>
<th style="user-select: auto;">제거할 0의 개수</th>
<th style="user-select: auto;">0 제거 후 길이</th>
<th style="user-select: auto;">이진 변환 결과</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">"1111111"</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">7</td>
<td style="user-select: auto;">"111"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">"111"</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">"11"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;">"11"</td>
<td style="user-select: auto;">0</td>
<td style="user-select: auto;">2</td>
<td style="user-select: auto;">"10"</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;">"10"</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">1</td>
<td style="user-select: auto;">"1"</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto;">
<li style="user-select: auto;">4번의 이진 변환을 하는 동안 1개의 0을 제거했으므로, <code style="user-select: auto;">[4,1]</code>을 return 해야 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges