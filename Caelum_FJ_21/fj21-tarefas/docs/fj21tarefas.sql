create table tarefas(
id SERIAL PRIMARY KEY,
descricao VARCHAR(255),
finalizado BOOLEAN,
dataFinalizacao DATE
)

create table usuarios(
login VARCHAR(255),
senha VARCHAR(255)
)

select * from tarefas
select * from usuarios
select * from tarefa


insert into usuarios(login, senha) VALUES ('rick', '123');