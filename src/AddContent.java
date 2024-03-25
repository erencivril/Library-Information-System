/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Arda
 */
public class AddContent extends javax.swing.JFrame {

    /**
     * Creates new form AddContent
     */
    public AddContent() {
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

        year_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        publisher_field = new javax.swing.JTextField();
        save_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contentID_field = new javax.swing.JTextField();
        contentname_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        isbn_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        close_button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(year_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 290, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("Publisher : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setText("Publishing Year : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(publisher_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 290, -1));

        save_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        save_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        save_button.setText("Save ");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("Content ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 20));

        contentID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentID_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(contentID_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 290, -1));
        jPanel1.add(contentname_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 290, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Content name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));
        jPanel1.add(isbn_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 290, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setText("ISBN :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 20));

        close_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeicon.png"))); // NOI18N
        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        setSize(new java.awt.Dimension(480, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contentID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contentID_fieldActionPerformed

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        //We get the text from text fields.
        String contentID = contentID_field.getText();
        String fullName = contentname_field.getText();
        String ISBN = isbn_field.getText();
        String publisher = publisher_field.getText();
        String year = year_field.getText();
        
        //We put them into our add content methof
        Contents.addContent(contentID, fullName, ISBN, publisher, year);
        //Reloading GUI
        setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_save_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        //Closing, hiding the gui
        setVisible(false);
    }//GEN-LAST:event_close_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_button;
    private javax.swing.JTextField contentID_field;
    private javax.swing.JTextField contentname_field;
    private javax.swing.JTextField isbn_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField publisher_field;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField year_field;
    // End of variables declaration//GEN-END:variables
}