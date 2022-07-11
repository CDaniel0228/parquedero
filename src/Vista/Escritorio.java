
package Vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
public final class Escritorio extends javax.swing.JFrame {

    Login login;
    Buscar buscar;
    Cliente cliente;
    ClienteFuncion clienteF;
    Vehiculo vehiculo;
    VehiculoFuncion vehiculoF;
    Recivo recivo;
    Color colorBonton=new Color(190,190,190);
    ImageIcon icono=new ImageIcon("./GatoNegro.jpeg");
    public Escritorio() {
        initComponents();
        this.setLocationRelativeTo(null);
        menuInvisible();
        lbIcono.setBorder(null);
        lbIcono.setIcon(new ImageIcon(icono.getImage().getScaledInstance(170, 130, Image.SCALE_SMOOTH)));
        
        login=new Login(this);
        buscar=new Buscar(this);
        cliente=new Cliente(this);
        clienteF=new ClienteFuncion(this);
        vehiculo=new Vehiculo(this);
        vehiculoF=new VehiculoFuncion(this);
        recivo=new Recivo(this);
        
        jpPrincipal.add(login);
        login.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        lbIcono = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRCliente = new javax.swing.JButton();
        btnRVehiculo = new javax.swing.JButton();
        btnGRecivo = new javax.swing.JButton();
        jpPrincipal = new javax.swing.JPanel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(244, 244, 244));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(244, 244, 244));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIcono.setBackground(new java.awt.Color(255, 255, 255));
        lbIcono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpMenu.add(lbIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 170, 130));

        btnBuscar.setBackground(new java.awt.Color(190, 190, 190));
        btnBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jpMenu.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 30));

        btnSalir.setBackground(new java.awt.Color(150, 150, 150));
        btnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jpMenu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, 30));

        btnRCliente.setBackground(new java.awt.Color(150, 150, 150));
        btnRCliente.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRCliente.setText("Registrar Cliente");
        btnRCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRClienteActionPerformed(evt);
            }
        });
        jpMenu.add(btnRCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 30));

        btnRVehiculo.setBackground(new java.awt.Color(150, 150, 150));
        btnRVehiculo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnRVehiculo.setText("Registrar Vehiculo");
        btnRVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRVehiculoActionPerformed(evt);
            }
        });
        jpMenu.add(btnRVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 160, 30));

        btnGRecivo.setBackground(new java.awt.Color(150, 150, 150));
        btnGRecivo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnGRecivo.setForeground(new java.awt.Color(255, 255, 255));
        btnGRecivo.setText("Generar Recivo");
        btnGRecivo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGRecivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRecivoActionPerformed(evt);
            }
        });
        jpMenu.add(btnGRecivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 30));

        jpFondo.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 200, 480));

        jpPrincipal.setBackground(new java.awt.Color(221, 221, 221));
        jpPrincipal.setLayout(new java.awt.BorderLayout());
        jpFondo.add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 600, 480));
        jpFondo.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        getContentPane().add(jpFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        abrirVentaba();
        colorFondo();
        jpPrincipal.add(buscar);
        buscar.setVisible(true);
        btnBuscar.setBackground(colorBonton);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRClienteActionPerformed
        colorFondo();
        abrirVentaba();
        jpPrincipal.add(cliente);
        cliente.setVisible(true);
        btnRCliente.setBackground(colorBonton);
    }//GEN-LAST:event_btnRClienteActionPerformed

    private void btnRVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRVehiculoActionPerformed
        colorFondo();
        abrirVentaba();
        jpPrincipal.add(vehiculo);
        vehiculo.setVisible(true);
        btnRVehiculo.setBackground(colorBonton);
    }//GEN-LAST:event_btnRVehiculoActionPerformed

    private void btnGRecivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRecivoActionPerformed
        colorFondo();
        abrirVentaba();
        jpPrincipal.add(recivo);
        recivo.setVisible(true);
        btnGRecivo.setBackground(colorBonton);
    }//GEN-LAST:event_btnGRecivoActionPerformed

    public void menuInvisible(){
        btnBuscar.setVisible(false);
        btnRCliente.setVisible(false);
        btnRVehiculo.setVisible(false);
        btnGRecivo.setVisible(false);
        btnSalir.setVisible(false);
    }
    
    public void menuVisible(){
        btnBuscar.setVisible(true);
        btnRCliente.setVisible(true);
        btnRVehiculo.setVisible(true);
        btnGRecivo.setVisible(true);
        btnSalir.setVisible(true);
    }
    
    public void colorFondo(){
        btnBuscar.setBackground(new Color(150,150,150));
        btnRCliente.setBackground(new Color(150,150,150));
        btnRVehiculo.setBackground(new Color(150,150,150));
        btnGRecivo.setBackground(new Color(150,150,150));
        btnSalir.setBackground(new Color(150,150,150));
    }
    
    public void abrirVentaba(){
        login.setVisible(false);
        buscar.setVisible(false);
        cliente.setVisible(false);
        vehiculo.setVisible(false);
        recivo.setVisible(false);
        clienteF.setVisible(false);
        vehiculoF.setVisible(false);
        
    }
    
    public void accionBuscar(){
        login.setVisible(false);
        jpPrincipal.add(buscar);
        buscar.setVisible(true);
        menuVisible();
        jpMenu.setBackground(new Color(221,221,221));
        jpPrincipal.setBackground(new Color(221,221,221));
    }
    public void accionCliente(){
        buscar.setVisible(false);
        jpPrincipal.add(clienteF);
        clienteF.setVisible(true);
        clienteF.mostrarCliente();
        menuVisible();
        jpMenu.setBackground(new Color(221,221,221));
        jpPrincipal.setBackground(new Color(221,221,221));
    }
    
    public void accionVehiculo(){
        buscar.setVisible(false);
        jpPrincipal.add(vehiculoF);
        vehiculoF.setVisible(true);
        vehiculoF.buscarBD();
        jpMenu.setBackground(new Color(221,221,221));
        jpPrincipal.setBackground(new Color(221,221,221));
        menuVisible();
    }
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Escritorio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGRecivo;
    private javax.swing.JButton btnRCliente;
    private javax.swing.JButton btnRVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbIcono;
    // End of variables declaration//GEN-END:variables

}
