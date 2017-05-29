/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  paulo
 * Created: May 28, 2017
 */

create table aluno
(
    id serial primary key,
    codMunicipal integer,
    nome varchar(50),
    mae varchar(50),
    pai varchar(50),
    bolsaFamilia boolean
);

create table matricula
(
    id serial primary key,
    dataMatricula varchar(50),
    dataTransferencia varchar(50),
    turma varchar(50),
    aluno_id serial references aluno (id),
    anoLetivo integer
);