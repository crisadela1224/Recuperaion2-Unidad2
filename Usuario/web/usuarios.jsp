<%-- 
    Document   : Usuario
    Created on : 22/09/2016, 02:24:34 PM
    Author     : user 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <form action="UsuarioController" method="post">
            <fieldset>
                <legend>Formulario de Usuarios</legend>
                <div>
                 <label>Id de usuario:</label>
                <input type="text" name="idUsuario"
                       value="${usuario.idUsuario}"
                       readonly="readonly"
                       placeholder="idUsuario"
                       />
                </div>
                       
                       <div>
                <label>Nombre:</label>
                <input type="text" name="nombre"
                                value="${usuario.nombre}"
                       placeholder="Nombre"
                       />
                
                       </div>
                       
                       <div>
                 <label>Clave:</label>
                <input type="text" name="clave"
                       value="${usuario.clave}"
                       placeholder="Clave"
                       />
                
                       </div>
                       <div>
                 <label>Rol:</label>
                <input type="text" name="rol"
                       value="${usuario.rol}"
                       placeholder="Rol"
                       />
                
                       </div>
                       
                       <div>
                
                <label>Descripcion:</label>
                <input type="text" name="descripcion"
                       value="${usuario.descripcion}"
                       
                       placeholder="Descripcion"
                       />
                       </div>
                       
                  
                           <input type="submit" value="Guardar" />
                           
                       
            </fieldset>
            
        </form>
    </body>
</html>
