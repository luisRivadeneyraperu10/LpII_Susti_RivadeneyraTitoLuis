package Interfaces;

import java.util.List;

import model.TblProductosusti;

public interface IProducto {

	public void RegistrarProducto(TblProductosusti producto);
	public void ActualizarProducto(TblProductosusti producto);
	public void EliminarProducto(TblProductosusti producto);
	public TblProductosusti BuscarProducto(TblProductosusti producto);
	public List<TblProductosusti> ListarProducto();
	
	
}
