# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM(
SELECT DISTINCT salary
FROM Employee 
ORDER BY salary DESC
LIMIT 1 offset 1)
AS result;