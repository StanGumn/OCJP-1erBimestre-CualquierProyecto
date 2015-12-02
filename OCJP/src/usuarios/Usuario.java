
package usuarios;

/**@author angel*/
public class Usuario {

    String tipo;

    public Usuario(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
