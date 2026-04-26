package java;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();
        List<Usuario> usuarios = dao.obtenerUsuarios();

        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}