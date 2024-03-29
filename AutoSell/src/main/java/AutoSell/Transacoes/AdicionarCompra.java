/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.AutoSell.Transacoes;

import AutoSell.DadosAplicacao;
import AutoSell.Transacoes.Transacao;
import main.java.AutoSell.Veiculos.RegistarVeiculo;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class AdicionarCompra extends javax.swing.JFrame {
    Boolean veiculoRegistado = false;
    /**
     * Creates new form AdicionarCompra
     */
    public AdicionarCompra() {
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

        painelRegistarCompra = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        btnRegistar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JTextField();
        btnRegistarVeculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registar Compra");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(141, 141, 141));

        btnFechar.setBackground(new java.awt.Color(0, 0, 0));
        btnFechar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnRegistar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistar.setText("Registar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor da Compra:");

        btnRegistarVeculo.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistarVeculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistarVeculo.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistarVeculo.setText("Registar Veiculo");
        btnRegistarVeculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarVeculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistarVeculo, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnRegistarVeculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelRegistarCompraLayout = new javax.swing.GroupLayout(painelRegistarCompra);
        painelRegistarCompra.setLayout(painelRegistarCompraLayout);
        painelRegistarCompraLayout.setHorizontalGroup(
            painelRegistarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRegistarCompraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelRegistarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        painelRegistarCompraLayout.setVerticalGroup(
            painelRegistarCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRegistarCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRegistarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelRegistarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fechar(){
        setVisible(false);
        dispose();
    }
    public void throwMessageError(String message)
    {
        JOptionPane.showMessageDialog(painelRegistarCompra, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        fechar();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        if(!veiculoRegistado)
        {
            throwMessageError("Necessita de Registar Veiculo");
        }
        else
        {
            if(txtValorCompra.getText().length()<=0)
            {
                throwMessageError("Necessita de inserir o valor da compra");
            }
            else
            {
                int valorCompra = Integer.parseInt(txtValorCompra.getText());

                if(valorCompra < 0)
                {
                    throwMessageError("O valor de compra tem que ser superior ou igual a 0");
                }
                else
                {
                    String dataAtual = obterDataAtual();
                    Transacao transacao = new Transacao(valorCompra, dataAtual, "compra");
                    boolean inseridoComSucesso = DadosAplicacao.INSTANCE.adicionarTransacao(transacao);
                    if(!inseridoComSucesso)
                    {
                        throwMessageError("Ocorreu um erro inesperado");
                    }
                    else
                    {
                        fechar();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnRegistarActionPerformed

    private String obterDataAtual() {
        return new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
    }

    private void btnRegistarVeculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarVeculoActionPerformed
        RegistarVeiculo registarVeiculo = new RegistarVeiculo();
        registarVeiculo.setVisible(true);
        veiculoRegistado = true;
    }//GEN-LAST:event_btnRegistarVeculoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnRegistarVeculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painelRegistarCompra;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
