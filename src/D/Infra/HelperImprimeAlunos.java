/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D.Infra;

import C.Model.Aluno;
import java.util.List;

/**
 *
 * @author paulo
 */
public class HelperImprimeAlunos
{        
        public static void exe(String caminho, List<Aluno> alunos)
        {
            System.out.println(caminho);
            System.out.println("qtd de alunos" + alunos.size());
            
            for(Aluno a : alunos)
            {
                System.out.println(a.getCodMunicipal());
                System.out.println(a.getNome());
                System.out.println(a.getMae());
                System.out.println(a.getPai());
            }
            System.out.println("\n");
        }
}
