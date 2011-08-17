--drop table users; 
--create table users (id varchar(20), password varchar(10), isDefault integer);
drop table forums;
create table forums (id varchar(50), parent varchar(50), name varchar(50), alias varchar(50), isTech int, points varchar(50));

drop table tih; --today in history
create table tih (userid varchar(20), day date, url varchar(200), checked int);

--System properties
drop table config;
create table config(attribute varchar(30), attvalue varchar(30));
insert into config values ('forums.savedToDB', 'false');