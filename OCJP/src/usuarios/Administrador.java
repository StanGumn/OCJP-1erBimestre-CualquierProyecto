/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author angel
 */
public class Administrador extends Usuario{
    private String Cedula;
    private String Telefono;
    private String nombre;
    

    public Administrador(String Cedula, String Telefono, String tipo) {
        super(tipo);
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }
    
    @Override
	public String toString() {
		System.out.println("%%--Datos del Administrador--%%");
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("CEDULA: " + this.Cedula);
		System.out.println("TELEFONO: " + this.Telefono);
		System.out.println("------");
		return "-----------";
	}
   
}
