# Write your MySQL query statement below
select SalesPerson.name 
from SalesPerson
WHERE sales_id NOT IN(
    SELECT o.sales_id
    from Orders o
    join Company c ON o.com_id= c.com_id
    where c.name='RED'
)