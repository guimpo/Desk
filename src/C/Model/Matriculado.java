/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C.Model;

import java.util.Calendar;

/**
 *
 * @author paulo
 */
public interface Matriculado
{
    public boolean isMatriculado();
    public void matricular(Calendar dataMatricula, Turma turma);
    public void transferir(Calendar dataTranferencia, Escola escolaDestino);
}
