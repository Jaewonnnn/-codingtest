-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(total_order) total_order
from FIRST_HALF, ICECREAM_INFO
where first_half.flavor = icecream_info.flavor
group by ingredient_type
order by total_order
;

