/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoocjp;

/**
 *
 * @author angel
 */
public class Cliente {
        private String apellido;
         private String nombre;
         private String cedula;
         private String direccion;
         private String telefono;
    //("Vazquez", "Juan", "1111111189", "Las Casas", "098890988");      
    public Cliente(String apellido, String nombre, String cedula, String direccion,String telefono ) {
       this.apellido= apellido;
       this.nombre= nombre;
       this.cedula= cedula;
       this.direccion= direccion;
       this.telefono= telefono;
    }
}
