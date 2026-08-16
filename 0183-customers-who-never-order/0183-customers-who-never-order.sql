# Write your MySQL query statement below
SELeCT customers.name as Customers
from Customers
left join Orders
on Customers.id=Orders.customerId
where orders.id IS NULL;