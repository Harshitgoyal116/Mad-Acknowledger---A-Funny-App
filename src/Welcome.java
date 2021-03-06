
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harshit Goyal
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
        FrameIcon();
        fetchData();
        //nameLbl.setText("Yash");
    }
    public void FrameIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Acknowledger.png")));
    }
    String Data;
    public void fetchData(){
        try {
            File file = new File("DB.dat");
            BufferedReader reader = new BufferedReader(new FileReader(file));
           // String Data;
            Data = reader.readLine();
            nameLbl.setText(Data +",");
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: The DB file is not found"+"\n"+e.getMessage(), "Error(0x2332)", 0);
        }
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
        jLabel1 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        YesBtn1 = new javax.swing.JButton();
        NoBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acknowledger");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("are you mad ?");

        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ConfirmBox.png"))); // NOI18N

        YesBtn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        YesBtn1.setText("Yes");
        YesBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                YesBtn1MouseEntered(evt);
            }
        });
        YesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesBtn1ActionPerformed(evt);
            }
        });

        NoBtn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NoBtn1.setText("No");
        NoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NoBtn1MouseEntered(evt);
            }
        });
        NoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(YesBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YesBtn1)
                    .addComponent(NoBtn1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void YesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesBtn1ActionPerformed
        // yes button 1
        if(YesBtn1.getText().equals("No")){
            JOptionPane.showMessageDialog(rootPane, "Congratulations, You are really a genious " + Data, "you crack the code",1);
            App app = new App();
            app.setVisible(true);
            this.dispose();
        }
        else{
        MadAck page = new MadAck();
        page.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_YesBtn1ActionPerformed

    private void YesBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YesBtn1MouseEntered
        // If mouse hover in Yes button
        YesBtn1.setText("Yes");
        NoBtn1.setText("No");
    }//GEN-LAST:event_YesBtn1MouseEntered

    private void NoBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoBtn1MouseEntered
        // If mouse hover in No button
        YesBtn1.setText("No");
        NoBtn1.setText("Yes");
    }//GEN-LAST:event_NoBtn1MouseEntered

    private void NoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoBtn1ActionPerformed
        // No Button
        if(NoBtn1.getText().equals("No")){
            JOptionPane.showMessageDialog(rootPane, "Congratulations, You are really a genious " + Data, "you crack the code",1);
            App app = new App();
            app.setVisible(true);
            this.dispose();
        }
        else{
        MadAck page = new MadAck();
        page.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_NoBtn1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoBtn1;
    private javax.swing.JButton YesBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLbl;
    // End of variables declaration//GEN-END:variables
}
