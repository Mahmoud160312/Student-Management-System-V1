package login;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StudentManagmentPortal {

    public static void main(String[] args) throws Exception {
        //String user_name="mahmo";                         // the name of the user name of my computer
        String user_name="mo7a";                          // the name of the user name of my computer
        //String user_name="Hisham El Attar";                // the name of the user name of my computer
        //String user_name="hp";                           // the name of the user name of my computer
        //String user_name="TASNEEM";                        // for ahmed esmail
        
        
        String pass = System.getProperty("user.name");
        System.out.println(pass);
        if (!user_name.equals(pass)) {
            JOptionPane.showMessageDialog(null, "لقد تم نقل البرنامج الى جهاز غير معلوم دون علم المختصيين", "عذراا", 3);
            return;
        }
        /*//******************************** how to get mac    **********
            String macAddress="00";
        
  
        InetAddress address=InetAddress.getLocalHost();
        NetworkInterface ni=NetworkInterface.getByInetAddress(address); 
        
        byte []mac=ni.getHardwareAddress();
        
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<mac.length;i++){
        sb.append(String.format("%02X%s",mac[i],(i<mac.length-1)?"-":"" ));
        
        }
        
        macAddress=sb.toString();
        
        
        String check_mac="";
        
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select *from serial");

            ResultSet set = stmt.executeQuery();

            while (set.next()) {
                check_mac = set.getString("serial");
            }
           

            if (!check_mac.equals(macAddress)) {
                JOptionPane.showMessageDialog(null, "لقد تم نقل البرنامج الى جهاز غير معلوم دون علم المختصيين", "عذراا", 3);
                return;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "لقد تم نقل البرنامج الى جهاز غير معلوم دون علم المختصيين", "عذراا", 3);
            System.out.println("Error mac" + ex.getErrorCode());
             return;
        }
         */

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //this to take a specific format
        Date date = new Date();                                     // the current date
        Date end_date = null;                                         // the last date the program have
        String current_date = dateFormat.format(date);              // convert the current date to string     
        String curr_date = null;                                    // get the last date in the database

        // convert the string of end date to date object
        try {
            end_date = dateFormat.parse("2019-08-01");
        } catch (ParseException ex) {
            Logger.getLogger(StudentManagmentPortal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //check if the program pass the year or not
        if (date.equals(end_date) || date.after(end_date)) {
            JOptionPane.showMessageDialog(null, "يجب تفعيل البرنامج الرجاء الاتصال بالمتخصصين");
            return;
        }
        //get the last date and compare it with the current date to check if the date didn't go back
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select *from date");
            ResultSet set = stmt.executeQuery();
            while (set.next()) {
                curr_date = set.getString("this_date");
            }

            Date date2 = null;                             // convert the string in the database to date object
            try {
                date2 = dateFormat.parse(curr_date);
            } catch (ParseException ex) {

            }
            // check if the date go back the current date and the last date stored in the database
            if (date.before(date2)) {
                JOptionPane.showMessageDialog(null, "لقد تم تغير التاريخ الي تاريخ اقدم الرجاء ضبط التاريخ على يوم " + curr_date, "عذراا", 3);
                return;
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex.getErrorCode());
        }
        // update the last date stored in the database
        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
            PreparedStatement stmt = con.prepareStatement("update date set end_date=?,this_date=?");
            stmt.setString(1, "2019-08-01");
            stmt.setString(2, current_date);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
        }

        Welcome w = new Welcome();
        w.setVisible(true);
        w.prog.setVisible(false);
        Thread th = new Thread() {
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(StudentManagmentPortal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    if (i == 1) {
                        w.prog.setValue(10);
                    }
                    if (i == 2) {
                        w.prog.setValue(20);
                    }
                    if (i == 3) {
                        w.prog.setValue(30);
                    }
                    if (i == 4) {
                        w.prog.setValue(40);
                    }
                    if (i == 5) {
                        w.prog.setValue(50);
                    }
                    if (i == 6) {
                        w.prog.setValue(60);
                    }
                    if (i == 7) {
                        w.prog.setValue(70);
                    }
                    if (i == 8) {
                        w.prog.setValue(80);
                    }
                    if (i == 9) {
                        w.prog.setValue(90);
                    }
                    if (i == 10) {
                        w.prog.setValue(100);
                    }
                }
                w.setVisible(false);
                LogInAs a = new LogInAs();
                a.setVisible(true);

            }
        };
        th.start();
    }

}
