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
public class AnoLetivo implements MatrizCurricular
{
    private List<Disciplina> disciplinas = null;
    private int anoLetivo = 0;
    private int diasLetivos = 0;
    
    public AnoLetivo(int anoLetivo, int diasLetivos, List<Disciplina> disciplinas)
    {
        this.anoLetivo = anoLetivo;
        this.diasLetivos = diasLetivos;
        this.disciplinas = disciplinas;
    }

    @Override
    public List<Disciplina> getDisciplinas()
    {
        return this.disciplinas;
    }

    @Override
    public int getAnoLetivo()
    {
        return this.anoLetivo;
    }

    @Override
    public int getDiasLetivos()
    {
        return this.diasLetivos;
    }
}
