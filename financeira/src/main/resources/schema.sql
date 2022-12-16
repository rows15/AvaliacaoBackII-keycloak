create table conta
(
    id_conta       varchar(255) not null,
    cliente_conta varchar(255),
    produto_conta  varchar(255),
    preco_total   double,
    primary key (id_conta)
);