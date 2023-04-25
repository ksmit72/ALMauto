alter table ALMAUTO_COMPANY add constraint FK_ALMAUTO_COMPANY_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_ALMAUTO_COMPANY_USER on ALMAUTO_COMPANY (USER_ID);
