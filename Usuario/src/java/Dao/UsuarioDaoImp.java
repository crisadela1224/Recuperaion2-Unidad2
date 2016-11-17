/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;




import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Util;

/**
 *
 * @author user
 */
public class UsuarioDaoImp implements UsuarioDao {
    private Connection connection;
    
    public UsuarioDaoImp(){
        connection = Util.getConnection();
    
}

    @Override
    public void insertarUsuario(Usuario usuario) {
try{
            String query = "INSERT INTO usuarios(nombre,clave, rol, descripcion)"
                    +" VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getClave());
            ps.setString(3,usuario.getRol());
            ps.setString(4, usuario.getDescripcion());
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        } 
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
try{
            String query = "DELETE FROM usuarios WHERE id_usuario=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, idUsuario);
            ps.executeUpdate();
            
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
try{
            String query = "UPDATE usuarios SET nombre =? "
                    + ", clave =?"
                    + ", rol =?"
                    +", descripcion =?"
                    +" WHERE   id_usuario=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,usuario.getNombre());
            ps.setString(2,usuario.getClave());
            ps.setString(3,usuario.getRol());
            ps.setString(4, usuario.getDescripcion());
            ps.setInt(5, usuario.getIdUsuario());
            
            ps.executeUpdate();
            ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Usuario> desplegarUsuario() {
     List<Usuario> usuarios = new ArrayList<Usuario>();
        try{
        Statement statement = connection.createStatement();
         ResultSet rs= statement.executeQuery("SELECT * FROM usuarios");
         while(rs.next()){
             Usuario usuario = new Usuario(
                     rs.getInt("id_usuario"),
                     rs.getString("nombre"),
                     rs.getString("clave"),
                     rs.getString("rol"),
                     rs.getString("descripcion"));
             
             usuarios.add(usuario);
             
         
         }
         rs.close();
         statement.close();
    }catch(SQLException e){
        e.printStackTrace();
    }
return usuarios;
    }
    

    @Override
    public Usuario elegirUsuario(int idUsuario) {
   Usuario usuario = null;
        
        try{
            String query = "SELECT * FROM usuarios WHERE id_usuario= ?";
            PreparedStatement statement =
                    connection.prepareStatement(query);
            statement.setInt(1, idUsuario);
             ResultSet rs= statement.executeQuery();
         if(rs.next()){
             
               usuario = new Usuario(
                rs.getInt("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("clave"),
                        rs.getString("rol"),
                        rs.getString("descripcion"));
         }
         rs.close();
         statement.close();
    }catch(SQLException e){
        e.printStackTrace();
    }
return usuario;
    }
    
    }
    
   
