
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Suba
 */
public class FrmDevolverMaterial extends javax.swing.JFrame {

    Biblioteca bibliotecaCompartida = new Biblioteca();

    /**
     * Creates new form FrmDevolverMaterial
     */
    public FrmDevolverMaterial(Biblioteca biblioteca) {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVolverInicio = new javax.swing.JButton();
        txtDevolucion = new javax.swing.JTextField();
        btnDevolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Devolver Material");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 270, 70));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Titulo:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 110, 50));

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

        txtDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 160, 50));

        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Suba\\Downloads\\b99b81de-f181-4ad2-9fbc-11da644cf692.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 650));
        jLabel1.setMinimumSize(new java.awt.Dimension(700, 650));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 650));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void txtDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevolucionActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        devolverMaterial();
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void devolverMaterial() {
        String tituloADevolver = txtDevolucion.getText().trim();

        if (tituloADevolver.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el título del material a devolver.");
            return;
        }

        try {
            // Llama al método devolverMaterial
            bibliotecaCompartida.devolverMaterial(tituloADevolver); //

            // Muestra un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Material '" + tituloADevolver + "' devuelto exitosamente.");
            txtDevolucion.setText("");

        } catch (MaterialNoEncontradoException ex) { // Captura tu excepción personalizada
            // Si el material no se encuentra, muestra un mensaje de error
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) { // Captura cualquier otra excepción inesperada
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado al devolver el material: " + ex.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDevolucion;
    // End of variables declaration//GEN-END:variables
}
