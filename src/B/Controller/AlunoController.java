/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B.Controller;

import C.Model.Aluno;
import D.Infra.EscritorBinario;
import D.Infra.LeitorBinario;
import java.io.File;
import java.util.List;

/**
 *
 * @author paulo
 */
public class AlunoController
{
    public void cadastrar(File arquivo, Aluno aluno)
    {
        LeitorBinario leitor = new LeitorBinario(arquivo);
        List<Aluno> alunos = leitor.recuperaObjeto();
        leitor.encerra();
        alunos.add(aluno);
        EscritorBinario escritor = new EscritorBinario(arquivo);
        escritor.escreveObjeto(alunos);
        escritor.encerra();
    }
    
    public Aluno buscar(File arquivo, Aluno aluno)
    {
        LeitorBinario leitor = new LeitorBinario(arquivo);
        List<Aluno> alunos = leitor.recuperaObjeto();
        leitor.encerra();
        for(Aluno a : alunos)
            if(a.equals(aluno)) return a;
        return null;
    }
}
