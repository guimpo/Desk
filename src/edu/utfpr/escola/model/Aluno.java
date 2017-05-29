/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */
public class Aluno implements BolsaFamilia
{
    private Long id = null;
    private int codMunicipal = 0;
    private String nome = "";
    private String mae = "";
    private String pai = "";
    private boolean bolsaFamilia = false;
    private List<Matricula> matriculas = null;

    public Aluno(int codMunicipal, String nome, String mae, String pai, boolean bolsaFamilia)
    {
        this.codMunicipal = codMunicipal;
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this.bolsaFamilia = bolsaFamilia;
        this.matriculas = new ArrayList<Matricula>();
    }
    
    /**
     * @return the codMunicipal
     */
    public int getCodMunicipal()
    {
        return codMunicipal;
    }

    /**
     * @param codMunicipal the codMunicipal to set
     */
    public void setCodMunicipal(int codMunicipal)
    {
        this.codMunicipal = codMunicipal;
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
     * @return the mae
     */
    public String getMae()
    {
        return mae;
    }

    /**
     * @param mae the mae to set
     */
    public void setMae(String mae)
    {
        this.mae = mae;
    }

    /**
     * @return the pai
     */
    public String getPai()
    {
        return pai;
    }

    /**
     * @param pai the pai to set
     */
    public void setPai(String pai)
    {
        this.pai = pai;
    }

    /**
     * @return the bolsaFamilia
     */
    public boolean ehBeneficiario()
    {
        return bolsaFamilia;
    }

    /**
     * @param bolsaFamilia the bolsaFamilia to set
     */
    public void setBolsaFamilia(boolean bolsaFamilia)
    {
        this.bolsaFamilia = bolsaFamilia;
    }
    
    public void addMatricula(Matricula matricula)
    {
        this.matriculas.add(matricula);
    }
    
    public Matricula getMatricula(int i)
    {
        return this.matriculas.get(i);
    }
    
    public Long getId()
    {
        return this.id;
    }
}
