
package logica;

import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    
    public void crearContacto(Contacto contacto){
        contactos.add(contacto);
    }
    
    public int cantidadContactos(){
        return contactos.size();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }
  
    
}
