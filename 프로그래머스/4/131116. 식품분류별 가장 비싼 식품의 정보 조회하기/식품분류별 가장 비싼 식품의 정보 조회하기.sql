-- 코드를 입력하세요
SELECT CATEGORY, price as  MAX_PRICE, PRODUCT_NAME
from food_product
WHERE PRICE IN ( SELECT MAX(PRICE) FROM FOOD_PRODUCT GROUP BY CATEGORY )
        AND  category in ( '과자', '국', '김치', '식용유')

order by MAX_PRICE DESC;