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
public class Nota implements ProcedimentoAvaliativo
{
    private final double notaMaxima = 10.0;
    private final double media = 6.0;
    private double notaFinal = 0.0;
    
    public double getNota()
    {
        return this.notaFinal;
    }
    
    public void setNota(double nota)
    {
        this.notaFinal = nota;
    }

    @Override
    public ProcedimentoAvaliativo getInstance()
    {
        return this;
    }
}
