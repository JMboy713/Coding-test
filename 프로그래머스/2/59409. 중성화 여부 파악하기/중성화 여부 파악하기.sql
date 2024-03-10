SELECT ANIMAL_ID,NAME,
CASE 
    WHEN SEX_UPON_INTAKE like "Neutered%" then "O" 
    WHEN SEX_UPON_INTAKE like "Spayed%" then "O"
    else "X"
END AS "중성화"
from ANIMAL_INS
order by ANIMAL_ID;