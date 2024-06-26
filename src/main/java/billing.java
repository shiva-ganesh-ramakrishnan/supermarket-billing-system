import java.sql.*;
import Project.ConnectionProvider;
import com.itextpdf.kernel.colors.DeviceRgb;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Tab;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TabAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.element.TabStop;
import com.itextpdf.layout.property.TextAlignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shivaramakrishnan
 */
public class billing extends javax.swing.JFrame {
    
    public float finalTotal;
    /**
     * Creates new form billing
     */
    public billing() {
        initComponents();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel5.setText(dateFormat.format(date));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel6.setText(now.format(dtf));
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(10000, 10000));
        setMinimumSize(new java.awt.Dimension(1192, 550));
        setPreferredSize(new java.awt.Dimension(1500, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/shivaramakrishnan/Desktop/bms/billing frame.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 28, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/shivaramakrishnan/Desktop/bms/Billing ani.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 88, -1, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 21, -1, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 89, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 134, 1187, 10));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 217, 200, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 221, -1, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 217, 187, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setText("Address");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 221, -1, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 217, 219, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel14.setText("Buyer Details:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 172, -1, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setText("Name");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 221, -1, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 217, 200, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setText("Contact No");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 221, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setText("Quantity");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 311, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel18.setText("Product Details:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 258, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel19.setText("Product ID");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 311, -1, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 307, 173, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 307, 60, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel20.setText("Price");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 311, -1, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setText("Product Name");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 311, -1, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 307, 87, -1));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 307, 134, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Description");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 311, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 307, 178, -1));

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/shivaramakrishnan/Desktop/bms/add.png")); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 351, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 395, 1187, 10));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Calculation Details:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 423, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 471, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setText("Paid Amount");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 525, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setText("Return Amount");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 578, -1, -1));

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 466, 167, -1));

        jTextField3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 167, -1));

        jTextField4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 573, 167, -1));

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/shivaramakrishnan/Desktop/bms/save.png")); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 463, -1, -1));

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("/Users/shivaramakrishnan/Desktop/bms/Reset.png")); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 517, -1, -1));

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("/Users/shivaramakrishnan/Desktop/bms/close Jframe.png")); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 570, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Price", "Quantity", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
        String prodNamePrefix = jTextField9.getText() + "%";
        String sel_stmt = "SELECT * FROM PRODUCTS WHERE name like ?;";
        try{
            
            Connection conn = ConnectionProvider.getConn();
            PreparedStatement sel_ps = conn.prepareStatement(sel_stmt);
            sel_ps.setString(1, prodNamePrefix);
            ResultSet resultSet = sel_ps.executeQuery();        

            if(resultSet.next()){
                    jTextField12.setText("");                    
                    jTextField10.setText(String.valueOf(resultSet.getInt("product_id")));
                    jTextField9.setText(resultSet.getString("name"));
                    jTextField11.setText(String.valueOf(resultSet.getFloat("price")));                    
                    jTextField1.setText(resultSet.getString("description"));

            }
            
            else{
                JOptionPane.showMessageDialog(null, "No product found with the given name");
                jTextField8.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
            }        
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
        String namePrefix = "%" + jTextField8.getText() + "%";
        try{
            Connection conn = ConnectionProvider.getConn();
            String sel_stmt = "SELECT * FROM BUYER WHERE name like ?;";
            PreparedStatement sel_ps = conn.prepareStatement(sel_stmt);
            sel_ps.setString(1, namePrefix);
            ResultSet resultSet = sel_ps.executeQuery();
            if(resultSet.next()){
                    jTextField8.setText(resultSet.getString("name"));
                    jTextField5.setText(resultSet.getString("contact_number"));
                    jTextField6.setText(resultSet.getString("email"));
                    jTextField7.setText(resultSet.getString("address"));
                
            }
            else{
                jTextField8.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
                
        String contactPrefix = "%" + jTextField5.getText() + "%";
        try{
            Connection conn = ConnectionProvider.getConn();
            String sel_stmt = "SELECT * FROM buyer WHERE contact_number like ?;";
            PreparedStatement sel_ps = conn.prepareStatement(sel_stmt);
            sel_ps.setString(1, contactPrefix);
            ResultSet resultSet = sel_ps.executeQuery();
            if(resultSet.next()){
                jTextField8.setText(resultSet.getString("name"));
                jTextField5.setText(resultSet.getString("contact_number"));
                jTextField6.setText(resultSet.getString("email"));
                jTextField7.setText(resultSet.getString("address"));
                
            }
            else{
                jTextField8.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Error occurred : "+e);
        }
        
    
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();        
        new home().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int colCount = model.getColumnCount();
        String[] columnNames = new String[colCount];
        for(int i = 0; i < colCount; i++){
            columnNames[i] = new String(model.getColumnName(i));
        }
        
        String buyerName = jTextField8.getText();
        String contactNo = jTextField5.getText();
        String email = jTextField6.getText();
        String address = jTextField7.getText();
        String date = jLabel5.getText();
        String time = jLabel6.getText();
        String totalAmt = jTextField2.getText();
        
        String path = "/Users/shivaramakrishnan/NetBeansProjects/BillingManagementSystem/src/main/java/Generated_Bills";
        
        String table[][] = new String[model.getRowCount()][colCount];
        for(int i = 0 ; i < model.getRowCount(); i++)
        {
            table[i][0] = new String(model.getValueAt(i, 0).toString());
            table[i][1] = new String(model.getValueAt(i, 1).toString());
            table[i][2] = new String(model.getValueAt(i, 2).toString());
            table[i][3] = new String(model.getValueAt(i, 3).toString());
            table[i][4] = new String(model.getValueAt(i, 4).toString());
        }
        

        

        
        try(Document doc = new Document(new PdfDocument(new PdfWriter(path+"/"+buyerName+"-"+date+"-"+time+".pdf")))){
            Table pdfTable = new Table(UnitValue.createPercentArray(new float[] {25,25,10,20,20})).useAllAvailableWidth();
            
            for(String column: columnNames){                
                pdfTable.addHeaderCell(new Cell().add(new Paragraph(column).setBold()).setBackgroundColor(new DeviceRgb(98, 101, 105)));
                
            }
            
            Paragraph titlePara = new Paragraph("SUPERMARKET BILL").setBold().setFontSize(24).setUnderline().setTextAlignment(TextAlignment.CENTER);
            doc.add(titlePara);
            doc.add(new Paragraph("\n"));
            Paragraph namePara = new Paragraph("Name: "+buyerName).setBold();
            namePara.add(new Tab());
            namePara.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
            namePara.add("Date: "+date);            
            doc.add(namePara);
            
            Paragraph contactPara = new Paragraph("Contact Number: "+contactNo).setBold();
            contactPara.add(new Tab());
            contactPara.addTabStops(new TabStop(1000, TabAlignment.RIGHT));
            contactPara.add("Time: "+time);            
            doc.add(contactPara);

            
            doc.add(new Paragraph("Email: "+email).setBold());            
            
            for(String[] row: table){
                pdfTable.addCell(row[0]);
                pdfTable.addCell(row[1]);
                pdfTable.addCell(row[2]);
                pdfTable.addCell(row[3]);
                pdfTable.addCell(row[4]);
                System.out.println("Done with adding the cells to the pdf table");
            }            
            
            doc.add(pdfTable);
            doc.add(new Paragraph("\n\n"));
            Paragraph totalPara = new Paragraph("Total Amount: "+totalAmt+"\n");
            
            
            doc.add(totalPara);
            doc.close();
            JOptionPane.showMessageDialog(null, "Bill Generated Successfully");
        }
        catch(Exception e){
            System.out.println("Error occurred: "+e);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
        int productId;
        try{
        productId = Integer.parseInt(jTextField10.getText());
        
            try{
                Connection conn = ConnectionProvider.getConn();
                String sel_stmt = "SELECT * FROM products WHERE product_id = ?;";
                PreparedStatement sel_ps = conn.prepareStatement(sel_stmt);
                sel_ps.setInt(1, productId);
                ResultSet resultSet = sel_ps.executeQuery();
                if(resultSet.next()){
                    jTextField12.setText("");
                    jTextField9.setText(resultSet.getString("name"));
                    jTextField11.setText(String.valueOf(resultSet.getFloat("price")));
                    //jTextField12.setText(resultSet.getString("email")); This is quantity
                    jTextField1.setText(resultSet.getString("description"));
                    

                }
                else{
                    jTextField9.setText("");
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField1.setText("");

                }


            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                System.out.println("Error occurred : "+e);
            }    
        }
        catch(Exception e){
            System.out.println("Product ID should be an integer");
        }
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int quantity = Integer.parseInt(jTextField12.getText());
        float price = Float.parseFloat(jTextField11.getText());
        float total = price * quantity;
        finalTotal = finalTotal + total;
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]{jTextField9.getText(), jTextField1.getText(), price, quantity, total});
        String finalTotal1 = String.valueOf(finalTotal);
        jTextField2.setText(finalTotal1);
        jTextField2.setEditable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        String paidAmount = jTextField3.getText();
        float paidAmt = Float.parseFloat(paidAmount);
        finalTotal = paidAmt - finalTotal;
        String finTotalStr = String.valueOf(finalTotal);
        jTextField4.setText(finTotalStr);
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
