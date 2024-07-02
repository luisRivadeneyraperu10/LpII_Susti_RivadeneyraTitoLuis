package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductoImp;
import model.TblProductosusti;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Controlador Cliente").append(request.getContextPath());
		TblProductoImp crud = new TblProductoImp()	;
		List<TblProductosusti> listadoproducto = crud.ListarProducto();
		request.setAttribute("listadoproductos", listadoproducto);
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombresusti");
        String precioVentas = request.getParameter("precioventasusti");
        String precioComps = request.getParameter("preciocompsusti");
        String estado = request.getParameter("estadosusti");
        String descripcion = request.getParameter("descripsusti");
        
        TblProductosusti producto = new TblProductosusti();
        TblProductoImp crud = new TblProductoImp();

        double precioVenta = 0;
        double precioCompra = 0;
        try {
            precioVenta = Double.parseDouble(precioVentas);
            precioCompra = Double.parseDouble(precioComps);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return;
        }
        
        producto.setNombresusti(nombre);
        producto.setPrecioventasusti(precioVenta);
        producto.setPreciocompsusti(precioCompra);
        producto.setEstadosusti(estado);
        producto.setDescripsusti(descripcion);

        crud.RegistrarProducto(producto);
        
        //actualizar listado 
        List<TblProductosusti> listadoproducto = crud.ListarProducto();
        //asignamos el listado de productos recuperados de la bd
        request.setAttribute("listadoproductos", listadoproducto);
        //redireccionamos hacia el listado de clientes...
        request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
        
        
        

	}

}
