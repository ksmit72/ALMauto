alter table ALMAUTO_PRODUCT_IN_LIST add constraint FK_ALMAUTO_PRODUCT_IN_LIST_PRODUCT foreign key (PRODUCT_ID) references ALMAUTO_PRODUCTS(ID);
alter table ALMAUTO_PRODUCT_IN_LIST add constraint FK_ALMAUTO_PRODUCT_IN_LIST_PACKAGE_TYPE foreign key (PACKAGE_TYPE_ID) references ALMAUTO_PACKAGE_TYPE(ID);
alter table ALMAUTO_PRODUCT_IN_LIST add constraint FK_ALMAUTO_PRODUCT_IN_LIST_PRODUCT_IN foreign key (PRODUCT_IN_ID) references ALMAUTO_PRODUCT_IN(ID);
create index IDX_ALMAUTO_PRODUCT_IN_LIST_PRODUCT on ALMAUTO_PRODUCT_IN_LIST (PRODUCT_ID);
create index IDX_ALMAUTO_PRODUCT_IN_LIST_PACKAGE_TYPE on ALMAUTO_PRODUCT_IN_LIST (PACKAGE_TYPE_ID);
create index IDX_ALMAUTO_PRODUCT_IN_LIST_PRODUCT_IN on ALMAUTO_PRODUCT_IN_LIST (PRODUCT_IN_ID);
