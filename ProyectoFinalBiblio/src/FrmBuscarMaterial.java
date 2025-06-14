
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Suba
 */
public class FrmBuscarMaterial extends javax.swing.JFrame {

    private Biblioteca bibliotecaCompartida = new Biblioteca();

    /**
     * Creates new form FrmBuscarMaterial
     */
    public FrmBuscarMaterial(Biblioteca biblioteca) {
        initComponents();

        this.bibliotecaCompartida = biblioteca;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnVolverInicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultados = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar material");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 102, 374, 56));

        btnVolverInicio.setBackground(new java.awt.Color(51, 51, 0));
        btnVolverInicio.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        btnVolverInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverInicio.setText("<- Volver al inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setText("Titulo:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 209, 149, 46));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 209, 182, 46));

        txaResultados.setColumns(20);
        txaResultados.setRows(5);
        jScrollPane1.setViewportView(txaResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 301, 344));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 219, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Suba\\Downloads\\d6598909-8c37-47e4-9de2-840fabf15185.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarMaterial();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarMaterial() {
        String tituloBuscado = txtBusqueda.getText(); // Obtiene el texto y quita espacios en blanco

        if (tituloBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un título para buscar.");
            return; // Sale del método si el campo está vacío
        }

        try {
            // Llama al método buscarMaterial de tu instancia de Biblioteca
            MaterialBibliografico encontrado = bibliotecaCompartida.buscarMaterial(tituloBuscado); //

            // Si el material fue encontrado, muestra su descripción y cantidad
            String mensajeResultado = "Material Encontrado:\n"
                    + encontrado.getDescripcion() + "\n"
                    + "Cantidad Disponible: " + encontrado.getCantidad();
            // Muestra el resultado en el JTextArea o un JOptionPane
            // Si tienes txtAreaResultadosBusqueda:
            if (txaResultados != null) { // Asegúrate de que este componente exista
                txaResultados.setText(mensajeResultado);
            }

        } catch (MaterialNoEncontradoException ex) { // Captura tu excepción personalizada
            // Si el material no se encuentra, muestra un mensaje de error
            if (txaResultados != null) { // Asegúrate de que este componente exista
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        } catch (Exception ex) { // Captura cualquier otra excepción inesperada
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado al buscar: " + ex.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultados;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
