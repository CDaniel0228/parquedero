
package Vista;
import Modelo.ClienteM;
import Control.infoConsulta;
import Control.Ficheros;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public final class Buscar extends javax.swing.JPanel  implements ActionListener{
    
    infoConsulta consultaBD=new infoConsulta();
    Escritorio escritorio;
    Ficheros archivo=new Ficheros();
    //Cliente
    JButton btnGCliente;
    JLabel titleCliente, lbNombre, lbCedula, lbCelular;
    //Vehiculo
    JLabel titleVehiculo[];
    JLabel lbMarca[];
    JLabel lbFoto[];
    JLabel lbPlaca[];
    JButton btnGVehiculo[];
    Image img[];
    ImageIcon fotoBD[];
    Font estilo=new Font(TOOL_TIP_TEXT_KEY, 1, 20);
    String apellido;
    public Buscar(Escritorio escritorio) {
        
        initComponents();
        this.escritorio=escritorio;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scPanel = new javax.swing.JScrollPane();
        jpRegistro = new javax.swing.JPanel();

        setBackground(new java.awt.Color(221, 221, 221));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Resultados para La busqueda");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Buscar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 43, -1, -1));

        boxBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxBusquedaKeyTyped(evt);
            }
        });
        add(boxBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 46, 310, 30));

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 46, 90, 30));

        jpRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jpRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scPanel.setViewportView(jpRegistro);

        add(scPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 560, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!"".equals(boxBusqueda.getText())){
        ConsultaCliente();
        ClienteM cliente=new ClienteM();
        cliente.setIdentificacion(Integer.parseInt(boxBusqueda.getText()));
            if(consultaBD.buscar(cliente)){
                lbNombre.setText(cliente.getNombre());
                apellido=cliente.getApellido();
                lbCedula.setText("Cc:"+cliente.getIdentificacion());
                lbCelular.setText("Cel:"+cliente.getCelular());
              
                //Vehiculo
                ConsultaAutos(consultaBD.getLista().size());
     
            }
           
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void boxBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxBusquedaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_boxBusquedaKeyTyped

    
    public void ConsultaCliente(){
        titleCliente=new JLabel("Cliente");
        lbNombre=new JLabel("Name");
        lbCedula=new JLabel("Cc");
        lbCelular=new JLabel("Cel");
        btnGCliente =new JButton("Gestionar Cliente");
        btnGCliente.addActionListener(this);
        titleCliente.setFont(estilo);
        //Agregar al Panel
        jpRegistro.add(titleCliente, new AbsoluteConstraints(10, 10, 110, 30));
        jpRegistro.add(lbNombre, new AbsoluteConstraints(10, 40, 80, 30));
        jpRegistro.add(lbCedula, new AbsoluteConstraints(10, 70, 80, 30));
        jpRegistro.add(lbCelular, new AbsoluteConstraints(150, 70, 80, 30));
        jpRegistro.add(btnGCliente, new AbsoluteConstraints(400, 50, 140, 30));
    }
    
    public void ConsultaAutos(int tamaño){
        titleVehiculo=new JLabel[tamaño];
        lbMarca =new JLabel[tamaño];
        lbFoto =new JLabel[tamaño];
        lbPlaca =new JLabel[tamaño];
        btnGVehiculo=new JButton[tamaño];
        img=new Image[tamaño];
        fotoBD=new ImageIcon[tamaño];
       //Cambio de cordenadas
       int cordenadaY1=110,  cordenadaY2=140;
       int cordenadaY3=170,  cordenadaY4=320;
       int cordenadaY5=220;
       //Crear contenedor de Vehiculo
        for(int i=0; i<tamaño; i++){
            titleVehiculo[i]=new JLabel("Autos");
            lbMarca[i]=new JLabel(consultaBD.getLista().get(i).getMarca());
            lbFoto[i]=new JLabel("Foto");
            lbPlaca[i]=new JLabel(consultaBD.getLista().get(i).getPlaca());
            titleVehiculo[i].setFont(estilo);
            lbFoto[i].setBorder(new BevelBorder(1));
            img[i] = Toolkit.getDefaultToolkit().createImage(consultaBD.getLista().get(i).getImagen());
            fotoBD[i]=new ImageIcon(img[i]);
            lbFoto[i].setIcon(new ImageIcon(fotoBD[i].getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
            btnGVehiculo[i]=new JButton("Gestionar vehiculo");
            btnGVehiculo[i].addActionListener(this);
            //Agregar al Panel
            jpRegistro.add(titleVehiculo[i], new AbsoluteConstraints(10, cordenadaY1, 120, 30));
            jpRegistro.add(lbMarca[i], new AbsoluteConstraints(10, cordenadaY2, 80, 30));
            jpRegistro.add(lbFoto[i], new AbsoluteConstraints(10, cordenadaY3, 150, 150));
            jpRegistro.add(lbPlaca[i], new AbsoluteConstraints(10, cordenadaY4, 80, 30));
            jpRegistro.add(btnGVehiculo[i], new AbsoluteConstraints(400, cordenadaY5, 140, 30));
            //Cambio de cordenadas
            cordenadaY1=cordenadaY4+30;
            cordenadaY2=cordenadaY1+30;
            cordenadaY3=cordenadaY2+30;
            cordenadaY4=cordenadaY3+150;
            cordenadaY5=cordenadaY3+50;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxBusqueda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jpRegistro;
    private javax.swing.JScrollPane scPanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       for(int t=0; t<consultaBD.getLista().size(); t++){
            if(e.getSource()==btnGVehiculo[t]){
                archivo.txt_Vehiculo(consultaBD.getLista().get(t).getPlaca());
                escritorio.accionVehiculo();
            }
        }
       
       if(e.getSource()==btnGCliente){
           String cedula=lbCedula.getText().replaceAll("Cc:", "");
           String celular=lbCelular.getText().replaceAll("Cel:", "");
           archivo.txt_Cliente(lbNombre.getText(), apellido, cedula, celular);
           escritorio.accionCliente();
       }
    }

    

}
