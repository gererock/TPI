/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi.Modelo.Equipos;

/**
 *
 * @author Geremias Rocchietti
 */
public abstract class Equipos {
    public String nombreEquipo;
    public int puntajeEquipo;

    public Equipos() {
    }
    
    

    public Equipos(String nombreEquipo, int puntajeEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.puntajeEquipo = puntajeEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }
    
    

    

    @Override
    public String toString() {
        return "Equipos{" + "nombreEquipo=" + nombreEquipo + ", puntajeEquipo=" + puntajeEquipo + '}';
    }
    
    
    
}
