/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor1;

import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class Deposit extends javax.swing.JFrame {
int deposit;
    /**
     * Creates new form Deposit
     */
    public Deposit() {
        initComponents();
        int amountLimit1 = new UserTransaction().checkDepositLimit();
           JOptionPane.showMessageDialog(this, "YOUR DAILY DEPOSIT LIMIT IS 20,000/-\nYOU CAN DEPOSIT "+ amountLimit1+"/- MORE!!!\nTHIS AMOUNT RESETS IN 24 HOURS");
        
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
        Navlb = new javax.swing.JLabel();
        depositTF = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JToggleButton();
        gobackBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Navlb.setBackground(new java.awt.Color(0, 204, 204));
        Navlb.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Navlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Navlb.setText("Enter Amount To Deposit");
        Navlb.setOpaque(true);

        depositTF.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        depositTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        depositTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                depositTFKeyTyped(evt);
            }
        });

        confirmBtn.setBackground(new java.awt.Color(0, 204, 204));
        confirmBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        gobackBtn.setBackground(new java.awt.Color(0, 204, 204));
        gobackBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        gobackBtn.setText("Go back");
        gobackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Navlb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(depositTF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gobackBtn)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Navlb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(depositTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gobackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void depositTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depositTFKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch))){
            evt.consume();
        }
    }//GEN-LAST:event_depositTFKeyTyped

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        // TODO add your handling code here:
        String deposits=  depositTF.getText();
        if(deposits.equals("")){
                                JOptionPane.showMessageDialog(this, "MUST ENTER SOME AMOUNT!!!");
                                depositTF.setFocusable(true);
        }
        else{
           deposit = Integer.parseInt(depositTF.getText());
           UserTransaction ut = new UserTransaction();
           
        int amountLimit = ut.checkDepositLimit();
                    if(deposit>amountLimit){
                                            JOptionPane.showMessageDialog(this, "ENTER AMOUNT LESS THAN "+amountLimit+"/-");
            depositTF.setFocusable(true);
            depositTF.setText("");
                    }
        
                else{
                           int balance = new UserTransaction().checkBalance();
           JOptionPane.showMessageDialog(this, "YOU ARE ABOUT TO DEPOSIT  " + deposit + " and your account balance is "+balance);
                                JOptionPane.showMessageDialog(this, "ADMIN/OWNER MUST LOGIN TO CONFIRM PAYMENT!!!");
                               this.setVisible(false);
                                new Login("deposit",deposit).setVisible(true);
                      } 
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void gobackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserHome().setVisible(true);
    }//GEN-LAST:event_gobackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Navlb;
    private javax.swing.JToggleButton confirmBtn;
    private javax.swing.JTextField depositTF;
    private javax.swing.JToggleButton gobackBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
