-- SELECT MCDP_CD as '진료과 코드', count(*) as '5월예약건수' from appointment where DATE_FORMAT(APNT_YMD,"%Y-%m") = '2022-05' group by MCDP_CD order by count(*) ASC, '진료과 코드' ASC;

SELECT MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
FROM APPOINTMENT
WHERE year(APNT_YMD) = 2022 and month(APNT_YMD) = 5 
GROUP BY MCDP_CD
ORDER BY COUNT(MCDP_CD) ASC, MCDP_CD ASC
;
