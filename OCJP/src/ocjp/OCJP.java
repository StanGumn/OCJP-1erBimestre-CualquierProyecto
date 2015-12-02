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

    public static void main(String[] args) {
        int opcion = -1, num = 0;
        String cedula, nombre, materia;
        int primeraPrueba, segundaPrueba, primerExamen, primeraPruebaSegundoBim, segundaPruebaSegundoBim, examenSegundoBim;
        int numeroPruebas = 0;
        int aux = 0, intmaxest = 2;
        String nombreest, ListaEst[] = new String[10];
        Scanner scanner = new Scanner(System.in);
        Estudiante est1 = null, est2 = null, est3, est4, est5;
        //estudiante
        Estudiante est = new Estudiante("Molina Angel", "0503087371", "OCJP", 6, "Estudiante");
        est.setCedula("0503087371");
        est.agregarNota(0, new PrimerBimestre("Primera Prueba-", 7));
        est.agregarNota(1, new PrimerBimestre("Segunda Prueba-", 10));
        est.agregarNota(2, new PrimerBimestre("Examen Primer Bimestre", 8));
        est.agregarNota(3, new SegundoBimestres("Primera Prueba-", 9));
        est.agregarNota(4, new SegundoBimestres("Segunda Prueba-", 8));
        est.agregarNota(5, new SegundoBimestres("Examen Primer Bimestre", 10));
        //datos del adminsitrador
        Administrador adm = new Administrador("Ivan Antonov", "0501708861", "032812761", "Administrador");
        adm.setCedula("0501708861");

        System.out.println("\tBienvenido al sistema de visualizacion de calficiaciones\n");
        System.out.println("\tINGRESE UNA OPCION");
        while (opcion != 0) {
            System.out.println("Elige opción:\n1.- Ver notas de estudiantes"
                    + "\n2.- Ver Datos del Administrador"
                    + "\n3.- Ingresar nuevo estudiante"
                    + "\n4.- Ingresar notas a un estudiante"
                    + "\n0.- Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("\tIngrese la cedula del estudiante");
                    cedula = scanner.nextLine();
                    try {
                        if (cedula.equals(est.getCedula())) {
                            est.datosEstudiante();
                            est.imprimirNota();
                            break;
                        }
                        if (cedula.equals(est1.getCedula())) {
                            est.datosEstudiante();
                            est.imprimirNota();
                            break;
                        }

                        if (cedula.equals(est2.getCedula())) {
                            est.datosEstudiante();
                            est.imprimirNota();
                            break;
                        }
                    } catch (Exception e1) {
                        System.out.println("\tNo existe el estudiante con esa cedula");
                        break;
                    }
                case 2:
                    System.out.println("\tIngrese la cédula del Administrador");
                    cedula = scanner.nextLine();
                    if (cedula.equals(adm.getCedula())) {
                        adm.imprimirDatos();
                    } else {
                        System.out.println("\tNo existe el Administrador");
                    }
                    break;
                case 3:
                    if (intmaxest == 2) {
                        System.out.println("\tIngrese el nombre del estudiante");
                        nombre = scanner.nextLine();
                        System.out.println("\tIngrese la cedula del estudiante");
                        cedula = scanner.nextLine();
                        if (cedula.equals(est.getCedula())) {
                            System.out.println("Ya existe dicho estudiante");
                            break;
                        }
                        System.out.println("\tIngrese la materia del estudiante");
                        materia = scanner.nextLine();
                        est1 = new Estudiante(nombre, cedula, materia, numeroPruebas, "Estudiante");
                        est1.setCedula(cedula);
                        intmaxest++;
                        System.out.println("\tINGRESO EXITOSO...!");
                        break;
                    } else if (intmaxest == 3) {
                        System.out.println("\tIngrese el nombre del estudiante");
                        nombre = scanner.nextLine();
                        System.out.println("\tIngrese la cedula del estudiante");
                        cedula = scanner.nextLine().trim();
                        if (cedula.equals(est.getCedula()) || cedula.equals(est1.getCedula())) {
                            System.out.println("Ya existe dicho estudiante");
                            break;
                        }
                        System.out.println("\tIngrese la materia del estudiante");
                        materia = scanner.nextLine();
                        est2 = new Estudiante(nombre, cedula, materia, numeroPruebas, "Estudiante");
                        est2.setCedula(cedula);
                        intmaxest++;
                        System.out.println("\tINGRESO EXITOSO...!");
                        break;
                    } else if (intmaxest >= 4) {
                        System.out.println("No se puede ingresar mas estudiantes");
                        break;
                    }
                case 4:
                    System.out.println("\t\tCrear estudiante");
                    System.out.println("\tIngrese la cedula del estudiante");
                    cedula = scanner.nextLine();
                    try {
                        if (cedula.equals(est.getCedula())) {
                            numeroPruebas++;
                            System.out.println("\t\tPrimer Bimestre");
                            System.out.println("\tIngrese la nota de la primera prueba");
                            primeraPrueba = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota de la segunda prueba");
                            segundaPrueba = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota del exámen");
                            primerExamen = Integer.parseInt(scanner.nextLine());
                            System.out.println("\t\tSegundo Bimestre");
                            System.out.println("\tIngrese la nota de la primera prueba");
                            primeraPruebaSegundoBim = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota de la segunda prueba");
                            segundaPruebaSegundoBim = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota del exámen");
                            examenSegundoBim = Integer.parseInt(scanner.nextLine());
                            est.agregarNota(0, new PrimerBimestre("Primera Prueba", primeraPrueba));
                            est.agregarNota(1, new PrimerBimestre("Segunda Prueba", segundaPrueba));
                            est.agregarNota(2, new PrimerBimestre("Examen", primerExamen));
                            est.agregarNota(3, new SegundoBimestres("Primera Prueba", primeraPruebaSegundoBim));
                            est.agregarNota(4, new SegundoBimestres("Segunda Prueba", segundaPruebaSegundoBim));
                            est.agregarNota(5, new SegundoBimestres("Examen", examenSegundoBim));
                            break;
                        } else if (cedula.equals(est1.getCedula())) {
                            numeroPruebas++;
                            System.out.println("\t\tPrimer Bimestre");
                            System.out.println("\tIngrese la nota de la primera prueba");
                            primeraPrueba = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota de la segunda prueba");
                            segundaPrueba = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota del exámen");
                            primerExamen = Integer.parseInt(scanner.nextLine());
                            System.out.println("\t\tSegundo Bimestre");
                            System.out.println("\tIngrese la nota de la primera prueba");
                            primeraPruebaSegundoBim = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota de la segunda prueba");
                            segundaPruebaSegundoBim = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota del exámen");
                            examenSegundoBim = Integer.parseInt(scanner.nextLine());
                            est1.agregarNota(0, new PrimerBimestre("Primera Prueba", primeraPrueba));
                            est1.agregarNota(1, new PrimerBimestre("Segunda Prueba", segundaPrueba));
                            est1.agregarNota(2, new PrimerBimestre("Examen", primerExamen));
                            est1.agregarNota(3, new SegundoBimestres("Primera Prueba", primeraPruebaSegundoBim));
                            est1.agregarNota(4, new SegundoBimestres("Segunda Prueba", segundaPruebaSegundoBim));
                            est1.agregarNota(5, new SegundoBimestres("Examen", examenSegundoBim));
                            break;
                        } else if (cedula.equals(est2.getCedula())) {
                            System.out.println("\t\tPrimer Bimestre");
                            System.out.println("\tIngrese la nota de la primera prueba");
                            primeraPrueba = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota de la segunda prueba");
                            segundaPrueba = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota del exámen");
                            primerExamen = Integer.parseInt(scanner.nextLine());
                            System.out.println("\t\tSegundo Bimestre");
                            System.out.println("\tIngrese la nota de la primera prueba");
                            primeraPruebaSegundoBim = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota de la segunda prueba");
                            segundaPruebaSegundoBim = Integer.parseInt(scanner.nextLine());
                            System.out.println("\tIngrese la nota del exámen");
                            examenSegundoBim = Integer.parseInt(scanner.nextLine());
                            est2.agregarNota(0, new PrimerBimestre("Primera Prueba", primeraPrueba));
                            est2.agregarNota(1, new PrimerBimestre("Segunda Prueba", segundaPrueba));
                            est2.agregarNota(2, new PrimerBimestre("Examen", primerExamen));
                            est2.agregarNota(3, new SegundoBimestres("Primera Prueba", primeraPruebaSegundoBim));
                            est2.agregarNota(4, new SegundoBimestres("Segunda Prueba", segundaPruebaSegundoBim));
                            est2.agregarNota(5, new SegundoBimestres("Examen", examenSegundoBim));
                            break;
                        }
                    } catch (Exception e5) {
                        System.out.println("No existe dicho estudiante debe ingresar el estudiante priemro");
                        break;

                    }

                case 0:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Número no reconocido");
                    break;

            }
        }

    }

}
