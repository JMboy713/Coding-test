# [level 2] 괄호 회전하기 - 76502 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/76502) 

### 성능 요약

메모리: 10.2 MB, 시간: 0.01 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌2

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.</p>

<ul style="user-select: auto;">
<li style="user-select: auto;"><code style="user-select: auto;">()</code>, <code style="user-select: auto;">[]</code>, <code style="user-select: auto;">{}</code> 는 모두 올바른 괄호 문자열입니다.</li>
<li style="user-select: auto;">만약 <code style="user-select: auto;">A</code>가 올바른 괄호 문자열이라면, <code style="user-select: auto;">(A)</code>, <code style="user-select: auto;">[A]</code>, <code style="user-select: auto;">{A}</code> 도 올바른 괄호 문자열입니다. 예를 들어, <code style="user-select: auto;">[]</code> 가 올바른 괄호 문자열이므로, <code style="user-select: auto;">([])</code> 도 올바른 괄호 문자열입니다.</li>
<li style="user-select: auto;">만약 <code style="user-select: auto;">A</code>, <code style="user-select: auto;">B</code>가 올바른 괄호 문자열이라면, <code style="user-select: auto;">AB</code> 도 올바른 괄호 문자열입니다. 예를 들어, <code style="user-select: auto;">{}</code> 와 <code style="user-select: auto;">([])</code> 가 올바른 괄호 문자열이므로, <code style="user-select: auto;">{}([])</code> 도 올바른 괄호 문자열입니다.</li>
</ul>

<p style="user-select: auto;">대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 <code style="user-select: auto;">s</code>가 매개변수로 주어집니다. 이 <code style="user-select: auto;">s</code>를 왼쪽으로 x (<em style="user-select: auto;">0 ≤ x &lt; (<code style="user-select: auto;">s</code>의 길이)</em>) 칸만큼 회전시켰을 때 <code style="user-select: auto;">s</code>가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.</p>

<hr style="user-select: auto;">

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">s의 길이는 1 이상 1,000 이하입니다.</li>
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
<td style="user-select: auto;"><code style="user-select: auto;">"[](){}"</code></td>
<td style="user-select: auto;">3</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;"><code style="user-select: auto;">"}]()[{"</code></td>
<td style="user-select: auto;">2</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;"><code style="user-select: auto;">"[)(]"</code></td>
<td style="user-select: auto;">0</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;"><code style="user-select: auto;">"}}}"</code></td>
<td style="user-select: auto;">0</td>
</tr>
</tbody>
      </table>
<hr style="user-select: auto;">

<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #1</strong></p>

<ul style="user-select: auto;">
<li style="user-select: auto;">다음 표는 <code style="user-select: auto;">"[](){}"</code> 를 회전시킨 모습을 나타낸 것입니다.</li>
</ul>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">x</th>
<th style="user-select: auto;">s를 왼쪽으로 x칸만큼 회전</th>
<th style="user-select: auto;">올바른 괄호 문자열?</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">0</td>
<td style="user-select: auto;"><code style="user-select: auto;">"[](){}"</code></td>
<td style="user-select: auto;">O</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;"><code style="user-select: auto;">"](){}["</code></td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;"><code style="user-select: auto;">"(){}[]"</code></td>
<td style="user-select: auto;">O</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;"><code style="user-select: auto;">"){}[]("</code></td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;"><code style="user-select: auto;">"{}[]()"</code></td>
<td style="user-select: auto;">O</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">5</td>
<td style="user-select: auto;"><code style="user-select: auto;">"}[](){"</code></td>
<td style="user-select: auto;">X</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto;">
<li style="user-select: auto;">올바른 괄호 문자열이 되는 x가 3개이므로, 3을 return 해야 합니다.</li>
</ul>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #2</strong></p>

<ul style="user-select: auto;">
<li style="user-select: auto;">다음 표는 <code style="user-select: auto;">"}]()[{"</code> 를 회전시킨 모습을 나타낸 것입니다.</li>
</ul>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">x</th>
<th style="user-select: auto;">s를 왼쪽으로 x칸만큼 회전</th>
<th style="user-select: auto;">올바른 괄호 문자열?</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">0</td>
<td style="user-select: auto;"><code style="user-select: auto;">"}]()[{"</code></td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">1</td>
<td style="user-select: auto;"><code style="user-select: auto;">"]()[{}"</code></td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">2</td>
<td style="user-select: auto;"><code style="user-select: auto;">"()[{}]"</code></td>
<td style="user-select: auto;">O</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">3</td>
<td style="user-select: auto;"><code style="user-select: auto;">")[{}]("</code></td>
<td style="user-select: auto;">X</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">4</td>
<td style="user-select: auto;"><code style="user-select: auto;">"[{}]()"</code></td>
<td style="user-select: auto;">O</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">5</td>
<td style="user-select: auto;"><code style="user-select: auto;">"{}]()["</code></td>
<td style="user-select: auto;">X</td>
</tr>
</tbody>
      </table>
<ul style="user-select: auto;">
<li style="user-select: auto;">올바른 괄호 문자열이 되는 x가 2개이므로, 2를 return 해야 합니다.</li>
</ul>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #3</strong></p>

<ul style="user-select: auto;">
<li style="user-select: auto;">s를 어떻게 회전하더라도 올바른 괄호 문자열을 만들 수 없으므로, 0을 return 해야 합니다.</li>
</ul>

<p style="user-select: auto;"><strong style="user-select: auto;">입출력 예 #4</strong></p>

<ul style="user-select: auto;">
<li style="user-select: auto;">s를 어떻게 회전하더라도 올바른 괄호 문자열을 만들 수 없으므로, 0을 return 해야 합니다.</li>
</ul>

<hr style="user-select: auto;">

<p style="user-select: auto;">※ 공지 - 2021년 4월 16일 테스트케이스가 추가되었습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges