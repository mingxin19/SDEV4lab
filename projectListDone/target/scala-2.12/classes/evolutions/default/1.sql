# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint not null,
  address1                      varchar(255),
  address2                      varchar(255),
  city                          varchar(255),
  post_code                     varchar(255),
  constraint pk_address primary key (id)
);
create sequence Address_seq increment by 1;

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);

create table projects (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  department_id                 bigint,
  description                   varchar(255),
  start_date                    date,
  constraint pk_projects primary key (id)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  department_id                 bigint,
  constraint pk_user primary key (email)
);

alter table projects add constraint fk_projects_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_projects_department_id on projects (department_id);

alter table user add constraint fk_user_department_id foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_user_department_id on user (department_id);


# --- !Downs

alter table projects drop constraint if exists fk_projects_department_id;
drop index if exists ix_projects_department_id;

alter table user drop constraint if exists fk_user_department_id;
drop index if exists ix_user_department_id;

drop table if exists address;
drop sequence if exists Address_seq;

drop table if exists department;

drop table if exists projects;

drop table if exists user;

