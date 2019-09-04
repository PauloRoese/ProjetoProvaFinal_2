package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    //Connection con = null;
    public static Connection conetion() {
        Connection con = null;
        try {
            //Procurando Drive de conexão
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drive encotrado com sucesso");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Drive Não encotrado ");
        }
        try {
            //Realizando Conexão
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbitem", "root", "");
            System.out.println("Conectou ao banco de dados com sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi realizada conexão ao banco de dados");
        }

        return con;
    }
}
