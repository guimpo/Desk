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
public interface MatrizCurricular
{
    List<Disciplina> getDisciplinas();
    int getAnoLetivo();
    int getDiasLetivos();
}
