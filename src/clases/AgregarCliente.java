package clases;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias Camuzzi
 */
public class AgregarCliente extends javax.swing.JFrame {

    public AgregarCliente() {
        initComponents();
        setSize(555, 400);
        setResizable(false);
        setTitle("  Agregar cliente");
        this.setLocationRelativeTo(null);

        txt_NombreCliente.setToolTipText("Ej: Juan");
        txt_ApellidoCliente.setToolTipText("Ej: Leiva");
        txt_CiudadCliente.setToolTipText("Ej: Santa Fe");
        txt_FechaNacimientoCliente.setToolTipText("Ej: DD/MM/YYYY");
        txt_DNI.setToolTipText("Ej: 34563456");
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
        jLabel_AgregarCliente = new javax.swing.JLabel();
        txt_NombreCliente = new javax.swing.JTextField();
        jLabel_NombreCliente = new javax.swing.JLabel();
        txt_ApellidoCliente = new javax.swing.JTextField();
        jLabel_ApellidoCliente = new javax.swing.JLabel();
        txt_CiudadCliente = new javax.swing.JTextField();
        jLabel_CiudadCliente = new javax.swing.JLabel();
        txt_FechaNacimientoCliente = new javax.swing.JTextField();
        jLabel_FechaNacimientoCliente = new javax.swing.JLabel();
        txt_DNI = new javax.swing.JTextField();
        jLabel_DNI = new javax.swing.JLabel();
        jButton_AgregarCliente = new javax.swing.JButton();
        jLabel_WallpaperAgregarCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_AgregarCliente.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_AgregarCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_AgregarCliente.setText("Panel para agregar Cliente");
        jPanel1.add(jLabel_AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        txt_NombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreClienteFocusLost(evt);
            }
        });
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

        txt_ApellidoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_ApellidoClienteFocusLost(evt);
            }
        });
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

        txt_DNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DNIKeyTyped(evt);
            }
        });
        jPanel1.add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        jLabel_DNI.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_DNI.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_DNI.setText("DNI");
        jPanel1.add(jLabel_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jButton_AgregarCliente.setBackground(new java.awt.Color(153, 255, 153));
        jButton_AgregarCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_AgregarCliente.setForeground(new java.awt.Color(35, 35, 35));
        jButton_AgregarCliente.setText("Agregar cliente");
        jButton_AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 200, 50));

        jLabel_WallpaperAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreClienteActionPerformed

    }//GEN-LAST:event_txt_NombreClienteActionPerformed

    private void jButton_AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarClienteActionPerformed
        String nombre;
        String apellido;
        String ciudad;
        String fechaNacimiento;
        String dni;

        nombre = txt_NombreCliente.getText().trim();
        apellido = txt_ApellidoCliente.getText().trim();
        ciudad = txt_CiudadCliente.getText().trim();
        fechaNacimiento = txt_FechaNacimientoCliente.getText().trim();
        dni = txt_DNI.getText().trim();

        if (dni.length() != 8) {
            JOptionPane.showMessageDialog(this, "Asegurese de colocar la cantidad correcta de numeros del DNI (sin puntos).");

        } else {
            if (nombre.equals("") || apellido.equals("") || ciudad.equals("") || fechaNacimiento.equals("") || dni.equals("")) {

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

                if (dni.equals("")) {
                    txt_DNI.setBackground(Color.magenta);
                }
                JOptionPane.showMessageDialog(this, "Asegurese de llenar todos los campos.");

            } else {
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
                    PreparedStatement pst = cn.prepareStatement("insert into clientes values(?,?,?,?,?)");

                    pst.setString(1, nombre);
                    pst.setString(2, apellido);
                    pst.setString(3, ciudad);
                    pst.setString(4, fechaNacimiento);
                    pst.setString(5, dni);
                    pst.executeUpdate();

                    txt_NombreCliente.setText("");
                    txt_ApellidoCliente.setText("");
                    txt_CiudadCliente.setText("");
                    txt_FechaNacimientoCliente.setText("");
                    txt_DNI.setText("");

                    txt_NombreCliente.setBackground(Color.white);
                    txt_ApellidoCliente.setBackground(Color.white);
                    txt_CiudadCliente.setBackground(Color.white);
                    txt_FechaNacimientoCliente.setBackground(Color.white);
                    txt_DNI.setBackground(Color.white);

                    JOptionPane.showMessageDialog(this, "Usuario registrado con exito.");

                    cn.close();
                    pst.close();

                } catch (SQLException e) {
                    System.err.println("El error es el siguiente: " + e);
                }
            }
        }

    }//GEN-LAST:event_jButton_AgregarClienteActionPerformed

    private void txt_NombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreClienteFocusLost

    }//GEN-LAST:event_txt_NombreClienteFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void txt_NombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreClienteFocusGained

    }//GEN-LAST:event_txt_NombreClienteFocusGained

    private void txt_ApellidoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_ApellidoClienteFocusLost

    }//GEN-LAST:event_txt_ApellidoClienteFocusLost

    private void txt_DNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DNIKeyTyped
        char validacionCampo = evt.getKeyChar();

        if (Character.isDigit(validacionCampo)) {

        } else {
            if (validacionCampo != evt.VK_BACK_SPACE) {
                evt.consume();

                JOptionPane.showMessageDialog(rootPane, "Asegurese de ingresar solo numeros en el DNI");
                
            }
        }
    }//GEN-LAST:event_txt_DNIKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregarCliente;
    private javax.swing.JLabel jLabel_AgregarCliente;
    private javax.swing.JLabel jLabel_ApellidoCliente;
    private javax.swing.JLabel jLabel_CiudadCliente;
    private javax.swing.JLabel jLabel_DNI;
    private javax.swing.JLabel jLabel_FechaNacimientoCliente;
    private javax.swing.JLabel jLabel_NombreCliente;
    private javax.swing.JLabel jLabel_WallpaperAgregarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ApellidoCliente;
    private javax.swing.JTextField txt_CiudadCliente;
    private javax.swing.JTextField txt_DNI;
    private javax.swing.JTextField txt_FechaNacimientoCliente;
    private javax.swing.JTextField txt_NombreCliente;
    // End of variables declaration//GEN-END:variables
}
