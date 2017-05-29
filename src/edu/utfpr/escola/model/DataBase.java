/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.escola.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class DataBase
{
    private static final String url = "jdbc:postgresql://localhost/escola";
    private static final String user = "postgres";
    private static final String password = "paulo";
    
    public static Connection conecta()
    {
        Connection conexao = null;
        try {
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("...Yohoho");
        } catch (SQLException e) {
            System.err.println("T.T");
            System.err.println(e.getMessage());
        }
        return conexao;
    }
}
