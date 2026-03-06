# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee as e
join Department  as d
on e.departmentId = d.id
where (e.departmentId, e.salary) IN (
    select departmentId, Max(salary)
    from employee
    group by departmentId

)