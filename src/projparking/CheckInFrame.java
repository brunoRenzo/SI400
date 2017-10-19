/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projparking;

import java.awt.Color;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Bruno
 */
public class CheckInFrame extends javax.swing.JFrame {

    /**
     * Creates new form CheckInFrame
     */
    public CheckInFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        lblVaga = new javax.swing.JLabel();
        tfVaga = new javax.swing.JTextField();
        lblNomeP = new javax.swing.JLabel();
        tfNomeP = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        tfContato = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnConclude = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Check-in");

        lblPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca.setText("Placa :");

        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setText("Modelo :");

        tfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModeloActionPerformed(evt);
            }
        });

        lblCor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCor.setText("Cor :");

        tfCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorActionPerformed(evt);
            }
        });

        lblVaga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVaga.setText("Vaga :");

        tfVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfVagaActionPerformed(evt);
            }
        });

        lblNomeP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNomeP.setText("Nome do proprietário :");

        tfNomeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomePActionPerformed(evt);
            }
        });

        lblContato.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblContato.setText("Número para contato :");

        tfContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContatoActionPerformed(evt);
            }
        });

        btnConclude.setBackground(new java.awt.Color(255, 255, 255));
        btnConclude.setText("Concluir");
        btnConclude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcludeActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPlaca)
                                .addGap(49, 49, 49)
                                .addComponent(tfPlaca))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConclude))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModelo)
                                    .addComponent(lblCor)
                                    .addComponent(lblVaga))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(tfVaga)
                                    .addComponent(tfCor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeP)
                                    .addComponent(lblContato))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNomeP, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                    .addComponent(tfContato)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(80, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVaga)
                    .addComponent(tfVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor)
                    .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeP)
                    .addComponent(tfNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContato)
                    .addComponent(tfContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConclude)
                    .addComponent(btnCancel))
                .addGap(30, 30, 30))
        );

        setBounds(0, 0, 626, 409);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
        System.out.println("asdasdasd");
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void tfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfModeloActionPerformed

    private void tfCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorActionPerformed

    private void tfVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfVagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfVagaActionPerformed

    private void tfNomePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomePActionPerformed

    private void tfContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContatoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        IndexFrame indexFrame =  new IndexFrame();
        indexFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConcludeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcludeActionPerformed
        lblContato.setForeground(Color.black);
        lblNomeP.setForeground(Color.black);
        lblCor.setForeground(Color.black);
        lblModelo.setForeground(Color.black);
        lblVaga.setForeground(Color.black);
        lblPlaca.setForeground(Color.black);
        
        int flag=0;
        if(tfContato.getText().equalsIgnoreCase("")){
            flag=1;
            lblContato.setForeground(Color.red);
        }
        if(tfNomeP.getText().equalsIgnoreCase("")){
            flag=1;
            lblNomeP.setForeground(Color.red);
        }
        if(tfCor.getText().equalsIgnoreCase("")){
            flag=1;
            lblCor.setForeground(Color.red);
        }
        if(tfModelo.getText().equalsIgnoreCase("")){
            flag=1;
            lblModelo.setForeground(Color.red);
        }
        if(tfVaga.getText().equalsIgnoreCase("")){
            flag=1;
            lblVaga.setForeground(Color.red);
        }
        if(tfPlaca.getText().equalsIgnoreCase("")){
            flag=1;
            lblPlaca.setForeground(Color.red);
        }
        
        if(flag==1)
            JOptionPane.showMessageDialog(this,"Alguns campos não foram preenchidos","Campos inválidos",JOptionPane.ERROR_MESSAGE);
        else{
            Parker np = new Parker();
            np.setPlaca(tfPlaca.getText());
            np.setVaga(tfVaga.getText());
            np.setModelo(tfModelo.getText());
            np.setCor(tfCor.getText());
            np.setNomeP(tfNomeP.getText());
            np.setContato(tfContato.getText());
            np.setDataHora(LocalDateTime.now());
            
            
            FileManager fm = new FileManager();
            try {
                fm.addParker(np);
            } catch (IOException ex) {
                Logger.getLogger(CheckInFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CheckInFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this,"Check-in efetuado com sucesso");
            IndexFrame indexF = new IndexFrame();
            indexF.setVisible(true);
            this.setVisible(false);
            
        }
        
    }//GEN-LAST:event_btnConcludeActionPerformed

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
            java.util.logging.Logger.getLogger(CheckInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckInFrame().setVisible(true);
            }
        });
    }
    //Variavel global para verificar campos preenchidos;
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConclude;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblVaga;
    private javax.swing.JTextField tfContato;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfNomeP;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfVaga;
    // End of variables declaration//GEN-END:variables
}
