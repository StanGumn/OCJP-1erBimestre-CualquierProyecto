/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocjp;

import evaluaciones.PrimerBimestre;
import evaluaciones.SegundoBimestres;
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
        // TODO code application logic here
        Estudiante est = new Estudiante("Molina Angel","0503087371","OCJP",6);
        est.agregarNota(0, new PrimerBimestre("Primera Prueba-", 7));
        est.agregarNota(1, new PrimerBimestre("Segunda Prueba-", 10));
        est.agregarNota(2, new PrimerBimestre("Examen Primer Bimestre", 8));
        est.agregarNota(3, new PrimerBimestre("Primera Prueba-", 9));
        est.agregarNota(4, new PrimerBimestre("Segunda Prueba-", 8));
        est.agregarNota(5, new PrimerBimestre("Examen Primer Bimestre", 10));
        
        System.out.println(est);

    }
    
}
