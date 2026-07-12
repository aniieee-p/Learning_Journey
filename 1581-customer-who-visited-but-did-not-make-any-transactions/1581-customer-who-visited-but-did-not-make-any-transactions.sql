# Write your MySQL query statement below
select 
    Visits.customer_id, count(*) as count_no_trans
from Visits
Left join Transactions
ON Visits.visit_id = Transactions.visit_id
where transaction_id IS NULL
group by customer_id;
