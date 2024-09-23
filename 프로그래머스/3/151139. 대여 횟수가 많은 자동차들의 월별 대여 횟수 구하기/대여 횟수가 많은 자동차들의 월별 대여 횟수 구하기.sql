SELECT MONTH(START_DATE),CAR_ID,COUNT(CAR_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE YEAR(START_DATE)=2022 AND MONTH(START_DATE) BETWEEN 8 AND 10 AND
CAR_ID IN (SELECT CAR_ID 
           FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
           WHERE MONTH(START_DATE) BETWEEN 8 AND 10
           GROUP BY CAR_ID
           HAVING COUNT(CAR_ID)>=5
          )
group by MONTH(START_DATE),CAR_ID
ORDER BY MONTH(START_DATE) ASC, CAR_ID DESC;



# -- 코드를 입력하세요
# SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(CAR_ID) AS RECORDS
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS A
# WHERE MONTH(START_DATE) BETWEEN 8 AND 10 AND
#       CAR_ID IN (
#           SELECT CAR_ID
#           FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
#           WHERE MONTH(START_DATE) BETWEEN 8 AND 10
#           GROUP BY CAR_ID
#           HAVING COUNT(CAR_ID) >= 5
#       )
# GROUP BY MONTH(START_DATE), CAR_ID
# ORDER BY MONTH(START_DATE) ASC, CAR_ID DESC;