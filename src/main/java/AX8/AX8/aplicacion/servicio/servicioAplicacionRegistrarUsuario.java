package AX8.AX8.aplicacion.servicio;

import AX8.AX8.dominio.modelo.RolUsuario;
import AX8.AX8.dominio.servicio.ServicioGuardarUsuario;

import AX8.AX8.aplicacion.dto.respuestaDTO

public class ServicioAplicacionRegistrarUsuario {
    private final ServicioGuardarUsuario servicioGuardarUsuario;

}

public ServicioAplicacionRegistrarUsuario(ServicioGuardarUsuario servicioGuardarUsuario){
    this.servicioGuardarUsuario = servicioGuardarUsuario;
}

public respuestaDTO <Long> ejecutar(usuarioDTO dto){
   List <RolUsuario> roles = Arrays.asList(RolUsuario.of("empleado"), RolUsuario.of("egresado"));
}