SELECT year(ym) as YEAR ,round(avg(pm_val1),2) as 'pm10' ,round(avg(pm_val2),2) as 'pm2.5'
FROM AIR_POLLUTION
WHERE LOCATION2 ="수원"
group by YEAR(YM)
order by year(ym) asc;