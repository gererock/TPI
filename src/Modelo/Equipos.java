/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 *
 * @author Geremias Rocchietti
 */
/*public abstract class Equipos {
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
    
    
    
}*/
// ======================  modelo/Equipos.java  ======================
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *  Representa una selección/equipo de fútbol.
 *  (No es abstracta para poder instanciarla con “new Equipos(){}”,
 *  tal como hace el controlador cuando lee los .csv).
 */
public class Equipos {

    /*  CAMPO PÚBLICO (usado directamente por la vista)  */
    public String nombreEquipo;

    /*  CAMPO PÚBLICO (podrías usarlo más adelante)  */
    public int puntajeEquipo = 0;

    /*  Plantel de jugadores  */
    private final List<Jugadores> plantel = new ArrayList<>();

    /* ---------- GETTERS / SETTERS ---------- */
    public String getNombreEquipo() { return nombreEquipo; }
    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public int getPuntajeEquipo() { return puntajeEquipo; }
    public void setPuntajeEquipo(int puntajeEquipo) { this.puntajeEquipo = puntajeEquipo; }

    public List<Jugadores> getPlantel() { return plantel; }

    public void addJugador(Jugadores j) { plantel.add(j); }
}
