/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B.Controller;

import C.Model.Aluno;
import D.Infra.EscritorBinario;
import D.Infra.HelperImprimeAlunos;
import D.Infra.LeitorBinario;
import java.io.File;
import java.util.List;

/**
 *
 * @author paulo
 */
public class CadastrarAlunoController
{
    private EscritorBinario escritor;
    private LeitorBinario leitor;
    
    public CadastrarAlunoController()
    {
        
    }
    
    public void cadastrar(File arquivo, List<Aluno> alunos)
    {
        HelperImprimeAlunos.exe("CadastrarAlunoController", alunos);
        
        escritor = new EscritorBinario(arquivo);
        escritor.escreveObjeto(alunos);
        escritor.encerra();
        
    }
}
