SELECT CHILD.ID,CHILD.GENOTYPE,PARENT.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA AS PARENT
    INNER JOIN ECOLI_DATA AS CHILD
    ON CHILD.PARENT_ID = PARENT.ID
WHERE CHILD.GENOTYPE & PARENT.GENOTYPE = PARENT.GENOTYPE
ORDER BY ID ASC;