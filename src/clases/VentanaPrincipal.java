package clases;

import clasessecundarias.InformacionAcercaDelProyecto;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Elias Camuzzi
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        setSize(639, 450);
        setResizable(false);
        setTitle("  Ventas de libros - Panel principal");
        this.setLocationRelativeTo(null);
        
        jButton_AcercaDe.setToolTipText("Acerca de...");
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
        jLabel_Titulo = new javax.swing.JLabel();
        jButton_Clientes = new javax.swing.JButton();
        jLabel_Clientes = new javax.swing.JLabel();
        jButton_Libros = new javax.swing.JButton();
        jLabel_Libros = new javax.swing.JLabel();
        jButton_AcercaDe = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Bienvenido a Venta De Libros");
        jPanel1.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 640, 30));

        jButton_Clientes.setBackground(new java.awt.Color(204, 255, 204));
        jButton_Clientes.setForeground(new java.awt.Color(204, 255, 204));
        jButton_Clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/audience.png"))); // NOI18N
        jButton_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, 110));

        jLabel_Clientes.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Clientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Clientes.setText("Administraccion de clientes");
        jPanel1.add(jLabel_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 20));

        jButton_Libros.setBackground(new java.awt.Color(204, 255, 204));
        jButton_Libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/books.png"))); // NOI18N
        jButton_Libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LibrosActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 110, 110));

        jLabel_Libros.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Libros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel_Libros.setText("Administraccion de libros");
        jPanel1.add(jLabel_Libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, 20));

        jButton_AcercaDe.setBackground(new java.awt.Color(204, 255, 204));
        jButton_AcercaDe.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton_AcercaDe.setForeground(new java.awt.Color(204, 255, 204));
        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/question.png"))); // NOI18N
        jButton_AcercaDe.setToolTipText("");
        jButton_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcercaDeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 319, 64, 64));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClientesActionPerformed
        AdministracionDeClientes administracionDeClientes = new AdministracionDeClientes();
        administracionDeClientes.setVisible(true);
    }//GEN-LAST:event_jButton_ClientesActionPerformed

    private void jButton_LibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LibrosActionPerformed
        AdministracionDeLibros administracionDeLibros = new AdministracionDeLibros();
        administracionDeLibros.setVisible(true);
        
    }//GEN-LAST:event_jButton_LibrosActionPerformed

    private void jButton_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcercaDeActionPerformed
        InformacionAcercaDelProyecto informacionAcercaDelProyecto = new InformacionAcercaDelProyecto();
        informacionAcercaDelProyecto.setVisible(true);
    }//GEN-LAST:event_jButton_AcercaDeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Clientes;
    private javax.swing.JButton jButton_Libros;
    private javax.swing.JLabel jLabel_Clientes;
    private javax.swing.JLabel jLabel_Libros;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
