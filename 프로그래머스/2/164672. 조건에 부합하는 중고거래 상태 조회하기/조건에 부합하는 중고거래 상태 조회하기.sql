SELECT U.BOARD_ID,U.WRITER_ID,U.TITLE,U.PRICE,
CASE
    WHEN U.STATUS='SALE' THEN '판매중'
    WHEN U.STATUS='RESERVED' THEN '예약중'
    else "거래완료"
End as STATUS
FROM  USED_GOODS_BOARD as U
WHERE DATE_FORMAT(CREATED_DATE,'%Y-%m-%d') = '2022-10-05'
order by board_id desc;
