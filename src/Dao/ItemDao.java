package Dao;

import Model.Item;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ItemDao {

    //Metodo para persistir (gravar dados) no banco de dados
    public static void persistir(Item item) {

        //Criando String para inserção
        String quary = "INSERT INTO item( codigo ,nome , tipo, estoque, valor) VALUES (?,?, ?, ?, ?)";
        /////////////////////////////////////////////////////////////////////////
        try {

            //Cria comando
            PreparedStatement stmt = Conexao.conetion().prepareStatement(quary);
            System.out.println("Inserção bem sucedida");

            stmt.setInt(1, item.getId());
            stmt.setString(2, item.getNome());
            stmt.setString(3, item.getTipo());
            stmt.setInt(4, item.getEstoque());
            stmt.setDouble(5, item.getValor());
            //indicação de recebimento de valores para atributos realizado com sucesso
            System.out.println("Parametros Foram Enviados Para String com sucesso");

            int resultado = 0;
            resultado = stmt.executeUpdate();
            if (resultado > 0) {
                System.out.println("STMT fez update com sucesso");
            } else {
                if (resultado == 0) {
                    System.out.println("STMT NÃOOO fez update com sucesso");
                }
            }
            ///////////////////////////////////
            stmt.close();
            Conexao.conetion().close();

        } catch (SQLException ex) {
            System.out.println("String Não Inserida");
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodo para listar informações do banco e popular tabela
    public static List<Item> listar() {

        String quary = "SELECT * FROM item ";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Item> listaItem = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item item = new Item();

                item.setId(rs.getInt("codigo"));
                item.setNome(rs.getString("nome"));
                item.setTipo(rs.getString("tipo"));
                item.setEstoque(rs.getInt("estoque"));
                item.setValor(rs.getDouble("valor"));
                listaItem.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaItem;

    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    //Listar Por Nome:
    public static List<Item> listarPorNome(javax.swing.JTextField nome) {

        String quary = "SELECT * FROM item where nome like'" + nome.getText() + "%';";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Item> listaItemNome = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item item = new Item();

                item.setId(rs.getInt("codigo"));
                item.setNome(rs.getString("nome"));
                item.setTipo(rs.getString("tipo"));
                item.setEstoque(rs.getInt("estoque"));
                item.setValor(rs.getDouble("valor"));
                listaItemNome.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaItemNome;

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //Listar Por Tipo:
    public static List<Item> listarPorTipo(javax.swing.JTextField nome) {

        String quary = "SELECT * FROM item where tipo like'" + nome.getText() + "%';";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Item> listaItemTipo = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item item = new Item();

                item.setId(rs.getInt("codigo"));
                item.setNome(rs.getString("nome"));
                item.setTipo(rs.getString("tipo"));
                item.setEstoque(rs.getInt("estoque"));
                item.setValor(rs.getDouble("valor"));
                listaItemTipo.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaItemTipo;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //Listar Por Estoque Zerado
    public static List<Item> listarPorEsotoqueZero(javax.swing.JTextField estoque) {

        String quary = "SELECT * FROM item where estoque = 0";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Item> listaItemEstoque = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item item = new Item();

                item.setId(rs.getInt("codigo"));
                item.setNome(rs.getString("nome"));
                item.setTipo(rs.getString("tipo"));
                item.setEstoque(rs.getInt("estoque"));
                item.setValor(rs.getDouble("valor"));
                listaItemEstoque.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaItemEstoque;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //Listar Por Estoque Positivo
    public static List<Item> listarPorEsotoquePositivo(javax.swing.JTextField estoque) {

        String quary = "SELECT * FROM item where estoque > 0";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Item> listaItemEstoquePositivo = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item item = new Item();

                item.setId(rs.getInt("codigo"));
                item.setNome(rs.getString("nome"));
                item.setTipo(rs.getString("tipo"));
                item.setEstoque(rs.getInt("estoque"));
                item.setValor(rs.getDouble("valor"));
                listaItemEstoquePositivo.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaItemEstoquePositivo;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    //Listar Por Estoque Negativo
    public static List<Item> listarPorEsotoqueNegativo(javax.swing.JTextField estoque) {

        String quary = "SELECT * FROM item where estoque < 0";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Item> listaItemEstoqueNegativo = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item item = new Item();

                item.setId(rs.getInt("codigo"));
                item.setNome(rs.getString("nome"));
                item.setTipo(rs.getString("tipo"));
                item.setEstoque(rs.getInt("estoque"));
                item.setValor(rs.getDouble("valor"));
                listaItemEstoqueNegativo.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaItemEstoqueNegativo;
    }

    public static void deletarItem(Item item) {
        try {
            PreparedStatement stmt = null;

            stmt = Conexao.conetion().prepareStatement("DELETE FROM item WHERE codigo = ?");

            stmt.setInt(1, item.getId());

            stmt.executeUpdate();

            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar não teve exito");
        } finally {

            try {
                Conexao.conetion().close();
                //stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void alterarItem(Item item) {

        PreparedStatement stmt = null;

        try {
            stmt = Conexao.conetion().prepareStatement("UPDATE item SET  nome = ? , tipo = ? , estoque = ? , valor = ? WHERE codigo = ?");
            stmt.setInt(1, item.getId());
            stmt.setString(1, item.getNome());
            stmt.setString(2, item.getTipo());
            stmt.setInt(3, item.getEstoque());
            stmt.setDouble(4, item.getValor());
            stmt.setInt(5, item.getId());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
