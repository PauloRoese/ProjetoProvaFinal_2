package View;

import Control.Citem;
import Control.Clogin;
import Dao.ItemDao;
import Model.Item;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroView extends javax.swing.JInternalFrame {

    //Collection<Item> listaEstoque = new ArrayList<>();
    /**
     * Creates new form CadastroView
     */
    public CadastroView() {

        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tbl_Lista.getModel();
        tbl_Lista.setRowSorter(new TableRowSorter(modelo));
        txt_IdEdita.setEnabled(false);
        txt_NomeEdita.setEnabled(false);
        txt_TipoEdita.setEnabled(false);
        txt_EstoqueEdita.setEnabled(false);
        txt_ValorEdita.setEnabled(false);
        btn_Deletar.setEnabled(false);
        btn_Confimar.setEnabled(false);

        Citem.lerLista(tbl_Lista);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Lista = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_Pesquisa = new javax.swing.JButton();
        txt_Pesquisa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txt_IdEdita = new javax.swing.JTextField();
        lbl_NomeEdita = new javax.swing.JLabel();
        txt_TipoEdita = new javax.swing.JTextField();
        lbl_TipoEdita = new javax.swing.JLabel();
        txt_EstoqueEdita = new javax.swing.JTextField();
        lbl_EstoqueEdita = new javax.swing.JLabel();
        lbl_ValorEdita = new javax.swing.JLabel();
        txt_ValorEdita = new javax.swing.JTextField();
        btn_Alterar = new javax.swing.JButton();
        btn_Confimar = new javax.swing.JButton();
        txt_NomeEdita = new javax.swing.JTextField();
        lbl_IdEdita = new javax.swing.JLabel();
        combo_Tipos = new javax.swing.JComboBox();
        btn_Deletar = new javax.swing.JButton();
        btn_CancelarAlteração = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_Nome = new javax.swing.JTextField();
        lbl_Nome = new javax.swing.JLabel();
        txt_Tipo = new javax.swing.JTextField();
        lbl_Tipo = new javax.swing.JLabel();
        txt_Estoque = new javax.swing.JTextField();
        lbl_Estoque = new javax.swing.JLabel();
        lbl_Valor = new javax.swing.JLabel();
        txt_Valor = new javax.swing.JTextField();
        btn_Salvar = new javax.swing.JButton();
        btn_CancelarCadastro = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_RefreschCadastro = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tbl_Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tipo", "Estoque", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Lista);

        btn_Pesquisa.setText("Pequisar");
        btn_Pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisaActionPerformed(evt);
            }
        });

        txt_IdEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdEditaActionPerformed(evt);
            }
        });

        lbl_NomeEdita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NomeEdita.setText("Nome:");

        txt_TipoEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TipoEditaActionPerformed(evt);
            }
        });

        lbl_TipoEdita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TipoEdita.setText("Tipo:");

        txt_EstoqueEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EstoqueEditaActionPerformed(evt);
            }
        });

        lbl_EstoqueEdita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_EstoqueEdita.setText("Estoque:");

        lbl_ValorEdita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_ValorEdita.setText("Valor:");

        txt_ValorEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorEditaActionPerformed(evt);
            }
        });

        btn_Alterar.setText("Alterar");
        btn_Alterar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_Alterar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarActionPerformed(evt);
            }
        });

        btn_Confimar.setText("Confirmar");
        btn_Confimar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_Confimar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Confimar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfimarActionPerformed(evt);
            }
        });

        txt_NomeEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeEditaActionPerformed(evt);
            }
        });

        lbl_IdEdita.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_IdEdita.setText("ID");

        combo_Tipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Listar", "Nome", "Tipo", "Estoque Zerado", "Estoque Positivo", "Estoque Negativo" }));
        combo_Tipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_TiposActionPerformed(evt);
            }
        });

        btn_Deletar.setText("Deletar");
        btn_Deletar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_Deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarActionPerformed(evt);
            }
        });

        btn_CancelarAlteração.setText("Cancelar");
        btn_CancelarAlteração.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_CancelarAlteração.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_CancelarAlteração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarAlteraçãoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_TipoEdita)
                            .addComponent(lbl_ValorEdita)
                            .addComponent(lbl_EstoqueEdita)
                            .addComponent(lbl_NomeEdita)
                            .addComponent(lbl_IdEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TipoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ValorEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_EstoqueEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NomeEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_IdEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_CancelarAlteração, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_Confimar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(combo_Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(combo_Tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_IdEdita)
                    .addComponent(txt_IdEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NomeEdita)
                    .addComponent(txt_NomeEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TipoEdita)
                    .addComponent(txt_TipoEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_EstoqueEdita)
                    .addComponent(txt_EstoqueEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ValorEdita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ValorEdita, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CancelarAlteração, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Confimar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Pesquisa)
                        .addGap(31, 31, 31)
                        .addComponent(txt_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txt_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomeActionPerformed(evt);
            }
        });

        lbl_Nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Nome.setText("Nome:");

        txt_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TipoActionPerformed(evt);
            }
        });

        lbl_Tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Tipo.setText("Tipo:");

        txt_Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EstoqueActionPerformed(evt);
            }
        });

        lbl_Estoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Estoque.setText("Estoque:");

        lbl_Valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Valor.setText("Valor:");

        txt_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorActionPerformed(evt);
            }
        });

        btn_Salvar.setText("Salvar");
        btn_Salvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_Salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalvarActionPerformed(evt);
            }
        });

        btn_CancelarCadastro.setText("Cancelar");
        btn_CancelarCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_CancelarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_CancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Tipo)
                            .addComponent(lbl_Estoque)
                            .addComponent(lbl_Nome)
                            .addComponent(lbl_Valor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btn_CancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Nome)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Tipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Estoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Valor)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Cadastro e Pesquisa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_RefreschCadastro.setText("Refresh");
        btn_RefreschCadastro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btn_RefreschCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_RefreschCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreschCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_RefreschCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(btn_RefreschCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeActionPerformed

    private void txt_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorActionPerformed

    private void txt_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EstoqueActionPerformed

    private void txt_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TipoActionPerformed

    private void btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalvarActionPerformed
        Citem.cadastrar(txt_Nome.getText(), txt_Tipo.getText(), txt_Estoque.getText(), txt_Valor.getText());

        txt_Nome.setText("");
        txt_Tipo.setText("");
        txt_Estoque.setText("");
        txt_Valor.setText("");
        Citem.lerLista(tbl_Lista);

        JOptionPane.showMessageDialog(rootPane, "Dados armazenados com sucesso");
    }//GEN-LAST:event_btn_SalvarActionPerformed

    private void btn_PesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisaActionPerformed
        selecao();
    }//GEN-LAST:event_btn_PesquisaActionPerformed

    private void combo_TiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_TiposActionPerformed
        btn_Pesquisa.setVisible(true);
        txt_Pesquisa.setText("");
    }//GEN-LAST:event_combo_TiposActionPerformed

    private void txt_IdEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdEditaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IdEditaActionPerformed

    private void txt_TipoEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TipoEditaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TipoEditaActionPerformed

    private void txt_EstoqueEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EstoqueEditaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EstoqueEditaActionPerformed

    private void txt_ValorEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorEditaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorEditaActionPerformed

    private void btn_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btn_AlterarActionPerformed

    private void btn_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarActionPerformed
