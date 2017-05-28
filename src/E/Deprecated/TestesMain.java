/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E.Deprecated;

import C.Model.Aluno;
import D.Infra.EscritorBinario;
import D.Infra.LeitorBinario;
import java.io.File;
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
//        File arquivo = new File("/home/paulo/Desktop/arquivo.bin");
//        EscritorBinario escritorBinario = new EscritorBinario(arquivo);
        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        Aluno a1 = new Aluno();
        a1.setCodMunicipal("1");
        a1.setNome("1");
        
        Aluno a2 = new Aluno();
        a2.setCodMunicipal("1");
        a2.setNome("2");
        
        Aluno a3 = new Aluno();
        a3.setCodMunicipal("3");
        a3.setNome("3");
        
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        
        
        System.out.println(a1.equals(a3));
       
//        escritorBinario.escreveObjeto(alunos);
//        
//        LeitorBinario leitorBinario = new LeitorBinario(arquivo);
//        
//        List<Aluno> alunosRecuperados = leitorBinario.recuperaObjeto();
//                
//        for(Aluno a : alunosRecuperados)
//        {
//            System.out.println(a.getCodMunicipal());
//            System.out.println(a.getNome());
//        }
//        
//        System.out.println(alunosRecuperados.size());
        
    }
}
