# Write your MySQL query statement below
select e1.name As Employee 
from Employee e1
LEFT JOIN Employee e2
ON e1.managerId=e2.id
where e1.salary>e2.salary