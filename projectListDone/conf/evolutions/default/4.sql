# --- !Ups

update projects set department_id = 1 where department_id is null;

# --- !Ups
delete from user;

insert into user (type, email,name,password,role) values ( 'a', 'admin@projects.com', 'Alice Admin', 'password', 'admin' );

insert into user (type, email,name,password,role) values ( 'a', 'ming@gmail.com', 'Ming Shen', 'ming', 'admin' );

insert into user (type, email,name,password,role) values ( 'a', 'ann@gmail.com', 'Ann Kelly', 'ann', 'admin' );

insert into user (type, email,name,password,role) values ( 'm', 'manager@projects.com', 'Bob Manager', 'password', 'manager' );

insert into user (type, email,name,password,role) values ( 'm', 'barry@gmail.com', 'Barry Butler', 'barry', 'manager' );

insert into user (type, email,name,password,role) values ( 'e', 'employee@projects.com', 'Charlie Employee', 'password', 'employee' );

insert into user (type, email,name,password,role) values ( 'e', 'peter@gmail.com', 'Peter Allen', 'peter', 'employee' );

insert into user (type, email,name,password,role) values ( 'e', 'kelly@gmail.com', 'Kelly Conner', 'kelly', 'employee' );

insert into user (type, email,name,password,role) values ( 'e', 'jimmy@gmail.com', 'Jimmy Wilson', 'jimmy', 'employee' );

insert into user (type, email,name,password,role) values ( 'e', 'john@gmail.com', 'John Smith', 'john', 'employee' );