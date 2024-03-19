package sistemacadastro;

import java.util.ArrayList;
import java.util.List;

public class UsuariosCadastradosSistema {
    private static List<Usuarios> listaUsuarios;

    static {
        // Inicializando a lista com alguns usuários de exemplo ja cadastrados
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuarios(1, "Ramona", 9));
        listaUsuarios.add(new Usuarios(2, "Tite", 9));
        listaUsuarios.add(new Usuarios(3, "Iris", 3));
    }

    public static List<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }
}

