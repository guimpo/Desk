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
public class Disciplinas implements Serializable
{
    private double portugues;
    private double matematica;
    private double historia;
    private double geografia;
    private double ciencia;

    /**
     * @return the portugues
     */
    public double getPortugues()
    {
        return portugues;
    }

    /**
     * @param portugues the portugues to set
     */
    public void setPortugues(double portugues)
    {
        this.portugues = portugues;
    }

    /**
     * @return the matematica
     */
    public double getMatematica()
    {
        return matematica;
    }

    /**
     * @param matematica the matematica to set
     */
    public void setMatematica(double matematica)
    {
        this.matematica = matematica;
    }

    /**
     * @return the historia
     */
    public double getHistoria()
    {
        return historia;
    }

    /**
     * @param historia the historia to set
     */
    public void setHistoria(double historia)
    {
        this.historia = historia;
    }

    /**
     * @return the geografia
     */
    public double getGeografia()
    {
        return geografia;
    }

    /**
     * @param geografia the geografia to set
     */
    public void setGeografia(double geografia)
    {
        this.geografia = geografia;
    }

    /**
     * @return the ciencia
     */
    public double getCiencia()
    {
        return ciencia;
    }

    /**
     * @param ciencia the ciencia to set
     */
    public void setCiencia(double ciencia)
    {
        this.ciencia = ciencia;
    }
}
