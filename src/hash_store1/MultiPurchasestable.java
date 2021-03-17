/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_store1;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ab o da
 */
public class MultiPurchasestable extends javax.swing.JFrame {

    /**
     * Creates new form MultiPurchasestable
     */ DefaultTableModel multi;
    public MultiPurchasestable() {
        initComponents();
         Home.styleTable (new JTable[] {multiPurchasesTable}) ;
        multi = createTableCols(multiPurchasesTable, new String[]{"ID", "Item", "Quantity", "Price"});
         shows();
    }
    DefaultTableModel createTableCols(JTable table, String[] cols) {
        DefaultTableModel dmodel;
        dmodel = (DefaultTableModel) table.getModel();
        for (int i = 0; i < cols.length; i++) {
            dmodel.addColumn(cols[i]);
        }
        return dmodel;
    }
    
    void shows(){
//         if (multi.getRowCount() != 0) {
//            for (int i = multi.getRowCount() - 1; i >= 0; i--) {
//                multi.removeRow(i);
//            }
//        }
        String  quant1 = null,  price = null;
        int id1;
        String sql3 = null;
        DBcon d = new DBcon();
        Home frame = new Home();
        id1 = frame.Idflag;
        String sql2 = "SELECT * FROM `multipurchases` WHERE ID = "+id1+";";
        try {
            String item = null;
            d.rs = d.st.executeQuery(sql2);
            int temp;
            while (d.rs.next()) {
                    quant1 = String.valueOf(d.rs.getInt("Quant"));
                    item = d.rs.getString("Item");
                    price = String.valueOf(d.rs.getFloat("Price"));
                String[] rowData = {String.valueOf(id1), item,quant1, price};
                multi.addRow(rowData);
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "please try again   --  الرجاء المحاولة مرة أخري" );
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

        jScrollPane3 = new javax.swing.JScrollPane();
        multiPurchasesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        multiPurchasesTable.setAutoCreateRowSorter(true);
        multiPurchasesTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multiPurchasesTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        multiPurchasesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        multiPurchasesTable.setGridColor(new java.awt.Color(153, 153, 153));
        multiPurchasesTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        multiPurchasesTable.setRowHeight(45);
        multiPurchasesTable.setShowHorizontalLines(true);
        multiPurchasesTable.setShowVerticalLines(false);
        jScrollPane3.setViewportView(multiPurchasesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MultiPurchasestable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiPurchasestable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiPurchasestable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiPurchasestable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiPurchasestable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable multiPurchasesTable;
    // End of variables declaration//GEN-END:variables
}