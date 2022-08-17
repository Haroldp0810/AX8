package AX8.AX8.dominio.puerto;

import AX8.AX8.dominio.modelo.Usuario;

public interface RepositorioUsuario {

    Long guardar (Usuario usuario);

    boolean existe (Usuario usuario);

    Usuario consultar (String usuario, String clave);
}
