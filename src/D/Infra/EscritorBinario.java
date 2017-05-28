/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D.Infra;

import C.Model.Aluno;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class EscritorBinario
{
    private File arquivo;
    private ObjectOutputStream saida;
    private FileOutputStream arquivoDeSaida;
    private boolean append = false;

    public EscritorBinario(File arquivo)
    {
        this.arquivo = arquivo;
        try
        {
            System.out.println("Escritorbinario 34");
            System.out.println("Arquivo criado: " + this.arquivo.createNewFile());
        }
        catch (IOException ex)
        {
            System.err.println("IOException da linha 34 do EscritorBinario\n");
        }
        
        try
        {
            this.arquivoDeSaida = new FileOutputStream(arquivo, append);
        }
        catch (FileNotFoundException ex)
        {
            System.err.println("FileNotFoundException da linha 43 do EscritorBinario");
        }
        try
        {
            this.saida = new ObjectOutputStream(arquivoDeSaida);
        }
        catch (IOException ex)
        {
            System.err.println("FileNotFoundException da linha 51 do EscritorBinario");
        }
    }
    
    public void escreveObjeto(List<Aluno> alunos)
    {    
  
        HelperImprimeAlunos.exe("EscritorBinario 62", alunos);
        
        try   
        {
            saida.writeObject(alunos);
        } catch (IOException ex)
        {
            System.err.println("FileNotFoundException da linha 66 do EscritorBinario");
        }
    }
    
    public void encerra()
    {
        try
        {
            this.saida.close();
        }
        catch (IOException ex)
        {
            System.err.println("IOException da linha 77 do EscritorBinario");
        }
    }
}
