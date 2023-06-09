-- begin ALMAUTO_WAREHOUSE
alter table ALMAUTO_WAREHOUSE add constraint FK_ALMAUTO_WAREHOUSE_COMPANY foreign key (COMPANY_ID) references ALMAUTO_COMPANY(ID)^
alter table ALMAUTO_WAREHOUSE add constraint FK_ALMAUTO_WAREHOUSE_EMPLOYEE foreign key (EMPLOYEE_ID) references ALMAUTO_EMPLOYEE(ID)^
create index IDX_ALMAUTO_WAREHOUSE_COMPANY on ALMAUTO_WAREHOUSE (COMPANY_ID)^
create index IDX_ALMAUTO_WAREHOUSE_EMPLOYEE on ALMAUTO_WAREHOUSE (EMPLOYEE_ID)^
-- end ALMAUTO_WAREHOUSE
-- begin ALMAUTO_KONTRAGENT
alter table ALMAUTO_KONTRAGENT add constraint FK_ALMAUTO_KONTRAGENT_POST foreign key (POST_ID) references ALMAUTO_POST(ID)^
create index IDX_ALMAUTO_KONTRAGENT_POST on ALMAUTO_KONTRAGENT (POST_ID)^
-- end ALMAUTO_KONTRAGENT
-- begin ALMAUTO_PACK_COUNT
alter table ALMAUTO_PACK_COUNT add constraint FK_ALMAUTO_PACK_COUNT_PACKAGE_TYPE foreign key (PACKAGE_TYPE_ID) references ALMAUTO_PACKAGE_TYPE(ID)^
alter table ALMAUTO_PACK_COUNT add constraint FK_ALMAUTO_PACK_COUNT_PRODUCTS foreign key (PRODUCTS_ID) references ALMAUTO_PRODUCTS(ID)^
create index IDX_ALMAUTO_PACK_COUNT_PACKAGE_TYPE on ALMAUTO_PACK_COUNT (PACKAGE_TYPE_ID)^
create index IDX_ALMAUTO_PACK_COUNT_PRODUCTS on ALMAUTO_PACK_COUNT (PRODUCTS_ID)^
-- end ALMAUTO_PACK_COUNT
-- begin ALMAUTO_EMPLOYEE
alter table ALMAUTO_EMPLOYEE add constraint FK_ALMAUTO_EMPLOYEE_COMPANY foreign key (COMPANY_ID) references ALMAUTO_COMPANY(ID)^
alter table ALMAUTO_EMPLOYEE add constraint FK_ALMAUTO_EMPLOYEE_POST foreign key (POST_ID) references ALMAUTO_POST(ID)^
alter table ALMAUTO_EMPLOYEE add constraint FK_ALMAUTO_EMPLOYEE_BRANCH foreign key (BRANCH_ID) references ALMAUTO_BRANCH(ID)^
alter table ALMAUTO_EMPLOYEE add constraint FK_ALMAUTO_EMPLOYEE_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_ALMAUTO_EMPLOYEE_COMPANY on ALMAUTO_EMPLOYEE (COMPANY_ID)^
create index IDX_ALMAUTO_EMPLOYEE_POST on ALMAUTO_EMPLOYEE (POST_ID)^
create index IDX_ALMAUTO_EMPLOYEE_BRANCH on ALMAUTO_EMPLOYEE (BRANCH_ID)^
create index IDX_ALMAUTO_EMPLOYEE_USER on ALMAUTO_EMPLOYEE (USER_ID)^
-- end ALMAUTO_EMPLOYEE
-- begin ALMAUTO_PRODUCT_IN
alter table ALMAUTO_PRODUCT_IN add constraint FK_ALMAUTO_PRODUCT_IN_WAREHOUSE foreign key (WAREHOUSE_ID) references ALMAUTO_WAREHOUSE(ID)^
alter table ALMAUTO_PRODUCT_IN add constraint FK_ALMAUTO_PRODUCT_IN_PRICE foreign key (PRICE_ID) references ALMAUTO_PRICE(ID)^
create index IDX_ALMAUTO_PRODUCT_IN_WAREHOUSE on ALMAUTO_PRODUCT_IN (WAREHOUSE_ID)^
create index IDX_ALMAUTO_PRODUCT_IN_PRICE on ALMAUTO_PRODUCT_IN (PRICE_ID)^
-- end ALMAUTO_PRODUCT_IN
-- begin ALMAUTO_PRODUCTS
alter table ALMAUTO_PRODUCTS add constraint FK_ALMAUTO_PRODUCTS_PRODUCT_TYPE foreign key (PRODUCT_TYPE_ID) references ALMAUTO_PRODUCT_TYPE(ID)^
alter table ALMAUTO_PRODUCTS add constraint FK_ALMAUTO_PRODUCTS_UNIT foreign key (UNIT_ID) references ALMAUTO_UNIT(ID)^
create index IDX_ALMAUTO_PRODUCTS_PRODUCT_TYPE on ALMAUTO_PRODUCTS (PRODUCT_TYPE_ID)^
create index IDX_ALMAUTO_PRODUCTS_UNIT on ALMAUTO_PRODUCTS (UNIT_ID)^
-- end ALMAUTO_PRODUCTS
-- begin ALMAUTO_FIXED_ASSETS_FOTOS
alter table ALMAUTO_FIXED_ASSETS_FOTOS add constraint FK_ALMAUTO_FIXED_ASSETS_FOTOS_IMAGE_FILE foreign key (IMAGE_FILE_ID) references SYS_FILE(ID)^
alter table ALMAUTO_FIXED_ASSETS_FOTOS add constraint FK_ALMAUTO_FIXED_ASSETS_FOTOS_FIXED_ASSETS foreign key (FIXED_ASSETS_ID) references ALMAUTO_FIXED_ASSETS(ID)^
create index IDX_ALMAUTO_FIXED_ASSETS_FOTOS_FIXED_ASSETS on ALMAUTO_FIXED_ASSETS_FOTOS (FIXED_ASSETS_ID)^
-- end ALMAUTO_FIXED_ASSETS_FOTOS
-- begin ALMAUTO_COMPANY
alter table ALMAUTO_COMPANY add constraint FK_ALMAUTO_COMPANY_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_ALMAUTO_COMPANY_USER on ALMAUTO_COMPANY (USER_ID)^
-- end ALMAUTO_COMPANY
-- begin ALMAUTO_PRODUCT_IN_LIST
alter table ALMAUTO_PRODUCT_IN_LIST add constraint FK_ALMAUTO_PRODUCT_IN_LIST_PRODUCT foreign key (PRODUCT_ID) references ALMAUTO_PRODUCTS(ID)^
alter table ALMAUTO_PRODUCT_IN_LIST add constraint FK_ALMAUTO_PRODUCT_IN_LIST_PACKAGE_TYPE foreign key (PACKAGE_TYPE_ID) references ALMAUTO_PACKAGE_TYPE(ID)^
alter table ALMAUTO_PRODUCT_IN_LIST add constraint FK_ALMAUTO_PRODUCT_IN_LIST_PRODUCT_IN foreign key (PRODUCT_IN_ID) references ALMAUTO_PRODUCT_IN(ID)^
create index IDX_ALMAUTO_PRODUCT_IN_LIST_PRODUCT on ALMAUTO_PRODUCT_IN_LIST (PRODUCT_ID)^
create index IDX_ALMAUTO_PRODUCT_IN_LIST_PACKAGE_TYPE on ALMAUTO_PRODUCT_IN_LIST (PACKAGE_TYPE_ID)^
create index IDX_ALMAUTO_PRODUCT_IN_LIST_PRODUCT_IN on ALMAUTO_PRODUCT_IN_LIST (PRODUCT_IN_ID)^
-- end ALMAUTO_PRODUCT_IN_LIST
-- begin ALMAUTO_PRICE_LIST
alter table ALMAUTO_PRICE_LIST add constraint FK_ALMAUTO_PRICE_LIST_PRODUCT foreign key (PRODUCT_ID) references ALMAUTO_PRODUCTS(ID)^
alter table ALMAUTO_PRICE_LIST add constraint FK_ALMAUTO_PRICE_LIST_PRICES foreign key (PRICES_ID) references ALMAUTO_PRICE(ID)^
create index IDX_ALMAUTO_PRICE_LIST_PRODUCT on ALMAUTO_PRICE_LIST (PRODUCT_ID)^
create index IDX_ALMAUTO_PRICE_LIST_PRICES on ALMAUTO_PRICE_LIST (PRICES_ID)^
-- end ALMAUTO_PRICE_LIST
