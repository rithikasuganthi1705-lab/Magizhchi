create table books(
book_id int primary key,
title varchar(50),
author varchar(30),
published_year int
);
insert into books values(1,'harrypotter','rowlin',2000)
select *from books