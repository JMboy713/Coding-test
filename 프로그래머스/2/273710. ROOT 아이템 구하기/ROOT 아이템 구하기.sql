SELECT F.ITEM_ID, F.ITEM_NAME
FROM ITEM_INFO AS F,ITEM_TREE AS T
WHERE F.ITEM_ID = T.ITEM_ID AND T.PARENT_ITEM_ID IS NULL
ORDER BY ITEM_ID ASC;

