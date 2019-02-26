# --- !Ups
delete from user;

insert into user (type, email,role, name, password) values ( 'a', 'admin@ofm.com', 'admin', 'Alice Admin', 'password' );

insert into user (type, email,role, name, password, street1, street2, town, post_code, credit_card) values ( 'c', 'customer@ofm.com', 'customer', 'Alex Customer', 'password', '6 Main Street', 'Woodland', 'Tallaght', 'D24 K4L9', '4013254621356355' );

