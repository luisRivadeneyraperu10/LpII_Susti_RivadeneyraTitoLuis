package Interfaces;

import java.util.List;

import model.TblUsuariosusti;

public interface IUsuario {

	public void RegistrarUsuario(TblUsuariosusti usuario);
	public void ActualizarUsuario(TblUsuariosusti usuario);
	public void EliminarUsuario(TblUsuariosusti usuario);
	public TblUsuariosusti BuscarUsuario(TblUsuariosusti usuario);
	public List<TblUsuariosusti> ListarUsuario();
	
}
