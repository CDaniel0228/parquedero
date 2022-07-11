
package Control;

import Modelo.ClienteM;
import Modelo.VehiculoM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class infoConsulta extends Conexion {
     private ArrayList<VehiculoM> lista=new ArrayList();
    
     public boolean buscar(ClienteM crear ) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String rSql="SELECT * FROM Cliente C INNER JOIN Vehiculo V ON (C.Identificacion = V.Identificacion) WHERE C.Identificacion=?";
        
        try {
            ps = con.prepareStatement(rSql);
            ps.setInt(1, crear.getIdentificacion());
            rs = ps.executeQuery();
            
            while(rs.next())
            {
               VehiculoM vehiculo=new VehiculoM();
               crear.setIdentificacion(rs.getInt("Identificacion"));
               crear.setNombre(rs.getString("Nombre"));
               crear.setApellido(rs.getString("Apellido"));
               crear.setCelular(rs.getString("Celular"));
               
               //Vehiculo
               vehiculo.setMarca(rs.getString("Marca"));
               vehiculo.setImagen(rs.getBytes("Foto"));
               vehiculo.setPlaca(rs.getString("Placa"));
               lista.add(vehiculo);
               
            }
            System.out.println(lista.get(0).getMarca()+"-"+lista.get(1).getMarca());
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public ArrayList<VehiculoM> getLista() {
        return lista;
    }

    public void setLista(ArrayList<VehiculoM> lista) {
        this.lista = lista;
    }
     
     
}
