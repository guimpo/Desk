/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.model;

/**
 *
 * @author paulo
 */
public class AlunoDto
{
    private Long id;
    private int codMuncipal;
    private String nome;
    private String mae;
    private String pai;
    private boolean bolsaFamilia;
    private Long idMatricula;
        
    private AlunoDto(){}
    
    public AlunoDto getInstance(Aluno aluno)
    {
        id = aluno.getId();
        codMuncipal = aluno.getCodMunicipal();
        nome = aluno.getNome();
        mae = aluno.getMae();
        pai = aluno.getPai();
        bolsaFamilia = aluno.ehBeneficiario();
        return this;
    }
}
