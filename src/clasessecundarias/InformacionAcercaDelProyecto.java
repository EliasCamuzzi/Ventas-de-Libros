package clasessecundarias;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Elias Camuzzi
 */
public class InformacionAcercaDelProyecto extends javax.swing.JFrame {

    public InformacionAcercaDelProyecto() {
        initComponents();
        setSize(400, 300);
        setResizable(false);
        setTitle("  Acerca de");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Informacion = new javax.swing.JTextArea();
        jLabel_WallpaperAcercaDe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea_Informacion.setColumns(20);
        jTextArea_Informacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea_Informacion.setRows(5);
        jTextArea_Informacion.setText("Proyecto desarrollado por Elias Camuzzi.\n\nNombre de la aplicacion: Ventas de Libros. v1.2\n\nFunciones de la aplicacion:\n          1.- La base de datos corre en un unico servidor.\n          2.- La base de datos es un MySQL server.\n          3.- La base de datos puede recibir comandos SQL en\n                formato de string y retornar respuestas.\n          4.- El acceso a la base de datos se realiza a traves del\n                puerto 3306.\n\n----------------------------------------------------------------------------------\n                                         IMPORTANTE\nLos iconos utilizados en este proyecto fueron extraidos del\nsitio web: www.flaticon.com");
        jScrollPane2.setViewportView(jTextArea_Informacion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, 220));

        jLabel_WallpaperAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lightgreen background.jpg"))); // NOI18N
        jPanel1.add(jLabel_WallpaperAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
            java.util.logging.Logger.getLogger(InformacionAcercaDelProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionAcercaDelProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionAcercaDelProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionAcercaDelProyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionAcercaDelProyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_WallpaperAcercaDe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Informacion;
    // End of variables declaration//GEN-END:variables
}
