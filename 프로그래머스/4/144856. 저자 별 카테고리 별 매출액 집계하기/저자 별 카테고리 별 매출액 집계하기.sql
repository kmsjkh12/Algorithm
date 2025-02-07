SELECT A.AUTHOR_ID, C.AUTHOR_NAME, A.CATEGORY,SUM( A.PRICE *  B.SALES) AS "TOTAL_SALES"
FROM BOOK A
JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID
JOIN AUTHOR C ON A.AUTHOR_ID = C.AUTHOR_ID 
WHERE YEAR(B.SALES_DATE) = 2022 AND MONTH(B.SALES_DATE) = 1
GROUP BY A.AUTHOR_ID, A.CATEGORY
ORDER BY A.AUTHOR_ID ASC, A.CATEGORY DESC;