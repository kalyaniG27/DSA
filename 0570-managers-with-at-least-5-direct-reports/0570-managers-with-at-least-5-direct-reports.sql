SELECT Employee.name
FROM Employee
JOIN
(
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(managerId) >= 5
) x
ON Employee.id = x.managerId;