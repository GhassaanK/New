/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechatonic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MERN Stack Disk
 */

class Variables{
    public String firstname;
    public String lastname;
    public String email;
    public String password;
}
public class SignupScreen extends javax.swing.JFrame {

    /**
     * Creates new form SignupScreen
     */
    public SignupScreen() {
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

        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userPass = new javax.swing.JPasswordField();
        emailwarning = new javax.swing.JLabel();
        passwarning = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        SignUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passwarn = new javax.swing.JLabel();
        fnamewarn = new javax.swing.JLabel();
        lnamewarn = new javax.swing.JLabel();
        emailwarn = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 550));
        setMinimumSize(new java.awt.Dimension(950, 550));
        setName("SignupScreen"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(950, 550));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mechatonic/4966434-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 30, 360, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 650, 500);

        jPanel4.setBackground(new java.awt.Color(99, 112, 255));
        jPanel4.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(99, 112, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign Up");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 0, 280, 33);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 40, 257, 19);

        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameKeyTyped(evt);
            }
        });
        jPanel3.add(lastName);
        lastName.setBounds(20, 140, 251, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 280, 84, 19);

        userPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userPassFocusGained(evt);
            }
        });
        jPanel3.add(userPass);
        userPass.setBounds(20, 300, 251, 30);

        emailwarning.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(emailwarning);
        emailwarning.setBounds(96, 155, 171, 0);

        passwarning.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(passwarning);
        passwarning.setBounds(10, 386, 0, 0);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Last Name");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 120, 71, 19);

        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameKeyTyped(evt);
            }
        });
        jPanel3.add(firstName);
        firstName.setBounds(20, 60, 251, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 200, 257, 19);

        userEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userEmailFocusLost(evt);
            }
        });
        userEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailActionPerformed(evt);
            }
        });
        userEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userEmailKeyTyped(evt);
            }
        });
        jPanel3.add(userEmail);
        userEmail.setBounds(20, 220, 251, 30);

        SignUp.setBackground(new java.awt.Color(255, 255, 255));
        SignUp.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        jPanel3.add(SignUp);
        SignUp.setBounds(100, 350, 100, 27);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Already a user?");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 400, 85, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Login!");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7);
        jLabel7.setBounds(120, 400, 39, 15);

        passwarn.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(passwarn);
        passwarn.setBounds(20, 340, 0, 0);

        fnamewarn.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(fnamewarn);
        fnamewarn.setBounds(20, 100, 0, 0);

        lnamewarn.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(lnamewarn);
        lnamewarn.setBounds(20, 180, 0, 0);

        emailwarn.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(emailwarn);
        emailwarn.setBounds(20, 260, 0, 0);

        jPanel4.add(jPanel3);
        jPanel3.setBounds(10, 80, 280, 450);

        close.setFont(new java.awt.Font("Symbol", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 0));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("O");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel4.add(close);
        close.setBounds(270, 10, 20, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(650, 0, 300, 550);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SignUp Today To Get Connected");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 11, 630, 33);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 650, 50);

        getAccessibleContext().setAccessibleName("Signup");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost

    }//GEN-LAST:event_lastNameFocusLost

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void lastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyPressed

    }//GEN-LAST:event_lastNameKeyPressed

    private void lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyTyped

    }//GEN-LAST:event_lastNameKeyTyped

    private void userPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userPassFocusGained

    }//GEN-LAST:event_userPassFocusGained

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFocusLost

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void firstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameKeyPressed

    private void firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameKeyTyped

    private void userEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailFocusLost

    private void userEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailActionPerformed

    private void userEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailKeyPressed

    private void userEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailKeyTyped

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
            
        if("".equals(firstName.getText())){
            fnamewarn.setText("Please enter a first name");
        }
        if("".equals(lastName.getText())){
            lnamewarn.setText("Please enter a last name");
        }
        if("".equals(userEmail.getText())){
            emailwarn.setText("Please enter an email");
        }else if(!userEmail.getText().contains("@")){
            emailwarn.setText("Please enter a valid email");
        }else{
            emailwarn.setText("");
        }
        if("".equals(userPass.getText())){
            passwarn.setText("Please enter a password");
        }
        
        if(!"".equals(firstName.getText()) && !"".equals(lastName.getText()) && !"".equals(userEmail.getText()) && !"".equals(userPass.getText())){
        try {  

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mechatonic?zeroDateTimeBehavior=convertToNull";
            String username = "root";
            String password = "";
            
            Variables vars = new Variables();
            vars.firstname = firstName.getText();
            
            vars.lastname = lastName.getText();
            vars.email = userEmail.getText();
            vars.password = userPass.getText();
            
            Connection conn = DriverManager.getConnection(url, username, password);
            
if (!firstName.getText().isEmpty() && !lastName.getText().isEmpty() && !userEmail.getText().isEmpty() && userEmail.getText().contains("@") && !userPass.getText().isEmpty()) {



        String selectQuery = "SELECT * FROM users WHERE email='" + vars.email + "'";
        Statement selectStatement = conn.createStatement();
        ResultSet rs = selectStatement.executeQuery(selectQuery);

        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "User already registered with the email, try signing in!");
            firstName.setText("");
            lastName.setText("");
            userEmail.setText("");
            userPass.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Signed Up!");
            firstName.setText("");
            lastName.setText("");
            userEmail.setText("");
            userPass.setText("");
            String sql = "INSERT INTO users (firstname, lastname, email, password) VALUES ('" + vars.firstname + "', '" + vars.lastname + "', '" + vars.email + "', '" + vars.password + "')";
            Statement insertStatement = conn.createStatement();
            insertStatement.executeUpdate(sql);
        }
        
    } else {
        if (firstName.getText().isEmpty()) {
            fnamewarn.setText("Please enter a first name");
        }
        if (lastName.getText().isEmpty()) {
            lnamewarn.setText("Please enter a last name");
        }
        if (userEmail.getText().isEmpty()) {
            emailwarn.setText("Please enter an email");
        } else if (!userEmail.getText().contains("@")) {
            emailwarn.setText("Please enter a valid email");
        } else {
            emailwarn.setText("");
        }
        if (userPass.getText().isEmpty()) {
            passwarn.setText("Please enter a password");
        }
    }
            

            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MechaTonic.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SignupScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
        
            if("".equals(firstName.getText())){
                fnamewarn.setText("Please enter a first name");
            }
            if("".equals(lastName.getText())){
                lnamewarn.setText("Please enter a last name");
            }
            if("".equals(userEmail.getText())){
                emailwarn.setText("Please enter an email");
            }else if(!userEmail.getText().contains("@")){
                emailwarn.setText("Please enter a valid email");
            }else{
                emailwarn.setText("");
            }
            if("".equals(userPass.getText())){
                passwarn.setText("Please enter a password");
            }
            
        }

    }//GEN-LAST:event_SignUpActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        LoginScreen login = new LoginScreen();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUp;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel close;
    private javax.swing.JLabel emailwarn;
    private javax.swing.JLabel emailwarning;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel fnamewarn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lnamewarn;
    private javax.swing.JLabel passwarn;
    private javax.swing.JLabel passwarning;
    private javax.swing.JTextField userEmail;
    private javax.swing.JPasswordField userPass;
    // End of variables declaration//GEN-END:variables
}
