select * from all_tables;

create table article(
	id int primary key,
	title varchar(50) not null,
	content varchar(100) not null
);

drop table article;
select * from article;