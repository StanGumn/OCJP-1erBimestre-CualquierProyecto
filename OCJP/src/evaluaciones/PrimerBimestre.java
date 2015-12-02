
package evaluaciones;

/** @author angel*/
public class PrimerBimestre extends Notas {

    private int nota;

    public PrimerBimestre(String nombre, int nota) {
        super(nombre);
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + " Primer Bimestre " + this.nota;
    }
}
