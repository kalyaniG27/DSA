# Write your MySQL query statement below
SELECT date_id,
make_name,
COUNT(Distinct (lead_id))As unique_leads ,
COUNT(Distinct (partner_id))As unique_partners
from DailySales
group by date_id,
make_name; 