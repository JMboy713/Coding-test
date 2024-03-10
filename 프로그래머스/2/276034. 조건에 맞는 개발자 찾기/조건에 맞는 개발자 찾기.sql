SELECT ID,EMAIL,FIRST_NAME,LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (select CODE from skillcodes where NAME ='Python')
or SKILL_CODE & (select CODE from skillcodes where NAME ='C#')
order by ID;