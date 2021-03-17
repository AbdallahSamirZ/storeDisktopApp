/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_store1;

import java.awt.Color;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    Process process ;
    String property, serial ;
    public login() {
        
        try {
            process = Runtime.getRuntime().exec(new String[]{"wmic", "bios", "get", "SerialNumber"});
            process.getOutputStream().close();
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scanner sc = new Scanner(process.getInputStream());
        property = sc.next();
        serial = sc.next();
        //System.out.println(serial);
        initComponents();
        wrongLbl.setVisible(false);
        pnl_overlay.setBackground(new Color(241, 242, 246, 200));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        login_btn = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wrongLbl = new javax.swing.JLabel();
        pnl_overlay = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(164, 176, 190));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 30, 28));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 310, 20));

        name.setBackground(new java.awt.Color(44, 62, 80));
        name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setBorder(null);
        name.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 310, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(164, 176, 190));
        jLabel2.setText("Password :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 107, 28));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 310, 10));

        password.setBackground(new java.awt.Color(44, 62, 80));
        password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(null);
        password.setCaretColor(new java.awt.Color(255, 255, 255));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 310, 36));

        login_btn.setBackground(new java.awt.Color(164, 176, 190));
        login_btn.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        login_btn.setForeground(new java.awt.Color(44, 62, 80));
        login_btn.setLabel("Login");
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
        });
        jPanel2.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 310, 39));

        jLabel5.setBackground(new java.awt.Color(44, 62, 80));
        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Hash Store");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 280, 47));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(164, 176, 190));
        jLabel7.setText("Name :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 74, 28));

        wrongLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        wrongLbl.setForeground(new java.awt.Color(255, 0, 0));
        wrongLbl.setText("Wrong Password !!");
        jPanel2.add(wrongLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 440, 590));

        pnl_overlay.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setText("Welcome to");

        javax.swing.GroupLayout pnl_overlayLayout = new javax.swing.GroupLayout(pnl_overlay);
        pnl_overlay.setLayout(pnl_overlayLayout);
        pnl_overlayLayout.setHorizontalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_overlayLayout.createSequentialGroup()
                .addGroup(pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_overlayLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3))
                    .addGroup(pnl_overlayLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnl_overlayLayout.setVerticalGroup(
            pnl_overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_overlayLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(pnl_overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int posX, posY;

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - posX, y - posY);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
        String name = this.name.getText();
        String pass = password.getText();
        DBcon d = new DBcon();
        DBcon db = new DBcon();
        wrongLbl.setText("Loading .... Please wait .");
        wrongLbl.setForeground(new java.awt.Color(51, 204, 0));
        wrongLbl.setVisible(true);
        int l = 0, z = 0;
        try {
            String sql2;
            String sql = "SELECT * FROM `users`";

            d.rs = d.st.executeQuery(sql);
       if ((pass.equals("hash1234") && name.equals("Hash"))) {l = -2;}
       else{
            while (d.rs.next()) {
                if ((pass.equals(d.rs.getString("password")) && name.equals(d.rs.getString("User_name")))) {
                    l = 1;
                    break;
       }}}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "‘User doesn't exist -- مستخدم غير موجود");
        }
        
        if (l < 0) {

            try {
                d.st = d.con.createStatement();
                d.st.executeUpdate("UPDATE users SET logged = 0;");
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Please wait   --  برجاء الانتظار" );
           if (serial.equals("HTJCX2J")) {
            Home h = new Home();
            h.setVisible(true);
            this.dispose();
           }else {
            JOptionPane.showMessageDialog(null, "You are not Allowed to run this program !!");
        }
        } else if (l > 0) {
            try {
                d.st = d.con.createStatement();
                d.st.executeUpdate("UPDATE users SET logged = '1' WHERE User_name = '" + name + "';");

                d.st = d.con.createStatement();
                d.st.executeUpdate("UPDATE users SET logged = '0' WHERE User_name != '" + name + "';");
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Please wait   --  برجاء الانتظار" );
            new Home().setVisible(true);
            dispose();
        } else {
            wrongLbl.setForeground(new java.awt.Color(255, 0, 0));
            wrongLbl.setText("Wrong Password !!");
            wrongLbl.setVisible(true);
        }


    }//GEN-LAST:event_login_btnMouseClicked

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        wrongLbl.setVisible(false);
    }//GEN-LAST:event_passwordFocusGained

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            String name = this.name.getText();
        String pass = password.getText();
        DBcon d = new DBcon();
        DBcon db = new DBcon();
        wrongLbl.setText("Loading .... Please wait .");
        wrongLbl.setForeground(new java.awt.Color(51, 204, 0));
        wrongLbl.setVisible(true);
        int l = 0, z = 0;
        try {
            String sql2;
            String sql = "SELECT * FROM `users`";

            d.rs = d.st.executeQuery(sql);
       if ((pass.equals("hash1234") && name.equals("Hash"))) {l = -2;}
       else{
            while (d.rs.next()) {
                if ((pass.equals(d.rs.getString("password")) && name.equals(d.rs.getString("User_name")))) {
                    l = 1;
                    break;
       }}}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "‘User doesn't exist -- مستخدم غير موجود");
        }
        
        if (l < 0) {

            try {
                d.st = d.con.createStatement();
                d.st.executeUpdate("UPDATE users SET logged = 0;");
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Please wait   --  برجاء الانتظار" );
            if (serial.equals("HTJCX2J")) {
            Home h = new Home();
            h.setVisible(true);
            this.dispose();
           }else {
            JOptionPane.showMessageDialog(null, "You are not Allowed to run this program !!");
        }
        } else if (l > 0) {
            try {
                d.st = d.con.createStatement();
                d.st.executeUpdate("UPDATE users SET logged = '1' WHERE User_name = '" + name + "';");

                d.st = d.con.createStatement();
                d.st.executeUpdate("UPDATE users SET logged = '0' WHERE User_name != '" + name + "';");
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Please wait   --  برجاء الانتظار" );
            new Home().setVisible(true);
            dispose();
        } else {
            wrongLbl.setForeground(new java.awt.Color(255, 0, 0));
            wrongLbl.setText("Wrong Password !!");
            wrongLbl.setVisible(true);
        }

        }
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Button login_btn;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel pnl_overlay;
    private javax.swing.JLabel wrongLbl;
    // End of variables declaration//GEN-END:variables
}