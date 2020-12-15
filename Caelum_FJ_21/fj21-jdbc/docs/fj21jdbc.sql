create table contatos(
id SERIAL PRIMARY KEY,
nome VARCHAR(255),
email VARCHAR(255),
endereco VARCHAR(255),
dataNascimento DATE
)

create table funcionarios(
id SERIAL PRIMARY KEY,
nome VARCHAR(255),
usuario VARCHAR(255),
senha VARCHAR(255)
)

select * from contatos
select * from funcionarios