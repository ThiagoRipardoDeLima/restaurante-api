insert into cozinha(id,nome) values (1,'Tailandesa');
insert into cozinha(id,nome) values (2,'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15, 2);

insert into forma_pagamento(descricao) values ('CARTAO CREDITO');
insert into forma_pagamento(descricao) values ('PIX');

insert into permissao(nome, descricao) values ("CONSULTAR", "Permite ao usuário efetuar a consulta as permissões");
insert into permissao(nome, descricao) values ("EDITAR", "Permite ao usuário efetuar a alteracao de uma permissão");

insert into estado(id, nome, sigla) values (1, "MATO GROSSO", "MT");
insert into estado(id, nome, sigla) values (2, "CEARA", "CE");

insert into cidade(nome, estado_id) values ("CUIABÀ", 1);
insert into cidade(nome, estado_id) values ("VARZEA GRANDE", 1);
insert into cidade(nome, estado_id) values ("SOBRAL", 2);
insert into cidade(nome, estado_id) values ("FORTALEZA", 2);