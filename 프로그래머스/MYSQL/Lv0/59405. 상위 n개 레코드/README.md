# [level 1] 상위 n개 레코드 - 59405 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/59405) 

### 성능 요약

메모리: 0.0 MB, 시간: 0.00 ms

### 구분

코딩테스트 연습 > SELECT

### 채점결과

Empty

### 문제 설명

<p style="user-select: auto;"><code style="user-select: auto;">ANIMAL_INS</code> 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. <code style="user-select: auto;">ANIMAL_INS</code> 테이블 구조는 다음과 같으며, <code style="user-select: auto;">ANIMAL_ID</code>, <code style="user-select: auto;">ANIMAL_TYPE</code>, <code style="user-select: auto;">DATETIME</code>, <code style="user-select: auto;">INTAKE_CONDITION</code>, <code style="user-select: auto;">NAME</code>, <code style="user-select: auto;">SEX_UPON_INTAKE</code>는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">NAME</th>
<th style="user-select: auto;">TYPE</th>
<th style="user-select: auto;">NULLABLE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">ANIMAL_ID</td>
<td style="user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">ANIMAL_TYPE</td>
<td style="user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">DATETIME</td>
<td style="user-select: auto;">DATETIME</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">INTAKE_CONDITION</td>
<td style="user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">NAME</td>
<td style="user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">TRUE</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">SEX_UPON_INTAKE</td>
<td style="user-select: auto;">VARCHAR(N)</td>
<td style="user-select: auto;">FALSE</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요. </p>

<h5 style="user-select: auto;">예시</h5>

<p style="user-select: auto;">예를 들어 <code style="user-select: auto;">ANIMAL_INS</code> 테이블이 다음과 같다면</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">ANIMAL_ID</th>
<th style="user-select: auto;">ANIMAL_TYPE</th>
<th style="user-select: auto;">DATETIME</th>
<th style="user-select: auto;">INTAKE_CONDITION</th>
<th style="user-select: auto;">NAME</th>
<th style="user-select: auto;">SEX_UPON_INTAKE</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">A399552</td>
<td style="user-select: auto;">Dog</td>
<td style="user-select: auto;">2013-10-14 15:38:00</td>
<td style="user-select: auto;">Normal</td>
<td style="user-select: auto;">Jack</td>
<td style="user-select: auto;">Neutered Male</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">A379998</td>
<td style="user-select: auto;">Dog</td>
<td style="user-select: auto;">2013-10-23 11:42:00</td>
<td style="user-select: auto;">Normal</td>
<td style="user-select: auto;">Disciple</td>
<td style="user-select: auto;">Intact Male</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">A370852</td>
<td style="user-select: auto;">Dog</td>
<td style="user-select: auto;">2013-11-03 15:04:00</td>
<td style="user-select: auto;">Normal</td>
<td style="user-select: auto;">Katie</td>
<td style="user-select: auto;">Spayed Female</td>
</tr>
<tr style="user-select: auto;">
<td style="user-select: auto;">A403564</td>
<td style="user-select: auto;">Dog</td>
<td style="user-select: auto;">2013-11-18 17:03:00</td>
<td style="user-select: auto;">Normal</td>
<td style="user-select: auto;">Anna</td>
<td style="user-select: auto;">Spayed Female</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">이 중 가장 보호소에 먼저 들어온 동물은 Jack입니다. 따라서 SQL문을 실행하면 다음과 같이 나와야 합니다.</p>
<table class="table" style="user-select: auto;">
        <thead style="user-select: auto;"><tr style="user-select: auto;">
<th style="user-select: auto;">NAME</th>
</tr>
</thead>
        <tbody style="user-select: auto;"><tr style="user-select: auto;">
<td style="user-select: auto;">Jack</td>
</tr>
</tbody>
      </table>
<p style="user-select: auto;">※ 보호소에 가장 먼저 들어온 동물은 한 마리인 경우만 테스트 케이스로 주어집니다.</p>

<hr style="user-select: auto;">

<p style="user-select: auto;">본 문제는 <a href="https://www.kaggle.com/aaronschlegel/austin-animal-center-shelter-intakes-and-outcomes" target="_blank" rel="noopener" style="user-select: auto;">Kaggle의 "Austin Animal Center Shelter Intakes and Outcomes"</a>에서 제공하는 데이터를 사용하였으며 <a href="https://opendatacommons.org/licenses/odbl/1.0/" target="_blank" rel="noopener" style="user-select: auto;">ODbL</a>의 적용을 받습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges