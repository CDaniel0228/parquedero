
package Vista;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import Modelo.VehiculoM;
import Control.infoVehiculo;
import Control.Ficheros;
import java.awt.Toolkit;

public class VehiculoFuncion extends javax.swing.JPanel {
    JFileChooser selecionar=new JFileChooser();
    File archivo;
    String ruta;
    ImageIcon foto;
    byte imageBD[];
    Ficheros archivos=new Ficheros();
    infoVehiculo infoV= new infoVehiculo();
    Escritorio escritorio;
    public VehiculoFuncion(Escritorio escritorio) {
        initComponents();
        this.escritorio=escritorio;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxCliente = new javax.swing.JTextField();
        boxMarca = new javax.swing.JTextField();
        boxFecha = new javax.swing.JTextField();
        boxPlaca = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        btnAVehiculo = new javax.swing.JButton();
        btnEVehiculo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(221, 221, 221));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Vehiculo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 590, -1));
        add(boxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 200, 30));
        add(boxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 450, 30));
        add(boxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 200, 30));
        add(boxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 200, 30));

        lbImage.setText("Foto");
        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImageMouseClicked(evt);
            }
        });
        add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, 150));

        btnAVehiculo.setBackground(new java.awt.Color(153, 153, 153));
        btnAVehiculo.setText("Actualizar Vehiculo");
        btnAVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAVehiculoActionPerformed(evt);
            }
        });
        add(btnAVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 210, 40));

        btnEVehiculo.setBackground(new java.awt.Color(153, 153, 153));
        btnEVehiculo.setText("Eliminar Vehiculo");
        btnEVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEVehiculoActionPerformed(evt);
            }
        });
        add(btnEVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 180, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel3.setText("Foto");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setText("Marca");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de llegada");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel6.setText("Placa");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("Cliente");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));
        add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void lbImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImageMouseClicked
        if(selecionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=selecionar.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith(".jpg") || archivo.getName().endsWith(".png") || archivo.getName().endsWith(".jpeg")){
                    ruta=selecionar.getSelectedFile().toString();
                    foto=new ImageIcon(ruta);
                    lbImage.setIcon(new ImageIcon(foto.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH)));
                }else{
                    System.out.println("Imagen no compatible");
                }
            }
            }
    }//GEN-LAST:event_lbImageMouseClicked

    private void btnAVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAVehiculoActionPerformed
        VehiculoM vehiculoM= new VehiculoM();
        vehiculoM.setMarca(boxMarca.getText());
        //vehiculoM.setFecha(boxFecha.getText());
        vehiculoM.setPlaca(boxPlaca.getText());
        vehiculoM.setImagen(imageBD);
        vehiculoM.setCedula(Integer.parseInt(boxCliente.getText()));
        
            if(infoV.modificar(vehiculoM)){
                System.out.println("Se ha actualizado");
                limpiar();
            }
        
    }//GEN-LAST:event_btnAVehiculoActionPerformed

    private void btnEVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEVehiculoActionPerformed
        VehiculoM vehiculoM= new VehiculoM();
        vehiculoM.setPlaca(boxPlaca.getText());
        if(infoV.eliminar(vehiculoM)){
            System.out.println("Se ha eliminado");
            limpiar();
        }
        
    }//GEN-LAST:event_btnEVehiculoActionPerformed

    public void buscarBD(){
        VehiculoM vehiculoM= new VehiculoM();
        vehiculoM.setPlaca(archivos.txt_SubirVehiculo());
        if(infoV.buscar(vehiculoM)){
            boxMarca.setText(vehiculoM.getMarca());
            boxPlaca.setText(vehiculoM.getPlaca());
            Image img=Toolkit.getDefaultToolkit().createImage(vehiculoM.getImagen());
            ImageIcon fotoBD=new ImageIcon(img);
            lbImage.setIcon(new ImageIcon(fotoBD.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            archivos.txt_EliminarVehiculo();
            archivos.txt_EliminarCliente();
        }
        
    }
    
    public void limpiar(){
        boxMarca.setText("");
        boxFecha.setText("");
        boxPlaca.setText("");
        boxCliente.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxCliente;
    private javax.swing.JTextField boxFecha;
    private javax.swing.JTextField boxMarca;
    private javax.swing.JTextField boxPlaca;
    private javax.swing.JButton btnAVehiculo;
    private javax.swing.JButton btnEVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbImage;
    // End of variables declaration//GEN-END:variables
}