//        ViewLogin login = new ViewLogin();
//        login.setVisible(true);
//        if(login.testalogin()){
        deletar();
        limparEdit();
        btn_Deletar.setEnabled(false);
        btn_Confimar.setEnabled(false);
//        }else{
//           JOptionPane.showMessageDialog(rootPane, "Sem Liberação Para Função !", "LIBERAÇÃO", JOptionPane.PLAIN_MESSAGE);
//        }
    }//GEN-LAST:event_btn_DeletarActionPerformed

    private void btn_ConfimarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfimarActionPerformed
        try {
            confirmarAlteracao();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparEdit();
    }//GEN-LAST:event_btn_ConfimarActionPerformed

    private void txt_NomeEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomeEditaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomeEditaActionPerformed

    private void btn_CancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarCadastroActionPerformed
        limparCadastro();
    }//GEN-LAST:event_btn_CancelarCadastroActionPerformed

    private void btn_CancelarAlteraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarAlteraçãoActionPerformed
        limparEdit();
    }//GEN-LAST:event_btn_CancelarAlteraçãoActionPerformed

    private void btn_RefreschCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreschCadastroActionPerformed
        Citem.lerLista(tbl_Lista);
    }//GEN-LAST:event_btn_RefreschCadastroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_CancelarAlteração;
    private javax.swing.JButton btn_CancelarCadastro;
    private javax.swing.JButton btn_Confimar;
    private javax.swing.JButton btn_Deletar;
    private javax.swing.JButton btn_Pesquisa;
    private javax.swing.JButton btn_RefreschCadastro;
    private javax.swing.JButton btn_Salvar;
    private javax.swing.JComboBox combo_Tipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Estoque;
    private javax.swing.JLabel lbl_EstoqueEdita;
    private javax.swing.JLabel lbl_IdEdita;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_NomeEdita;
    private javax.swing.JLabel lbl_Tipo;
    private javax.swing.JLabel lbl_TipoEdita;
    private javax.swing.JLabel lbl_Valor;
    private javax.swing.JLabel lbl_ValorEdita;
    private javax.swing.JTable tbl_Lista;
    private javax.swing.JTextField txt_Estoque;
    private javax.swing.JTextField txt_EstoqueEdita;
    private javax.swing.JTextField txt_IdEdita;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_NomeEdita;
    private javax.swing.JTextField txt_Pesquisa;
    private javax.swing.JTextField txt_Tipo;
    private javax.swing.JTextField txt_TipoEdita;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_ValorEdita;
    // End of variables declaration//GEN-END:variables

    public void limparCadastro() {
        txt_Nome.setText("");
        txt_Tipo.setText("");
        txt_Valor.setText("");
        txt_Estoque.setText("");
    }

    public void limparEdit() {
        txt_IdEdita.setText("");
        txt_NomeEdita.setText("");
        txt_TipoEdita.setText("");
        txt_EstoqueEdita.setText("");
        txt_ValorEdita.setText("");
        txt_IdEdita.setEnabled(false);
        txt_NomeEdita.setEnabled(false);
        txt_TipoEdita.setEnabled(false);
        txt_EstoqueEdita.setEnabled(false);
        txt_ValorEdita.setEnabled(false);
        btn_Confimar.setEnabled(false);
        btn_Deletar.setEnabled(false);
    }

    public void selecao() {

//////////////////////////////////////////////////////////////////////////////////////        
        //Seleciona Metodo ler Lista e listar na tabela
        if (combo_Tipos.getSelectedItem() == "Listar") {
            Citem.lerLista(tbl_Lista);
            System.out.println("seleção listar");

        }
//////////////////////////////////////////////////////////////////////////////////////
        //Seleciona Metodo Procurar por Nome
        if (combo_Tipos.getSelectedItem() == "Nome") {
            Citem.ListarPorNome(tbl_Lista, txt_Pesquisa);

        }
///////////////////////////////////////////////////////////////////////////////////////  
        //Seleciona Metodo Procurar por Tipo
        if (combo_Tipos.getSelectedItem() == "Tipo") {
            Citem.ListarPorTipo(tbl_Lista, txt_Pesquisa);
            System.out.println("entrou  " + combo_Tipos.getSelectedItem());
        }
        //Seleciona Metodo Procurar por Estoque Zerado
        if (combo_Tipos.getSelectedItem() == "Estoque Zerado") {
            Citem.ListarPorEstoqueZerado(tbl_Lista, txt_Pesquisa);

        }
        //Seleciona Metodo Procurar por Estoque Positivo
        if (combo_Tipos.getSelectedItem() == "Estoque Positivo") {
            Citem.ListarPorEstoquePositivo(tbl_Lista, txt_Pesquisa);

        }
        //Seleciona Metodo Procurar por Estoque Negativo
        if (combo_Tipos.getSelectedItem() == "Estoque Negativo") {
            Citem.ListarPorEstoqueNegativo(tbl_Lista, txt_Pesquisa);

        }

        txt_IdEdita.setEnabled(false);
        txt_TipoEdita.setEnabled(false);
        txt_EstoqueEdita.setEnabled(false);
        txt_ValorEdita.setEnabled(false);
    }

    public void alterar() {
        int row = tbl_Lista.getSelectedRow();

        if (row != -1) {

            txt_IdEdita.setEnabled(true);
            txt_IdEdita.setEditable(false);
            txt_NomeEdita.setEnabled(true);
            txt_TipoEdita.setEnabled(true);
            txt_EstoqueEdita.setEnabled(true);
            txt_ValorEdita.setEnabled(true);

            txt_IdEdita.setText((String) tbl_Lista.getValueAt(row, 0).toString());
            txt_NomeEdita.setText((String) tbl_Lista.getValueAt(row, 1));
            txt_TipoEdita.setText((String) tbl_Lista.getValueAt(row, 2));
            txt_EstoqueEdita.setText((String) tbl_Lista.getValueAt(row, 3).toString());
            txt_ValorEdita.setText((String) tbl_Lista.getValueAt(row, 4).toString());

            btn_Confimar.setEnabled(true);
            btn_Deletar.setEnabled(true);

        }

    }

    public void deletar() {

        int row = tbl_Lista.getSelectedRow();

        if (row != -1) {

            Item item = new Item();

            item.setId((int) tbl_Lista.getValueAt(tbl_Lista.getSelectedRow(), 0));

            ItemDao.deletarItem(item);
            Citem.lerLista(tbl_Lista);

            JOptionPane.showMessageDialog(rootPane, "Produto deletado com sucesso !", "Sucesso", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void confirmarAlteracao() throws SQLException {
        int row = tbl_Lista.getSelectedRow();

        if (row != -1) {
            Item item = new Item();

            item.setId(Integer.parseInt(txt_IdEdita.getText()));
            item.setNome(txt_NomeEdita.getText());
            item.setTipo(txt_TipoEdita.getText());
            item.setEstoque(Integer.parseInt(txt_EstoqueEdita.getText()));
            item.setValor(Double.parseDouble(txt_ValorEdita.getText()));
            ItemDao.alterarItem(item);
            Citem.lerLista(tbl_Lista);

            JOptionPane.showMessageDialog(rootPane,
                    "Item alterado com sucesso !",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}