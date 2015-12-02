/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoocjp;

import com.matoosfe.modelo.Cliente;

/**
 * Esta clase permitirá manejar toda la lógica de negocio relacionada con clientes

 */
public class AdminCliente {
    
    
    /**
     * Método para guardar un cliente
     * @param cliente
     * @return
     */
    public static String guardarCliente(Cliente cliente){
        MemoriaBDD.clientes.add(cliente);
        return "Registro Guardado Satisfactoriamente";
    }

    /**
     * Método para buscar un cliente por la cédula de identidad
     * @param cedIn
     * @return
     */
    public static Cliente buscarClienteByCedula(String cedIn) {
        Cliente clienteDev = null;
        for(Cliente cli: MemoriaBDD.clientes){
            if(cli.getCedula().equals(cedIn)){
                clienteDev = cli;
                break;
            }
        }
        return clienteDev;
    }
    
    /**
     * Método para actualizar un cliente
     * @param cedIn
     * @param clienteAct
     * @return
     */
    public static String actualizarCliente(String cedIn, Cliente clienteAct){
        
        guardarCliente(clienteAct);
        return "Registro actualizado Satisfactoriamente";
    }

    /**
     * Método para eliminar un cliente
     * @param cedIn
     * @return
     */
    public static String eliminarCliente(String cedIn) {
        Cliente clienteOri = buscarClienteByCedula(cedIn);
        boolean confEli = MemoriaBDD.clientes.remove(clienteOri);
        if(confEli){
            return "Registro eliminado Satisfactoriamente";
        }else{
            return "No se pudo eliminar el cliente";
        }
    }

}
