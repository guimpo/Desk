/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C.Model;

import java.io.Serializable;

/**
 *
 * @author paulo
 */
public class Trimestre implements Serializable
{
    private int anoLetivo;
    private int diasLetivos;
    private int faltas;
    private Disciplinas disciplinas;
    private String turma;
    private String periodo;
    private int nivel;

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

    /**
     * @return the periodo
     */
    public String getPeriodo()
    {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo)
    {
        this.periodo = periodo;
    }

    /**
     * @return the nivel
     */
    public int getNivel()
    {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }
    
    /**
     * @return the anoLetivo
     */
    public int getAnoLetivo()
    {
        return anoLetivo;
    }

    /**
     * @param anoLetivo the anoLetivo to set
     */
    public void setAnoLetivo(int anoLetivo)
    {
        this.anoLetivo = anoLetivo;
    }

    /**
     * @return the diasLetivos
     */
    public int getDiasLetivos()
    {
        return diasLetivos;
    }

    /**
     * @param diasLetivos the diasLetivos to set
     */
    public void setDiasLetivos(int diasLetivos)
    {
        this.diasLetivos = diasLetivos;
    }

    /**
     * @return the faltas
     */
    public int getFaltas()
    {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas)
    {
        this.faltas = faltas;
    }

    /**
     * @return the disciplinas
     */
    public Disciplinas getDisciplinas()
    {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(Disciplinas disciplinas)
    {
        this.disciplinas = disciplinas;
    }
    
    


}
