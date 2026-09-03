# Write your MySQL query statement below
select sell_date, 
COUNT(DISTINCT product )As num_sold,
GROUP_CONCAT(DISTINCT product ORDER BY product) AS products  
from Activities
Group by sell_date
Order by sell_date 
