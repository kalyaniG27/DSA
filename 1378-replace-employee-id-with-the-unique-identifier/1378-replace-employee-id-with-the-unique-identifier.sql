# Write your MySQL query statement below
SELECT unique_id ,name
from Employees
LEFT JOIN EmployeeUNI
on EmployeeUNI.id=Employees.id 

