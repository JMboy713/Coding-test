-- SELECT count(distinct name) from animal_ins
select count(*) from (select name from animal_ins where name is not null group by name) as unique_name