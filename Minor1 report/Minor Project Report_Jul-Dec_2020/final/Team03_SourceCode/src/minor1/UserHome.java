/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor1;



import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

    
/**
 *
 * @author Lenovo
 */
public class UserHome extends javax.swing.JFrame {
    /**
     * Creates new form UserHome
     */
    public UserHome()  {      
        initComponents();
        jPanel1.setFocusable(true);
        usernameLbl.setText("Welcome: "+AtmPin.userName);
        checkLimit();
    
    }
    // checkLimit
    void checkLimit(){
    
    }
    
   // design
          public void setBtnColor(JToggleButton jb)
    {
          jb.setBackground(new Color(0,204,204));
        jb.setForeground(Color.black);
    }
    
    public void removeBtnColor(JToggleButton jb)
    {
        jb.setBackground(new Color(0,44,62));
        jb.setForeground(Color.white);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Loginlb = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkBalanceBtn = new javax.swing.JToggleButton();
        depositBtn = new javax.swing.JToggleButton();
        miniBtn = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        withdrawBtn = new javax.swing.JToggleButton();
        fastcashBtn = new javax.swing.JToggleButton();
        pinBtn = new javax.swing.JToggleButton();
        changeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(466, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(466, 400));

        Loginlb.setBackground(new java.awt.Color(0, 204, 204));
        Loginlb.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Loginlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loginlb.setText("CASHPOINT");
        Loginlb.setOpaque(true);

        usernameLbl.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(0, 127, 255));
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLbl.setText("Welcome : User");

        jPanel2.setOpaque(false);

