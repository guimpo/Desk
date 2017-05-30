/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.teste;

import edu.utfpr.escola.controller.AlunoDao;
import edu.utfpr.escola.model.Aluno;
import edu.utfpr.escola.model.AlunoDto;
import edu.utfpr.escola.model.AnoLetivo;
import edu.utfpr.escola.model.Disciplina;
import edu.utfpr.escola.model.Matricula;
import edu.utfpr.escola.model.MatrizCurricular;
import edu.utfpr.escola.model.Nota;
import edu.utfpr.escola.model.ProcedimentoAvaliativo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */
public class TestesMain
{
    public static void main(String[] args)
    {
        boolean bf = true;
        
        Aluno aluno = new Aluno(0, "paulo", "", "", bf);
        
        ProcedimentoAvaliativo nota = new Nota();
        
        Disciplina d = new Disciplina("por", nota);
        
        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        
        disciplinas.add(d);
        
        MatrizCurricular matriz = new AnoLetivo(2017, 180, disciplinas);
        
        Matricula matricula = new Matricula(matriz, aluno, "01/03/2017", "5MA");
        
        aluno.addMatricula(matricula);
        
//        System.out.println(aluno.getCodMunicipal());
//        System.out.println(aluno.getNome());
//        System.out.println(aluno.getMae());
//        System.out.println(aluno.getPai());
//        System.out.println(aluno.ehBeneficiario());
//        
//        System.out.println(aluno.getMatricula(0).getAnoLetivo());
//        System.out.println(aluno.getMatricula(0).getDataMatricula());
        
//        Connection conexao = DataBase.conecta();
//        try { conexao.close(); } catch (SQLException ex) {}

        AlunoDao dao = new AlunoDao();
//        dao.insert(aluno);
         
//        System.out.println(dao.select(1).getCodMunicipal());
        dao.update(new AlunoDto(1, "alessandro"));
    }
}
