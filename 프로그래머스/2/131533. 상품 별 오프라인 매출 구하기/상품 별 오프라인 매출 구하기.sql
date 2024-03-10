SELECT p.product_code, (p.price*sum(o.sales_amount)) as sales
from PRODUCT AS p,OFFLINE_SALE as o
where p.PRODUCT_ID=o.PRODUCT_ID
group by p.product_code
order by sales desc,p.product_code asc;

# SELECT p.PRODUCT_CODE, SUM(f.SALES_AMOUNT)*p.PRICE 'SALES'
# FROM PRODUCT p, OFFLINE_SALE f
# WHERE p.PRODUCT_ID = f.PRODUCT_ID
# GROUP BY p.PRODUCT_CODE
# ORDER BY SALES DESC, p.PRODUCT_CODE