-- 코드를 작성해주세요
select a.id, 
CASE
    WHEN A.PER <= 0.25 THEN 'CRITICAL'
    WHEN A.PER <= 0.5 THEN 'HIGH'
    WHEN A.PER <= 0.75 THEN 'MEDIUM'
    ELSE 'LOW'
END AS COLONY_NAME
from (select id, 
      percent_rank() over (order by SIZE_OF_COLONY desc ) as per 
      from ECOLI_DATA)
      as a 
order by a.id
