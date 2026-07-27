# Write your MySQL query statement below
select 
    v.customer_id,
    count(v.visit_id) as count_no_trans

from Visits v

Left join Transactions t
ON v.visit_id = t.visit_id

where amount IS NULL

group by v.customer_id;



-- select visits.customer_id, count(*) as count_no_trans
-- from visits left join Transactions
-- on visits.visit_id = transactions.visit_id
-- where amount is null
-- group by visits.customer_id;



















