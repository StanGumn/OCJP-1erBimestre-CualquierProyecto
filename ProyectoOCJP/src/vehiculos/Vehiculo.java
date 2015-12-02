/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author angel
 */
public class Vehiculo {
    private String placa;    

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
    public Vehiculo(String placa) {
        this.placa = placa;
    }
  
}
