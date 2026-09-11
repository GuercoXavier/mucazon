CREATE SCHEMA IF NOT EXISTS users;

CREATE TABLE users.user
(
    id           bigserial primary key,
    name         varchar(100) not null,
    idCard       varchar(100) not null,
    address      varchar(100) not null,
    email        varchar(100) not null,
    phone        varchar(100) not null,
    registryDate timestamp    not null
);