-- 코드를 입력하세요
SELECT animal_type,IFNULL(NAME,"No name") as name,SEX_UPON_INTAKE from animal_ins ORDER BY ANIMAL_ID;