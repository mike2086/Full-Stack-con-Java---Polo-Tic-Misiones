
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
    
    //instanciamos la controladora de persistencia para pasar los datos
    ControladoraPersistencia Persistencia = new ControladoraPersistencia();
    
    //metodo para alta de mascotas
    public void altaMascota (String clienteNro, String nombre, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String telfDuenio, String observaciones){
    
        Mascota mascota = new Mascota();
        
        //seteamos los datos que traemos de la interfaz
        mascota.setNum_cliente(Integer.parseInt(clienteNro));
        mascota.setNombre_perro(nombre);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setNombre_duenio(nombreDuenio);
        mascota.setCelular_duenio(telfDuenio);
        mascota.setObservaciones(observaciones);
        
        //enviamos los datos para crear objeto en BD
        Persistencia.altaMascota(mascota);
    }
}
