# Write your MySQL query statement below
-- select customer_id,count(v.visit_id) as count_no_trans
-- from visits v left join transactions t
-- on v.visit_id= t.visit_id
-- group by customer_id 
SELECT v.customer_id, COUNT(v.visit_id) AS count_no_trans 
from Visits v 
LEFT JOIN Transactions t 
ON v.visit_id = t.visit_id  
WHERE t.transaction_id IS NULL 
GROUP BY v.customer_id; 
