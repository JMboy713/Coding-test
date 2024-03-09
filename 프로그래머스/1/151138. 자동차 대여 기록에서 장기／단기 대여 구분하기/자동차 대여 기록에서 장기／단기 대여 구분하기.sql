SELECT HISTORY_ID,CAR_ID,DATE_FORMAT(START_DATE,'%Y-%m-%d')as START_DATE,DATE_FORMAT(END_DATE,'%Y-%m-%d') as END_DATE,
case 
when DATEDIFF(end_date,start_date)>=29  then '장기 대여'
else '단기 대여'
end as RENT_TYPE
   from car_rental_company_rental_history 
   where year(Start_date)=2022 and month(start_date)=9
   order by history_id desc;