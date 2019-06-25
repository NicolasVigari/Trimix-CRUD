<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>CRUD</title>
    </head>

    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-outline-light" href="agregar.htm">Nuevo Registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombres</th>
                                <th>Apellido</th>
                                <th>Fecha de Nacimiento</th>
                                <th>Tipo de documento</th>
                                <th>Numero de Docuemtno</th>
                                <th>Opciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td>${dato.Id}</td>
                                    <td>${dato.perNombre}</td>
                                    <td>${dato.perApellido}</td>
                                    <td><fmt:formatDate value="${dato.perFechaNacimiento}" pattern="yyyy-MM-dd" /></td>
                                    <td>${dato.perTipoDocumento}</td>
                                    <td>${dato.perNumeroDocumento}</td>
                                    <td>
                                        <a href="editar.htm?id=${dato.Id}" class="btn btn-warning ">Editar</a>
                                        <a href="delete.htm?id=${dato.Id}" class="btn btn-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>

        </div>

    </body>
</html>
