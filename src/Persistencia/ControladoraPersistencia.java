
package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
  
    //instanciamos el JPA controller para alta de mascota en BD
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    //metodo Crear registro de mascota
    
    public void altaMascota(Mascota mascota){
    
        try {
            mascotaJpa.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
