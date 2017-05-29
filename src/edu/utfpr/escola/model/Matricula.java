/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.model;

import java.util.List;

/**
 *
 * @author paulo
 */
public class Matricula
{
    private Long id = null;
    private String dataMatricula;
    private String dataTranferencia;
    private String turma;
    private Aluno aluno = null;
    private MatrizCurricular matrizCurricular = null;

    public Matricula(MatrizCurricular matrizCurricular, Aluno aluno, String dataMatricula, String turma)
    {
        this.matrizCurricular = matrizCurricular;
        this.aluno = aluno;
        this.dataMatricula = dataMatricula;
        this.turma = turma;
    }
    
    /**
     * @return the dataMatricula
     */
    public String getDataMatricula()
    {
        return dataMatricula;
    }

    /**
     * @return the dataTranferencia
     */
    public String getDataTranferencia()
    {
        return dataTranferencia;
    }

    /**
     * @param dataTranferencia the dataTranferencia to set
     */
    public void setDataTranferencia(String dataTranferencia)
    {
        this.dataTranferencia = dataTranferencia;
    }

    /**
     * @return the aluno
     */
    public Aluno getAluno()
    {
        return aluno;
    }

    /**
     * @return the anoLetivo
     */
    public int getAnoLetivo()
    {
        return this.matrizCurricular.getAnoLetivo();
    }

    /**
     * @return the turma
     */
    public String getTurma()
    {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma)
    {
        this.turma = turma;
    }
    
    public Long getId()
    {
        return this.id;
    }

}
