package AX8.AX8.dominio.modelo;

import AX8.AX8.dominio.validador.ValidadroArgumento;
import lombok.Getter;

@Getter
public class RolUsuario {

    private final String rol;

    public static RolUsuario of(String rol){
        ValidadroArgumento.validarObligatorio(rol,"El rol no puede ser vacio");
        return new RolUsuario(rol);
    }
    private RolUsuario (String rol){this.rol = rol;}

    public String getRol(){return rol;}
}
