
package logica;

import java.util.List;

public class SistemaTipoContacto {
    private List<TipoContacto> tiposContacto;
    
    public void agregarTipoContacto(TipoContacto tipoContacto){
        tiposContacto.add(tipoContacto);
    }

    public List<TipoContacto> getTiposContacto() {
        return tiposContacto;
    }
    
    
}
