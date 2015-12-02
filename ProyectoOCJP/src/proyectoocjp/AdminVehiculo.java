/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoocjp;

import vehiculos.Vehiculo;




/**
 * 
 * Esta clase permite manipular todas las operaciones relacionadas con Vehiculo
 */
public class AdminVehiculo {

    /**
     * Método para guardar un vehículo
     * @param vehiculoGen
     * @return
     */
    public String guardarVehiculo(Vehiculo vehiculoGen){
        MemoriaBDD.vehiculos.add(vehiculoGen);
        return "Registro Guardado Satisfactoriamente";
    }


    /**
     * Método para buscar un vehículo de acuerdo a la placa y tipo
     * @param placa
     * @param tipo
     * @return
     */
    public static Vehiculo buscarVehiculoPorPlaca(String placa) {
        Vehiculo vehDev = null;

        for (Vehiculo veh : MemoriaBDD.vehiculos) {
            if(veh.getPlaca().equals(placa)){
                vehDev = veh;
                break;
            }
        }

        return vehDev;
    }   
}