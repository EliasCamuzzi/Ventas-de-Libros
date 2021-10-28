package clases;

import static clases.InformacionLibros.txt_AnnoPublicacionLibro;
import static clases.InformacionLibros.txt_ISBN;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias Camuzzi
 */
public class BuscarISBN extends javax.swing.JFrame {

    public BuscarISBN() {
        initComponents();
        setSize(350, 290);
        setResizable(false);
        setTitle("  Busqueda de libro");
        this.setLocationRelativeTo(null);
        
        txt_BuscarLibro.setToolTipText("Ej: 3742");
    }
    
    @Override
    public Image getIconImage() {
        Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/open-book.png"));
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_BuscarLibro = new javax.swing.JTextField();
        jLabel_BuscarLibro = new javax.swing.JLabel();
        jButton_BuscarLibro = new javax.swing.JButton();
        jLabel_WallpaperBusquedaCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_BuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 30));

        jLabel_BuscarLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_BuscarLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_BuscarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BuscarLibro.setText("Ingrese el numero ISBN del libro que desea buscar");
        jLabel_BuscarLibro.setToolTipText("");
        jPanel1.add(jLabel_BuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 350, 20));

        jButton_BuscarLibro.setBackground(new java.awt.Color(204, 255, 204));
        jButton_BuscarLibro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_BuscarLibro.setForeground(new java.awt.Color(35, 35, 35));
        jButton_BuscarLibro.setText("Buscar libro");
        jButton_BuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_BuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, 40));

        jLabel_WallpaperBusquedaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperBusquedaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarLibroActionPerformed
        InformacionLibros informacionLibros = new InformacionLibros();

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");

            PreparedStatement pst = cn.prepareStatement("select * from libros where ISBN = ?");
            pst.setString(1, txt_BuscarLibro.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                informacionLibros.txt_NombreLibro.setText(rs.getString("NombreLibro"));
                informacionLibros.txt_AutorLibro.setText(rs.getString("Autor"));
                informacionLibros.txt_Genero.setText(rs.getString("Genero"));
                informacionLibros.txt_AnnoPublicacionLibro.setText(rs.getString("AnnoDePublicacion"));
                informacionLibros.txt_ISBN.setText(rs.getString("ISBN"));
                informacionLibros.txt_Precio.setText(rs.getString("Precio"));

                informacionLibros.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro.");
            }
            
            cn.close();
            pst.close();
            
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton_BuscarLibroActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarISBN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarISBN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BuscarLibro;
    private javax.swing.JLabel jLabel_BuscarLibro;
    private javax.swing.JLabel jLabel_WallpaperBusquedaCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_BuscarLibro;
    // End of variables declaration//GEN-END:variables
}
