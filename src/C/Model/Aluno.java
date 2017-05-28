/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */
public class Aluno implements Serializable
{
    private String nome;
    private String codMunicipal;
    private String mae;
    private String pai;
    private String responsavel;
    private String dataNascimento;
    private boolean beneficiario = false;
    private List<Trimestre> trimestres;

    public Aluno()
    {
        this.trimestres = new ArrayList<Trimestre>();
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
     * @return the codMunicipal
     */
    public String getCodMunicipal()
    {
        return codMunicipal;
    }

    /**
     * @param codMunicipal the codMunicipal to set
     */
    public void setCodMunicipal(String codMunicipal)
    {
        this.codMunicipal = codMunicipal;
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
     * @return the responsavel
     */
    public String getResponsavel()
    {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel)
    {
        this.responsavel = responsavel;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento()
    {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the beneficiario
     */
    public boolean isBeneficiario()
    {
        return beneficiario;
    }

    /**
     * @param beneficiario the beneficiario to set
     */
    public void setBeneficiario(boolean beneficiario)
    {
        this.beneficiario = beneficiario;
    }

    /**
     * @return the frequencia
     */
    public List<Trimestre> getTrimestres()
    {
        return trimestres;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setTrimestre(Trimestre trimestre)
    {
        this.trimestres.add(trimestre);
    }
    
    public boolean equals(Aluno aluno)
    {
        
        return aluno.getCodMunicipal().equals(this.codMunicipal);
    }
}
