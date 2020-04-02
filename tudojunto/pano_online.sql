create database if not exists pano_online;
use pano_online;

create table if not exists cliente (
	id_cliente int not null primary key auto_increment,
	nome varchar(70) not null,
	cpf varchar(11) not null unique,
	email varchar(40) not null unique,
	senha varchar(128) not null,
	data_nasc datetime not null,
	genero char(1) not null
);

-- create table if not exists telefone (
-- 	id_tel int not null primary key auto_increment,
-- 	numero varchar(11) not null,
-- 	tipo_tel varchar(20) 
-- -- 	opções comercial, residencial e celular
-- 	cliente_id fk int,
-- 	foreign key (cliente_id) references cliente(id_cliente)
-- );

create table if not exists endereco_cliente (
	id_end int not null primary key auto_increment,
	num_telefone varchar(11) not null,
	cep varchar(8) not null,
	logradouro varchar(200),
	numero varchar(20),
	complemento varchar(30),
	referencia text,
	bairro varchar(60),
	cidade varchar(60) not null,
	uf varchar(2) not null,
	cliente_id int,
	fornecedor_id int,
	foreign key (cliente_id) references cliente(id_cliente)
);

create table if not exists produto (
	id_produto int not null primary key auto_increment,
	titulo varchar(200),
	fabricante varchar(100),
	descricao text,
	cor varchar(30),
	valor decimal(5, 2)
);

create table if not exists categoria (
	id_categoria int not null primary key auto_increment,
	nome_categoria varchar(30) not null,
	produto_id int,
	foreign key (produto_id) references produto(id_produto)
);

create table if not exists carrinho_venda (
	id int not null primary key auto_increment,
	cliente_id int,
	endereco_id int,
	produto_id int,
	valor_frete decimal(4, 2),
	total_compra decimal(8, 2)
);

create table if not exists fornecedor (
	id_forn int not null primary key auto_increment,
	nome_forn varchar(200) not null
);

