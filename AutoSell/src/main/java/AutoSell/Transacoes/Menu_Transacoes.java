/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.AutoSell.Transacoes;

import main.java.AutoSell.Transacoes.AdicionarCompra;
import main.java.AutoSell.Transacoes.AdicionarVenda;
import main.java.AutoSell.Transacoes.HistoricoTransacoes;
/**
 *
 * @author rodri
 */
public class Menu_Transacoes extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Transacoes
     */
    public Menu_Transacoes() {
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
        btnAdicionarCompra = new javax.swing.JButton();
        btnAdicionarVenda = new javax.swing.JButton();
        btnHistoricoTransacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestão Transações");
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

        btnAdicionarCompra.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionarCompra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdicionarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarCompra.setText("<html>Inserir<br>Compra de<br>Veiculo</html>");
        btnAdicionarCompra.setToolTipText("");
        btnAdicionarCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdicionarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarComprabtnEstatisticaMarcaActionPerformed(evt);
            }
        });

        btnAdicionarVenda.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionarVenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdicionarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarVenda.setText("<html>Inserir<br>Venda de<br>Veiculo</html>");
        btnAdicionarVenda.setToolTipText("");
        btnAdicionarVenda.setMaximumSize(new java.awt.Dimension(2147483647, 90));
        btnAdicionarVenda.setMinimumSize(new java.awt.Dimension(134, 90));
        btnAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVendaActionPerformed(evt);
            }
        });

        btnHistoricoTransacoes.setBackground(new java.awt.Color(0, 0, 0));
        btnHistoricoTransacoes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHistoricoTransacoes.setForeground(new java.awt.Color(255, 255, 255));
        btnHistoricoTransacoes.setText("<html>Historico<br>de Transações</html>");
        btnHistoricoTransacoes.setToolTipText("");
        btnHistoricoTransacoes.setMaximumSize(new java.awt.Dimension(2147483647, 90));
        btnHistoricoTransacoes.setMinimumSize(new java.awt.Dimension(134, 90));
        btnHistoricoTransacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoTransacoesActionPerformed(evt);
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
                            .addComponent(btnAdicionarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAdicionarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnHistoricoTransacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(btnHistoricoTransacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAdicionarComprabtnEstatisticaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarComprabtnEstatisticaMarcaActionPerformed
        AdicionarCompra janela = new AdicionarCompra();
        janela.setVisible(true);
    }//GEN-LAST:event_btnAdicionarComprabtnEstatisticaMarcaActionPerformed

    private void btnAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVendaActionPerformed
        AdicionarVenda janela = new AdicionarVenda();
        janela.setVisible(true);
    }//GEN-LAST:event_btnAdicionarVendaActionPerformed

    private void btnHistoricoTransacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoTransacoesActionPerformed
        HistoricoTransacoes janela = new HistoricoTransacoes();
        janela.setVisible(true);
    }//GEN-LAST:event_btnHistoricoTransacoesActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCompra;
    private javax.swing.JButton btnAdicionarVenda;
    private javax.swing.JButton btnHistoricoTransacoes;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
