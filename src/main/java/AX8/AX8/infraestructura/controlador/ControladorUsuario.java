package AX8.AX8.infraestructura.controlador;

import AX8.AX8.aplicacion.dto.respuestaDTO;
import AX8.AX8.aplicacion.dto.usuarioDTO;
import AX8.AX8.aplicacion.servicio.ServicioAplicacionRegistrarUsuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")

public class ControladorUsuario {

    private final ServicioAplicacionRegistrarUsuario servicioAplicacionRegistrarUsuario;


    public ControladorUsuario(ServicioAplicacionRegistrarUsuario servicioAplicacionRegistrarUsuario){
        this.servicioAplicacionRegistrarUsuario = servicioAplicacionRegistrarUsuario;
    }

    @PostMapping
    public respuestaDTO<Long> crear(@RequestBody usuarioDTO dto) {
        return this.servicioAplicacionRegistrarUsuario.ejecutar(dto);
    }

}


