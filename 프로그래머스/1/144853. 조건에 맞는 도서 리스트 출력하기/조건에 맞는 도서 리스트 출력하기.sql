SELECT BOOK_ID,Date_FORMAT(PUBLISHED_DATE,'%Y-%m-%d') FROM BOOK WHERE YEAR(PUBLISHED_DATE)=2021 AND CATEGORY='인문' order by published_date asc;