/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio05practico;

import Cuenta.Cuenta;
import ServicioCuenta.ServicioCuenta;

/**
 *
 * @author Diego Eduardo Beltramo
 */
public class POOEjercicio05Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCuenta sc = new ServicioCuenta();
        
        
        Cuenta c1 = sc.crearCuenta();
        sc.depositarCuenta(c1);
        sc.retirarCuenta(c1);
        sc.extraccionRapida(c1);
        sc.consultarDatos(c1);
      
    }
    
}
