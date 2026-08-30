# Write your MySQL query statement below
select player_id ,
        MIN(event_date) As first_login
from Activity 
GROUP BY player_id 
ORDER BY player_id ASC