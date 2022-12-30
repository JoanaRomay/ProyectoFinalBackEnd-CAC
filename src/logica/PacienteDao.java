
package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PacienteDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    
    public boolean RegristrarPaciente(Paciente pt){
       String sql = "INSERT INTO pacientes (nombre, edad, raza, tamanhio, especie, sexo, observaciones, nombre_duenhio, direccion, contacto) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps= con.prepareStatement(sql); 
            ps.setString(1, pt.getNombre());
            ps.setInt(2, pt.getEdad());
            ps.setString(3, pt.getRaza());
            ps.setString(4, pt.getTamanhio());
            ps.setString(5, pt.getEspecie());
            ps.setString(6, pt.getSexo());
            ps.setString(7, pt.getObservaciones()); 
            ps.setString(8, pt.getNombre_duenhio());
            ps.setString(9, pt.getDireccion());
            ps.setInt(10, pt.getContacto());
          
             ps.execute();
             
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
            }finally{
            try{
                con.close();
        
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
            
    }
}

 

