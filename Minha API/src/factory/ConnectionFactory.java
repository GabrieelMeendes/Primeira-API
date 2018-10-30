/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mendes
 */
public class ConnectionFactory {
    public static Connection getConnection() {
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
