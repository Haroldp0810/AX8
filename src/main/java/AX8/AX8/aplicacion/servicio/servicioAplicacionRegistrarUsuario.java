package AX8.AX8.aplicacion.servicio;

import AX8.AX8.aplicacion.dto.usuarioDTO;
import AX8.AX8.dominio.modelo.RolUsuario;
import AX8.AX8.dominio.modelo.Usuario;
import AX8.AX8.dominio.servicio.ServicioCifrarTexto;
import AX8.AX8.dominio.servicio.ServicioGuardarUsuario;

import AX8.AX8.aplicacion.dto.respuestaDTO;

import java.util.Arrays;
import java.util.List;

public class ServicioAplicacionRegistrarUsuario {
    private final ServicioGuardarUsuario servicioGuardarUsuario;

    private final ServicioCifrarTexto servicioCifrarTexto;

    public ServicioAplicacionRegistrarUsuario(ServicioGuardarUsuario servicioGuardarUsuario, ServicioCifrarTexto servicioCifrarTexto){
        this.servicioGuardarUsuario = servicioGuardarUsuario;
        this.servicioCifrarTexto = servicioCifrarTexto;
    }


    public respuestaDTO <Long> ejecutar(usuarioDTO dto){
        List<RolUsuario> roles = Arrays.asList(RolUsuario.of("Administrador"), RolUsuario.of("Cliente"));

        Usuario usuario = Usuario.of(dto.getUsuario(), dto.getClave(), roles);

        String claveCifrada = this.servicioCifrarTexto.ejecutar(usuario.getClave());
        usuario.asignarClaveCifrada(claveCifrada);

        return new respuestaDTO<>(this.servicioGuardarUsuario.ejecutar(usuario));
    }

}



