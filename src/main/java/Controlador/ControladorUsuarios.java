package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Dao.TblUsuarioImp;
import model.TblUsuariosusti;

public class ControladorUsuarios extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final TblUsuarioImp usuarioDao = new TblUsuarioImp();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuariosusti");
        String password = request.getParameter("passwordsusti");

        // Verificar usuario y contraseña (puedes implementar esto según tu lógica)
        // Aquí se omite la verificación por simplicidad en el ejemplo

        TblUsuariosusti nuevoUsuario = new TblUsuariosusti();
        nuevoUsuario.setUsuariosusti(usuario);
        nuevoUsuario.setPasswordsusti(password);

        usuarioDao.RegistrarUsuario(nuevoUsuario);

        // Redirigir a la página de listado de usuarios después de registrar
        response.sendRedirect("ListadoProductos.jsp");
    }
}


