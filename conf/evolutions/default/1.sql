# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table registration_data (
  id                        bigserial not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  email_id                  varchar(255),
  password                  varchar(255),
  constraint uq_registration_data_email_id unique (email_id),
  constraint pk_registration_data primary key (id))
;




# --- !Downs

drop table if exists registration_data cascade;

