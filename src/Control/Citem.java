package Control;

import Dao.ItemDao;
import Model.Item;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo Ricardo Roese
 */
public class Citem {

    public static void cadastrar(String nome, String tipo, String estoque, String valor) {
        Item item = new Item();
        item.setNome(nome);
        item.setTipo(tipo);
        item.setEstoque(Integer.parseInt(estoque));
        item.setValor(Double.parseDouble(valor));
        ItemDao.persistir(item);

        //Somente teste para verificação de recebimento para atributos do obj
        System.out.println(item.getNome());
        System.out.println(item.getTipo());
        System.out.println(item.getEstoque());
        System.out.println(item.getValor());
    }

    //Metodo que chama leitura de base de dados e replica na tabela
    public static void lerLista(javax.swing.JTable tabela) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Item exibi : ItemDao.listar()) {

            modelo.addRow(new Object[]{
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getEstoque(),
                exibi.getValor(),}
            );

        }
    }
   // Metodo que chama leitura da base de dados pelo nome e replica na tabela
    public static void ListarPorNome(javax.swing.JTable tabela, javax.swing.JTextField txt) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Item exibi : ItemDao.listarPorNome(txt)) {

            modelo.addRow(new Object[]{
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getEstoque(),
                exibi.getValor(),}
            );

        }
    }
     // Metodo que chama leitura da base de dados pelo Tipo e replica na tabela
    public static void ListarPorTipo(javax.swing.JTable tabela, javax.swing.JTextField txt) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Item exibi : ItemDao.listarPorTipo(txt)) {

            modelo.addRow(new Object[]{
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getEstoque(),
                exibi.getValor(),}
            );

        }
    }
    
     public static void ListarPorEstoqueZerado(javax.swing.JTable tabela, javax.swing.JTextField txt) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Item exibi : ItemDao.listarPorEsotoqueZero(txt)) {

            modelo.addRow(new Object[]{
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getEstoque(),
                exibi.getValor(),}
            );

        }
    }
     
       public static void ListarPorEstoquePositivo(javax.swing.JTable tabela, javax.swing.JTextField txt) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Item exibi : ItemDao.listarPorEsotoquePositivo(txt)) {

            modelo.addRow(new Object[]{
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getEstoque(),
                exibi.getValor(),}
            );

        }
    }
       
        public static void ListarPorEstoqueNegativo(javax.swing.JTable tabela, javax.swing.JTextField txt) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Item exibi : ItemDao.listarPorEsotoqueNegativo(txt)) {

            modelo.addRow(new Object[]{
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getEstoque(),
                exibi.getValor(),}
            );

        }
    }
}
