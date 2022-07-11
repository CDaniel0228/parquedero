
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.ClienteM;
import Modelo.VehiculoM;
import java.util.ArrayList;


public class infoCliente extends Conexion{
     ArrayList<VehiculoM> lista=new ArrayList();
     
     
    public boolean registrar(ClienteM crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO estudiantes (Identidicacion, 	Nombre, Apellido, Celular ) VALUES(?,?,?,?)";

        try {
            
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, crear.getIdentificacion());
            ps.setString(2, crear.getNombre());
            ps.setString(3, crear.getApellido());
            ps.setString(4, crear.getCelular());
            
            ps.execute();
            
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
    
    public boolean modificar(ClienteM crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE estudiantes SET Identidicacion=?, Nombre=?, Apellido=?, Celular=? WHERE Identidicacion=? ";

        try {
            
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, crear.getIdentificacion());
            ps.setString(2, crear.getNombre());
            ps.setString(3, crear.getApellido());
            ps.setString(4, crear.getCelular());
            ps.setInt(5, crear.getIdentificacion());
            
            ps.executeUpdate();
            
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

    public boolean eliminar(ClienteM crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM estudiantes WHERE Identificacion=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, crear.getIdentificacion());
            ps.execute();
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
    
   
}
