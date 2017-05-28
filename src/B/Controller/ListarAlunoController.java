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
public class ListarAlunoController
{
    private EscritorBinario escritor;
    private LeitorBinario leitor;
    
    public List<Aluno> listar(File arquivo)
    {
        leitor = new LeitorBinario(arquivo);
        List<Aluno> alunos = leitor.recuperaObjeto();
        HelperImprimeAlunos.exe("ListarAlunoControler 28", alunos);
        leitor.encerra();
        return alunos;
    }
}
