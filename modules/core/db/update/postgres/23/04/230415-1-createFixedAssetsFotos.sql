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
);