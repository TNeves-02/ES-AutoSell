/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.AutoSell.Eventos;

import main.java.AutoSell.Eventos.AdicionarEvento;
import main.java.AutoSell.Eventos.EditarEvento;
import main.java.AutoSell.Eventos.CancelarEvento;
import main.java.AutoSell.Eventos.HistoricoEvento;

/**
 *
 * @author rodri
 */
public class Menu_Eventos extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Eventos
     */
    public Menu_Eventos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltarMenu = new javax.swing.JButton();
        btnRegistarEvento = new javax.swing.JButton();
        btnAlterarEvento = new javax.swing.JButton();
        btnCancelarEvento = new javax.swing.JButton();
        btnHistoricoEvento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestão Eventos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        btnVoltarMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnVoltarMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarMenu.setText("Voltar ao Menu Principal");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        btnRegistarEvento.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistarEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegistarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistarEvento.setText("<html>Registar<br>Evento</html>");
        btnRegistarEvento.setToolTipText("");
        btnRegistarEvento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarEventobtnEstatisticaMarcaActionPerformed(evt);
            }
        });

        btnAlterarEvento.setBackground(new java.awt.Color(0, 0, 0));
        btnAlterarEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAlterarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarEvento.setText("<html>Alterar<br>Dados<br>de Evento</html>");
        btnAlterarEvento.setToolTipText("");
        btnAlterarEvento.setMaximumSize(new java.awt.Dimension(2147483647, 90));
        btnAlterarEvento.setMinimumSize(new java.awt.Dimension(134, 90));
        btnAlterarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarEventoActionPerformed(evt);
            }
        });

        btnCancelarEvento.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCancelarEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEvento.setText("<html>Cancelar<br>Evento</html>");
        btnCancelarEvento.setToolTipText("");
        btnCancelarEvento.setMaximumSize(new java.awt.Dimension(2147483647, 90));
        btnCancelarEvento.setMinimumSize(new java.awt.Dimension(134, 90));
        btnCancelarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEventoActionPerformed(evt);
            }
        });

        btnHistoricoEvento.setBackground(new java.awt.Color(0, 0, 0));
        btnHistoricoEvento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHistoricoEvento.setForeground(new java.awt.Color(255, 255, 255));
        btnHistoricoEvento.setText("<html>Histórico<br>de Eventos</html>");
        btnHistoricoEvento.setToolTipText("");
        btnHistoricoEvento.setMaximumSize(new java.awt.Dimension(2147483647, 90));
        btnHistoricoEvento.setMinimumSize(new java.awt.Dimension(134, 90));
        btnHistoricoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegistarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAlterarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnHistoricoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(btnAlterarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistoricoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fechar(){
        setVisible(false);
        dispose();
    }
    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        fechar();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnRegistarEventobtnEstatisticaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarEventobtnEstatisticaMarcaActionPerformed
        AdicionarEvento janela = new AdicionarEvento();
        janela.setVisible(true);
    }//GEN-LAST:event_btnRegistarEventobtnEstatisticaMarcaActionPerformed

    private void btnAlterarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarEventoActionPerformed
        EditarEvento janela = new EditarEvento();
        janela.setVisible(true);
    }//GEN-LAST:event_btnAlterarEventoActionPerformed

    private void btnCancelarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEventoActionPerformed
        CancelarEvento janela = new CancelarEvento();
        janela.setVisible(true);
    }//GEN-LAST:event_btnCancelarEventoActionPerformed

    private void btnHistoricoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoEventoActionPerformed
        HistoricoEvento janela = new HistoricoEvento();
        janela.setVisible(true);
    }//GEN-LAST:event_btnHistoricoEventoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Eventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarEvento;
    private javax.swing.JButton btnCancelarEvento;
    private javax.swing.JButton btnHistoricoEvento;
    private javax.swing.JButton btnRegistarEvento;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
