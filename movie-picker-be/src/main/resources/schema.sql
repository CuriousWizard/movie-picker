drop table if exists movies;

create table movies (
    id int auto_increment primary key,
    title varchar(250) not null,
    "YEAR" int not null,
    genre varchar(250) default null
);