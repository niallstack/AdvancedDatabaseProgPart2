/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack.niall;

import com.mongodb.BasicDBObject;
import com.mongodb.BulkWriteOperation;
import com.mongodb.BulkWriteResult;
import com.mongodb.Cursor;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import com.mongodb.ServerAddress;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author niall
 */
public class ViewDoc extends javax.swing.JFrame {
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        DB db = mongoClient.getDB( "CarRegistration" );
        
        DBCollection coll = db.getCollection("Cars");
        

    /**
     * Creates new form ViewDoc
     */
    public ViewDoc() {
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

        jPanel1 = new javax.swing.JPanel();
        addDocLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTxtArea = new javax.swing.JTextArea();
        viewBasicBtn = new javax.swing.JButton();
        IDTxt = new javax.swing.JTextField();
        searchIDBtn = new javax.swing.JButton();
        IDLbl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manBtn = new javax.swing.JButton();
        manTxt = new javax.swing.JTextField();
        IDLbl1 = new javax.swing.JLabel();
        fuelBtn = new javax.swing.JButton();
        fuelTxt = new javax.swing.JTextField();
        IDLbl2 = new javax.swing.JLabel();
        yearBeforeBtn = new javax.swing.JButton();
        manualBtn = new javax.swing.JButton();
        yearAfterBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addDocLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addDocLbl.setForeground(new java.awt.Color(0, 153, 153));
        addDocLbl.setText("View Documents");
        addDocLbl.setToolTipText("");

        viewTxtArea.setColumns(20);
        viewTxtArea.setRows(5);
        viewTxtArea.setEditable(false);
        jScrollPane1.setViewportView(viewTxtArea);

        viewBasicBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewBasicBtn.setForeground(new java.awt.Color(0, 153, 153));
        viewBasicBtn.setText("View First");
        viewBasicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBasicBtnActionPerformed(evt);
            }
        });

        IDTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        IDTxt.setForeground(new java.awt.Color(0, 153, 153));

        searchIDBtn.setBackground(new java.awt.Color(255, 255, 255));
        searchIDBtn.setForeground(new java.awt.Color(0, 153, 153));
        searchIDBtn.setText("Search");
        searchIDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIDBtnActionPerformed(evt);
            }
        });

        IDLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        IDLbl.setForeground(new java.awt.Color(0, 153, 153));
        IDLbl.setText("Search by ID");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        manBtn.setBackground(new java.awt.Color(255, 255, 255));
        manBtn.setForeground(new java.awt.Color(0, 153, 153));
        manBtn.setText("Search");
        manBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manBtnActionPerformed(evt);
            }
        });

        manTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        manTxt.setForeground(new java.awt.Color(0, 153, 153));

        IDLbl1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        IDLbl1.setForeground(new java.awt.Color(0, 153, 153));
        IDLbl1.setText("Search by Manufacturer");

        fuelBtn.setBackground(new java.awt.Color(255, 255, 255));
        fuelBtn.setForeground(new java.awt.Color(0, 153, 153));
        fuelBtn.setText("Search");
        fuelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelBtnActionPerformed(evt);
            }
        });

        fuelTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fuelTxt.setForeground(new java.awt.Color(0, 153, 153));

        IDLbl2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        IDLbl2.setForeground(new java.awt.Color(0, 153, 153));
        IDLbl2.setText("Search by Fuel Type");

        yearBeforeBtn.setBackground(new java.awt.Color(255, 255, 255));
        yearBeforeBtn.setForeground(new java.awt.Color(0, 153, 153));
        yearBeforeBtn.setText("Pre-2000");
        yearBeforeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBeforeBtnActionPerformed(evt);
            }
        });

        manualBtn.setBackground(new java.awt.Color(255, 255, 255));
        manualBtn.setForeground(new java.awt.Color(0, 153, 153));
        manualBtn.setText("Manual");
        manualBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualBtnActionPerformed(evt);
            }
        });

        yearAfterBtn.setBackground(new java.awt.Color(255, 255, 255));
        yearAfterBtn.setForeground(new java.awt.Color(0, 153, 153));
        yearAfterBtn.setText("Post-2000");
        yearAfterBtn.setToolTipText("");
        yearAfterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearAfterBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 153, 153));
        backBtn.setText("<");
        backBtn.setActionCommand("<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(189, 189, 189)
                        .addComponent(addDocLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewBasicBtn)
                            .addComponent(yearAfterBtn))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearBeforeBtn)
                            .addComponent(manualBtn))
                        .addGap(63, 63, 63)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchIDBtn)
                                    .addComponent(manBtn)
                                    .addComponent(fuelBtn))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(IDLbl)
                                            .addGap(158, 158, 158))
                                        .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(manTxt, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(fuelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(IDLbl1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(IDLbl2)))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(5, 5, 5))
                    .addComponent(addDocLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(IDLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchIDBtn))
                                .addGap(18, 18, 18)
                                .addComponent(IDLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(manTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IDLbl2)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fuelBtn)
                                    .addComponent(fuelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(viewBasicBtn)
                                    .addComponent(yearBeforeBtn))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(yearAfterBtn)
                                    .addComponent(manualBtn))))
                        .addGap(32, 115, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewBasicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBasicBtnActionPerformed
        //Finds first document in collection
        DBObject myDoc = coll.findOne();
        //Wipes the text area
        viewTxtArea.setText("");
        //Inserts the document into the text area
        viewTxtArea.append(myDoc.toString()+"\n");
    }//GEN-LAST:event_viewBasicBtnActionPerformed

    private void searchIDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIDBtnActionPerformed
        
        BasicDBObject whereQuery = new BasicDBObject();
        String carID = IDTxt.getText();
        whereQuery.put("_id", new ObjectId(carID));
        DBCursor cursor = coll.find(whereQuery);
        viewTxtArea.setText("");
        while(cursor.hasNext()) {
            viewTxtArea.append(cursor.next().toString()+"\n");
        }
    }//GEN-LAST:event_searchIDBtnActionPerformed

    private void manBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manBtnActionPerformed
        BasicDBObject whereQuery = new BasicDBObject();
        String manufacturer = manTxt.getText();
        whereQuery.put("Manufacturer", manufacturer);
        DBCursor cursor = coll.find(whereQuery);
        viewTxtArea.setText("");
        while(cursor.hasNext()) {
            viewTxtArea.append(cursor.next().toString()+"\n");
        }
    }//GEN-LAST:event_manBtnActionPerformed

    private void fuelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelBtnActionPerformed
        BasicDBObject whereQuery = new BasicDBObject();
        String fuelType = fuelTxt.getText();
        whereQuery.put("FuelType", fuelType);
        DBCursor cursor = coll.find(whereQuery);
        viewTxtArea.setText("");
        while(cursor.hasNext()) {
            viewTxtArea.append(cursor.next().toString()+"\n");
        }
    }//GEN-LAST:event_fuelBtnActionPerformed

    private void yearBeforeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBeforeBtnActionPerformed
        BasicDBObject whereQuery = new BasicDBObject();
        //String fuelType = fuelTxt.getText();
        whereQuery.put("Year", new BasicDBObject("$lt", 2000));
        DBCursor cursor = coll.find(whereQuery);
        viewTxtArea.setText("");
        while(cursor.hasNext()) {
            viewTxtArea.append(cursor.next().toString()+"\n");
        }
    }//GEN-LAST:event_yearBeforeBtnActionPerformed

    private void manualBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualBtnActionPerformed
        BasicDBObject whereQuery = new BasicDBObject();
        whereQuery.put("Transmission", "Manual");
        DBCursor cursor = coll.find(whereQuery);
        viewTxtArea.setText("");
        while(cursor.hasNext()) {
            viewTxtArea.append(cursor.next().toString()+"\n");
        }
    }//GEN-LAST:event_manualBtnActionPerformed

    private void yearAfterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearAfterBtnActionPerformed
        BasicDBObject whereQuery = new BasicDBObject();
        //String fuelType = fuelTxt.getText();
        whereQuery.put("Year", new BasicDBObject("$gt", 2000));
        DBCursor cursor = coll.find(whereQuery);
        viewTxtArea.setText("");
        while(cursor.hasNext()) {
            viewTxtArea.append(cursor.next().toString()+"\n");
        }
    }//GEN-LAST:event_yearAfterBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        MainMenu JFrame =new MainMenu();
        JFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoc().setVisible(true);
            }
        });

        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLbl;
    private javax.swing.JLabel IDLbl1;
    private javax.swing.JLabel IDLbl2;
    private javax.swing.JTextField IDTxt;
    private javax.swing.JLabel addDocLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton fuelBtn;
    private javax.swing.JTextField fuelTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton manBtn;
    private javax.swing.JTextField manTxt;
    private javax.swing.JButton manualBtn;
    private javax.swing.JButton searchIDBtn;
    private javax.swing.JButton viewBasicBtn;
    private javax.swing.JTextArea viewTxtArea;
    private javax.swing.JButton yearAfterBtn;
    private javax.swing.JButton yearBeforeBtn;
    // End of variables declaration//GEN-END:variables
}

