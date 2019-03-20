# --- Sample dataset

# --- !Ups

insert into user (type,email,name,phone_number,password,role) values ( 'a', 'admin@ofm.com', 'Alice Admin','1234567', 'password', 'admin' );
insert into user (type,email,name,phone_number,password,role) values ( 'e', 'artist@ofm.com', 'Bob Artist','0987654', 'password', 'employee' );
insert into user (type,email,name,phone_number,password,role) values ( 'c', 'customer@ofm.com', 'Charlie Customer','3457124', 'password', 'customer' );

insert into appointment (name,email,phone_number,date,time,artist,description,size,placement,colour) values ( 'John Smith', 'johnS@a.com', '0873654292', '25-03-19', '14:30', 'Ben', 'wolf', '15 cm', 'chest', 'black' );
insert into appointment (name,email,phone_number,date,time,artist,description,size,placement,colour) values ( 'Mary Kelly', 'maryK@b.com', '0864595217', '16-03-19', '9:20', 'Ryan', 'skeleton', '8 inch', 'leg', 'black and red' );
insert into appointment (name,email,phone_number,date,time,artist,description,size,placement,colour) values ( 'Max O Connor', 'macOC@c.com', '0839264851', '07-02-19', '11:50', 'Ann', 'follows', '4 inch', 'arm', 'yellow, green and purple' );