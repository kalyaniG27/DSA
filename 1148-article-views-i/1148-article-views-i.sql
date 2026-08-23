# Write your MySQL query statement below
select  DISTINCT viewer_id As id
from Views
where author_id = viewer_id
ORDER BY viewer_id ASC;
