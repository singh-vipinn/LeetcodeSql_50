# Write your MySQL query statement below

SELECT p.project_id, ROUND(AVG(e.experience_years),2) AS average_years
from Project p
LEFT JOIN Employee e
ON p.employee_id = e.employee_id
group by p.project_id