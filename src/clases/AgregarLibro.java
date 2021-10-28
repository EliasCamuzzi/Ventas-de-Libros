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
public class AgregarLibro extends javax.swing.JFrame {

    public AgregarLibro() {
        initComponents();
        setSize(555, 400);
        setResizable(false);
        setTitle("  Agregar libro");
        this.setLocationRelativeTo(null);

        txt_NombreLibro.setToolTipText("Ej: El señor de los anillos - La comunidad del anillo");
        txt_AutorLibro.setToolTipText("Ej: J.R.R. Tolkien");
        txt_GeneroLibro.setToolTipText("Ej: Aventura");
        txt_AnnoPublicacionLibro.setToolTipText("Ej: DD/MM/YYYY");
        txt_ISBN.setToolTipText("Ej: 4296");
        txt_PrecioLibro.setToolTipText("Ej: $500");

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
        txt_NombreLibro = new javax.swing.JTextField();
        jLabel_NombreLibro = new javax.swing.JLabel();
        txt_AutorLibro = new javax.swing.JTextField();
        jLabel_AutorLibro = new javax.swing.JLabel();
        txt_GeneroLibro = new javax.swing.JTextField();
        jLabel_GeneroLibro = new javax.swing.JLabel();
        txt_AnnoPublicacionLibro = new javax.swing.JTextField();
        jLabel_AnnoPublicacionLibro = new javax.swing.JLabel();
        txt_ISBN = new javax.swing.JTextField();
        jLabel_ISBN = new javax.swing.JLabel();
        txt_PrecioLibro = new javax.swing.JTextField();
        jLabel_PrecioLibro = new javax.swing.JLabel();
        jButton_AgregarLibro = new javax.swing.JButton();
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

        jLabel_Titulo.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Titulo.setText("Panel para agregar libro");
        jPanel1.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        txt_NombreLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_NombreLibroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_NombreLibroFocusLost(evt);
            }
        });
        txt_NombreLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreLibroActionPerformed(evt);
            }
        });
        jPanel1.add(txt_NombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 30));

        jLabel_NombreLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_NombreLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_NombreLibro.setText("Nombre");
        jPanel1.add(jLabel_NombreLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txt_AutorLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_AutorLibroFocusLost(evt);
            }
        });
        jPanel1.add(txt_AutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 200, 30));

        jLabel_AutorLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_AutorLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_AutorLibro.setText("Autor");
        jPanel1.add(jLabel_AutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        jPanel1.add(txt_GeneroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 200, 30));

        jLabel_GeneroLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_GeneroLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_GeneroLibro.setText("Genero");
        jPanel1.add(jLabel_GeneroLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        jPanel1.add(txt_AnnoPublicacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, 30));

        jLabel_AnnoPublicacionLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_AnnoPublicacionLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_AnnoPublicacionLibro.setText("Fecha de publicacion");
        jPanel1.add(jLabel_AnnoPublicacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        txt_ISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ISBNKeyTyped(evt);
            }
        });
        jPanel1.add(txt_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 30));

        jLabel_ISBN.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_ISBN.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_ISBN.setText("ISBN");
        jPanel1.add(jLabel_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel1.add(txt_PrecioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 90, 30));

        jLabel_PrecioLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_PrecioLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_PrecioLibro.setText("Precio");
        jPanel1.add(jLabel_PrecioLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jButton_AgregarLibro.setBackground(new java.awt.Color(153, 255, 153));
        jButton_AgregarLibro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_AgregarLibro.setForeground(new java.awt.Color(35, 35, 35));
        jButton_AgregarLibro.setText("Agregar libro");
        jButton_AgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_AgregarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 180, 30));

        jLabel_WallpaperAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreLibroActionPerformed

    }//GEN-LAST:event_txt_NombreLibroActionPerformed

    private void jButton_AgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarLibroActionPerformed
        String nombre;
        String genero;
        String autor;
        String annoPublicacion;
        String ISBN;
        String precio;

        nombre = txt_NombreLibro.getText().trim();
        autor = txt_AutorLibro.getText().trim();
        genero = txt_GeneroLibro.getText().trim();
        annoPublicacion = txt_AnnoPublicacionLibro.getText().trim();
        precio = txt_PrecioLibro.getText().trim();
        ISBN = txt_ISBN.getText().trim();

        if (ISBN.length() > 13) {
            JOptionPane.showMessageDialog(this, "Numero ISBN superior al permitido.");

        } else {
            if (nombre.equals("") || genero.equals("") || autor.equals("") || annoPublicacion.equals("") || ISBN.equals("") || precio.equals("")) {

                if (nombre.equals("")) {
                    txt_NombreLibro.setBackground(Color.magenta);
                }

                if (autor.equals("")) {
                    txt_AutorLibro.setBackground(Color.magenta);
                }

                if (genero.equals("")) {
                    txt_GeneroLibro.setBackground(Color.magenta);
                }

                if (annoPublicacion.equals("")) {
                    txt_AnnoPublicacionLibro.setBackground(Color.magenta);
                }

                if (ISBN.equals("")) {
                    txt_ISBN.setBackground(Color.magenta);
                }

                if (precio.equals("")) {
                    txt_PrecioLibro.setBackground(Color.magenta);
                }

                JOptionPane.showMessageDialog(this, "Asegurese de llenar todos los campos.");

            } else {
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
                    PreparedStatement pst = cn.prepareStatement("insert into libros values(?,?,?,?,?,?)");

                    pst.setString(1, nombre);
                    pst.setString(2, autor);
                    pst.setString(3, genero);
                    pst.setString(4, annoPublicacion);
                    pst.setString(5, ISBN);
                    pst.setString(6, precio);
                    pst.executeUpdate();

                    txt_NombreLibro.setText("");
                    txt_AutorLibro.setText("");
                    txt_GeneroLibro.setText("");
                    txt_AnnoPublicacionLibro.setText("");
                    txt_PrecioLibro.setText("");
                    txt_ISBN.setText("");

                    txt_NombreLibro.setBackground(Color.white);
                    txt_AutorLibro.setBackground(Color.white);
                    txt_GeneroLibro.setBackground(Color.white);
                    txt_AnnoPublicacionLibro.setBackground(Color.white);
                    txt_PrecioLibro.setBackground(Color.white);
                    txt_ISBN.setBackground(Color.white);

                    JOptionPane.showMessageDialog(this, "Libro registrado con exito.");

                    cn.close();
                    pst.close();

                } catch (SQLException e) {
                    System.err.println("El error es el siguiente: " + e);
                }
            }
        }

    }//GEN-LAST:event_jButton_AgregarLibroActionPerformed

    private void txt_NombreLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreLibroFocusLost

    }//GEN-LAST:event_txt_NombreLibroFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

    }//GEN-LAST:event_formWindowGainedFocus

    private void txt_NombreLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_NombreLibroFocusGained

    }//GEN-LAST:event_txt_NombreLibroFocusGained

    private void txt_AutorLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_AutorLibroFocusLost

    }//GEN-LAST:event_txt_AutorLibroFocusLost

    private void txt_ISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ISBNKeyTyped
        char validacionCampo = evt.getKeyChar();

        if (Character.isDigit(validacionCampo)) {

        } else {
            if (validacionCampo != evt.VK_BACK_SPACE) {
                evt.consume();

                JOptionPane.showMessageDialog(rootPane, "Asegurese de ingresar solo numeros en el ISBN");
                
            }
        }
    }//GEN-LAST:event_txt_ISBNKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregarLibro;
    private javax.swing.JLabel jLabel_AnnoPublicacionLibro;
    private javax.swing.JLabel jLabel_AutorLibro;
    private javax.swing.JLabel jLabel_GeneroLibro;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_NombreLibro;
    private javax.swing.JLabel jLabel_PrecioLibro;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_WallpaperAgregarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_AnnoPublicacionLibro;
    private javax.swing.JTextField txt_AutorLibro;
    private javax.swing.JTextField txt_GeneroLibro;
    private javax.swing.JTextField txt_ISBN;
    private javax.swing.JTextField txt_NombreLibro;
    private javax.swing.JTextField txt_PrecioLibro;
    // End of variables declaration//GEN-END:variables
}
