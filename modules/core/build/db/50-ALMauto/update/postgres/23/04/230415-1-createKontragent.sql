create table ALMAUTO_KONTRAGENT (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255) not null,
    INN varchar(9),
    LAST_NAME varchar(50),
    FIRST_NAME varchar(50),
    MIDDLE_NAME varchar(50),
    POST_ID integer,
    ADDRESS varchar(255),
    RS varchar(30),
    BANK varchar(255),
    MFO varchar(6),
    TEL_FAX varchar(255),
    --
    primary key (ID)
);