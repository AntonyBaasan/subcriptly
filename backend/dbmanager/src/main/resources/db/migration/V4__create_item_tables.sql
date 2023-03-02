-- Item table
create table ITEM (
    ID integer primary key AUTO_INCREMENT,
    NAME nvarchar(200) not null,
    DESCRIPTION nvarchar(2000) null,
    PROJECT_ID nvarchar(100) not null,
    ITEM_TYPE_ID integer
);

insert into ITEM (ID, NAME, DESCRIPTION, PROJECT_ID)
values (1, 'Application 1', 'Dddd', 'abc123');
insert into ITEM (ID, NAME, DESCRIPTION, PROJECT_ID)
values (2, 'Game 2', 'Dddd', 'abc123');

-- Item Type table
create table ITEM_TYPE (
    ID integer primary key AUTO_INCREMENT,
    NAME nvarchar(200) not null
);

insert into ITEM_TYPE (NAME)
values ('Static Website');
insert into ITEM_TYPE (NAME)
values ('Mirror Server App');
insert into ITEM_TYPE (NAME)
values ('Database');

-- Item Artifacts
create table ITEM_ARTIFACT (
    ID integer primary key AUTO_INCREMENT,
    ITEM_ID nvarchar(100) not null,
    LOCATION nvarchar(200) not null
);

insert into ITEM_ARTIFACT (ITEM_ID, LOCATION)
values (1, 'C:\\temp\\web1');
