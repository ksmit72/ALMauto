create table ALMAUTO_PRODUCTS (
    ID integer,
    UUID uuid,
    --
    PRODUCT_TYPE_ID integer,
    NAME varchar(255),
    VENDOR_CODE varchar(10),
    BAR_CODE varchar(255),
    UNIT_ID integer,
    --
    primary key (ID)
);