package clases;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias Camuzzi
 */
public class InformacionClientes extends javax.swing.JFrame {

    String userUpdate1 = "";
    String userUpdate2 = "";
    String ID;

    public InformacionClientes() {
        initComponents();
        setSize(555, 400);
        setResizable(false);
        setTitle("  Informacion del cliente");
        this.setLocationRelativeTo(null);

        userUpdate1 = ListaDeClientes.userUpdate1;
        userUpdate2 = ListaDeClientes.userUpdate2;
        jLabel_Titulo.setText("Informacion del cliente - " + userUpdate1 + " " + userUpdate2);

        txt_DNI.setEnabled(false);

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from clientes where NombreCliente = '" + userUpdate1 + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ID = rs.getString("DNI");

                txt_NombreCliente.setText(rs.getString("NombreCliente"));
                txt_ApellidoCliente.setText(rs.getString("ApellidoCliente"));
                txt_CiudadCliente.setText(rs.getString("CiudadCliente"));
                txt_FechaNacimientoCliente.setText(rs.getString("FechaNacimientoCliente"));
                txt_DNI.setText(rs.getString("DNI"));

            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al cargar usuario: " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar usuario");
        }
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
        jLabel_NombreCliente = new javax.swing.JLabel();
        jLabel_ApellidoCliente = new javax.swing.JLabel();
        jLabel_CiudadCliente = new javax.swing.JLabel();
        txt_FechaNacimientoCliente = new javax.swing.JTextField();
        jLabel_FechaNacimientoCliente = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        jLabel_DNI = new javax.swing.JLabel();
        jButton_ActualizarCliente = new javax.swing.JButton();
        jButton_EliminarCliente = new javax.swing.JButton();
        jLabel_WallpaperAgregarCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Informacion del cliente -");
        jPanel1.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 550, -1));

        txt_NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txt_NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 30));

        jLabel_NombreCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_NombreCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_NombreCliente.setText("Nombre");
        jPanel1.add(jLabel_NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(txt_ApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 200, 30));

        jLabel_ApellidoCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_ApellidoCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_ApellidoCliente.setText("Apellido");
        jPanel1.add(jLabel_ApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        jPanel1.add(txt_CiudadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 30));

        jLabel_CiudadCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_CiudadCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_CiudadCliente.setText("Ciudad / Localidad");
        jPanel1.add(jLabel_CiudadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(txt_FechaNacimientoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, 30));

        jLabel_FechaNacimientoCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_FechaNacimientoCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_FechaNacimientoCliente.setText("Fecha de nacimiento");
        jPanel1.add(jLabel_FechaNacimientoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));
        jPanel1.add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        jLabel_DNI.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_DNI.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_DNI.setText("DNI");
        jPanel1.add(jLabel_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jButton_ActualizarCliente.setBackground(new java.awt.Color(153, 255, 153));
        jButton_ActualizarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_ActualizarCliente.setForeground(new java.awt.Color(35, 35, 35));
        jButton_ActualizarCliente.setText("Actualizar cliente");
        jButton_ActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_ActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 200, 40));

        jButton_EliminarCliente.setBackground(new java.awt.Color(153, 255, 153));
        jButton_EliminarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_EliminarCliente.setForeground(new java.awt.Color(35, 35, 35));
        jButton_EliminarCliente.setText("Eliminar cliente");
        jButton_EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_EliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 200, 40));

        jLabel_WallpaperAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreClienteActionPerformed

    private void jButton_ActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarClienteActionPerformed
        String nombre;
        String apellido;
        String ciudad;
        String fechaNacimiento;
        String dniTexto;

        nombre = txt_NombreCliente.getText().trim();
        apellido = txt_ApellidoCliente.getText().trim();
        ciudad = txt_CiudadCliente.getText().trim();
        fechaNacimiento = txt_FechaNacimientoCliente.getText().trim();
        dniTexto = txt_DNI.getText().trim();

        if (nombre.equals("") || apellido.equals("") || ciudad.equals("") || fechaNacimiento.equals("") || dniTexto.equals("")) {

            if (nombre.equals("")) {
                txt_NombreCliente.setBackground(Color.magenta);
            }

            if (apellido.equals("")) {
                txt_ApellidoCliente.setBackground(Color.magenta);
            }

            if (ciudad.equals("")) {
                txt_CiudadCliente.setBackground(Color.magenta);
            }

            if (fechaNacimiento.equals("")) {
                txt_FechaNacimientoCliente.setBackground(Color.magenta);
            }

            if (dniTexto.equals("")) {
                txt_DNI.setBackground(Color.magenta);
            }
            JOptionPane.showMessageDialog(this, "Asegurese de llenar todos los campos.");

        } else {

            try {
                String dni;
                dni = txt_DNI.getText().trim();

                int entero_dni = Integer.parseInt(dni);
                int entero_ID = Integer.parseInt(ID);

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
                PreparedStatement pst2 = cn.prepareStatement("select DNI from clientes where DNI = '" + entero_dni + "' and not DNI = '" + entero_ID + "'");

                ResultSet rs = pst2.executeQuery();

                PreparedStatement pst1 = cn.prepareStatement("update clientes set NombreCliente = ?, ApellidoCliente = ?, CiudadCliente = ?, FechaNacimientoCliente = ?, DNI = ? where DNI = '" + entero_ID + "'");

                pst1.setString(1, txt_NombreCliente.getText().trim());
                pst1.setString(2, txt_ApellidoCliente.getText().trim());
                pst1.setString(3, txt_CiudadCliente.getText().trim());
                pst1.setString(4, txt_FechaNacimientoCliente.getText().trim());
                pst1.setString(5, txt_DNI.getText().trim());
                pst1.executeUpdate();

                txt_NombreCliente.setBackground(Color.white);
                txt_ApellidoCliente.setBackground(Color.white);
                txt_CiudadCliente.setBackground(Color.white);
                txt_FechaNacimientoCliente.setBackground(Color.white);
                txt_DNI.setBackground(Color.white);

                JOptionPane.showMessageDialog(null, "Modificacion exitosa.");

                cn.close();
                pst1.close();
                pst2.close();

            } catch (SQLException e) {
                System.err.println("Ha ocurrido un error: " + e);
            }
        }
    }//GEN-LAST:event_jButton_ActualizarClienteActionPerformed

    private void jButton_EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarClienteActionPerformed
        try {
            String dni;
            dni = txt_DNI.getText().trim();

            int entero_dni = Integer.parseInt(dni);
            int entero_ID = Integer.parseInt(ID);

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
            PreparedStatement pst2 = cn.prepareStatement("select DNI from clientes where DNI = '" + entero_dni + "' and not DNI = '" + entero_ID + "'");

            ResultSet rs = pst2.executeQuery();

            PreparedStatement pst1 = cn.prepareStatement("delete from clientes where DNI = ?");

            pst1.setString(1, txt_DNI.getText().trim());
            pst1.executeUpdate();

            txt_NombreCliente.setText("");
            txt_ApellidoCliente.setText("");
            txt_CiudadCliente.setText("");
            txt_FechaNacimientoCliente.setText("");
            txt_DNI.setText("");

            JOptionPane.showMessageDialog(null, "Eliminacion exitosa.");

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: " + e);
        }
    }//GEN-LAST:event_jButton_EliminarClienteActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarCliente;
    private javax.swing.JButton jButton_EliminarCliente;
    private javax.swing.JLabel jLabel_ApellidoCliente;
    private javax.swing.JLabel jLabel_CiudadCliente;
    private javax.swing.JLabel jLabel_DNI;
    private javax.swing.JLabel jLabel_FechaNacimientoCliente;
    private javax.swing.JLabel jLabel_NombreCliente;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_WallpaperAgregarCliente;
    private javax.swing.JPanel jPanel1;
    public final javax.swing.JTextField txt_ApellidoCliente = new javax.swing.JTextField();
    public final javax.swing.JTextField txt_CiudadCliente = new javax.swing.JTextField();
    public static javax.swing.JTextField txt_DNI;
    public static javax.swing.JTextField txt_FechaNacimientoCliente;
    public final javax.swing.JTextField txt_NombreCliente = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
