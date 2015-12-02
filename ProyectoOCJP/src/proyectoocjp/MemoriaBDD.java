/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoocjp;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import vehiculos.Buseta;
import vehiculos.Moto;
import vehiculos.Trailer;
import vehiculos.Vehiculo;

public class MemoriaBDD {
    public static Set<Vehiculo> vehiculos;
    public static Set<Cliente> clientes;
    public static Set<Factura> facturas;
    
    static{
        
        //Inicilializar Facturas
        facturas = new HashSet<Factura>();
        
        //Inicializar Vehiculos
        vehiculos = new HashSet<Vehiculo>();
        Moto motoUno = new Moto("azul","PBB-987","QMC","2007", new BigDecimal(1567.45d));
        Moto motoDos = new Moto("verde","PAL-747","HONDA","2010", new BigDecimal(1000.45d));
        vehiculos.add(motoUno);
        vehiculos.add(motoDos);
        
        Trailer trailerUno = new Trailer("rojo","UBJ-098","MERCEDES BENZ","2005", new BigDecimal(144000));
        Trailer trailerDos = new Trailer("azul","XJT-233","MERCEDES BENZ","2004", new BigDecimal(124000));
        vehiculos.add(trailerUno);
        vehiculos.add(trailerDos);
        
        Buseta busUno = new Buseta("amarilla","GYT-9889","HYUNDAI","2002", new BigDecimal(75000));
        Buseta busDos = new Buseta("amarilla","PKT-956","CHEVROLET","1999", new BigDecimal(55000));
        vehiculos.add(busUno);
        vehiculos.add(busDos);
        
        //Inicializar clientes
        clientes = new HashSet<Cliente>();
        Cliente clienteUno = new Cliente("Vazquez", "Juan", "1111111189", "Las Casas", "098890988");
        Cliente clienteDos = new Cliente("Sanchez", "Luis", "1234567890", "El Dorado", "097090988");
        Cliente clienteTres = new Cliente("Prado", "Maria Fernanda", "222222220", "Carapungo", "2345659");
        clientes.add(clienteUno);
        clientes.add(clienteDos);
        clientes.add(clienteTres);
        
    }       
}