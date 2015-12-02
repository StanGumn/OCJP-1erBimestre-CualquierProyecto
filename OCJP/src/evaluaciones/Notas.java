/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluaciones;

/**
 *
 * @author angel
 */
public abstract class Notas {
    private String nombre;

    public Notas(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
     return this.nombre;
    }
}
