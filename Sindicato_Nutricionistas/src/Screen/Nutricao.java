package Screen;

import java.util.List;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Nutricao extends javax.swing.JFrame {

    public Nutricao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txHora = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txps = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txpd = new javax.swing.JTextField();
        boxStress = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Saúde de Pacientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setLabelFor(txNome);
        jLabel1.setText("Nome");

        txNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txNome.setToolTipText("Insira seu nome");
        txNome.setNextFocusableComponent(txData);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setLabelFor(txData);
        jLabel2.setText("Data");
        jLabel2.setToolTipText("");

        txData.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txData.setToolTipText("Insira a data");
        txData.setNextFocusableComponent(txHora);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setLabelFor(txHora);
        jLabel3.setText("Hora");

        txHora.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txHora.setToolTipText("Insira a hora");
        txHora.setNextFocusableComponent(txps);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setLabelFor(txps);
        jLabel4.setText("Pressão Sistólica");

        txps.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txps.setToolTipText("insira a Pressão SIstólica");
        txps.setNextFocusableComponent(txpd);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setLabelFor(txpd);
        jLabel5.setText("Pressão Diastólica");

        txpd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txpd.setToolTipText("Insira a pressão diastólica");
        txpd.setNextFocusableComponent(boxStress);

        boxStress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        boxStress.setText("Está estressado?");
        boxStress.setToolTipText("Marque se está estressado");

        jScrollPane1.setToolTipText("Tabela de pacientes");
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        tblPaciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data", "Hora", "P. Sistólica", "P.Diastólica", "Estressado?"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPaciente.setToolTipText("Tabela dos dados");
        tblPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPaciente.setRowHeight(30);
        jScrollPane1.setViewportView(tblPaciente);
        tblPaciente.getAccessibleContext().setAccessibleName("Tabela de Pacientes");
        tblPaciente.getAccessibleContext().setAccessibleDescription("Tabela com todos os dados dos pacientes");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salve em um arquivo os dados");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("Clique para atualizar a tabela");
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boxStress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txpd, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(txps))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txHora, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                            .addComponent(txData))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txNome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txHora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txps, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txpd)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxStress)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );

        txNome.getAccessibleContext().setAccessibleName("Nome");
        txNome.getAccessibleContext().setAccessibleDescription("Input para colocar o nome");
        txData.getAccessibleContext().setAccessibleName("Data");
        txData.getAccessibleContext().setAccessibleDescription("Input para colocar a data");
        txHora.getAccessibleContext().setAccessibleName("Hora");
        txHora.getAccessibleContext().setAccessibleDescription("Input da hora");
        txps.getAccessibleContext().setAccessibleName("Pressão Sistólica");
        txpd.getAccessibleContext().setAccessibleName("Pressão Diastólica");
        txpd.getAccessibleContext().setAccessibleDescription("input da pressão diastólica");
        boxStress.getAccessibleContext().setAccessibleDescription("checkbox para saber do estresse");
        jScrollPane1.getAccessibleContext().setAccessibleName("Tabela de pacientes");
        jScrollPane1.getAccessibleContext().setAccessibleDescription("Tabela com todos os dados preenchidos dos pacientes");
        btnSalvar.getAccessibleContext().setAccessibleDescription("Salve os dados em um arquivo");
        btnAtualizar.getAccessibleContext().setAccessibleDescription("Atualiza a tabela atual");

        jMenu1.setText("MENU");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setText("Salvar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("Atualizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenu2.setText("Preencher");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem4.setText("Nome");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setText("Data");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setText("Hora");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setText("Pressão Sistólica");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setText("Pressão Diastólica");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem9.setText("Estressado?");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("Insira os dados da sua pressão para levar a sua consulta");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(!regex()){
           String[] options = { "Texto", "Planilha" };
        
            int deletar = JOptionPane.showOptionDialog(rootPane,
                "Qual o tipo de arquivo você gostaria de salvar?",
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null,
                options, options[0]);
            if(deletar == 0){
                setTxt();
            }else{
                try {
                    setCsv();
                } catch (IOException ex) {
                    Logger.getLogger(Nutricao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            limpaInputs();
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        String[] options = { "Texto", "Planilha" };
        
        int deletar = JOptionPane.showOptionDialog(rootPane,
                "Qual o tipo de arquivo você gostaria de colocar na tabela?",
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, 
                null,
                options, options[0]);
            if(deletar == 0){
                getTxt();
            }else{
                getCsv();
            }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        txNome.requestFocus();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        txData.requestFocus();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        txHora.requestFocus();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        txps.requestFocus();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        txpd.requestFocus();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        if(boxStress.isSelected()){
           boxStress.setSelected(false); 
        }else{
           boxStress.setSelected(true); 
        }
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Nutricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxStress;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPaciente;
    private javax.swing.JTextField txData;
    private javax.swing.JTextField txHora;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txpd;
    private javax.swing.JTextField txps;
    // End of variables declaration//GEN-END:variables
    private final String[] columns = {"Nome","Data","Hora",
        "Pressão Sistólica","Pressão Diastólica","estressado?"};
    
    DefaultTableModel table = new DefaultTableModel(columns,0);
    
    private void getLista(String nome,String data,String hora,
        String ps,String pd, String stress){
            
        String[] row = {nome, data, hora, ps, pd, stress};

        table.addRow(row);
        tblPaciente.setModel(table);
    }
    
    private void getTxt(){
        try{
            String arquivo = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:");
            ArrayList<String> lista = new ArrayList<>();
            
            File obj = new File("E://Senac_UNIP//"
            + "Desenvolver e organizar interface gráfica para aplicações desktop//"
            + "testes//"+arquivo+".txt");
            
            Scanner Reader = new Scanner(obj);
            for (int i = 0; Reader.hasNextLine(); i++) {
                String data = Reader.nextLine();
                lista.add(data.substring(data.indexOf(":") + 2));
            }
            getLista(lista.get(0), lista.get(1), lista.get(2),
                lista.get(3),lista.get(4), lista.get(5));
            
            Reader.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Ocorreu algum erro.");
        }
    }
    
    private void getCsv(){
        try{
            String arquivo = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:");
            List<List<String>> data = new ArrayList<>();
            
            String file = "E://Senac_UNIP//"
                + "Desenvolver e organizar interface gráfica para aplicações desktop//"
                + "testes//matheus.csv";
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String row = br.readLine();
            while(row != null){
                List<String> rowData = Arrays.asList(row.split(";"));
                data.add(rowData);
                row = br.readLine();
            }
            
            getLista(data.get(1).get(0),data.get(1).get(1),data.get(1).get(2),
                data.get(1).get(3),data.get(1).get(4),data.get(1).get(5));
            br.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    private void setCsv() throws IOException{
        String arquivo = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:");
        
        FileWriter csv = new FileWriter("E://Senac_UNIP//"
            + "Desenvolver e organizar interface gráfica para aplicações desktop//"
            + "testes//"+arquivo+".csv");
        
        csv.append("Nome");
        csv.append(";");
        csv.append("Data");
        csv.append(";");
        csv.append("Hora");
        csv.append(";");
        csv.append("Pressao Sistolica");
        csv.append(";");
        csv.append("Pressao Diastolica");
        csv.append(";");
        csv.append("Estressado?");
        csv.append("\n");
        
        List<List<String>> rows = Arrays.asList(
        Arrays.asList(txNome.getText(),txData.getText(),txHora.getText(),
            txps.getText(),txpd.getText(),getStress())
        );
        
        for (java.util.List<String> rowData : rows) {
            csv.append(String.join(";", rowData));
            csv.append("\n");
        }
        csv.flush();
        csv.close();
    }
    
    private void setTxt(){
        String arquivo = JOptionPane.showInputDialog(null, "Digite o nome do arquivo:");
        
        System.out.println("Escolha um nome para o arquivo");
        try{
            FileWriter writer = new FileWriter("E://Senac_UNIP//"
                  + "Desenvolver e organizar interface gráfica para aplicações desktop//"
                  + "testes//"+ arquivo + ".txt");

            writer.write("Nome: " + txNome.getText()
                + "\nData: " + txData.getText() 
                + "\nHora: "+ txHora.getText()
                + "\nPressão Sistolica: " + txps.getText()
                +"\nPressão Diastolica: " + txpd.getText()
                +"\nEsta estressado?: " + getStress());
            
            writer.close();
            System.out.println("Salvo");
        }catch(IOException e){
            System.out.println("Ocorreu algum erro");
        }
    }
    
    
    
    private boolean regex(){
        String nome = txNome.getText();
        String data = txData.getText();
        String hora = txHora.getText();
        String ps = txps.getText();
        String pd = txpd.getText();
        
        boolean empty = true;
        if(nome.trim().isEmpty() && data.trim().isEmpty() && 
        hora.trim().isEmpty() && ps.trim().isEmpty() && pd.trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane,"Não deixe os campos vazios");
        }else{
            boolean rNome = nome.matches("[a-zA-Z\s]{1,50}");
            boolean rData = data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{2,4}");
            boolean rHora = hora.matches("[0-9]{1,2}[:][0-9]{2}");
            boolean rPs = ps.matches("[0-9]{2,3}");
            boolean rPd = pd.matches("[0-9]{2,3}");
            
            if(rNome == false){
                JOptionPane.showMessageDialog(rootPane,"Nome Incorreto");
            }else if(rData == false){
                JOptionPane.showMessageDialog(rootPane,"Data Incorreta, XX/XX/XXXX");
            }else if(rHora == false){
                JOptionPane.showMessageDialog(rootPane,"Hora Incorreta, XX:XX");
            }else if(rPs == false){
                JOptionPane.showMessageDialog(rootPane,"Pressão Sistólica Incorreta,XX ou XXX");
            }else if(rPd == false){
                JOptionPane.showMessageDialog(rootPane,"Pressão Diastólica Incorreta,XX ou XXX");
            }else{
                empty = false;
            }
        }
        return empty;
    }
    
    private void limpaInputs(){
        txNome.setText("");
        txData.setText("");
        txHora.setText("");
        txps.setText("");
        txpd.setText("");
        boxStress.setSelected(false);

        txNome.requestFocus();
    }
    
    private String getStress(){
        String stress;
        if(boxStress.isSelected()){
            stress = "sim";
        }else{
            stress = "não";
        }
        return stress;
    }
}
