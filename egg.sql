use egg;
create table Egg_table(id int not null,hotelNmae  varchar(20),dishName varchar(20),type varchar(20),price DECIMAL(10.2),quantity INT,takeAway tinyint);
select * from Egg_table;
alter table Egg_table add primary key(id);