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
    private String dataMatricula;
    private String dataTranferencia;
    private Aluno aluno = null;
    private AnoLetivo anoLetivo = null;

    /**
     * @return the dataMatricula
     */
    public String getDataMatricula()
    {
        return dataMatricula;
    }

    /**
     * @param dataMatricula the dataMatricula to set
     */
    public void setDataMatricula(String dataMatricula)
    {
        this.dataMatricula = dataMatricula;
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
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }

    /**
     * @return the anoLetivo
     */
    public AnoLetivo getAnoLetivo()
    {
        return anoLetivo;
    }

    /**
     * @param anoLetivo the anoLetivo to set
     */
    public void setAnoLetivo(AnoLetivo anoLetivo)
    {
        this.anoLetivo = anoLetivo;
    }
}
