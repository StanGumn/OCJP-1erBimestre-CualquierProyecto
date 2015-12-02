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
public class Estudiante extends Usuario{
    private String nombre;
    private String Cedula;

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedula() {
        return Cedula;
    }
    private String Materia;
    private Notas[] notas;
    public Estudiante(String nombre,String cedula,String Materia, int i, String tipo) {
        super(tipo);
        this.nombre=nombre;
        this.Cedula=cedula;
        this.Materia=Materia;  
        this.notas = new Notas[i];
        
        
    }
    
    public void agregarNota(int i, Notas nota) {
        this.notas[i] = nota;		
    }
    
    public void imprimirNota() {
                System.out.println("\n\t\t--Notas--");
        	System.out.println("\t\t"+this.notas[0]);
		System.out.println("\t\t"+this.notas[1]);
		System.out.println("\t\t"+this.notas[2]);
                System.out.println("\t\t"+this.notas[3]);
                System.out.println("\t\t"+this.notas[4]);
                System.out.println("\t\t"+this.notas[5]);	
                System.out.println("------");
    }
    

    public void datosEstudiante() {
		System.out.println("\t\t%%--Informacion del Estudiante--%%");
		System.out.println("\tNOMBRE: " + this.nombre);
		System.out.println("\tCEDULA: " + this.Cedula);
		System.out.println("\tMATERIA: " + this.Materia);
		System.out.println("\t--------------------------\n");
	}
}
