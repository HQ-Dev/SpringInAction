create table Spittle (
	id identity,
	message varchar(140) not null,
	created_at timestamp not null,
	latitude double,
	longitude double
);

create table Spitter (
	id identity,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	email varchar(30) not null
);

insert into Spittle (id,message,created_at,latitude,longitude)
		VALUES (1,'spring','2011-12-02 11:22:32','123','123') , (2, 'summer','2013-12-03 13:23:32','2','3'),
			(3,'autumn','2009-09-12 04:23:40','23','122'),(4,'winter','2008-04-10 18:00:00','120','30')