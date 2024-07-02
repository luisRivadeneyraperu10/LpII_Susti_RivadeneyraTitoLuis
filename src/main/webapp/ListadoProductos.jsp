<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
  
  <%@page import="java.util.*" %>

  <%@page import="model.TblProductosusti" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body>
<h1 align="center" > MENU-PRINCIPAL</h1>
<h2 align="center"><a href="RegistrarProducto.jsp">Registrar Producto</a></h2>
<table align="center" border="2">
<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>Precio Venta</td>
<td>Precio Compra</td>
<td>Estado</td>
<td>Descripcion</td>
</tr>
<%
List<TblProductosusti> listadoproducto=(List<TblProductosusti>)request.getAttribute("listadoproductos");
if (listadoproducto!=null){
	
for(TblProductosusti lis:listadoproducto){
	%>	
<tr>
<td>
<%=lis.getIdproductosusti() %>
</td>	
<td>

<%=lis.getNombresusti()%>

</td>

<td>

<%=lis.getPrecioventasusti() %>

</td>

<td>

<%=lis.getPreciocompsusti() %>

</td>

<td>

<%=lis.getEstadosusti() %>

</td>

<td>

<%=lis.getDescripsusti()%>

</td>
</tr>

<%

   }//cerramos la condicion...

}  //cerramos el bucle

%>
</table>

</body>
</html>