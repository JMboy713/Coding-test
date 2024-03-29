SELECT ROUTE,CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km')  as 'TOTAL_DISTANCE', CONCAT(round(avg(D_BETWEEN_DIST), 2), 'km')  AS 'AVERAGE_DISTANCE'
FROM subway_distance
GROUP BY ROUTE
order by 1 desc;