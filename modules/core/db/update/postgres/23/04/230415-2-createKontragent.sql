alter table ALMAUTO_KONTRAGENT add constraint FK_ALMAUTO_KONTRAGENT_POST foreign key (POST_ID) references ALMAUTO_POST(ID);
create index IDX_ALMAUTO_KONTRAGENT_POST on ALMAUTO_KONTRAGENT (POST_ID);
