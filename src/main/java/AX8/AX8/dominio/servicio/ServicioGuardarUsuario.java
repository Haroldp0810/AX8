package AX8.AX8.dominio.servicio;

import AX8.AX8.dominio.modelo.Usuario;
import AX8.AX8.dominio.puerto.RepositorioUsuario;

public class ServicioGuardarUsuario {
    private static final String MENSAJE_A_EXISTE = "Ya exsite un usuario con los datos ingresados";

    private final RepositorioUsuario repositorioUsuario;

    public ServicioGuardarUsuario (RepositorioUsuario repositorioUsuario){
        this.repositorioUsuario = repositorioUsuario;
    }

    public Long ejecutar(Usuario usuario){
        if(this.repositorioUsuario.existe(usuario)){
            throw new IllegalStateException(MENSAJE_A_EXISTE);
        }
        return this.repositorioUsuario.guardar(usuario);
    }


}
