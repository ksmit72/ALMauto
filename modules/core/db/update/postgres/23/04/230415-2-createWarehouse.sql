alter table ALMAUTO_WAREHOUSE add constraint FK_ALMAUTO_WAREHOUSE_COMPANY foreign key (COMPANY_ID) references ALMAUTO_COMPANY(ID);
alter table ALMAUTO_WAREHOUSE add constraint FK_ALMAUTO_WAREHOUSE_EMPLOYEE foreign key (EMPLOYEE_ID) references ALMAUTO_EMPLOYEE(ID);
create index IDX_ALMAUTO_WAREHOUSE_COMPANY on ALMAUTO_WAREHOUSE (COMPANY_ID);
create index IDX_ALMAUTO_WAREHOUSE_EMPLOYEE on ALMAUTO_WAREHOUSE (EMPLOYEE_ID);
