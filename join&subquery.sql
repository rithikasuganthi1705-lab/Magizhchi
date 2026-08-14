create table orders(
order_id int,
amount smallint
);
create table customers(
customer_id int ,
customer_name varchar(30),
city varchar(40)
);

insert into orders values (1,8000),
(2,7000),
(3,56000),
(4,1500)
truncate table orders
select * from orders

insert into customers values(1,'phuwin','chennai'),
(2,'pond','madurai'),
(3,'net','bangalore')
select * from customers

select * from orders o
inner join customers c
on o.order_id=c.customer_id
where amount >5000

create table employees(
emp_id int,
emp_name varchar(40),
dept_id int,
salary bigint
);

create table departments(
dept_id int,
dept_name varchar(50)
);

insert into employees values
(1,'santa',101,600000),
(2,'perth',102,650000),
(3,'jj',103,5000)
insert into departments values
(101,'GMMTv'),
(102,'GMMTv'),
(103,'DUOLINGTv'),
(104,'GMMTv')
select * from employees
select * from departments
select * from employees e
full outer join departments d
on e.dept_id = d.dept_id
where salary>30000

create table orderss(
order_id int,
customer_id int,
amount bigint
);
insert into orderss values
(1,11,20000),
(2,12,30000),
(3,13,1000)
select order_id,customer_id,amount 
from orderss
where amount >(
select avg (amount)
from orderss
)
