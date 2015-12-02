/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocjp;

import evaluaciones.PrimerBimestre;
import evaluaciones.SegundoBimestres;
import java.util.Scanner;
import usuarios.Administrador;
import usuarios.Estudiante;

/**
 *
 * @author angel
 */
public class OCJP {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        int opcion=-1,num=0;
        String cedula;
        Scanner scanner = new Scanner(System.in);
        Estudiante est = new Estudiante("Molina Angel","0503087371","OCJP",6,"Estudiante");
        est.setCedula("0503087371");
        est.agregarNota(0, new PrimerBimestre("Primera Prueba-", 7));
        est.agregarNota(1, new PrimerBimestre("Segunda Prueba-", 10));
        est.agregarNota(2, new PrimerBimestre("Examen Primer Bimestre", 8));
        est.agregarNota(3, new PrimerBimestre("Primera Prueba-", 9));
        est.agregarNota(4, new PrimerBimestre("Segunda Prueba-", 8));
        est.agregarNota(5, new PrimerBimestre("Examen Primer Bimestre", 10));
        
        Administrador adm = new Administrador("Ivan Antonov","0501708861", "032812761","Administrador");
        adm.setCedula("0501708861");
        
        System.out.println("\tBienvenido al sistema de visualizacion de calficiaciones\n");
        System.out.println("\tINGRESE UNA OPCION");
        while (opcion!=0){
            System.out.println("Elige opción:\n1.- Ver notas de estudiantes" +
				"\n2.- Ver Datos del Administrador\n" +
				"0.- Salir");
            opcion= Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("\tIngrese la cedula del estudiante");
                    cedula= scanner.nextLine();
                    if(cedula.equals(est.getCedula())){
                    est.datosEstudiante();
                    est.imprimirNota();
                    }else System.out.println("\tNo existe el estudiante con esa cedula");
                    
                    break;
                case 2:
                    System.out.println("\tIngrese la cédula del Administrador");
                    cedula= scanner.nextLine();
                    if(cedula.equals(adm.getCedula())){
                    
                    }
                    break;
                case 0:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Número no reconocido");
                    break;
                    
            }
        }
        
        
       // est.datosEstudiante();
       // est.imprimirNota();
       

    }
    
}
