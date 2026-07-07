# Write your MySQL query statement below
SELECT 
    emu.unique_id ,
    e.name
from Employees e
left join EmployeeUNI emu
on e.id = emu.id;