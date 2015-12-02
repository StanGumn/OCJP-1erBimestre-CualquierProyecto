package usuarios;

/*** @author angel*/
public class Administrador extends Usuario {

    private String Cedula;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
    private String Telefono;
    private String nombre;

    public Administrador(String nombre, String Cedula, String Telefono, String tipo) {
        super(tipo);
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("\t\t%%--Datos del Administrador--%%");
        System.out.println("\tNOMBRE: " + this.nombre);
        System.out.println("\tCEDULA: " + this.Cedula);
        System.out.println("\tTELEFONO: " + this.Telefono);
        System.out.println("----------------------------");
    }

}
