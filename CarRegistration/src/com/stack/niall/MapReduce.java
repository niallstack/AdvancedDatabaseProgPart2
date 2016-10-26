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
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.MongoClient;
import com.mongodb.ParallelScanOptions;
import com.mongodb.ServerAddress;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author niall
 */
public class MapReduce extends javax.swing.JFrame {
        // Connecting to the mongodb server
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        // Connecting to the databases
        DB db = mongoClient.getDB( "CarRegistration" );
        // Connecting to the collection
        DBCollection coll = db.getCollection("Cars");
    /**
     * Creates new form MapReduce
     */
    public MapReduce() {
        initComponents();
        setIcon();
    }
    private void setIcon() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rsalogo.png")));
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
        backBtn = new javax.swing.JButton();
        addDocLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTxtArea = new javax.swing.JTextArea();
        mapRedFunBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Registration - Mapreduce");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setForeground(new java.awt.Color(0, 153, 153));
        backBtn.setText("<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addDocLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        addDocLbl.setForeground(new java.awt.Color(0, 153, 153));
        addDocLbl.setText("Mapreduce");
        addDocLbl.setToolTipText("");

        viewTxtArea.setColumns(20);
        viewTxtArea.setRows(5);
        viewTxtArea.setEditable(false);
        jScrollPane1.setViewportView(viewTxtArea);

        mapRedFunBtn.setBackground(new java.awt.Color(255, 255, 255));
        mapRedFunBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mapRedFunBtn.setForeground(new java.awt.Color(0, 153, 153));
        mapRedFunBtn.setText("Mapreduce Function");
        mapRedFunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapRedFunBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("(Displays all maufacturers in the database and how many models by each manufacturer)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn)
                .addGap(303, 303, 303)
                .addComponent(addDocLbl)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(mapRedFunBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(addDocLbl))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mapRedFunBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
        MainMenu JFrame =new MainMenu();
        JFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void mapRedFunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapRedFunBtnActionPerformed
        //Wipes the text area
        viewTxtArea.setText("");
        //Create map function
        String map = "function(doc) {\n" +"emit(this.Manufacturer,1)\n"+"}";
        //Create reduce function
        String reduce = "function(key,values){" + "\n"
                + "return Array.sum(values)}";
        //Create a mapreduce command
        MapReduceCommand cmd = new MapReduceCommand(coll, map, reduce,
        null, MapReduceCommand.OutputType.INLINE, null);
        //Insert mapreduce command into collection
        MapReduceOutput out = coll.mapReduce(cmd);
        
        //Insert mapreduce into text area
        for (DBObject o : out.results()) {
            //System.out.println(o.toString());
            viewTxtArea.append(o.toString()+"\n");
        }
        
    }//GEN-LAST:event_mapRedFunBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MapReduce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapReduce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapReduce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapReduce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapReduce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addDocLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mapRedFunBtn;
    private javax.swing.JTextArea viewTxtArea;
    // End of variables declaration//GEN-END:variables
}
