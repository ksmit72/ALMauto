create table ALMAUTO_PRODUCT_IN (
    ID integer,
    UUID uuid,
    --
    V_DATE date not null,
    WAREHOUSE_ID integer,
    TYPE_FLOW integer,
    PRICE_ID integer,
    AMOUNT double precision,
    COMMENT_ varchar(255),
    --
    primary key (ID)
);