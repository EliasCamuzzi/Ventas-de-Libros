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
public class InformacionLibros extends javax.swing.JFrame {

    String nombreDelLibro = "";
    String ID;

    public InformacionLibros() {
        initComponents();
        setSize(555, 400);
        setResizable(false);
        setTitle("  Informacion del libro");
        this.setLocationRelativeTo(null);

        nombreDelLibro = ListaDeLibros.userUpdate1;
        jLabel_Titulo.setText("Informacion del libro - " + nombreDelLibro);

        txt_ISBN.setEnabled(false);

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_libreria", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from libros where NombreLibro = '" + nombreDelLibro + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ID = rs.getString("ISBN");

                txt_NombreLibro.setText(rs.getString("NombreLibro"));
                txt_AutorLibro.setText(rs.getString("Autor"));
                txt_Genero.setText(rs.getString("Genero"));
                txt_AnnoPublicacionLibro.setText(rs.getString("AnnoDePublicacion"));
                txt_ISBN.setText(rs.getString("ISBN"));
                txt_Precio.setText(rs.getString("Precio"));

            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al cargar libro: " + e);
            JOptionPane.showMessageDialog(null, "Error al cargar libro");
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
        jLabel_NombreLibro = new javax.swing.JLabel();
        jLabel_AutorLibro = new javax.swing.JLabel();
        jLabel_Genero = new javax.swing.JLabel();
        txt_AnnoPublicacionLibro = new javax.swing.JTextField();
        jLabel_AnnoPublicacionLibro = new javax.swing.JLabel();
        txt_ISBN = new javax.swing.JTextField();
        jLabel_ISBN = new javax.swing.JLabel();
        txt_Precio = new javax.swing.JTextField();
        jLabel_Precio = new javax.swing.JLabel();
        jButton_ActualizarLibro = new javax.swing.JButton();
        jButton_EliminarLibro = new javax.swing.JButton();
        jLabel_WallpaperInformacionLibros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Informacion del libro -");
        jPanel1.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 550, -1));

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
        jPanel1.add(txt_AutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 200, 30));

        jLabel_AutorLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_AutorLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_AutorLibro.setText("Autor");
        jPanel1.add(jLabel_AutorLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));
        jPanel1.add(txt_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 30));

        jLabel_Genero.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Genero.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_Genero.setText("Genero");
        jPanel1.add(jLabel_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(txt_AnnoPublicacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 90, 30));

        jLabel_AnnoPublicacionLibro.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_AnnoPublicacionLibro.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_AnnoPublicacionLibro.setText("Fecha de publicacion");
        jPanel1.add(jLabel_AnnoPublicacionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));
        jPanel1.add(txt_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 30));

        jLabel_ISBN.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_ISBN.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_ISBN.setText("ISBN");
        jPanel1.add(jLabel_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel1.add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 150, 30));

        jLabel_Precio.setBackground(new java.awt.Color(35, 35, 35));
        jLabel_Precio.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel_Precio.setText("Precio");
        jPanel1.add(jLabel_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        jButton_ActualizarLibro.setBackground(new java.awt.Color(153, 255, 153));
        jButton_ActualizarLibro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_ActualizarLibro.setForeground(new java.awt.Color(35, 35, 35));
        jButton_ActualizarLibro.setText("Actualizar libro");
        jButton_ActualizarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_ActualizarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 30));

        jButton_EliminarLibro.setBackground(new java.awt.Color(153, 255, 153));
        jButton_EliminarLibro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_EliminarLibro.setForeground(new java.awt.Color(35, 35, 35));
        jButton_EliminarLibro.setText("Eliminar libro");
        jButton_EliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_EliminarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 200, 30));

        jLabel_WallpaperInformacionLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperInformacionLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreLibroActionPerformed

    private void jButton_ActualizarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarLibroActionPerformed
        String annoPublicacion;
        String autor;
        String genero;
        String ISBN;
        String nombre;
        String precio;

        nombre = txt_NombreLibro.getText().trim();
        autor = txt_AutorLibro.getText().trim();
        genero = txt_Genero.getText().trim();
        annoPublicacion = txt_AnnoPublicacionLibro.getText().trim();
        precio = txt_Precio.getText().trim();
        ISBN = txt_ISBN.getText().trim();

        if (nombre.equals("") || autor.equals("") || genero.equals("") || annoPublicacion.equals("") || precio.equals("") || ISBN.equals("")) {

            if (nombre.equals("")) {
                txt_NombreLibro.setBackground(Color.magenta);
            }

            if (autor.equals("")) {
                txt_AutorLibro.setBackground(Color.magenta);
            }

            if (genero.equals("")) {
                txt_Genero.setBackground(Color.magenta);
            }

            if (annoPublicacion.equals("")) {
                txt_AnnoPublicacionLibro.setBackground(Color.magenta);
            }

            if (precio.equals("")) {
                txt_Precio.setBackground(Color.magenta);
            }
            
            if (ISBN.equals("")) {
                txt_ISBN.setBackground(Color.magenta);
            }
            
            JOptionPane.showMessageDialog(this, "Asegurese de llenar todos los campos.");

        } else {

            try {
                String isbn;
                isbn = txt_ISBN.getText().trim();

                int entero_isbn = Integer.parseInt(isbn);
                int entero_ID = Integer.parseInt(ID);

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_libreria", "root", "");
                PreparedStatement pst2 = cn.prepareStatement("select ISBN from libros where ISBN = '" + entero_isbn + "' and not ISBN = '" + entero_ID + "'");

                ResultSet rs = pst2.executeQuery();

                PreparedStatement pst1 = cn.prepareStatement("update libros set NombreLibro = ?, Autor = ?, Genero = ?, AnnoPublicacion = ?, ISBN = ?, Precio = ? where ISBN = '" + entero_ID + "'");

                pst1.setString(1, txt_NombreLibro.getText().trim());
                pst1.setString(2, txt_AutorLibro.getText().trim());
                pst1.setString(3, txt_Genero.getText().trim());
                pst1.setString(4, txt_AnnoPublicacionLibro.getText().trim());
                pst1.setString(5, txt_ISBN.getText().trim());
                pst1.setString(6, txt_Precio.getText().trim());
                pst1.executeUpdate();

                txt_NombreLibro.setBackground(Color.white);
                txt_AutorLibro.setBackground(Color.white);
                txt_Genero.setBackground(Color.white);
                txt_AnnoPublicacionLibro.setBackground(Color.white);
                txt_ISBN.setBackground(Color.white);
                txt_Precio.setBackground(Color.white);

                JOptionPane.showMessageDialog(null, "Modificacion exitosa.");

                cn.close();
                pst1.close();
                pst2.close();

            } catch (SQLException e) {
                System.err.println("Ha ocurrido un error: " + e);
            }
        }
    }//GEN-LAST:event_jButton_ActualizarLibroActionPerformed

    private void jButton_EliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarLibroActionPerformed
        try {
            String isbn;
            isbn = txt_ISBN.getText().trim();

            int entero_isbn = Integer.parseInt(isbn);
            int entero_ID = Integer.parseInt(ID);

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_libreria", "root", "");
            PreparedStatement pst2 = cn.prepareStatement("select ISBN from libros where ISBN = '" + entero_isbn + "' and not ISBN = '" + entero_ID + "'");

            ResultSet rs = pst2.executeQuery();

            PreparedStatement pst1 = cn.prepareStatement("delete from libros where ISBN = ?");

            pst1.setString(1, txt_ISBN.getText().trim());
            pst1.executeUpdate();

            txt_NombreLibro.setText("");
            txt_AutorLibro.setText("");
            txt_Genero.setText("");
            txt_AnnoPublicacionLibro.setText("");
            txt_Precio.setText("");
            txt_ISBN.setText("");

            JOptionPane.showMessageDialog(null, "Eliminacion exitosa.");

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error: " + e);
        }
    }//GEN-LAST:event_jButton_EliminarLibroActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarLibro;
    private javax.swing.JButton jButton_EliminarLibro;
    private javax.swing.JLabel jLabel_AnnoPublicacionLibro;
    private javax.swing.JLabel jLabel_AutorLibro;
    private javax.swing.JLabel jLabel_Genero;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_NombreLibro;
    private javax.swing.JLabel jLabel_Precio;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_WallpaperInformacionLibros;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txt_AnnoPublicacionLibro;
    public final javax.swing.JTextField txt_AutorLibro = new javax.swing.JTextField();
    public final javax.swing.JTextField txt_Genero = new javax.swing.JTextField();
    public static javax.swing.JTextField txt_ISBN;
    public final javax.swing.JTextField txt_NombreLibro = new javax.swing.JTextField();
    public static javax.swing.JTextField txt_Precio;
    // End of variables declaration//GEN-END:variables
}
