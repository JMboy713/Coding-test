SELECT I.NAME,I.DATETIME
FROM ANIMAL_OUTS AS O,ANIMAL_INS AS I
WHERE I.ANIMAL_ID NOT IN (
    SELECT O.ANIMAL_ID
    FROM ANIMAL_OUTS AS O,ANIMAL_INS AS I
    WHERE I.ANIMAL_ID = O.ANIMAL_ID
)
GROUP BY NAME
ORDER BY DATETIME ASC
LIMIT 3;


# SELECT I.ANIMAL_ID
# FROM ANIMAL_OUTS AS O,ANIMAL_INS AS I
# WHERE I.ANIMAL_ID = O.ANIMAL_ID

# SELECT * FROM ANIMAL_OUTS