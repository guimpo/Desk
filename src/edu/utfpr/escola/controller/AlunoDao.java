/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.controller;

import edu.utfpr.escola.model.Aluno;
import edu.utfpr.escola.model.AlunoDto;
import edu.utfpr.escola.model.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class AlunoDao
{
    public AlunoDto select(Integer id)
    {
        String query = "SELECT * FROM aluno " +
                "WHERE id = ?";
        
        try (Connection connection = DataBase.conecta();
             PreparedStatement preparedStatement = connection.prepareStatement(query);)
        {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            AlunoDto a = null;
            while(resultSet.next())
            {
                a = new AlunoDto(resultSet.getInt("id"), resultSet.getInt("codMunicipal"));
            }
            return a;
        } catch (Exception e)
        {
            System.err.println(e.toString());
        }
        return null;
    }
    
    
    public void insert(Aluno aluno)
    {
        String query =  "INSERT INTO aluno (codMunicipal, nome, mae, pai, bolsaFamilia) " +
                "VALUES(?,?,?,?,?)";
        
        try (Connection conexao = DataBase.conecta();
            PreparedStatement ps = conexao.prepareStatement(query))
        {
            ps.setInt(1, aluno.getCodMunicipal());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getMae());
            ps.setString(4, aluno.getPai());
            ps.setBoolean(5, aluno.ehBeneficiario());
            ps.executeUpdate();
  
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }
    
    public void update(AlunoDto a)
    {
        String query = "UPDATE aluno " +
                       "SET nome = ? " +
                       "WHERE id = ?";
        
        try(Connection c = DataBase.conecta();
                PreparedStatement ps = c.prepareStatement(query);)
        {
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getId());
            ps.executeUpdate();
        }
        catch (SQLException ex)
        {
            
        }
    }
}
