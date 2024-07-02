package Test;

import Dao.TblProductoImp;
import model.TblProductosusti;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TblProductosusti producto = new TblProductosusti();
		TblProductoImp crud = new TblProductoImp();
		
		producto.setNombresusti("Azucar");
		producto.setPrecioventasusti(5.50);
		producto.setPreciocompsusti(2.50);
		producto.setEstadosusti("Vigente");
		producto.setDescripsusti("Oferta");
		
		crud.RegistrarProducto(producto);

	}

}
