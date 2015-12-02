/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoocjp;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * Esta clase permitirá manejar todas las operaciones relacionadas con Factura
 */
public class AdminFactura {
    
    /**
     * Método para guardar una factura
     * @param factura
     * @return
     */
    public static String guardarFactura(Factura factura){
        MemoriaBDD.facturas.add(factura);
        return "Factura registrada Exitosamente";
    }
    
    /**
     * Métodos para buscar facturas por cliente de acuerdo 
     * a la cédula
     * @param cedCliente
     * @return
     */
    public static List<Factura> buscarFacturasPorCliente(String cedCliente){
        List<Factura> facturasCliente = new ArrayList<Factura>();
        for (Factura factura : MemoriaBDD.facturas) {
            if(factura.getCliente().getCedula().equals(cedCliente)){
                facturasCliente.add(factura);
            }
        }
        return facturasCliente;
    }

}