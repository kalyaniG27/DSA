# Write your MySQL query statement below
select
 event_day As day , 
   emp_id ,
  
   Sum(out_time -in_time ) As total_time
from Employees 
Group By day ,emp_id;