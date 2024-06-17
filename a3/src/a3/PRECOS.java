
package a3;

import javax.swing.*;

public class PRECOS extends javax.swing.JFrame {

    public PRECOS() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        btCarro = new javax.swing.JButton();
        btRetornar = new javax.swing.JButton();
        btMoto = new javax.swing.JButton();
        btCaminhao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCarro.setText("Carros");
        btCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarroActionPerformed(evt);
            }
        });

        btRetornar.setBackground(new java.awt.Color(255, 0, 0));
        btRetornar.setText("Retornar");
        btRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetornarActionPerformed(evt);
            }
        });

        btMoto.setText("Moto");
        btMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMotoActionPerformed(evt);
            }
        });

        btCaminhao.setText("Caminhão");
        btCaminhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaminhaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(btCarro)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btRetornar)
                        .addGap(161, 161, 161))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btMoto)
                        .addGap(31, 31, 31)
                        .addComponent(btCaminhao)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCarro)
                    .addComponent(btMoto)
                    .addComponent(btCaminhao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(btRetornar)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarroActionPerformed

        tbPreco tbCarros = new tbPreco();
        tbCarros.setVisible(true);
        tbCarros.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btCarroActionPerformed

    private void btRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetornarActionPerformed
 
    }//GEN-LAST:event_btRetornarActionPerformed

    private void btCaminhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaminhaoActionPerformed
        tbPrecoCaminhoes tbCaminhao = new tbPrecoCaminhoes();
        tbCaminhao.setVisible(true);
   
    }//GEN-LAST:event_btCaminhaoActionPerformed

    private void btMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMotoActionPerformed
      tbPrecoMoto tbMoto = new tbPrecoMoto();
        tbMoto.setVisible(true);
        tbMoto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btMotoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRECOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCaminhao;
    private javax.swing.JButton btCarro;
    private javax.swing.JButton btMoto;
    private javax.swing.JButton btRetornar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
