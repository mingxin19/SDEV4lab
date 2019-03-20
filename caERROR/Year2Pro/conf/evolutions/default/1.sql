# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table appointment (
  apm_number                    integer auto_increment not null,
  name                          varchar(255),
  email                         varchar(255),
  phone_number                  varchar(255),
  date                          varchar(255),
  time                          varchar(255),
  artist                        varchar(255),
  description                   varchar(255),
  size                          varchar(255),
  placement                     varchar(255),
  colour                        varchar(255),
  constraint pk_appointment primary key (apm_number)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  phone_number                  varchar(255),
  constraint pk_user primary key (email)
);


# --- !Downs

drop table if exists appointment;

drop table if exists user;

