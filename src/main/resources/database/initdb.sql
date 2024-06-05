create table product (
                         id serial primary key,
                         name varchar(100) not null ,
                         shade_number double precision not null ,
                         volume double precision,
                         country varchar(60) not null
);
