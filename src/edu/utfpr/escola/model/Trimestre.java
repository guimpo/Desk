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
public class Trimestre implements Divisao
{
    class Estrutura implements Frequencia
    {
        private final int diasLetivos;
        private int faltas = 0;
        private double mediaTrimestre = 0.0;
        
        public Estrutura(int diasLetivos)
        {
            this.diasLetivos = diasLetivos;
        }

        @Override
        public double getFrequencia()
        {
            double frequencia = this.diasLetivos - this.faltas;
            frequencia = frequencia * 100 / this.diasLetivos;
            return frequencia;
        }

        @Override
        public void setFaltas(int faltas)
        {
            this.faltas -= faltas;
        }
    }
    
    List<Estrutura> trimestres = null;
    
    private Trimestre() {};
    
    @Override
    public Divisao getInstance(String tipo, List<Integer> diasLetivos)
    {
        this.trimestres = new ArrayList<Estrutura>();
        trimestres.add(new Estrutura(diasLetivos.get(0)));
        trimestres.add(new Estrutura(diasLetivos.get(1)));
        trimestres.add(new Estrutura(diasLetivos.get(2)));
        return this;
    }
    
    public double getFrequencia(int trimestre)
    {
        Estrutura e = this.trimestres.get(trimestre - 1);
        return e.getFrequencia();
    }   
}