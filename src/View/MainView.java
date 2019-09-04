package View;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainView extends javax.swing.JFrame {

    CadastroView cadastroview = new CadastroView();
    VendaView vendaview = new VendaView();
    ListaVendaView listaVenda = new ListaVendaView();

    //CadastroView cadastroview = new CadastroView();
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();

        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        Cadastrar = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        call_CadastrarVenda = new javax.swing.JMenuItem();
        Call_ListaVenda = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1332, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );

        menuBar.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");

        Cadastrar.setMnemonic('o');
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        fileMenu.add(Cadastrar);

        exitMenu.setMnemonic('x');
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenu);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Venda");

        call_CadastrarVenda.setMnemonic('t');
        call_CadastrarVenda.setText("Cadastrar Venda");
        call_CadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                call_CadastrarVendaActionPerformed(evt);
            }
        });
        editMenu.add(call_CadastrarVenda);

        Call_ListaVenda.setMnemonic('y');
        Call_ListaVenda.setText("Lista de Vendas");
        Call_ListaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Call_ListaVendaActionPerformed(evt);
            }
        });
        editMenu.add(Call_ListaVenda);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        //CadastroView cadastroview = new CadastroView();
        if (!cadastroview.isVisible()) {
            this.desktopPane.add(cadastroview);
            cadastroview.setVisible(true);

        } else {
            if (cadastroview.isVisible()) {
                JOptionPane.showMessageDialog(cadastroview, "Tela de Cadastro ja Esta Aberta");
            }
        }
       
    }//GEN-LAST:event_CadastrarActionPerformed

    private void call_CadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_call_CadastrarVendaActionPerformed
        //VendaView vendaview = new VendaView();
        if (!vendaview.isVisible()) {
            this.desktopPane.add(vendaview);
            vendaview.setVisible(true);
        } else {
            if (vendaview.isVisible()) {
                JOptionPane.showMessageDialog(vendaview, "Tela de Cadastro de Venda ja Esta Aberta");
            }
        }

    
    }//GEN-LAST:event_call_CadastrarVendaActionPerformed

    private void Call_ListaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Call_ListaVendaActionPerformed
        // ListaVendaView listaVenda = new ListaVendaView();
        if (!listaVenda.isVisible()) {
            this.desktopPane.add(listaVenda);
            listaVenda.setVisible(true);

        } else {
            if (listaVenda.isVisible()) {
                JOptionPane.showMessageDialog(listaVenda, "Tela Listagem de Vendas ja Esta Aberta");
            }
        }

        
    }//GEN-LAST:event_Call_ListaVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cadastrar;
    private javax.swing.JMenuItem Call_ListaVenda;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem call_CadastrarVenda;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}