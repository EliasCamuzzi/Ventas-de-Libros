package clases;

import static clases.InformacionClientes.txt_DNI;
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
public class BuscarDNI extends javax.swing.JFrame {

    public BuscarDNI() {
        initComponents();
        setSize(350, 290);
        setResizable(false);
        setTitle("  Busqueda de cliente");
        this.setLocationRelativeTo(null);
        
        txt_BuscarCliente.setToolTipText("Ej: 34563456");
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
        txt_BuscarCliente = new javax.swing.JTextField();
        jLabel_BuscarCliente = new javax.swing.JLabel();
        jButton_BuscarCliente = new javax.swing.JButton();
        jLabel_WallpaperBusquedaCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 30));

        jLabel_BuscarCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_BuscarCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_BuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BuscarCliente.setText("Ingrese el DNI del cliente que desea buscar");
        jLabel_BuscarCliente.setToolTipText("");
        jPanel1.add(jLabel_BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 350, 20));

        jButton_BuscarCliente.setBackground(new java.awt.Color(204, 255, 204));
        jButton_BuscarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_BuscarCliente.setForeground(new java.awt.Color(35, 35, 35));
        jButton_BuscarCliente.setText("Buscar cliente");
        jButton_BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, 40));

        jLabel_WallpaperBusquedaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperBusquedaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarClienteActionPerformed
        InformacionClientes informacionClientes = new InformacionClientes();

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");

            PreparedStatement pst = cn.prepareStatement("select * from clientes where DNI = ?");
            pst.setString(1, txt_BuscarCliente.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                informacionClientes.txt_NombreCliente.setText(rs.getString("NombreCliente"));
                informacionClientes.txt_ApellidoCliente.setText(rs.getString("ApellidoCliente"));
                informacionClientes.txt_CiudadCliente.setText(rs.getString("CiudadCliente"));
                informacionClientes.txt_FechaNacimientoCliente.setText(rs.getString("FechaNacimientoCliente"));
                informacionClientes.txt_DNI.setText(rs.getString("DNI"));

                informacionClientes.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el registro.");
            }
            
            cn.close();
            pst.close();
            
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton_BuscarClienteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarDNI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarDNI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BuscarCliente;
    private javax.swing.JLabel jLabel_BuscarCliente;
    private javax.swing.JLabel jLabel_WallpaperBusquedaCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_BuscarCliente;
    // End of variables declaration//GEN-END:variables
}
