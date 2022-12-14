/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school.sptech.api.looca;

import javax.swing.JOptionPane;

public class InterfaceLogin extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceLoginAPI
     */
    public InterfaceLogin() {
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

        buttonLogin = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 236, 236));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        buttonLogin.setBackground(new java.awt.Color(0, 204, 204));
        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(255, 255, 255));
        buttonLogin.setText("Entrar");
        buttonLogin.setToolTipText("");
        buttonLogin.setAutoscrolls(true);
        buttonLogin.setBorderPainted(false);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin);
        buttonLogin.setBounds(200, 440, 270, 32);

        email.setBackground(new java.awt.Color(233, 233, 233));
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(110, 270, 470, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Bem-vindo(a) de volta!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 190, 270, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 330, 60, 20);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 240, 60, 20);

        senha.setBackground(new java.awt.Color(233, 233, 233));
        senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(senha);
        senha.setBounds(110, 360, 470, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 20, 170, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        PegarDadosLogin pegarDadosDeLogin = new PegarDadosLogin();

        String emailLogin = email.getText();
        String senhaLogin = String.valueOf(senha.getPassword());
        Boolean isLogado = true;
        
        for (int i = 0; i < pegarDadosDeLogin.getTamanhoLista(); i++) {
            if (emailLogin.equals(pegarDadosDeLogin.getEmails().get(i))
                    && senhaLogin.equals(pegarDadosDeLogin.getSenhas().get(i))) {
                System.out.println("Voc?? achou um e-mail e senha igual! Logado!");
                InterfaceLogado logado = new InterfaceLogado();
                this.dispose();
                logado.setVisible(true);
                isLogado = true;
                break;
            } else {
                isLogado = false;
            }
        }

        if (isLogado == true) {
            System.out.println("Login realizado!");
        }else{
            System.out.println("E-mail ou senha incorreto!");
            JOptionPane.showMessageDialog(this, "E-mail ou senha incorreto!");
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
