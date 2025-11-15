1.Show Database;

create database PPA53;

show Databases;

use PPA53;

create table student(Rno int, Name varchar(255), City varchar(255), Marks int);

describe student;

insert into student values(11, 'Amit', 'satara', 91);

insert into student values(15, 'Sagar', 'Pune', 81);

insert into student values(17, 'Pooja', 'Mumbai', 93);

select * from student;


select Name, City from student;


select Name, Marks from student;


select Student from student;


