-- SELECT * FROM ONLINE_SALE

SELECT USER_ID,PRODUCT_ID from ONLINE_SALE GROUP BY USER_ID,PRODUCT_ID HAVING COUNT(*)>=2 ORDER BY USER_ID ASC,PRODUCT_ID DESC;