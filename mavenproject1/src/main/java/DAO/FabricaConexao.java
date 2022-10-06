/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 0062330
 */
public class FabricaConexao {
    
    public static Connection getConnection(){
        Connection conexao = null;
        
        try{
            String URL = "jdbc:mysql://127.0.0.1/cidade";
            String Usuario = "root";
            String senha = "";
            conexao = DriverManager.getConnection(URL, Usuario, senha);
        }catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        return conexao;
    }
}
