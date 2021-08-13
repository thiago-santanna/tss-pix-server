insert into pais (descricao) values ('Brasil');
insert into estado (descricao, pais_id) values ('Pernambuco', 1);
insert into cidade (codigo_cidade, descricao, estado_id) values ('102057', 'Recife', 1);
insert into rua (cep, nome, cidade_id) values ('52120315', 'Rua Pastor Israel Vieira Ferreira', 1);
insert into banco (nome) values ('Banco do Brasil');
insert into banco (nome) values ('Banco Bradesco');
insert into banco (nome) values ('Banco Itaú');
insert into banco (nome) values ('Pague Seguro');
insert into banco (nome) values ('Mercado Pago');

insert into parceiros (cpf, telefone, email, nome, num_endereco, senha, situacao, usuario, rua_id) values ('04490627408', '81992713545', 'uzmaki_thiago@outlook.com', 'Thiago Santanna da Silva', '56', '1020kt', 0, 'uzmaki_thiago', 1);
insert into clientes (nome, conta, agencia, chave_pix, cpf, email, telefone, rua_id, num_endereco, situacao, banco_id) values ('Junior Elcoma', '1020-1', '5775', '102057@571020', '04490627408', 'junior@gmail.com', '81979090117', 1, '56', 0, 1)