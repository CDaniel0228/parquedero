
package Vista;

public class Login extends javax.swing.JPanel {

    Escritorio escritorio;
    public Login(Escritorio escritorio) {
        initComponents();
        this.escritorio=escritorio;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(244, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, -1));

        jTextField2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Contraseña");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 300, 30));

        btnIniciar.setBackground(new java.awt.Color(153, 153, 153));
        btnIniciar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Secion");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 30));

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Usuario");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 300, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 470, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
       escritorio.accionBuscar();
    }//GEN-LAST:event_btnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
