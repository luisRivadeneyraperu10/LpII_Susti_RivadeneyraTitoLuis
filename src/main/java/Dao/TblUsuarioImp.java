package Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Interfaces.IUsuario;
import model.TblUsuariosusti;

public class TblUsuarioImp implements IUsuario {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LpII_Susti_RivadeneyraTitoLuis");

    @Override
    public void RegistrarUsuario(TblUsuariosusti usuario) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public List<TblUsuariosusti> ListarUsuario() {
        EntityManager em = emf.createEntityManager();
        List<TblUsuariosusti> listaUsuarios = null;
        try {
            listaUsuarios = em.createQuery("SELECT u FROM TblUsuariosusti u", TblUsuariosusti.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return listaUsuarios;
    }

	@Override
	public void ActualizarUsuario(TblUsuariosusti usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuariosusti usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TblUsuariosusti BuscarUsuario(TblUsuariosusti usuario) {
		// TODO Auto-generated method stub
		return null;
	}
}

