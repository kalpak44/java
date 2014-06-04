/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servereditor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kalpak44
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    private String pName,brand,model,quality;
    private double price=0.0;
    private int available=0;
    
    public AddProduct() {
        initComponents();
        setVisible(true);
        getProductsNames();
        getBrands();
        getQuality();
        pName = (String)productsItems.getSelectedItem();
        brand = (String)brandIttems.getSelectedItem();
        
        
    }
    private void getQuality(){
        qualityIttem.addItem("Good");
        qualityIttem.addItem("Normal");
        qualityIttem.addItem("Bad");
        
    }
    
    private void getBrands(){
        try{
            DataBase db = new DataBase();
            Connection con = db.getConnection();
            String query ="SELECT brand FROM products;";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println("get brands:");
            
            
            List<String> brandAll= new ArrayList<>();
            while(rs.next()){
                brandAll.add(rs.getString("brand"));
            }
            
            List<String> brands = new ArrayList<String>(new HashSet<String>(brandAll));
            
            
            for(int i=0;i<brands.size();i++){
                brandIttems.addItem(brands.get(i));
                System.out.println(brands.get(i));
            }
            brandIttems.addItem(new String("Other"));
            
            

            
        }catch(Exception e){
            System.err.println("getUsers Exception: "+e);
        }
    }
    
    private void getProductsNames(){
        try{
            DataBase db = new DataBase();
            Connection con = db.getConnection();
            String query ="SELECT product_name FROM products;";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println("get pNames:");
            
            
            List<String> pNameAll= new ArrayList<>();
            while(rs.next()){
                pNameAll.add(rs.getString("product_name"));
            }
            
            List<String> pNames = new ArrayList<String>(new HashSet<String>(pNameAll));
            
            
            for(int i=0;i<pNames.size();i++){
                productsItems.addItem(pNames.get(i));
                System.out.println(pNames.get(i));
            }
            productsItems.addItem(new String("Other"));
            
            

            
        }catch(Exception e){
            System.err.println("getUsers Exception: "+e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productsItems = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        brandIttems = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        modelLabel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qualityIttem = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        availableField = new javax.swing.JTextField();
        chancelButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();

        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add product"));

        jLabel1.setText("product:");

        productsItems.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productsItemsItemStateChanged(evt);
            }
        });

        jLabel2.setText("brand:");

        brandIttems.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brandIttemsItemStateChanged(evt);
            }
        });

        jLabel3.setText("Model:");

        jLabel4.setText("quality:");

        qualityIttem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                qualityIttemItemStateChanged(evt);
            }
        });

        jLabel5.setText("price:");

        jLabel6.setText("available:");

        chancelButton.setText("Chancel");
        chancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chancelButtonActionPerformed(evt);
            }
        });

        okButton.setText("ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(priceField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(modelLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(productsItems, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE))
                            .addComponent(jLabel3)))
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(brandIttems, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qualityIttem, 0, 190, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chancelButton))
                            .addComponent(availableField))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productsItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brandIttems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qualityIttem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availableField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chancelButton)
                    .addComponent(okButton))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_chancelButtonActionPerformed

    private void productsItemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productsItemsItemStateChanged
        // TODO add your handling code here:
        if(productsItems.getSelectedItem().equals("Other")){
                String str = JOptionPane.showInputDialog(null, "Enter Product name : ", "Product", 1);
                  if(str != null){
                      productsItems.removeItem("Other");
                      productsItems.addItem(str);
                      productsItems.setSelectedItem(str);
                      
                  }else{
                      JOptionPane.showMessageDialog(null, "Not corectyly name of product", "Product", 1);
                      
                  }
                  
        }
    }//GEN-LAST:event_productsItemsItemStateChanged

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        pName = (String)productsItems.getSelectedItem();
        brand = (String)brandIttems.getSelectedItem();
        model = (String)modelLabel.getText();
        quality = (String)qualityIttem.getSelectedItem();
        
        if(!(pName.equals("Other"))&&!(brand.equals("Other"))&&!(model.equals(""))&&!(priceField.getText().equals(""))&&!(availableField.getText().equals(""))){
            price = Double.parseDouble(priceField.getText());
            available = Integer.parseInt(availableField.getText());
            
            
            //**************************************
            try{
            DataBase db = new DataBase();
                Connection con = db.getConnection();
                String query ="SELECT p_id FROM products WHERE product_name='"+pName+"' AND brand='"+brand+"' AND quality='"+quality+"' AND model = '"+model+"';";
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery(query);
                System.out.println(pName+" "+brand+" "+model+" "+quality+" "+price+" "+available +" updating");
                if(rs.last()){
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Product exist, do you want to update the data on it?", "title",dialogButton);
                    if(dialogResult==0){
                        query = "UPDATE  `products` SET available ='"+available+"' ,  price='"+price+"' WHERE product_name='"+pName+"' AND brand='"+brand+"' AND model='"+model+"' AND quality='"+quality+"';";
                        
                    statement = con.createStatement();
                    statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Successfull update", "Product", 1);
                    }
                }else{
                    query = "INSERT INTO  `products` ( `product_name` ,  `brand` ,  `model` ,  `quality` ,  `available` ,  `price` ) \n" +
                        "VALUES (\n" +
                        "'"+pName+"',  '"+brand+"',  '"+model+"',  '"+quality+"',  '"+available+"',  '"+price+"'\n" +
                        ");";
                    statement = con.createStatement();
                    statement.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Successfull update", "Product", 1);
                }
                

            }catch(Exception e){
                System.err.println("add Product Exception: "+e);
                JOptionPane.showMessageDialog(this, "Eroor "+e,"EXeption",1);
            }finally{
                setVisible(false);
            }
            
            
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Input data eroor.","Update Product",2);
        }
        
    }//GEN-LAST:event_okButtonActionPerformed

    private void brandIttemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brandIttemsItemStateChanged
        // TODO add your handling code here:
        if(brandIttems.getSelectedItem().equals("Other")){
                String str = JOptionPane.showInputDialog(null, "Enter Product brand : ", "Product", 1);
                  if(str != null){
                      brandIttems.removeItem("Other");
                      brandIttems.addItem(str);
                      brandIttems.setSelectedItem(str);
                      
                  }else{
                      JOptionPane.showMessageDialog(null, "Not corectyly brand of product", "Product", 1);
                      
                  }
                  
        }
    }//GEN-LAST:event_brandIttemsItemStateChanged

    private void qualityIttemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_qualityIttemItemStateChanged
        // TODO add your handling code here:
        quality = (String)qualityIttem.getSelectedItem();
    }//GEN-LAST:event_qualityIttemItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availableField;
    private javax.swing.JComboBox brandIttems;
    private javax.swing.JButton chancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modelLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JComboBox productsItems;
    private javax.swing.JComboBox qualityIttem;
    // End of variables declaration//GEN-END:variables
}
