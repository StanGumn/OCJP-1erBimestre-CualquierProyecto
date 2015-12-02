package evaluaciones;

/** @author angel*/
public class SegundoBimestres extends Notas {

    private int nota;

    public SegundoBimestres(String nombre, int nota) {
        super(nombre);
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + " Segundo Bimestre " + this.nota;
    }

}
