/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D.Infra;

import C.Model.Aluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author paulo
 */
public class LeitorBinario
{
    private File arquivo;
    private ObjectInputStream entrada;
    private FileInputStream arquivoDeEntrada;
    
    public LeitorBinario(File arquivo)
    {
        this.arquivo = arquivo;
        try
        {
            this.arquivo.createNewFile();
        }
        catch(IOException ex)
        {
            System.err.println("FileNotFoundException da linha 31 do LeitorBinario");
        }
        try
        {
            this.arquivoDeEntrada = new FileInputStream(arquivo);
        }
        catch (FileNotFoundException ex)
        {
            System.err.println("FileNotFoundException da linha 39 do LeitorBinario");
        }
        try
        {
            entrada = new ObjectInputStream(arquivoDeEntrada);
        }
        catch (IOException ex)
        {
            System.err.println("IOException da linha 47 do LeitorBinario");
        }
    }
    
    public List<Aluno> recuperaObjeto()
    {
        List<Aluno> alunos = null;
        try
        {
            alunos = (List<Aluno>) this.entrada.readObject();
        }
        catch (IOException ex)
        {
            System.err.println("IOException da linha 59 do LeitorBinario");
        }
        catch (ClassNotFoundException ex)
        {
            System.err.println("ClassNotfoundException da linha 64 do LeitorBinario");
        }
        return alunos;
    }
    
    public void encerra()
    {
        try
        {
            this.entrada.close();
        }
        catch (IOException ex)
        {
            System.err.println("IOException da linha 77 do LeitorBinario");
        }
    }
}
