use tree;
create table aeroplane_table(a_id int not null,a_company varchar(20),a_name varchar(20),a_cost bigint,a_type varchar(20),a_country varchar(20) );
select * from aeroplane_table;
alter table aeroplane_table add primary key(a_id);