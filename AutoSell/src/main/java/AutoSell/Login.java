/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.AutoSell;

import AutoSell.Clientes.Cliente;
import AutoSell.DadosAplicacao;
import AutoSell.Eventos.Evento;
import AutoSell.Filiais.Filial;
import AutoSell.Pecas.Peca;
import AutoSell.Sede.Sede;
import AutoSell.Transacoes.Transacao;
import AutoSell.Utilizadores.Utilizador;
import AutoSell.Veiculos.Veiculo;
import main.java.AutoSell.MenuPrincipal;

import javax.swing.*;

/**
 *
 * @author rodri
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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
        label1 = new java.awt.Label();
        btnLogin = new javax.swing.JButton();
        textFieldUsername = new java.awt.TextField();
        textFieldPassword = new java.awt.TextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 187, 187));

        label1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        label1.setText("AutoSell");

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setName("btn_veiculos"); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        label2.setText("Password:");

        label3.setText("Username:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(textFieldUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fechar(){
        setVisible(false);
    }

    public void throwMessageError(String message)
    {
        JOptionPane.showMessageDialog(jPanel1, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = textFieldUsername.getText();
        String password = textFieldPassword.getText();

        if(username.length()<=0)
        {
            throwMessageError("O Username tem que estar preenchido");
        }
        else
        {
            if(password.length()<=0)
            {
                throwMessageError("A password tem que estar preenchida");
            }
            else
            {
                Utilizador utilizador = DadosAplicacao.INSTANCE.getUtilizador(username);
                if(utilizador == null)
                {
                    throwMessageError("o utilizador não existe");
                }
                else
                {
                    if(!utilizador.getPassword().equals(password))
                    {
                        throwMessageError("Os dados de acesso estão incorretos");
                    }
                    else
                    {
                        MenuPrincipal janela = new MenuPrincipal();
                        janela.setVisible(true);
                        fechar();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Cliente cliente1 = new Cliente("Tomás Neves","9669999999","2201747@my.ipleiria.pt","9999999990","R.Louriçal","3105-170 Louriçal");
        Cliente cliente2 = new Cliente("David Marques","9669555555","2201748@my.ipleiria.pt","153757701","R.Matas","3050-200 Matas");
        Cliente cliente3 = new Cliente("Rodrigo Domingues","966966666","2191173@my.ipleiria.pt","259376566","R.Leiria","3100-100 Leiria");
        Cliente cliente4 = new Cliente("Toze Menuel","966343456","email@gmail.com","280043910","R.Comibra","2500-200 Coimbra");
        Cliente cliente5 = new Cliente("Henrique Ferreira","966243267","teste@gemial.com","276517962","R.Lisboa","4100-150 Lisboa");

        Sede sede = new Sede("AutoSell","911111111","autoSell@gmail.com","R.Sell","3400-140 Pombal","Joaquim António");
        Utilizador sedeUser = new Utilizador("sede", "123", "SEDE");
        Filial filial1 = new Filial("Auto Pombal","964444444","autoPombal@gmail.com","R.Pombal","3400-140 Pombal","Manuel António");
        Utilizador utilizador1 = new Utilizador("filial1", "123", "FILIAL");
        Filial filial2 = new Filial("Auto Figueira","967575758","autoFigueira@gmail.com","R.Figueira","3759-042 Figueira","José Manuel");
        Utilizador utilizador2 = new Utilizador("filial2", "123", "FILIAL");
        Filial filial3 = new Filial("Auto Leiria","965050504","autoLeiria@gmail.com","R.Leiria","2400-213 Leiria","Gabriel Ferreira");
        Utilizador utilizador3 = new Utilizador("filial3", "123", "FILIAL");
        Filial filial4 = new Filial("Auto Algarve","961234567","autoAlgarve@gmail.com","R.Algarve","3008-430 Algarve","João Fernandes");
        Utilizador utilizador4 = new Utilizador("filial4", "123", "FILIAL");
        Filial filial5 = new Filial("Auto Viseu","912345678","autoViseu@gmail.com","R.Viseu","2500-115 Viseu","Tiago Alexandre");
        Utilizador utilizador5 = new Utilizador("filial5", "123", "FILIAL");

        Veiculo veiculo1 = new Veiculo("10-ZE-20","Golf","Volkswagen","José Manuel",2,"Gasóleo",false,"");
        Veiculo veiculo2 = new Veiculo("25-XX-10","Caddy","Volkswagen","José António",1,"Gasolina",false,"");
        Veiculo veiculo3 = new Veiculo("00-AA-00","Ibiza","Seat","Manuel António",5,"Gasóleo",true,"");
        Veiculo veiculo4 = new Veiculo("50-ZE-99","Clio","Renault","João Pedro",3,"Gasolina",false,"");
        Veiculo veiculo5 = new Veiculo("60-ZA-42","80","Audi","Tiago Manuel",3,"Gasóleo",false,"");

        Peca peca1 = new Peca("Volante","123456789","Bosch",2,"Sede",veiculo1.marca+"/"+veiculo1.modelo);
        Peca peca2 = new Peca("Acelarador","111111111","3M",6,filial1.nome,veiculo2.marca+"/"+veiculo2.modelo);
        Peca peca3 = new Peca("Colunas ","112222222","JVC",10,filial2.nome,veiculo3.marca+"/"+veiculo3.modelo);
        Peca peca4 = new Peca("Puxador ","232521597","Renault",5,"Sede",veiculo4.marca+"/"+veiculo4.modelo);
        Peca peca5 = new Peca("Jante ","847569697","BBS",4,filial5.nome,veiculo5.marca+"/"+veiculo5.modelo);

        Transacao transacao1 = new Transacao(20000, "2022/06/27", "compra");
        Transacao transacao2 = new Transacao(30000, "2022/06/26", "venda");
        Transacao transacao3 = new Transacao(40000, "2022/06/25", "compra");

        Evento evento1 = new Evento("Feira de Leiria", "2022/05/27", "2022/05/28", false, "Leira", "Finalizado");

        evento1.addVeiculo(veiculo1);
        evento1.addVeiculo(veiculo2);

        Evento evento2 = new Evento("Feira de Coimbra", "2022/05/30", "2022/08/28", false, "Coimbra", "Pendente");

        evento2.addVeiculo(veiculo1);
        evento2.addVeiculo(veiculo2);

        DadosAplicacao.INSTANCE.adicionarCliente(cliente1);
        DadosAplicacao.INSTANCE.adicionarCliente(cliente2);
        DadosAplicacao.INSTANCE.adicionarCliente(cliente3);
        DadosAplicacao.INSTANCE.adicionarCliente(cliente4);
        DadosAplicacao.INSTANCE.adicionarCliente(cliente5);

        DadosAplicacao.INSTANCE.adicionarSede(sede);

        DadosAplicacao.INSTANCE.adicionarUtilizador(sedeUser);
        DadosAplicacao.INSTANCE.adicionarUtilizador(utilizador1);
        DadosAplicacao.INSTANCE.adicionarUtilizador(utilizador2);
        DadosAplicacao.INSTANCE.adicionarUtilizador(utilizador3);
        DadosAplicacao.INSTANCE.adicionarUtilizador(utilizador4);
        DadosAplicacao.INSTANCE.adicionarUtilizador(utilizador5);

        DadosAplicacao.INSTANCE.adicionarFilial(filial1);
        DadosAplicacao.INSTANCE.adicionarFilial(filial2);
        DadosAplicacao.INSTANCE.adicionarFilial(filial3);
        DadosAplicacao.INSTANCE.adicionarFilial(filial4);
        DadosAplicacao.INSTANCE.adicionarFilial(filial5);

        DadosAplicacao.INSTANCE.adicionarVeiculo(veiculo1);
        DadosAplicacao.INSTANCE.adicionarVeiculo(veiculo2);
        DadosAplicacao.INSTANCE.adicionarVeiculo(veiculo3);
        DadosAplicacao.INSTANCE.adicionarVeiculo(veiculo4);
        DadosAplicacao.INSTANCE.adicionarVeiculo(veiculo5);

        DadosAplicacao.INSTANCE.adicionarPeca(peca1);
        DadosAplicacao.INSTANCE.adicionarPeca(peca2);
        DadosAplicacao.INSTANCE.adicionarPeca(peca3);
        DadosAplicacao.INSTANCE.adicionarPeca(peca4);
        DadosAplicacao.INSTANCE.adicionarPeca(peca5);

        DadosAplicacao.INSTANCE.adicionarTransacao(transacao1);
        DadosAplicacao.INSTANCE.adicionarTransacao(transacao2);
        DadosAplicacao.INSTANCE.adicionarTransacao(transacao3);

        DadosAplicacao.INSTANCE.adicionarEvento(evento1);
        DadosAplicacao.INSTANCE.adicionarEvento(evento2);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.TextField textFieldPassword;
    private java.awt.TextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
