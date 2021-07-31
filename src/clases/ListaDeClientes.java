package clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elias Camuzzi
 */
public class ListaDeClientes extends javax.swing.JFrame {

    String user;
    public static String userUpdate1 = "";
    public static String userUpdate2 = "";
    DefaultTableModel modelo = new DefaultTableModel();

    public ListaDeClientes() {
        initComponents();
        setSize(700, 400);
        setResizable(false);
        setTitle("  Lista de clientes");
        this.setLocationRelativeTo(null);

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_libreria", "root", "");
            PreparedStatement pst = cn.prepareStatement("select NombreCliente, ApellidoCliente, Ciudad, FechaNacimiento, DNI from clientes");

            ResultSet rs = pst.executeQuery();

            jTable_Registro = new JTable(modelo);
            jScrollPane1.setViewportView(jTable_Registro);

            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Ciudad/Localidad");
            modelo.addColumn("Fecha de nacimiento");
            modelo.addColumn("DNI");

            while (rs.next()) {
                Object[] fila = new Object[5];

                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }

            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar la tabla: " + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar la informacion.");
        }

        jTable_Registro.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_Registro.rowAtPoint(e.getPoint());
                int columna_point1 = 0;
                int columna_point2 = 1;

                if (fila_point > -1) {
                    userUpdate1 = (String) modelo.getValueAt(fila_point, columna_point1);
                    userUpdate2 = (String) modelo.getValueAt(fila_point, columna_point2);
                    InformacionClientes informacionCliente = new InformacionClientes();
                    informacionCliente.setVisible(true);
                    
                    dispose();
                }
            }
        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Registro = new javax.swing.JTable();
        jLabel_WallpaperAgregarCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Clientes registrados");
        jPanel1.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 700, -1));

        jTable_Registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Registro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 670, 300));

        jLabel_WallpaperAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_WallpaperAgregarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Registro;
    // End of variables declaration//GEN-END:variables
}
