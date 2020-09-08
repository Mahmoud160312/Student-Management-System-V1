/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secretary;

import java.awt.Toolkit;
import login.LogInAs;
import java.io.File;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Pro-Mahmoud Reda
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
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

        jPanel9 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel60.setBackground(new java.awt.Color(0, 102, 204));
        jLabel60.setForeground(new java.awt.Color(0, 102, 204));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/settings.jpg"))); // NOI18N
        jLabel60.setToolTipText("الاعدادات");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel60);
        jLabel60.setBounds(10, 10, 60, 40);

        jLabel62.setBackground(new java.awt.Color(0, 102, 204));
        jLabel62.setForeground(new java.awt.Color(0, 102, 204));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/house-outline.jpg"))); // NOI18N
        jLabel62.setToolTipText("الصفحة الرئيسية");
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel62);
        jLabel62.setBounds(90, 10, 50, 40);

        jLabel61.setBackground(new java.awt.Color(0, 102, 204));
        jLabel61.setForeground(new java.awt.Color(0, 102, 204));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/logout.jpg"))); // NOI18N
        jLabel61.setToolTipText("تسجيل الخروج");
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel61);
        jLabel61.setBounds(150, 10, 60, 40);

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton26);
        jButton26.setBounds(40, 90, 145, 50);

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton22.setContentAreaFilled(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton22);
        jButton22.setBounds(40, 170, 145, 50);

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton23.setContentAreaFilled(false);
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton23);
        jButton23.setBounds(40, 250, 145, 50);

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton25.setContentAreaFilled(false);
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton25);
        jButton25.setBounds(40, 330, 145, 55);

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton21.setContentAreaFilled(false);
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton21);
        jButton21.setBounds(40, 407, 145, 50);

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton24.setContentAreaFilled(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton24);
        jButton24.setBounds(40, 490, 145, 55);

        jButton28.setBackground(new java.awt.Color(255, 255, 255));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton28.setContentAreaFilled(false);
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton28);
        jButton28.setBounds(40, 570, 145, 55);

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/seee2.jpg"))); // NOI18N
        jPanel9.add(jLabel32);
        jLabel32.setBounds(0, 0, 950, 660);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(360, 100, 220, 190);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(630, 100, 210, 190);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 350, 210, 190);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(70, 100, 250, 190);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(80, 350, 230, 190);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(630, 350, 210, 190);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/setting.jpg"))); // NOI18N
        jPanel1.add(jLabel31);
        jLabel31.setBounds(0, 0, 950, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        password_sec frame = new password_sec();
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String path = null;
        String fileName;
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        String date = new SimpleDateFormat("YYYY-MM-DD").format(new Date());

        try {
            File f = fc.getSelectedFile();
            if (fc.getSelectedFile() == null) {
                return;
            }
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            path = path + ".sql";

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Process p = null;
        try {

            Process runtime = Runtime.getRuntime().exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -uroot -proot --add-drop-database -B sms -r " + path);

            int processComplete = runtime.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, " تم النسخ الاحتياطي ;)", "Done...", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "لم يتم اخد نسخه احتياطيه :(", "Sorry...", JOptionPane.PLAIN_MESSAGE);

            }
        } catch (Exception ez) {
            ez.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path = null;

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        try {
            File f = fc.getSelectedFile();
            if (fc.getSelectedFile() == null) {
                return;
            }
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        String user = "root";
        String pass = "root";
        String[] restoreCmd = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe", "--user=" + user, "--password=" + pass, "-e", "source " + path};
        Process process;
        try {
            process = Runtime.getRuntime().exec(restoreCmd);
            int processComplete = process.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "تم استرجاع النسخ الاحتياطي ;)", "Done...", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "فشل فالنسخ الاحتياطي :(", "Sorry...", JOptionPane.PLAIN_MESSAGE);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String path = null;
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        try {
            File f = fc.getSelectedFile();
            if (fc.getSelectedFile() == null) {
                JOptionPane.showMessageDialog(null, "يجب اختيار مسار صحيح لمكان حفط النسخة الاحتياطية", "عذرا", 0);
                return;
            }
            path = f.getAbsolutePath();
            path = path.replace('\\', '/');
            path = path + ".sql";

            try {
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
                PreparedStatement stmt = con.prepareStatement("update  path set path=?");

                stmt.setString(1, path);
                
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "تم","",JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException ex) {
                System.out.println(ex.getErrorCode());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String foot= JOptionPane.showInputDialog(null,"اكتب ما سيعرض باسفل كل تقرير","الفوتر",JOptionPane.PLAIN_MESSAGE);
      try {
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
                PreparedStatement stmt = con.prepareStatement("update  footer set footer=?");
                stmt.setString(1, foot);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "تم","",JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException ex) {
                System.out.println(ex.getErrorCode());
            }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        Settings a = new Settings();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
      Secretary_control s=new Secretary_control();
      this.setVisible(false);
      s.setVisible(true);
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        int replay = JOptionPane.showConfirmDialog(null, "هل انت متاكد من انك تريد الخروج", "تاكيد", JOptionPane.YES_NO_OPTION, 1);
        if (replay == JOptionPane.YES_OPTION) {
            LogInAs a = new LogInAs();
            this.setVisible(false);
            a.setVisible(true);
        }
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String path = null;
        path = "sms.sql";
        path = path.replace('\\', '/');

        String user = "root";
        String pass = "root";
        String[] restoreCmd = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe", "--user=" + user, "--password=" + pass, "-e", "source " + path};
        Process process;
        int replay;
       replay=JOptionPane.showConfirmDialog(null,"هل انت متاكد من انك تريد حذف كل البيانات","confirm",JOptionPane.YES_NO_OPTION,2);
       if(replay==JOptionPane.YES_OPTION){
        try {
            process = Runtime.getRuntime().exec(restoreCmd);
            int processComplete = process.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "تم الحذف بنجاح ;)", "Done...", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }   
       }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        StudnetManagement a = new StudnetManagement();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        Attendence a = new Attendence();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        Quiz a = new Quiz();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Exams a = new Exams();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        Money a = new Money();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Groups a = new Groups();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        report a = new report();
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Photos/logo2.jpg")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
