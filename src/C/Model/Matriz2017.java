/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C.Model;

import java.util.List;

/**
 *
 * @author paulo
 */
public class Matriz2017 implements MatrizCurricular
{
    private List<Disciplina> disciplinas = null;
    
    private Matriz2017(){};
       
    @Override
    public MatrizCurricular getInstance(String tipo)
    {
        return this;
    }
    
}
