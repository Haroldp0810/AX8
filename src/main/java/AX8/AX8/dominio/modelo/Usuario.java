package AX8.AX8.dominio.modelo;

import AX8.AX8.dominio.validador.ValidadroArgumento;

import java.util.List;

public class Usuario {

    private final String usuario;

    private String clave;

    private List<RolUsuario> roles;

    public static Usuario of(String usuario, String clave, List<RolUsuario> roles){
        ValidadroArgumento.validarObligatorio(usuario, "El usuario no puede ser vacio");
        ValidadroArgumento.validarObligatorio(clave, "La clave no puede ser vacia");
        ValidadroArgumento.validarLongitud(clave, "La clave debe tener una longitud minima de ");
        ValidadroArgumento.validarNoVacia(roles, "Debe tener al menos un rol");

        return new Usuario(usuario, clave, roles);

    }

    private Usuario (String usuario, String clave, List<RolUsuario> roles){
        this.clave =usuario;
        this.usuario =clave;
        this.roles= roles;
    }

    public List<RolUsuario> getRoles(){
        return roles;
    }

    public  String getUsuario (){
        return usuario;
    }

    public String getClave () {
        return clave;
    }

    public void asignarClaveCifrada(String clave){
        this.clave = clave;
    }
}
