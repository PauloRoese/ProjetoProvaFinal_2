package Dao;

import Model.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VendaDao {

    //Metodo para persistir (gravar dados) no banco de dados
    public static void persistir(Venda venda) {

        //Criando String para inserção
        String quary = "INSERT INTO venda( codigoVenda, codigo ,nome , tipo, quantidadeVendida, valor, valorVendido, estoque) "
                + "VALUES (?,?,?, ?, ?, ? , ?, ?)";
        /////////////////////////////////////////////////////////////////////////
        try {

            //Cria comando
            PreparedStatement stmt = Conexao.conetion().prepareStatement(quary);
            System.out.println("Inserção bem sucedida");
            stmt.setInt(1, venda.getIdVenda());
            stmt.setInt(2, venda.getId());
            stmt.setString(3, venda.getNome());
            stmt.setString(4, venda.getTipo());
            stmt.setInt(5, venda.getQuantidadeVenda());
            stmt.setDouble(6, venda.getValor());
            stmt.setDouble(7, venda.getValorDeVenda());
            stmt.setInt(8, venda.getEstoque());
            //indicação de recebimento de valores para atributos realizado com sucesso
            System.out.println("Parametros Foram Enviados Para String com sucesso");
           

            
            stmt.executeUpdate();

            stmt.close();
            Conexao.conetion().close();

        } catch (SQLException ex) {
            System.out.println("String Não Inserida");
        }

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodo para listar informações do banco e popular tabela
    public static List<Venda> listar() {

        String quary = "SELECT * FROM venda";
        ResultSet rs;
        PreparedStatement stmt = null;
        List<Venda> listaVenda = new ArrayList<>();

        try {
            //Estanciando Conexão

            stmt = Conexao.conetion().prepareStatement(quary);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Venda venda = new Venda();
                venda.setIdVenda(rs.getInt("codigoVenda"));
                venda.setId(rs.getInt("codigo"));
                venda.setNome(rs.getString("nome"));
                venda.setTipo(rs.getString("tipo"));
                venda.setQuantidadeVenda(rs.getInt("quantidadeVendida"));
                venda.setValor(rs.getDouble("valor"));
                venda.setValorDeVenda(rs.getDouble("valorVendido"));
                venda.setEstoque(rs.getInt("estoque"));
                listaVenda.add(venda);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexão para listar venda não teve exito");
        } finally {
            try {
                Conexao.conetion().close();
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ItemDao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return listaVenda;

    }
    
     public static void deletarVenda(Venda venda) {
        try {
            PreparedStatement stmt = null;

            stmt = Conexao.conetion().prepareStatement("DELETE FROM venda WHERE codigoVenda = ?");

            stmt.setInt(1, venda.getIdVenda());
            System.out.println(venda.getIdVenda());

            stmt.executeUpdate();
            System.out.println("Entrou no Dao Delete");
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
}
