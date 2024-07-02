<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iniciar Sesión</title>
</head>
<body>
<h1 align="center">Iniciar Sesión</h1>
<form action="ControladorUsuarios" method="post">
<table align="center">
<tr>
<td>Usuario:</td>
<td><input type="text" name="usuariosusti"></td>
</tr>
<tr>
<td>Contraseña:</td>
<td><input type="password" name="passwordsusti"></td>
</tr>
<tr>
<td colspan="2" style="text-align:center">
<input type="submit" value="Iniciar Sesión">
</td>
</tr>
</table>
</form>
</body>
</html>
