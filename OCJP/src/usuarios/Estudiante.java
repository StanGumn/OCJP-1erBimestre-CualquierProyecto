/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import evaluaciones.Notas;

/**
 *
 * @author angel
 */
public class Estudiante {
    private String nombre;
    private String Cedula;
    private String Materia;
    private Notas[] notas;
    public Estudiante(String nombre,String cedula,String Materia, int i) {
        this.nombre=nombre;
        this.Cedula=cedula;
        this.Materia=Materia;  
        this.notas = new Notas[i];
        
        
    }
    
    public void agregarNota(int i, Notas nota) {
        this.notas[i] = nota;		
    }
    
    
    @Override
	public String toString() {
		System.out.println("%%--Calificaciones--%%");
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("CEDULA: " + this.Cedula);
		System.out.println("MATERIA: " + this.Materia);
		System.out.println("------");
		System.out.println(this.notas[0]);
		System.out.println(this.notas[1]);
		System.out.println(this.notas[2]);
                System.out.println(this.notas[3]);
                System.out.println(this.notas[4]);
                System.out.println(this.notas[5]);
		return "-----------";
	}
}
