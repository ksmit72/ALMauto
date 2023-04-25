create table ALMAUTO_EMPLOYEE (
    ID integer,
    UUID uuid,
    --
    COMPANY_ID integer,
    POST_ID integer,
    BRANCH_ID integer,
    LAST_NAME varchar(255),
    FIRST_NAME varchar(255),
    MIDDLE_NAME varchar(255),
    USER_ID uuid,
    --
    primary key (ID)
);