
import java.util.HashMap;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author batuh
 */
public class QueryContent extends javax.swing.JFrame {

    /**
     * Creates new form QueryUserInformation
     */
    public QueryContent() {
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
        contentID_combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        query_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentID_combobox.setEditable(true);
        contentID_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentID_comboboxActionPerformed(evt);
            }
        });
        jPanel1.add(contentID_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("Content ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 40));

        query_button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        query_button.setText("Query");
        query_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                query_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(query_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 40));

        close_button.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contentID_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentID_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentID_comboboxActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    //We are putting every content into our combobox
    for (String content : Contents.contentList.keySet()){
        contentID_combobox.addItem(content);                                
    }
    }//GEN-LAST:event_formComponentShown

    private void query_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_query_buttonActionPerformed
        //We are getting text from our combobox to put it in our method
        String contentID = contentID_combobox.getSelectedItem().toString();
        //We are adding contentID into our queryContent method
        Contents.queryContent(contentID);
        setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_query_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_close_buttonActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        //When gui is hidden we are cleaning combobox to prevent duplicates
        contentID_combobox.removeAllItems();
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JComboBox<String> contentID_combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton query_button;
    // End of variables declaration//GEN-END:variables
}
