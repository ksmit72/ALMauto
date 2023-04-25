-- begin ALMAUTO_PRICE
create table ALMAUTO_PRICE (
    ID integer,
    UUID uuid,
    --
    V_DATE timestamp not null,
    COMMENT_ varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_PRICE
-- begin ALMAUTO_WAREHOUSE
create table ALMAUTO_WAREHOUSE (
    ID integer,
    UUID uuid,
    --
    COMPANY_ID integer,
    NAME varchar(255),
    EMPLOYEE_ID integer,
    --
    primary key (ID)
)^
-- end ALMAUTO_WAREHOUSE
-- begin ALMAUTO_KONTRAGENT
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
)^
-- end ALMAUTO_KONTRAGENT
-- begin ALMAUTO_FIXED_ASSETS
create table ALMAUTO_FIXED_ASSETS (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    DESCRIPTION varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_FIXED_ASSETS
-- begin ALMAUTO_PACK_COUNT
create table ALMAUTO_PACK_COUNT (
    ID integer,
    UUID uuid,
    --
    PACKAGE_TYPE_ID integer,
    QUANTITY integer,
    PRODUCTS_ID integer,
    --
    primary key (ID)
)^
-- end ALMAUTO_PACK_COUNT
-- begin ALMAUTO_EMPLOYEE
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
)^
-- end ALMAUTO_EMPLOYEE
-- begin ALMAUTO_PRODUCT_IN
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
)^
-- end ALMAUTO_PRODUCT_IN
-- begin ALMAUTO_PRODUCTS
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
)^
-- end ALMAUTO_PRODUCTS
-- begin ALMAUTO_PRODUCT_TYPE
create table ALMAUTO_PRODUCT_TYPE (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_PRODUCT_TYPE
-- begin ALMAUTO_PACKAGE_TYPE
create table ALMAUTO_PACKAGE_TYPE (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_PACKAGE_TYPE
-- begin ALMAUTO_FIXED_ASSETS_FOTOS
create table ALMAUTO_FIXED_ASSETS_FOTOS (
    ID integer,
    UUID uuid,
    --
    IMAGE_FILE_ID uuid,
    COMMENT_ varchar(255),
    DATA_ bytea,
    FIXED_ASSETS_ID integer,
    --
    primary key (ID)
)^
-- end ALMAUTO_FIXED_ASSETS_FOTOS
-- begin ALMAUTO_BRANCH
create table ALMAUTO_BRANCH (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_BRANCH
-- begin ALMAUTO_POST
create table ALMAUTO_POST (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_POST
-- begin ALMAUTO_UNIT
create table ALMAUTO_UNIT (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end ALMAUTO_UNIT
-- begin ALMAUTO_COMPANY
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
)^
-- end ALMAUTO_COMPANY
-- begin ALMAUTO_PRODUCT_IN_LIST
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
)^
-- end ALMAUTO_PRODUCT_IN_LIST
-- begin ALMAUTO_PRICE_LIST
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
)^
-- end ALMAUTO_PRICE_LIST
