# Write your MySQL query statement below
select c.name as customers
from Customers as c
left join Orders as o
on c.id = o.customerId
where o.customerId is NULL