
package Control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Ficheros {
    public void txt_Cliente(String nombre, String apellido, String cedula, String celular){
        try {
            File archivo=new File("Cliente.txt");
            archivo.createNewFile();
            BufferedWriter bw = null;
            bw = new BufferedWriter(new FileWriter(archivo));
            
            bw.write(nombre);
            bw.newLine();
            
            bw.write(apellido);
            bw.newLine();
            
            bw.write(cedula);
            bw.newLine();
            
            bw.write(celular);
            bw.newLine();
            
            bw.close();  
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public ArrayList txt_SubirCliente(){
        ArrayList <String> datos=new ArrayList();
        String temp , bfRead;
        try (BufferedReader bf = new BufferedReader(new FileReader("Cliente.txt"))) {
            
            while((bfRead = bf.readLine()) != null){ 
                temp=bfRead;
                datos.add(temp); 
            }
                  
        return datos;
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo"+e);
            txt_Cliente("nombre", "apellido", "Cedul2", "Celular");
        } catch (IOException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
        
        return null;
    }
    
    public void txt_EliminarCliente(){
        File archivo=new File("Cliente.txt");
        if(archivo.delete()){
        }
    }
    
    
    public void txt_Vehiculo(String placa){
        try {
            File archivo=new File("Vehiculo.txt");
            archivo.createNewFile();
            BufferedWriter bw = null;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(placa);
            bw.close();  
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public String txt_SubirVehiculo(){
        String placa = null;
        String temp , bfRead;
        try (BufferedReader bf = new BufferedReader(new FileReader("Vehiculo.txt"))) {
            
            while((bfRead = bf.readLine()) != null){ 
                temp=bfRead;
                placa=temp; 
            }
                  
        return placa;
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo"+e);
            txt_Vehiculo("placa");
        } catch (IOException ex) {
            System.out.println("Excepcion " + ex.getMessage());
        }
        
        return null;
    }
    
    public void txt_EliminarVehiculo(){
        File archivo=new File("Vehiculo.txt");
        if(archivo.delete()){
        }
    }
    

    
    
}
