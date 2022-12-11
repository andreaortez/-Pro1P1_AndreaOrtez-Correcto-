
package pro1p1_andreaortez;

import javax.swing.JOptionPane;

public class Conversiones extends javax.swing.JFrame {

    public Conversiones() {
        initComponents();
    }

    public int Decimal(int binario, int exp) {
        int num = binario % 10;//Necesito el residuo para obtener cada uno de los digitos del numero binario
        int exponente = (int) Math.pow(2, exp);//Este es el proceso para obtener el decimal. Se usa 2(la base) a la exponcencia de la posición (de izquierda a derecha)
        
        if (binario == 0) {
            return binario;//para que se salga al terminar de leer los digitos
        } else {
            return num*exponente + Decimal(binario / 10, exp+1);//Para sumar el numero obtenido con el siguiente que se obtenido
        }
    }

    public int Binario(int decimal) {
        int num = decimal % 2;
        
        if (decimal < 2) {
            return decimal;//para que se salga cuando ya no hayan digitos
        } else {
            return num+(Binario(decimal / 2))*10;//Para sumar el obtenido con el siguiente y obtener el binario
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BD = new javax.swing.JButton();
        DB = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        MenuR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(214, 217, 224));
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 7, -1, -1));

        jLabelMin1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabelMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 7, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Conversiones");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 60, -1, -1));

        BD.setText("Binario a decimal");
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 115, -1, -1));

        DB.setText("Decimal a binario");
        DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBActionPerformed(evt);
            }
        });
        getContentPane().add(DB, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(214, 217, 224));

        MenuR.setText("Menu de Recursión");
        MenuR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(MenuR)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(MenuR)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        int binario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero binario"));
        JOptionPane.showMessageDialog(null, "El numero en decimal es : " + Decimal(binario,0));
    }//GEN-LAST:event_BDActionPerformed

    private void DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBActionPerformed
        int decimal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero decimal"));
        JOptionPane.showMessageDialog(null, "El numero en binario es : " + Binario(decimal));
    }//GEN-LAST:event_DBActionPerformed

    private void MenuRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRActionPerformed
        Recursividad R = new Recursividad();
        R.setVisible(true);
        R.pack();
        R.setAlwaysOnTop(true);
        R.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_MenuRActionPerformed

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
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BD;
    private javax.swing.JButton DB;
    private javax.swing.JButton MenuR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
