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
public class Usuario {
    private String tipo;

    public Usuario(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
     return this.tipo;
    }
}
