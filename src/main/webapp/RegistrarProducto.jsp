<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body>
<h1 align="center">Registrar Producto</h1>
<form action="ControladorProducto" method="post">
<table align="center">
<tr>
<td>nombre</td>
<td> <input type="text" name="nombresusti">></td>
</tr>
<tr>
<td>precio venta</td>
<td> <input type="text" name="precioventasusti">></td>
</tr>
<tr>
<td>precio compra</td>
<td> <input type="text" name="preciocompsusti">></td>
</tr>
<tr>
<td>estado</td>
<td> <input type="text" name="estadosusti">></td>
</tr>
<tr>
<td>descripcion</td>
<td> <input type="text" name="descripsusti">></td>
</tr>
<tr>
<td  colspan="2" style="text-align:center">
<input type="submit" value="Registrar">
</td>
</tr>
</table>
</form>
</body>
</html>