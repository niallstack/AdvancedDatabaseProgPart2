/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack.niall;

import java.awt.Toolkit;

/**
 *
 * @author Niall
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        MainMenuPanel = new javax.swing.JPanel();
        menuLbl = new javax.swing.JLabel();
        addDocBtn = new javax.swing.JButton();
        viewDocBtn = new javax.swing.JButton();
        deleteDocBtn = new javax.swing.JButton();
        updateDocBtn = new javax.swing.JButton();
        mapReduceBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Registration - Main Menu");

        MainMenuPanel.setBackground(new java.awt.Color(255, 255, 255));

        menuLbl.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        menuLbl.setForeground(new java.awt.Color(0, 153, 153));
        menuLbl.setText("Car Registration - Menu");

        addDocBtn.setBackground(new java.awt.Color(255, 255, 255));
        addDocBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        addDocBtn.setForeground(new java.awt.Color(0, 153, 153));
        addDocBtn.setText("Add Documents");
        addDocBtn.setMaximumSize(new java.awt.Dimension(159, 35));
        addDocBtn.setMinimumSize(new java.awt.Dimension(159, 35));
        addDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDocBtnActionPerformed(evt);
            }
        });

        viewDocBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewDocBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        viewDocBtn.setForeground(new java.awt.Color(0, 153, 153));
        viewDocBtn.setText("View Documents");
        viewDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDocBtnActionPerformed(evt);
            }
        });

        deleteDocBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteDocBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        deleteDocBtn.setForeground(new java.awt.Color(0, 153, 153));
        deleteDocBtn.setText("Delete Documents");
        deleteDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDocBtnActionPerformed(evt);
            }
        });

        updateDocBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateDocBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        updateDocBtn.setForeground(new java.awt.Color(0, 153, 153));
        updateDocBtn.setText("Update Documents");
        updateDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDocBtnActionPerformed(evt);
            }
        });

        mapReduceBtn.setBackground(new java.awt.Color(255, 255, 255));
        mapReduceBtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        mapReduceBtn.setForeground(new java.awt.Color(0, 153, 153));
        mapReduceBtn.setText("Map Reduce");
        mapReduceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapReduceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuPanelLayout = new javax.swing.GroupLayout(MainMenuPanel);
        MainMenuPanel.setLayout(MainMenuPanelLayout);
        MainMenuPanelLayout.setHorizontalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(menuLbl)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteDocBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDocBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDocBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateDocBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(mapReduceBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(331, 331, 331))
        );
        MainMenuPanelLayout.setVerticalGroup(
            MainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLbl)
                .addGap(73, 73, 73)
                .addComponent(addDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapReduceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Open new form and close the current one
    private void addDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDocBtnActionPerformed
        dispose();
        AddDoc JFrame =new AddDoc();
        JFrame.setVisible(true);

    }//GEN-LAST:event_addDocBtnActionPerformed

    private void viewDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDocBtnActionPerformed
        dispose();
        ViewDoc JFrame =new ViewDoc();
        JFrame.setVisible(true);
    }//GEN-LAST:event_viewDocBtnActionPerformed

    private void deleteDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDocBtnActionPerformed
        dispose();
        DeleteDoc JFrame =new DeleteDoc();
        JFrame.setVisible(true);
    }//GEN-LAST:event_deleteDocBtnActionPerformed

    private void updateDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDocBtnActionPerformed
        dispose();
        UpdateDoc JFrame =new UpdateDoc();
        JFrame.setVisible(true);
    }//GEN-LAST:event_updateDocBtnActionPerformed

    private void mapReduceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapReduceBtnActionPerformed
        dispose();
        MapReduce JFrame =new MapReduce();
        JFrame.setVisible(true);
    }//GEN-LAST:event_mapReduceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainMenuPanel;
    private javax.swing.JButton addDocBtn;
    private javax.swing.JButton deleteDocBtn;
    private javax.swing.JButton mapReduceBtn;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JButton updateDocBtn;
    private javax.swing.JButton viewDocBtn;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rsalogo.png")));
    }
}
