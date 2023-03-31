
package logica;

import java.util.List;

public class Fachada {
    private static Fachada instancia = new Fachada();

    public static Fachada getInstancia() {
        return instancia;
    }
    
    private SistemaUsuario sistemaUsuario = new SistemaUsuario();
    private SistemaTipoContacto sistemaTipoContacto = new SistemaTipoContacto();

    public void agregarTipoContacto(TipoContacto tipoContacto) {
        sistemaTipoContacto.agregarTipoContacto(tipoContacto);
    }

    public List<TipoContacto> getTiposContacto() {
        return sistemaTipoContacto.getTiposContacto();
    }

    public Usuario login(String username, String password) {
        return sistemaUsuario.login(username, password);
    }

    public void registrarUsuario(Usuario usuario) {
        sistemaUsuario.registrarUsuario(usuario);
    }
    
    
    
    
    
}
