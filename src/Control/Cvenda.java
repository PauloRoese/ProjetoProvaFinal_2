package Control;

import Dao.VendaDao;
import Model.Venda;
import javax.swing.table.DefaultTableModel;

public class Cvenda {

    public static void cadastrarVenda(String id, String nome, String tipo, String quantidadeVenda,
            String valor, int estoque) {

        Venda venda = new Venda();
        double valorVenda = (Integer.parseInt(quantidadeVenda) * Double.parseDouble(valor));

        venda.setId(Integer.parseInt(id));
        venda.setNome(nome);
        venda.setTipo(tipo);
        venda.setEstoque(estoque);
        venda.setQuantidadeVenda(Integer.parseInt(quantidadeVenda));
        venda.setValor(Double.parseDouble(valor));
        venda.setValorDeVenda(valorVenda);
        VendaDao.persistir(venda);

        //Somente teste para verificação de recebimento para atributos do obj
        System.out.println(venda.getId());
        System.out.println(venda.getNome());
        System.out.println(venda.getTipo());
        System.out.println(venda.getEstoque());
        System.out.println(venda.getQuantidadeVenda());
        System.out.println(venda.getValorDeVenda());
        System.out.println(venda.getValor());
    }

    //Metodo que chama leitura de base de dados e replica na tabela
    public static void lerLista(javax.swing.JTable tabela) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        for (Venda exibi : VendaDao.listar()) {

            modelo.addRow(new Object[]{
                exibi.getIdVenda(),
                exibi.getId(),
                exibi.getNome(),
                exibi.getTipo(),
                exibi.getQuantidadeVenda(),
                exibi.getValor(),
                exibi.getValorDeVenda(),
                exibi.getEstoque()}
            );

        }
    }

//Metodo que chama leitura de base de dados e replica o mais vendido
    public static void listarPorMaior(javax.swing.JTable tabela) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        Venda aux = new Venda();

        for (Venda exibi : VendaDao.listar()) {

            if (aux.getQuantidadeVenda() < exibi.getQuantidadeVenda()) {

                aux.setIdVenda(exibi.getIdVenda());
                aux.setId(exibi.getId());
                aux.setNome(exibi.getNome());
                aux.setTipo(exibi.getTipo());
                aux.setQuantidadeVenda(exibi.getQuantidadeVenda());
                aux.setValor(exibi.getValor());
                aux.setValorDeVenda(exibi.getValorDeVenda());
                aux.setEstoque(exibi.getEstoque());
            }

        }
        modelo.addRow(new Object[]{
            aux.getIdVenda(),
            aux.getId(),
            aux.getNome(),
            aux.getTipo(),
            aux.getQuantidadeVenda(),
            aux.getValor(),
            aux.getValorDeVenda(),
            aux.getEstoque()}
        );
    }
//Metodo que chama leitura de base de dados e replica o Mnos vendido

    public static void listarPorMenosVendido(javax.swing.JTable tabela) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        Venda aux = new Venda();

        int i = 0;
        for (Venda exibi : VendaDao.listar()) {

            while ( i <1 ) {
                aux.setQuantidadeVenda(exibi.getQuantidadeVenda());
                System.out.println("Entou no for uma vez!!!!!!!!!");
                System.out.println(aux.getQuantidadeVenda());
                ++i;
            }

            if (aux.getQuantidadeVenda() > exibi.getQuantidadeVenda()) {

                aux.setIdVenda(exibi.getIdVenda());
                aux.setId(exibi.getId());
                aux.setNome(exibi.getNome());
                aux.setTipo(exibi.getTipo());
                aux.setQuantidadeVenda(exibi.getQuantidadeVenda());
                aux.setValor(exibi.getValor());
                aux.setValorDeVenda(exibi.getValorDeVenda());
                aux.setEstoque(exibi.getEstoque());
            }
           
        }
         modelo.addRow(new Object[]{
                aux.getIdVenda(),
                aux.getId(),
                aux.getNome(),
                aux.getTipo(),
                aux.getQuantidadeVenda(),
                aux.getValor(),
                aux.getValorDeVenda(),
                aux.getEstoque()}
            );

    }
}
