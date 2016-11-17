/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Usuario {
   private int idUsuario;
    private String nombre;
    private String clave;
    private String rol;
    private String descripcion;


    public Usuario(int idUsuario, String nombre,  String clave , String rol, String descripcion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.clave=clave;
        this.rol = rol;
        this.descripcion = descripcion;
       
    }
    
    public Usuario(){
        this(0,"", "", "", "");
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", clave=" + clave + ", rol=" + rol + ", descripcion=" + descripcion + '}';
    }
    
}
