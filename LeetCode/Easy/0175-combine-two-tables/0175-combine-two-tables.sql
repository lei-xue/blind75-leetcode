# Write your MySQL query statement below
select firstName, lastName, city, state
from Person as a 
left join Address as b
on a.personId = b.personId