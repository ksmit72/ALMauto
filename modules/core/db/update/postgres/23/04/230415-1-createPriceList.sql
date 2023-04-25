create table ALMAUTO_PRICE_LIST (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID integer not null,
    PRICE double precision not null,
    PRICES_ID integer,
    --
    primary key (ID)
);