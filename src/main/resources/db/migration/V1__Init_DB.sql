
create table person
(
    id         int8 not null,
    email      varchar(255),
    fname      varchar(255),
    number     varchar(255),
    patronymic varchar(255),
    sname      varchar(255),
    primary key (id)
);
create sequence hibernate_sequence start 1 increment 1;