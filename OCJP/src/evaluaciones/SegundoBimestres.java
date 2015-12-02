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
public class SegundoBimestres  extends Notas{
    private int nota;
    public SegundoBimestres(String nombre, int nota) {
        super(nombre);
        this.nota = nota;
    }
    
    
    @Override
    public String toString(){
     return super.toString() +" Segundo Bimestre ";
    }
    
}
