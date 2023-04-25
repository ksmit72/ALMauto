create table ALMAUTO_PRODUCT_IN_LIST (
    ID integer,
    UUID uuid,
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID integer,
    KOL_UPAK integer,
    PACKAGE_TYPE_ID integer,
    IN_UPAK integer,
    UM_KOL integer,
    PRICE double precision,
    AMOUNT double precision,
    PRODUCT_IN_ID integer,
    --
    primary key (ID)
);