/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoocjp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Esta clase representa el formulario de ingreso de la información
 * para la gestión de la compra de los vehículos
 */
public class Formulario {

    public void registrarFactura(){
        //Recibo los datos del vehiculo(s) que son los detalles, cliente
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el cliente que va a comprar:");
        try {
            String cedIn = br.readLine();
            Cliente cliente = AdminCliente.buscarClienteByCedula(cedIn);
            Factura facturaCompra = new Factura();
            List<DetalleFactura> detallesFactura = new ArrayList<DetalleFactura>();
            BigDecimal subtotal = new BigDecimal(0.0d);
            BigDecimal total = new BigDecimal(0.0d);
            
            System.out.println("\n*************DATOS VEHICULO************");
            String placaVeh = "1";

            //Registro los vehículos que se vayan a comprar
            while(!placaVeh.equals("0")){
                System.out.print("Ingrese vehículo codigo:");
                placaVeh = br.readLine();
                
                //Buscamos al vehículo para registrarlo
                Vehiculo vehTmp = AdminVehiculo.buscarVehiculoPorPlaca(placaVeh);

                //Verificamos que si se encontró el vehiculo guardamos el detalle
                if(vehTmp != null){
                    //Ingresando cada detalle
                    DetalleFactura detalleTmp = new DetalleFactura();
                    detalleTmp.setCantidad(1);
                    detalleTmp.setFactura(facturaCompra);
                    detalleTmp.setVehiculo(vehTmp);
                    detalleTmp.setPrecio(vehTmp.getPrecio());
                    detallesFactura.add(detalleTmp);
                    subtotal = subtotal.add(vehTmp.getPrecio());

                }
            }
            
            //Añado detalles y calculo el IVA
            facturaCompra.setDetalles(detallesFactura);
            total = subtotal.add(subtotal.multiply(new BigDecimal(0.12d)));
            
            //Registro la factura siempre que haya minimo un detalle
            if(facturaCompra.getDetalles().size() > 1){
                facturaCompra.setCliente(cliente);
                facturaCompra.setFechaCompra(new Date());
                facturaCompra.setNumeroFactura(String.valueOf(Math.random()));
                facturaCompra.setDetalles(detallesFactura);
                facturaCompra.setSubtotal(subtotal);
                facturaCompra.setTotal(total);
            }
            
            //Guardamos la factura
            AdminFactura.guardarFactura(facturaCompra);
            
            //Imprimir Registro Compra
            System.out.println("\n*************DATOS COMPRA************");
            System.out.println("Cliente:" +  cliente.getNombres() + " " +  cliente.getApellidos());
            for (Factura fac : AdminFactura.buscarFacturasPorCliente(cliente.getCedula())) {
                System.out.println("Factura:" +  fac.getNumeroFactura());
                System.out.println("Total Factura:" + fac.getTotal());
                //Imprimir Vehiculos comprados
                for (DetalleFactura det : fac.getDetalles()) {
                    System.out.println("Vehiculo Marca:" +  det.getVehiculo().getMarca());
                    System.out.println("Vehiculo Modelo:" +  det.getVehiculo().getModelo());
                    System.out.println("Vehiculo Placa:" +  det.getVehiculo().getPlaca());
                }
            }
            
            
        } catch (NumberFormatException e) {
            System.out.println("Error Formato");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error Lectura");
            e.printStackTrace();
        }
        //Aqui ya tengo el cliente y todos los vehiculos que quiere comprar

    }

    public static void main(String[] args) {
        Formulario pr = new Formulario();
        pr.registrarFactura();
    }
}

