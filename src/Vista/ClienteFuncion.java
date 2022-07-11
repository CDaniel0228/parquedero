
package Vista;
import Modelo.ClienteM;
import Control.infoCliente;
import Control.Ficheros;

public final class ClienteFuncion extends javax.swing.JPanel {
    
    infoCliente infoC=new infoCliente();
    Ficheros archivos=new Ficheros();
    Escritorio escritorio;
    public ClienteFuncion(Escritorio escritorio) {
        initComponents();
        this.escritorio=escritorio;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxCelular = new javax.swing.JTextField();
        boxNombre = new javax.swing.JTextField();
        boxApellido = new javax.swing.JTextField();
        boxCedula = new javax.swing.JTextField();
        btnECliente = new javax.swing.JButton();
        btnACliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbGondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Cliente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, -1));
        add(boxCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 200, 30));
        add(boxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 440, 30));
        add(boxApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 440, 30));
        add(boxCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 210, 30));

        btnECliente.setBackground(new java.awt.Color(153, 153, 153));
        btnECliente.setText("Eliminar Cliente");
        btnECliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEClienteActionPerformed(evt);
            }
        });
        add(btnECliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 190, 40));

        btnACliente.setBackground(new java.awt.Color(153, 153, 153));
        btnACliente.setText("Actualizar Cliente");
        btnACliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAClienteActionPerformed(evt);
            }
        });
        add(btnACliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 160, 40));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("Celular");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("Apellido");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("Identificacion");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));
        add(lbGondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEClienteActionPerformed
        ClienteM clienteM=new ClienteM();
        clienteM.setNombre(boxCedula.getText());
        if(infoC.eliminar(clienteM)){
            System.out.println("Se ha eliminado");
            limpiar();
        }
                
    }//GEN-LAST:event_btnEClienteActionPerformed

    private void btnAClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAClienteActionPerformed
        ClienteM clienteM=new ClienteM();
        clienteM.setNombre(boxNombre.getText());
        clienteM.setApellido(boxApellido.getText());
        clienteM.setIdentificacion(Integer.parseInt(boxCedula.getText()));
        clienteM.setCelular(boxCelular.getText());
        if(infoC.modificar(clienteM)){
            System.out.println("Se ha actializado");
            limpiar();
        }
    }//GEN-LAST:event_btnAClienteActionPerformed

    public void mostrarCliente(){
        
        boxNombre.setText((String) archivos.txt_SubirCliente().get(0));
        boxApellido.setText((String) archivos.txt_SubirCliente().get(1));
        boxCedula.setText((String) archivos.txt_SubirCliente().get(2));
        boxCelular.setText((String) archivos.txt_SubirCliente().get(3));
        archivos.txt_EliminarCliente();
        archivos.txt_EliminarVehiculo();
        
    }
    
    public void limpiar(){
        boxNombre.setText("");
        boxApellido.setText("");
        boxCedula.setText("");
        boxCelular.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxApellido;
    private javax.swing.JTextField boxCedula;
    private javax.swing.JTextField boxCelular;
    private javax.swing.JTextField boxNombre;
    private javax.swing.JButton btnACliente;
    private javax.swing.JButton btnECliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbGondo;
    // End of variables declaration//GEN-END:variables
}
