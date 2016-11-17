<%-- 
    Document   : ListarUsuario
    Created on : 22/09/2016, 02:24:08 PM
    Author     : user 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar usuario</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id usuario</th>
                    <th>Nombre</th>
                    <th>Clave</th>
                    <th>Rol</th>
                    <th>Descripcion</th>
                    
                    
                </tr>
            <tbody>
                <c:forEach var="usuario" items="${usuarios}">
                    <tr>
                        <td>${usuario.idUsuario}</td>
                        <td>${usuario.nombre}</td>
                        <td>${usuario.clave}</td>
                        <td>${usuario.rol}</td>
                         <td>${usuario.descripcion}</td>
                        <td><a href="UsuarioController?action=modificar&idUsuario=${usuario.idUsuario}">Modificar</a></td>
                         <td><a href="UsuarioController?action=eliminar&idUsuario=${usuario.idUsuario}">eliminar</a></td>
                    </tr>
                </c:forEach>
            </tbody>
            
            
        </table>
        <p>
            <a href="UsuarioController?action=insertar">Nuevo Usuario</a>
        </p>
    </body>
</html>
