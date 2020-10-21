show databases;
create database tutorial1;
show databases;
use tutorial1;
create table users (username text);
show tables;
desc users;
insert into users (username) values ("Bob");
insert into users (username) values ("Vicky");
select * from users;

desc users;
drop table users;
show tables;
create table users (id int, username text);
desc users;
insert into users (id, username) values (1, "Bob");
insert into users (id, username) values (1, "Vicky");
select * from users;


desc users;
insert into users (id, username) values (2, null);
select * from users LIMIT 0, 1000;
insert into users (id, username) values (null, null);
select * from users LIMIT 0, 1000;
insert into users (id) values (3);
select * from users LIMIT 0, 1000;
drop table users;
show tables;
create table users (id int not null, username text not null);
desc users;

select * from users;

select * from users LIMIT 0, 1000;



use tutorial1;
show engines;
show table status;
create table test (id int) engine=MYISAM;
show table status;
drop table test;
set default_storage_engine=MYISAM;
show tables;
show table status;
show engines;
create table test (id int); 
show table status;
show engines;
set default_storage_engine=INNODB;
show engines;