/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import java.util.List;
import model.Usuario;

/**
 *
 * @author Maria Magdalena Cabrera Coronilla magdacc05@gmail.com
 */
public interface UsuarioDao {
    void insertarUsuario(Usuario usuario);
    void eliminarUsuario(int idUsuario);
    void modificarUsuario(Usuario usuario);
    List<Usuario> desplegarUsuario();
    Usuario elegirUsuario(int idUsuario);
    
}
