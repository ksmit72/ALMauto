create table ALMAUTO_COMPANY (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    USER_ID uuid,
    INN varchar(9),
    ADDRESS varchar(255),
    BANK varchar(255),
    --
    primary key (ID)
);