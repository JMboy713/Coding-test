# [level 2] 최솟값 만들기 - 12941 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12941) 

### 성능 요약

메모리: 10.2 MB, 시간: 0.42 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;">길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다. <br style="user-select: auto;">
배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다. 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다. (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)</p>

<p style="user-select: auto;">예를 들어 A = <code style="user-select: auto;">[1, 4, 2]</code> , B = <code style="user-select: auto;">[5, 4, 4]</code> 라면</p>

<ul style="user-select: auto;">
<li style="user-select: auto;">A에서 첫번째 숫자인 1, B에서 첫번째 숫자인 5를 뽑아 곱하여 더합니다. (누적된 값 : 0 + 5(1x5) = 5)</li>
<li style="user-select: auto;">A에서 두번째 숫자인 4, B에서 세번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 5 + 16(4x4) = 21)</li>
<li style="user-select: auto;">A에서 세번째 숫자인 2, B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 21 + 8(2x4) = 29)</li>
</ul>

<p style="user-select: auto;">즉, 이 경우가 최소가 되므로 <strong style="user-select: auto;">29</strong>를 return 합니다.</p>

<p style="user-select: auto;">배열 A, B가 주어질 때 최종적으로 누적된 최솟값을 return 하는 solution 함수를 완성해 주세요.</p>

<h5 style="user-select: auto;">제한사항</h5>

<ul style="user-select: auto;">
<li style="user-select: auto;">배열 A, B의 크기 : 1,000 이하의 자연수</li>
<li style="user-select: auto;">배열 A, B의 원소의 크기 : 1,000 이하의 자연수</li>
</ul>

<h5 style="user-select: auto;">입출력 예</h5>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">A</th>
<th style="user-select: auto;">B</th>
<th style="user-select: auto;">answer</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">[1, 4, 2]</td>
<td style="user-select: auto;">[5, 4, 4]</td>
<td style="user-select: auto;">29</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">[1,2]</td>
<td style="user-select: auto;">[3,4]</td>
<td style="user-select: auto;">10</td>
</tr>
</tbody>
      </table>
<h5 style="user-select: auto;">입출력 예 설명</h5>

<p style="user-select: auto;">입출력 예 #1<br style="user-select: auto;">
문제의 예시와 같습니다.</p>

<p style="user-select: auto;">입출력 예 #2<br style="user-select: auto;">
A에서 첫번째 숫자인 1,  B에서 두번째 숫자인 4를 뽑아 곱하여 더합니다. (누적된 값 : 4) 다음, A에서 두번째 숫자인 2, B에서 첫번째 숫자인 3을 뽑아 곱하여 더합니다. (누적된 값 : 4 + 6 = 10)<br style="user-select: auto;">
이 경우가 최소이므로 10을 return 합니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges