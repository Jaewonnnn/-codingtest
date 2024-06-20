-- 코드를 입력하세요
SELECT user_id, used_goods_user.nickname as nickname, sum(price) as total_sales
from USED_GOODS_BOARD, USED_GOODS_USER
where USED_GOODS_BOARD.STATUS = 'DONE' and used_goods_board.writer_id = used_goods_user.user_id
group by used_goods_user.user_id, used_goods_user.nickname
having sum(price) >= 700000
order by total_sales

;