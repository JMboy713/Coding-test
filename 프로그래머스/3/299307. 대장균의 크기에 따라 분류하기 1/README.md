# [level 3] 대장균의 크기에 따라 분류하기 1 - 299307 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/299307) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > SELECT

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2024년 09월 25일 17:44:22

### 문제 설명

<p style="user-select: auto !important;">대장균들은 일정 주기로 분화하며, 분화를 시작한 개체를 부모 개체, 분화가 되어 나온 개체를 자식 개체라고 합니다.<br style="user-select: auto !important;">
다음은 실험실에서 배양한 대장균들의 정보를 담은 <code style="user-select: auto !important;">ECOLI_DATA</code> 테이블입니다. <code style="user-select: auto !important;">ECOLI_DATA</code> 테이블의 구조는 다음과 같으며,  <code style="user-select: auto !important;">ID</code>, <code style="user-select: auto !important;">PARENT_ID</code>, <code style="user-select: auto !important;">SIZE_OF_COLONY</code>, <code style="user-select: auto !important;">DIFFERENTIATION_DATE</code>, <code style="user-select: auto !important;">GENOTYPE</code> 은 각각 대장균 개체의 ID, 부모 개체의 ID, 개체의 크기, 분화되어 나온 날짜, 개체의 형질을 나타냅니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">Column name</th>
<th style="user-select: auto !important;">Type</th>
<th style="user-select: auto !important;">Nullable</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">PARENT_ID</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">TRUE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">SIZE_OF_COLONY</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">DIFFERENTIATION_DATE</td>
<td style="user-select: auto !important;">DATE</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">GENOTYPE</td>
<td style="user-select: auto !important;">INTEGER</td>
<td style="user-select: auto !important;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">최초의 대장균 개체의 <code style="user-select: auto !important;">PARENT_ID</code> 는 NULL 값입니다.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">문제</h5>

<p style="user-select: auto !important;">대장균 개체의 크기가 100 이하라면 'LOW', 100 초과 1000 이하라면 'MEDIUM', 1000 초과라면 'HIGH' 라고 분류합니다. 대장균 개체의 ID(<code style="user-select: auto !important;">ID</code>) 와 분류(<code style="user-select: auto !important;">SIZE</code>)를 출력하는 SQL 문을 작성해주세요.이때 결과는 개체의 ID 에 대해 오름차순 정렬해주세요.</p>

<hr style="user-select: auto !important;">

<h5 style="user-select: auto !important;">예시</h5>

<p style="user-select: auto !important;">예를 들어 <code style="user-select: auto !important;">ECOLI_DATA</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">PARENT_ID</th>
<th style="user-select: auto !important;">SIZE_OF_COLONY</th>
<th style="user-select: auto !important;">DIFFERENTIATION_DATE</th>
<th style="user-select: auto !important;">GENOTYPE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">NULL</td>
<td style="user-select: auto !important;">17</td>
<td style="user-select: auto !important;">2019/01/01</td>
<td style="user-select: auto !important;">5</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">NULL</td>
<td style="user-select: auto !important;">150</td>
<td style="user-select: auto !important;">2019/01/01</td>
<td style="user-select: auto !important;">3</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">4000</td>
<td style="user-select: auto !important;">2020/01/01</td>
<td style="user-select: auto !important;">4</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto !important;">대장균 개체 ID(<code style="user-select: auto !important;">ID</code>) 1,2,3 에 대해 개체의 크기는 각각 17, 150, 4000 이므로 분류된 이름은 각각 'LOW', 'MEDIUM', 'HIGH' 입니다. 따라서 결과를 개체의 ID 에 대해 오름차순 정렬하면 다음과 같아야 합니다.</p>
<table class="table" style="user-select: auto !important;">
        <thead style="user-select: auto !important;"><tr style="user-select: auto !important;">
<th style="user-select: auto !important;">ID</th>
<th style="user-select: auto !important;">SIZE</th>
</tr>
</thead>
        <tbody style="user-select: auto !important;"><tr style="user-select: auto !important;">
<td style="user-select: auto !important;">1</td>
<td style="user-select: auto !important;">LOW</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">2</td>
<td style="user-select: auto !important;">MEDIUM</td>
</tr>
<tr style="user-select: auto !important;">
<td style="user-select: auto !important;">3</td>
<td style="user-select: auto !important;">HIGH</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges