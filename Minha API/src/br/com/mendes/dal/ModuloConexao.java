/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mendes.dal;

import java.sql.*;
import static java.time.Clock.system;

/**
 *
 * @author Mendes
 */
// metodo responsavel por conecatar ao banco . // 
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o Driver // 
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informacoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelecendo conexao com banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;

        } catch (ClassNotFoundException | SQLException e) {
            return null;

        }   
    }
}