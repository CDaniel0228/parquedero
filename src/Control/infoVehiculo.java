
package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.VehiculoM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.ResultSet;

public class infoVehiculo extends Conexion{
    
    public boolean registrar(VehiculoM crear, File archivo) throws FileNotFoundException {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO vehiculo (Marca, Placa, Foto, Identificacion) VALUES(?,?,?,?)";

        try {
            FileInputStream fis = new FileInputStream(archivo);
            ps = con.prepareStatement(sql);
            
            ps.setString(1, crear.getMarca());
            ps.setString(2, crear.getPlaca());
            ps.setBinaryStream(3, fis, (int) archivo.length()); 
            ps.setInt(4, crear.getCedula());
           
           ps.execute();
            
            return true;
        } catch (SQLException e)  {
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
    
    public boolean modificar(VehiculoM crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE vehiculo SET Marca=?, Placa=?, Foto=?, Identificacion=? WHERE Codigo=? ";
        
        try {
           
            ps = con.prepareStatement(sql);
            
            ps.setString(1, crear.getMarca());
            ps.setString(2, crear.getPlaca());
            ps.setBytes(3, crear.getImagen());
            ps.setInt(4, crear.getCedula());
            ps.setString(5, crear.getPlaca());
            
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

    public boolean eliminar(VehiculoM crear) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM vehiculo WHERE Placa=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(2, crear.getPlaca());
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
    
    public boolean buscar(VehiculoM crear) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM vehiculo WHERE Placa=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crear.getPlaca());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               crear.setMarca(rs.getString("Marca"));
               crear.setImagen(rs.getBytes("Foto"));
               crear.setPlaca(rs.getString("Placa"));
              
              
               
               return true;
            }
            return false;
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
