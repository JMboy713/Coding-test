# 세단 or SUV 중 2022 11월 대여 가능. 30일간의 대여. ㅡㅁ액이 50~200미만
# car_rental_company_car -> id, 종류, 일일대여 요금, 자동차 옵션 리스트
# carRentalCompanyREntalHist -> 대여 시작, 종료일.
#  discount  30일 이상 -> 할인
SELECT C.CAR_ID, 
       C.CAR_TYPE, 
       FLOOR(C.DAILY_FEE * 30 * (100 - P.DISCOUNT_RATE) / 100) AS FEE
FROM CAR_RENTAL_COMPANY_CAR AS C
    LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS H
        ON C.CAR_ID = H.CAR_ID
        AND (
            (H.START_DATE BETWEEN '2022-11-01' AND '2022-11-30') OR 
            (H.END_DATE BETWEEN '2022-11-01' AND '2022-11-30') OR
            (H.START_DATE <= '2022-11-01' AND H.END_DATE >= '2022-11-30')
        )
    INNER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS P
        ON C.CAR_TYPE = P.CAR_TYPE
        AND P.DURATION_TYPE = '30일 이상'
WHERE (C.CAR_TYPE = '세단' OR C.CAR_TYPE = 'SUV')
    AND H.CAR_ID IS NULL  -- 대여 이력이 없는 차량만 선택
    AND FLOOR(C.DAILY_FEE * 30 * (100 - P.DISCOUNT_RATE) / 100) >= 500000
    AND FLOOR(C.DAILY_FEE * 30 * (100 - P.DISCOUNT_RATE) / 100) < 2000000
ORDER BY FEE DESC, C.CAR_TYPE ASC, C.CAR_ID DESC;
