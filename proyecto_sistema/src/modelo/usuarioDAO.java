
package modelo;

import com.mysql.cj.jdbc.Driver;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class usuarioDAO {
    
    private Connection conexion;
    private Statement st;
    private ResultSet rs;
    
    public usuarioDAO(){
        String URL = "jdbc:mysql://localhost:3306/proyecto";
        String USER = "root";
        String password = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL,USER,password);
            System.out.println("Conectado");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public boolean getUsuario( usuario usuario){
        String sql = "SELECT * FROM users WHERE usuario='" + usuario.getUsuario() + "' AND pass = '" + usuario.getContrasenia() + "'";
        try{
            st = (Statement) conexion.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                do{
                    return true;
                }while(rs.next());
            }         
            
        }catch(SQLException e){
            e.printStackTrace();
            
        }   
        return false;
    }
}
    

