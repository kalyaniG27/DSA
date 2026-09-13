# Write your MySQL query statement below
SELECT s.year,s.price,p.product_name
from Sales AS s 
join Product AS p 
on s.product_id=p.product_id