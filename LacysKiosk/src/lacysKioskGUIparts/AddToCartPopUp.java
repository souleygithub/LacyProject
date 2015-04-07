/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacysKioskGUIparts;

/**
 *
 * @author Alisha
 */
public class AddToCartPopUp extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddToCartPopUp
     */
    public AddToCartPopUp() {
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

        addLabel = new javax.swing.JLabel();
        addItemNameLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        inventoryLabel = new javax.swing.JLabel();
        confirmAddCartButton = new javax.swing.JButton();
        addCartCancelButton = new javax.swing.JButton();

        setTitle("Add Item To Cart");

        addLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addLabel.setText("ADD: ");

        addItemNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addItemNameLabel.setText("Product Name Here");

        quantityLabel.setText("Quantity: XX");

        priceLabel.setText("Price: $X.XX");

        totalLabel.setText("Total: $X.XX");

        inventoryLabel.setText("Inventory: XX");

        confirmAddCartButton.setText("Confirm");
        confirmAddCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddCartButtonActionPerformed(evt);
            }
        });

        addCartCancelButton.setText("Cancel");
        addCartCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(confirmAddCartButton)))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addCartCancelButton)
                                    .addComponent(inventoryLabel))))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addItemNameLabel)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addItemNameLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(inventoryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmAddCartButton)
                    .addComponent(addCartCancelButton))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmAddCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddCartButtonActionPerformed
        // TODO add your handling code here:
        //Add the product to user's cart and close pop up window
    }//GEN-LAST:event_confirmAddCartButtonActionPerformed

    private void addCartCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartCancelButtonActionPerformed
        // TODO add your handling code here:
        //Close the pop up window but don't add product to cart
    }//GEN-LAST:event_addCartCancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartCancelButton;
    private javax.swing.JLabel addItemNameLabel;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton confirmAddCartButton;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}