-- 코드를 입력하세요
-- SELECT BOOK_ID, PUBLISHED_DATE FROM BOOK
-- WHERE CATEGORY = '인문'
-- AND SUBSTR(TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD'), 4) = '2021'
-- ORDER BY PUBLISHED_DATE;
SELECT BOOK_ID, TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD') FROM BOOK
WHERE SUBSTR(TO_CHAR(PUBLISHED_DATE, 'YYYY-MM-DD'), 1, 4) = '2021'
AND CATEGORY = '인문'
ORDER BY PUBLISHED_DATE;
