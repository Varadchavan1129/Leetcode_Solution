# Write your MySQL query statement below
UPDATE salary set sex = 
case sex 
when 'm' then 'f'
else 'm'
end;