package login_senha;

import TelaPrincipal.Tela;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.Option;

/**
 *
 * @author Helio Franca
 */
public class Login extends javax.swing.JFrame {

    
    public Login() throws ClassNotFoundException {
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

        Acessar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Acessar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Acessar.setForeground(new java.awt.Color(0, 0, 102));
        Acessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bold6.png"))); // NOI18N
        Acessar.setText("  Acessar");
        Acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessarActionPerformed(evt);
            }
        });
        getContentPane().add(Acessar);
        Acessar.setBounds(110, 520, 131, 46);

        Fechar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/close18.png"))); // NOI18N
        Fechar.setText("  Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        getContentPane().add(Fechar);
        Fechar.setBounds(290, 520, 137, 46);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tela de Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 40, 191, 41);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 340, 80, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 420, 80, 37);

        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(110, 350, 349, 40);

        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Senha);
        Senha.setBounds(110, 420, 349, 37);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoG.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 160, 460, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 919, 665);

        setBounds(0, 0, 558, 703);
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void AcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessarActionPerformed
       
        String Usuario = "Teste";
        
        
        
        if (Login.getText().equalsIgnoreCase(Usuario)&& (Senha.getText().equals("123"))){
            
            
            JOptionPane.showMessageDialog(null, "Usuário: "+Usuario+"\nAcesso autorizado.");
            new Tela().setVisible(true);
            this.dispose();//FECHA A TELA ATUAL.
            }
        
              
        else {
        JOptionPane.showMessageDialog(null, "Acesso Negado, usuário ou senha está incorreto");
        }
        
    }//GEN-LAST:event_AcessarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
      System.exit(0);
      
    }//GEN-LAST:event_FecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acessar;
    private javax.swing.JButton Fechar;
    private javax.swing.JTextField Login;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
