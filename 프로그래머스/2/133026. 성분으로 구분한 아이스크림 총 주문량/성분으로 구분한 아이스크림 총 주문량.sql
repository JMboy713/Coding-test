SELECT INGREDIENT_TYPE,SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
From FIRST_HALF AS F,ICECREAM_INFO AS I
where F.FLAVOR=I.FLAVOR
GROUP BY I.INGREDIENT_TYPE
order by TOTAL_ORDER;