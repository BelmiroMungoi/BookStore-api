create table provincias(
	id bigint primary key not null,
	nome varchar(50) not null
);

create table distritos(
	id bigint primary key not null,
	nome varchar(60) not null,
	provincia_id bigint not null,
	foreign key(provincia_id) references provincias(id)
);