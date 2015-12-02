/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.math.BigDecimal;

/**
 *
 * @author angel
 */
public class Trailer extends Vehiculo{
    private String color;
         private String placa;
         private String marca;
         private String anio;
         private BigDecimal num;
         
    public Trailer(String color, String placa, String marca, String anio,BigDecimal num ) {
       super(placa);
       this.color= color;
       this.placa= placa;
       this.marca= marca;
       this.anio= anio;
       this.num= num;
    }
}
