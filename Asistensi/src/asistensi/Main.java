/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package asistensi;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class Main extends javax.swing.JFrame {
    private java.sql.Connection connection = Koneksi.DBConnection();
    private PreparedStatement statement;
    /**
     * Creates new form NewJFrame
     */
    public Main() {
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
        Nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Makanan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Minuman = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        TambahData = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        LihatData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Makanan :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama : ");

        Minuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinumanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Minuman : ");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID_PESANAN", "ID_USER", "NAMA_USER", "MAKANAN", "MINUMAN", "TOTAL_HARGA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        TambahData.setText("Tambah Data");
        TambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahDataActionPerformed(evt);
            }
        });

        Update.setText("Update Data");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete Data");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        LihatData.setText("Lihat Data");
        LihatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LihatDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(Minuman)
                            .addComponent(Makanan))
                        .addGap(251, 251, 251)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TambahData)
                            .addComponent(Update))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(Delete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(LihatData)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TambahData)
                    .addComponent(Delete))
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Makanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update)
                    .addComponent(LihatData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(Minuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinumanActionPerformed

    private void TambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahDataActionPerformed
       Pelanggan pel = new Pelanggan();
       pel.setUser(Nama.getText());
       pel.setMakanan(Makanan.getText());
       pel.setMinuman(Minuman.getText());
       pel.setHargaMakanan(pel.getMakanan());
       pel.setHargaMinuman(pel.getMinuman());
       tambahDataTableUser(pel);
       tambahDataTablePesanan(pel);
       tambahDataTableDescPesanan(pel);
    }//GEN-LAST:event_TambahDataActionPerformed

    private void LihatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LihatDataActionPerformed
     showData();
    }//GEN-LAST:event_LihatDataActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       update u = new update();
       u.setVisible(true);
       Main m = new Main();
       m.setVisible(false);
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        Hapus h = new Hapus();
        h.setVisible(true);
    }//GEN-LAST:event_DeleteActionPerformed
    public void tambahDataTableUser(Pelanggan pel){
        try{
            long user_id = pel.getid_user();
            long pesanan = pel.getId_pesanan();
            String q = "INSERT INTO user VALUES (?,?)";
            statement = (PreparedStatement) connection.prepareStatement(q);
            statement.setLong(1,pel.getid_user());
            statement.setString(2,pel.getNama());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void tambahDataTablePesanan(Pelanggan pel){
        try{
            String query = "SELECT id_user FROM user ORDER BY id_user DESC LIMIT 1";
            statement = (PreparedStatement) connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            if(result.next()){
            long user_id = result.getLong("id_user");
            String q = "INSERT INTO pesanan VALUES (?,?,?,?)";
            statement = (PreparedStatement) connection.prepareStatement(q);
            statement.setLong(1,pel.getId_pesanan());
            statement.setLong(2,user_id);
            statement.setString(3,pel.getMakanan());
            statement.setString(4,pel.getMinuman());
            pel.jumlah++;
            statement.executeUpdate();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public  void tambahDataTableDescPesanan(Pelanggan pel){
    try {
        String userQuery = "SELECT id_user FROM user ORDER BY id_user DESC LIMIT 1";
        statement = connection.prepareStatement(userQuery);
        ResultSet userResult = statement.executeQuery();
        if (userResult.next()) {
            long user_id = userResult.getLong("id_user");
            String pesananQuery = "SELECT id_pesanan FROM pesanan ORDER BY id_pesanan DESC LIMIT 1";
            statement = connection.prepareStatement(pesananQuery);
            ResultSet pesananResult = statement.executeQuery();
            if (pesananResult.next()) {
            long pesanan_id = pesananResult.getLong("id_pesanan");
            String insertQuery = "INSERT INTO desc_pesanan (id_pesanan, id_user, total_harga) VALUES (?, ?, ?)";
            statement = connection.prepareStatement(insertQuery);
            statement.setLong(1, pesanan_id);
            statement.setLong(2, user_id);
            statement.setDouble(3, pel.getTotalHarga());
            statement.executeUpdate();
                } else {
                    System.out.println("Pesanan tidak ditemukan.");
                }
            } else {
                System.out.println("User tidak ditemukan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void showData(){
        try{
           String query = 
                   "SELECT "
             + "user.id_user, "
             + "user.nama, "
             + "pesanan.id_pesanan, "
             + "pesanan.makanan, "
             + "pesanan.minuman, "
             + "desc_pesanan.total_harga "
             + "FROM user "
             + "INNER JOIN pesanan ON user.id_user = pesanan.id_user "
             + "INNER JOIN desc_pesanan ON user.id_user= desc_pesanan.id_user";
           statement = connection.prepareStatement(query);
           ResultSet res = statement.executeQuery();
           DefaultTableModel t = new DefaultTableModel(new String[]{"ID_USER","ID_PESANAN",
               "NAMA_USER","MAKANAN","MINUMAN","TOTAL_HARGA"},0);
           table.setModel(t);
           while(res.next()){
               String id_user = res.getString("id_user");
               String id_pesanan = res.getString("id_pesanan");
               String nama = res.getString("nama");
               String makanan = res.getString("makanan");
               String minuman = res.getString("minuman");
               String totalHarga = res.getString("total_harga");
               t.addRow(new Object[]{id_user,id_pesanan,nama,makanan,minuman,totalHarga});
           }
           res.close();
           statement.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main m = new Main();
                new Main().setVisible(true);
                m.showData();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton LihatData;
    private javax.swing.JTextField Makanan;
    private javax.swing.JTextField Minuman;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton TambahData;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
