/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpi;
// ---------------------------  Main.java  ----------------------------
import controlador.ControladorTPI;
import vista.VistaTPI;
/**
 *
 * @author Geremias Rocchietti
 */
public class TPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VistaTPI vista = new VistaTPI();
        ControladorTPI ctrl = new ControladorTPI(vista);
        ctrl.iniciar();
    }
    
}





    

