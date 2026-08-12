create table employeee(
id int,
name varchar(20),
department varchar(50),
temp_add varchar(150)
);
drop table employeee
insert into employeee values(1,'rithika','AIML','iravathanallur')
select * from employeee

alter table employeee
rename department to department_name

alter table employeee
drop column temp_add