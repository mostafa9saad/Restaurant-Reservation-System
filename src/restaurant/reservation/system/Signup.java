/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.reservation.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static restaurant.reservation.system.gui.main;

/**
 *
 * @author user
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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

        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        customer = new javax.swing.JRadioButton();
        manger = new javax.swing.JRadioButton();
        waiter = new javax.swing.JRadioButton();
        cooker = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox4.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 51, 0));
        jCheckBox4.setText("cooker");

        jCheckBox3.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 51, 0));
        jCheckBox3.setText("waiter");

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 51, 0));
        jCheckBox1.setText("customer");

        jCheckBox2.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 102, 0));
        jCheckBox2.setText("manger");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("jCheckBox5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("sign_up");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Name:-");

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Username:-");

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Password:-");

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        customer.setBackground(new java.awt.Color(0, 0, 0));
        customer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customer.setForeground(new java.awt.Color(255, 102, 0));
        customer.setText("customer");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });

        manger.setBackground(new java.awt.Color(0, 0, 0));
        manger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manger.setForeground(new java.awt.Color(255, 102, 0));
        manger.setText("manager");
        manger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangerActionPerformed(evt);
            }
        });

        waiter.setBackground(new java.awt.Color(0, 0, 0));
        waiter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waiter.setForeground(new java.awt.Color(255, 102, 0));
        waiter.setText("waiter");
        waiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waiterActionPerformed(evt);
            }
        });

        cooker.setBackground(new java.awt.Color(0, 0, 0));
        cooker.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cooker.setForeground(new java.awt.Color(255, 102, 0));
        cooker.setText("cooker");
        cooker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookerActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username)))
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customer)
                    .addComponent(waiter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manger)
                    .addComponent(cooker))
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manger, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waiter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cooker, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void mangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangerActionPerformed
if(manger.isSelected()){
cooker.setSelected(false);
waiter.setSelected(false);
customer.setSelected(false);
}
    }//GEN-LAST:event_mangerActionPerformed

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
if(customer.isSelected()){

cooker.setSelected(false);
waiter.setSelected(false);
manger.setSelected(false);

}        
    }//GEN-LAST:event_customerActionPerformed

    private void waiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waiterActionPerformed
if(waiter.isSelected()){

manger.setSelected(false);
cooker.setSelected(false);
customer.setSelected(false);
}    
    }//GEN-LAST:event_waiterActionPerformed

    private void cookerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookerActionPerformed
       if(cooker.isSelected()){
       manger.setSelected(false);
       customer.setSelected(false);
       waiter.setSelected(false);
       }
    }//GEN-LAST:event_cookerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
       boolean flag=true;
       boolean flag1=true;
       
         ArrayList<user> user = RestaurantReservationSystem.user;
         int i=0;
         
         
         
           if( "".equals(name.getText())){
       JOptionPane.showMessageDialog(this,"Enter name ","ERROR",JOptionPane.ERROR_MESSAGE);
       flag1=false;
      
       
       }
           System.out.println(manger.isSelected());
            if(!manger.isSelected() && !waiter.isSelected() && !customer.isSelected() && !cooker.isSelected()){
       JOptionPane.showMessageDialog(this,"Enter Role ","ERROR",JOptionPane.ERROR_MESSAGE);
       flag1=false;
     
       
       }
       if( "".equals(username.getText())){
       JOptionPane.showMessageDialog(this,"Enter username ","ERROR",JOptionPane.ERROR_MESSAGE);
       flag1=false;
      
     
       }
       if( "".equals(String.valueOf(password.getPassword()))){
       JOptionPane.showMessageDialog(this,"Enter password ","ERROR",JOptionPane.ERROR_MESSAGE);
       flag1=false;
       
      
       }
      
         
       
         
         
         
         
         
         
         
         
         
       else if(flag1){
        
         for(i=0;i<user.size();i++){
        if( username.getText() == null ? user.get(i).getName() == null : username.getText().equals(user.get(i).getName())){
        
        
         JOptionPane.showMessageDialog(this,"this username is aready taken","ERROR",JOptionPane.ERROR_MESSAGE);
       flag=false;
        name.setText("");
      username.setText("");
      password.setText("");
      customer.setSelected(false);
       
        }}
        if(flag){
        if(customer.isSelected()){
      RestaurantReservationSystem.sign_up(name.getText(),"customer", username.getText(),String.valueOf( password.getPassword()));
     
      
      
      RestaurantReservationSystem.save();
            jLabel2.setText("Saved");
      name.setText("");
      username.setText("");
      password.setText("");
      customer.setSelected(false);
      
        }
         
      else if(manger.isSelected()){
      
      
      RestaurantReservationSystem.sign_up(name.getText(),"manager", username.getText(),String.valueOf( password.getPassword()));
    
      RestaurantReservationSystem.save();
            jLabel2.setText("Saved");
        name.setText("");
      username.setText("");
      password.setText("");
      manger.setSelected(false);

      }
      else if(waiter.isSelected()){
      
      
      RestaurantReservationSystem.sign_up(name.getText(),"waiter", username.getText(), String.valueOf(password.getPassword()));
    
      RestaurantReservationSystem.save();
            jLabel2.setText("Saved");
        name.setText("");
      username.setText("");
      password.setText("");
      waiter.setSelected(false);
     
      }
      else if(cooker.isSelected()){
      
      
      RestaurantReservationSystem.sign_up(name.getText(),"cooker", username.getText(),String.valueOf( password.getPassword()));
     
      
      RestaurantReservationSystem.save();
      jLabel2.setText("Saved");
        name.setText("");
      username.setText("");
      password.setText("");
      cooker.setSelected(false);
      
      }
        }
       }
       else if(!flag1){
       Signup s=new Signup();
       s.setVisible(true);
       this.setVisible(false);
       
       
       
       } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
       gui g=new gui();
       g.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cooker;
    private javax.swing.JRadioButton customer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton manger;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    private javax.swing.JRadioButton waiter;
    // End of variables declaration//GEN-END:variables
}