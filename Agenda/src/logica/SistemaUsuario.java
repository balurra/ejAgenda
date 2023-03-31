
package logica;

import java.util.List;

public class SistemaUsuario {
    private List<Usuario> usuarios;
    
    
    public Usuario login(String username, String password){
        for(Usuario u:usuarios){
            if(u.getUsername().equals(username) && u.getPassword().equals(password))
                return u;
        }
        return null;
    }
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
}
