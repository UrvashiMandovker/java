import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Urvashi Mandovker
 */
public class converter extends javax.swing.JFrame {

    /**
     * Creates new form converter
     */
    
    public converter() {
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

        iptf = new javax.swing.JTextField();
        input = new javax.swing.JLabel();
        bbtn = new javax.swing.JButton();
        obtn = new javax.swing.JButton();
        hxbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        input.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        input.setText("Input :");

        bbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bbtn.setText("Binary");
        bbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbtnActionPerformed(evt);
            }
        });

        obtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        obtn.setText("Octale");
        obtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtnActionPerformed(evt);
            }
        });

        hxbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        hxbtn.setText("Hexadecimal");
        hxbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hxbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Decimal to -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 391, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(obtn)
                    .addComponent(bbtn))
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(input)
                .addGap(38, 38, 38)
                .addComponent(iptf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hxbtn)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input)
                            .addComponent(iptf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20)
                .addComponent(bbtn)
                .addGap(16, 16, 16)
                .addComponent(hxbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(obtn)
                .addGap(161, 161, 161))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbtnActionPerformed
       String st,binary=null;
        st = iptf.getText();
        int bi = 0;
         int n = 0;
                int[] biarr = new int[100];
        int i = Integer.parseInt(st);
        Object  r = evt.getSource();
        try {
        if(r.equals(bbtn))
        {
           binary = Integer.toBinaryString(i);
        }
        } catch (Exception e) {}
         JOptionPane.showMessageDialog(null, "Binary equivalent is: " +binary);
        // TODO add your handling code here:
    }//GEN-LAST:event_bbtnActionPerformed

    private void hxbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hxbtnActionPerformed

        String st,hxdeci=null;
        st = iptf.getText();
        int i = Integer.parseInt(st);
        Object r = evt.getSource();
        try {
        if(r.equals(hxbtn))
        {
            hxdeci = Integer.toHexString(i);
             JOptionPane.showMessageDialog(null, "Binary equivalent is: " +hxdeci);
        }
        } catch (Exception e) {}
        // TODO add your handling code here:
    }//GEN-LAST:event_hxbtnActionPerformed

    private void obtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtnActionPerformed
        
          String st,octal= null;
        st = iptf.getText();
        int i = Integer.parseInt(st);
        Object r = evt.getSource();
        try {
        if(r.equals(obtn))
        {
            octal= Integer.toOctalString(i);
            
            JOptionPane.showMessageDialog(null, "Binary equivalent is: " +octal);
        }
        }
        catch (Exception e) {}
        // TODO add your handling code here:
        
        // TODO add your handling code here:
    }//GEN-LAST:event_obtnActionPerformed

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
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbtn;
    private javax.swing.JButton hxbtn;
    private javax.swing.JLabel input;
    private javax.swing.JTextField iptf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton obtn;
    // End of variables declaration//GEN-END:variables
}
     
