/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.controller;

import edu.utfpr.escola.model.Aluno;
import edu.utfpr.escola.model.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

/**
 *
 * @author paulo
 */
public class AlunoDao
{
    public void insert(Aluno aluno)
    {
        String query =  "INSERT INTO aluno (codMunicipal, nome, mae, pai, bolsaFamilia) " +
                "VALUES(?,?,?,?,?)";
        
        try (Connection conexao = DataBase.conecta();
            PreparedStatement pstmt = conexao.prepareStatement(query, Statement.RETURN_GENERATED_KEYS))
        {
            pstmt.setInt(1, aluno.getCodMunicipal());
            pstmt.setString(2, aluno.getNome());
            pstmt.setString(3, aluno.getMae());
            pstmt.setString(4, aluno.getPai());
            pstmt.setBoolean(5, aluno.ehBeneficiario());
            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        long id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }
}
