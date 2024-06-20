-- 코드를 입력하세요
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, nvl(FREEZER_YN, 'N') "freezer_yn"
FROM FOOD_WAREHOUSE
where address like '경기도%'
order by warehouse_id;