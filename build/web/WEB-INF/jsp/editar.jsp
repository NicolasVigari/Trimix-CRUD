<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>CRUD</title>
    </head>
    <body>
        <div class="container mt-2 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre</label>
                        <input type="text" name="perNombre" class="form-control" value="${lista[0].perNombre}">
                        <label>Apellido</label>
                        <input type="text" name="perApellido" class="form-control" value="${lista[0].perApellido}">
                        <label>Fecha de Nacimiento</label>
                        <input type="text" name="perFechaNaciemiento" class="form-control" value="${lista[0].perFechaNaciemiento}">
                        <label>Tipo de Documento</label>             
                        <select id="perTipoDocumento" name="perTipoDocumento" class="form-control" value="${lista[0].perTipoDocumento}">
                            <option value="DNI">DNI</option>
                            <option value="Pasaporte">Pasaporte</option>
                            <option value="Cedula">Cedula</option>  
                        </select>
                        <label>Numero de Documento</label>
                        <input type="text" name="perNumeroDocumento" class="form-control" value="${lista[0].perNumeroDocumento}">
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="home.htm">Regresar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