        checkBalanceBtn.setBackground(new java.awt.Color(0, 44, 62));
        buttonGroup1.add(checkBalanceBtn);
        checkBalanceBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        checkBalanceBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkBalanceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor1/ic_account_balance_wallet_48px.png"))); // NOI18N
        checkBalanceBtn.setText("CHECK BALANCE");
        checkBalanceBtn.setBorder(null);
        checkBalanceBtn.setBorderPainted(false);
        checkBalanceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBalanceBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkBalanceBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        checkBalanceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkBalanceBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkBalanceBtnMouseExited(evt);
            }
        });
        checkBalanceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalanceBtnActionPerformed(evt);
            }
        });

        depositBtn.setBackground(new java.awt.Color(0, 44, 62));
        buttonGroup1.add(depositBtn);
        depositBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        depositBtn.setForeground(new java.awt.Color(255, 255, 255));
        depositBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor1/handout_1.png"))); // NOI18N
        depositBtn.setText("DEPOSIT");
        depositBtn.setBorder(null);
        depositBtn.setBorderPainted(false);
        depositBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        depositBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        depositBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        depositBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositBtnMouseExited(evt);
            }
        });
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        miniBtn.setBackground(new java.awt.Color(0, 44, 62));
        buttonGroup1.add(miniBtn);
        miniBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        miniBtn.setForeground(new java.awt.Color(255, 255, 255));
        miniBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor1/ic_receipt_48px.png"))); // NOI18N
        miniBtn.setText("MINI STATEMENT");
        miniBtn.setBorder(null);
        miniBtn.setBorderPainted(false);
        miniBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miniBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        miniBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        miniBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniBtnMouseExited(evt);
            }
        });
        miniBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(miniBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(checkBalanceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBalanceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miniBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);

        withdrawBtn.setBackground(new java.awt.Color(0, 44, 62));
        buttonGroup1.add(withdrawBtn);
        withdrawBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        withdrawBtn.setForeground(new java.awt.Color(255, 255, 255));
        withdrawBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor1/ic_local_atm_48px.png"))); // NOI18N
        withdrawBtn.setText("WITHDRAW");
        withdrawBtn.setBorder(null);
        withdrawBtn.setBorderPainted(false);
        withdrawBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        withdrawBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        withdrawBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        withdrawBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawBtnMouseExited(evt);
            }
        });
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        fastcashBtn.setBackground(new java.awt.Color(0, 44, 62));
        buttonGroup1.add(fastcashBtn);
        fastcashBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fastcashBtn.setForeground(new java.awt.Color(255, 255, 255));
        fastcashBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor1/ic_hourglass_full_48px.png"))); // NOI18N
        fastcashBtn.setText("FAST CASH");
        fastcashBtn.setBorder(null);
        fastcashBtn.setBorderPainted(false);
        fastcashBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fastcashBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fastcashBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fastcashBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fastcashBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fastcashBtnMouseExited(evt);
            }
        });
        fastcashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastcashBtnActionPerformed(evt);
            }
        });

        pinBtn.setBackground(new java.awt.Color(0, 44, 62));
        buttonGroup1.add(pinBtn);
        pinBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pinBtn.setForeground(new java.awt.Color(255, 255, 255));
        pinBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minor1/key-25.png"))); // NOI18N
        pinBtn.setText("CHANGE PIN");
        pinBtn.setBorder(null);
        pinBtn.setBorderPainted(false);
        pinBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pinBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pinBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pinBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pinBtnMouseExited(evt);
            }
        });
        pinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(withdrawBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fastcashBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pinBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(withdrawBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fastcashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        changeBtn.setBackground(new java.awt.Color(0, 204, 204));
        changeBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        changeBtn.setText("Change A/c Type");
        changeBtn.setBorder(null);
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 204, 204));
        logoutBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        logoutBtn.setText("Log out");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Loginlb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBalanceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalanceBtnActionPerformed

            int balance = new UserTransaction().checkBalance();
        JOptionPane.showMessageDialog(this, "YOUR BALANCE IS " + balance);
    }//GEN-LAST:event_checkBalanceBtnActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SavCurCheck().setVisible(true);
    }//GEN-LAST:event_changeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
                    int a =JOptionPane.showConfirmDialog(this, "ARE YOU SURE!!!\nDO YOU WISH TO LOGOUT?");
        if(a == 0){
        this.setVisible(false);
                new nav().setVisible(true);}
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Amount().setVisible(true);
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         new Deposit().setVisible(true);       
    }//GEN-LAST:event_depositBtnActionPerformed

    private void fastcashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastcashBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Fastcash().setVisible(true);
    }//GEN-LAST:event_fastcashBtnActionPerformed

    private void checkBalanceBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceBtnMouseEntered
        // TODO add your handling code here:
        setBtnColor(checkBalanceBtn);
    }//GEN-LAST:event_checkBalanceBtnMouseEntered

    private void depositBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnMouseEntered
        // TODO add your handling code here:
        setBtnColor(depositBtn);
    }//GEN-LAST:event_depositBtnMouseEntered

    private void withdrawBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMouseEntered
        // TODO add your handling code here:
        setBtnColor(withdrawBtn);
    }//GEN-LAST:event_withdrawBtnMouseEntered

    private void fastcashBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fastcashBtnMouseEntered
        // TODO add your handling code here:
        setBtnColor(fastcashBtn);
    }//GEN-LAST:event_fastcashBtnMouseEntered

    private void miniBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseEntered
        // TODO add your handling code here:
        setBtnColor(miniBtn);
    }//GEN-LAST:event_miniBtnMouseEntered

    private void pinBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinBtnMouseEntered
        // TODO add your handling code here:
        setBtnColor(pinBtn);
    }//GEN-LAST:event_pinBtnMouseEntered

    private void checkBalanceBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBalanceBtnMouseExited
        // TODO add your handling code here:
        removeBtnColor(checkBalanceBtn);
    }//GEN-LAST:event_checkBalanceBtnMouseExited

    private void depositBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositBtnMouseExited
        // TODO add your handling code here:
        removeBtnColor(depositBtn);
    }//GEN-LAST:event_depositBtnMouseExited

    private void miniBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBtnMouseExited
        // TODO add your handling code here:
        removeBtnColor(miniBtn);
    }//GEN-LAST:event_miniBtnMouseExited

    private void withdrawBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawBtnMouseExited
        // TODO add your handling code here:
        removeBtnColor(withdrawBtn);
    }//GEN-LAST:event_withdrawBtnMouseExited

    private void fastcashBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fastcashBtnMouseExited
        // TODO add your handling code here:
        removeBtnColor(fastcashBtn);
    }//GEN-LAST:event_fastcashBtnMouseExited

    private void pinBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinBtnMouseExited
        // TODO add your handling code here:
        removeBtnColor(pinBtn);
    }//GEN-LAST:event_pinBtnMouseExited

    private void pinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new PinChange().setVisible(true);
    }//GEN-LAST:event_pinBtnActionPerformed

    private void miniBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MiniStatement().setVisible(true);
    }//GEN-LAST:event_miniBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loginlb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changeBtn;
    private javax.swing.JToggleButton checkBalanceBtn;
    private javax.swing.JToggleButton depositBtn;
    private javax.swing.JToggleButton fastcashBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JToggleButton miniBtn;
    private javax.swing.JToggleButton pinBtn;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JToggleButton withdrawBtn;
    // End of variables declaration//GEN-END:variables
}
