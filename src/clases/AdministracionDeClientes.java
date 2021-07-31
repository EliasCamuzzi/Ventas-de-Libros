package clases;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Elias Camuzzi
 */
public class AdministracionDeClientes extends javax.swing.JFrame {
    
    public AdministracionDeClientes() {
        initComponents();
        setSize(500, 350);
        setResizable(false);
        setTitle("  Administracion de clientes");
        this.setLocationRelativeTo(null);
        
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
        jButton_AgregarCliente = new javax.swing.JButton();
        jLabel_AgregarCliente = new javax.swing.JLabel();
        jButton_TablaClientes = new javax.swing.JButton();
        jLabel_TablaClientes = new javax.swing.JLabel();
        jButton_BuscarPorDNI = new javax.swing.JButton();
        jLabel_BuscarPorDNI = new javax.swing.JLabel();
        jLabel_WallpaperClientes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_AgregarCliente.setBackground(new java.awt.Color(204, 255, 204));
        jButton_AgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir-cliente.png"))); // NOI18N
        jButton_AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 120, 120));

        jLabel_AgregarCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_AgregarCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_AgregarCliente.setText("Agregar cliente");
        jPanel1.add(jLabel_AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jButton_TablaClientes.setBackground(new java.awt.Color(204, 255, 204));
        jButton_TablaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tabla.png"))); // NOI18N
        jButton_TablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TablaClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_TablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 150, 100));

        jLabel_TablaClientes.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_TablaClientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_TablaClientes.setText("Ver todos los clientes");
        jPanel1.add(jLabel_TablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jButton_BuscarPorDNI.setBackground(new java.awt.Color(204, 255, 204));
        jButton_BuscarPorDNI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DNI.png"))); // NOI18N
        jButton_BuscarPorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarPorDNIActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_BuscarPorDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 150, 100));

        jLabel_BuscarPorDNI.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_BuscarPorDNI.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_BuscarPorDNI.setText("Buscar cliente por DNI");
        jPanel1.add(jLabel_BuscarPorDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel_WallpaperClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarClienteActionPerformed
        AgregarCliente agregarCliente = new AgregarCliente();
        agregarCliente.setVisible(true);
    }//GEN-LAST:event_jButton_AgregarClienteActionPerformed

    private void jButton_TablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TablaClientesActionPerformed
        ListaDeClientes listaDeClientes = new ListaDeClientes();
        listaDeClientes.setVisible(true);
    }//GEN-LAST:event_jButton_TablaClientesActionPerformed

    private void jButton_BuscarPorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarPorDNIActionPerformed
        BuscarDNI buscarDNI = new BuscarDNI();
        buscarDNI.setVisible(true);
    }//GEN-LAST:event_jButton_BuscarPorDNIActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministracionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregarCliente;
    private javax.swing.JButton jButton_BuscarPorDNI;
    private javax.swing.JButton jButton_TablaClientes;
    private javax.swing.JLabel jLabel_AgregarCliente;
    private javax.swing.JLabel jLabel_BuscarPorDNI;
    private javax.swing.JLabel jLabel_TablaClientes;
    private javax.swing.JLabel jLabel_WallpaperClientes;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}