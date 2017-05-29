/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.model;

import java.io.Serializable;

/**
 *
 * @author paulo
 */
public class Disciplina
{
    private String nome = "";
    private ProcedimentoAvaliativo procedimentoAvaliativo = null;
    
    public Disciplina(String nome, ProcedimentoAvaliativo procedimentoAvaliativo)
    {
        this.nome = nome;
        this.procedimentoAvaliativo = procedimentoAvaliativo;
    }

    /**
     * @return the nome
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    /**
     * @return the procedimentoAvaliativo
     */
    public ProcedimentoAvaliativo getProcedimentoAvaliativo()
    {
        return procedimentoAvaliativo;
    }

    /**
     * @param procedimentoAvaliativo the procedimentoAvaliativo to set
     */
    public void setProcedimentoAvaliativo(ProcedimentoAvaliativo procedimentoAvaliativo)
    {
        this.procedimentoAvaliativo = procedimentoAvaliativo;
    }
    
    
}
