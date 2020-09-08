package Teacher;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud Mansour
 */
public class Password_tech extends javax.swing.JFrame {

    /**
     * Creates new form setting_tech
     */
    public Password_tech() {
        initComponents();
        setIcon();
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel60 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 250, 180, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/تم.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 490, 120, 60);

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(90, 380, 180, 30);

        jLabel60.setBackground(new java.awt.Color(0, 102, 204));
        jLabel60.setForeground(new java.awt.Color(0, 102, 204));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/logout 2.jpg"))); // NOI18N
        jLabel60.setToolTipText("تسجيل الخروج");
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel60);
        jLabel60.setBounds(0, 10, 70, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/resetpassword2222.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 370, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(382, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String newID = jTextField1.getText();
        //    String Bass = jPasswordField1.getText();         مش هيستخدم كلمه المرور القديمه فى تغيير الباص 
        String newPass = jPasswordField2.getText();

        Scanner scan = null;

        if ("".equals(jTextField1.getText()) || "".equals(jPasswordField2.getText())) {
            if ("".equals(jTextField1.getText())) {

                JOptionPane.showMessageDialog(this, "من فضلك ادخل البيانات كامله , لاجراء العمليه", "Sorry!", JOptionPane.PLAIN_MESSAGE);

            }

        } else {
            PrintWriter writer = null;
            ////////////
            //          Reader reader=null;
            ///////////
            try {
                writer = new PrintWriter("autorun.inf", "UTF-8");
            } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                Logger.getLogger(Teacher_control.class.getName()).log(Level.SEVERE, null, ex);
            }
            writer.println(jTextField1.getText());
            writer.println(jPasswordField2.getText());
            writer.close();
            ///////////////////
            //            if (! scan.equals(jTextField1.getText()) || ! reader.equals(jPasswordField1.getText())){

            //                  JOptionPane.showMessageDialog(this, "يوجد خطأ فى اسم المستخدم او كلمه المرور الحاليه , من فضلك افحص البيانات مره اخرى", "done", JOptionPane.PLAIN_MESSAGE);
            //       }
            ////////////////////////
            int replay = JOptionPane.showConfirmDialog(this, "هل انت منأكد انك تريد تغيير أسم المستخدم وكلمه المرور ؟", "", JOptionPane.YES_NO_OPTION, 1);
            if (replay == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "تم تغيير الاسم وكلمه المرور بنجاح", "done", JOptionPane.PLAIN_MESSAGE);
                Teacher_control a = new Teacher_control();
                this.setVisible(false);
                a.setVisible(true);
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        setting_tech frame = new setting_tech();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField2.requestFocus();
        }

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String newID = jTextField1.getText();
            //    String Bass = jPasswordField1.getText();         مش هيستخدم كلمه المرور القديمه فى تغيير الباص 
            String newPass = jPasswordField2.getText();

            Scanner scan = null;

            if ("".equals(jTextField1.getText()) || "".equals(jPasswordField2.getText())) {
                if ("".equals(jTextField1.getText())) {

                    JOptionPane.showMessageDialog(this, "من فضلك ادخل البيانات كامله , لاجراء العمليه", "Sorry!", JOptionPane.PLAIN_MESSAGE);

                }

            } else {
                PrintWriter writer = null;
                ///////////
                try {
                    writer = new PrintWriter("autorun.inf", "UTF-8");
                } catch (FileNotFoundException | UnsupportedEncodingException ex) {
                    Logger.getLogger(Teacher_control.class.getName()).log(Level.SEVERE, null, ex);
                }
                writer.println(jTextField1.getText());
                writer.println(jPasswordField2.getText());
                writer.close();
                ///////////////////
                int replay = JOptionPane.showConfirmDialog(this, "هل انت منأكد انك تريد تغيير أسم المستخدم وكلمه المرور ؟", "", JOptionPane.YES_NO_OPTION, 1);
                if (replay == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "تم تغيير الاسم وكلمه المرور بنجاح", "done", JOptionPane.PLAIN_MESSAGE);
                    Teacher_control a = new Teacher_control();
                    this.setVisible(false);
                    a.setVisible(true);
                }

            }

        }

    }//GEN-LAST:event_jPasswordField2KeyPressed

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
            java.util.logging.Logger.getLogger(Password_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_tech().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Photos/logo2.jpg")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
