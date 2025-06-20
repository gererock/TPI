/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geremias Rocchietti
 */
public class Clasificacion {
    private List<Equipos> puntajeEquipos = new ArrayList<>();
    private int diferenciaGoles;
    private int golesAFavor;
    private List<Jugadores> tarjetas = new ArrayList<>();

    public Clasificacion(int diferenciaGoles, int golesAFavor) {
        this.diferenciaGoles = diferenciaGoles;
        this.golesAFavor = golesAFavor;
    }

    public List<Equipos> getPuntajeEquipos() {
        return puntajeEquipos;
    }

    public void setPuntajeEquipos(List<Equipos> puntajeEquipos) {
        this.puntajeEquipos = puntajeEquipos;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public List<Jugadores> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Jugadores> tarjetas) {
        this.tarjetas = tarjetas;
    }

    @Override
    public String toString() {
        return "Clasificacion{" + "puntajeEquipos=" + puntajeEquipos + ", diferenciaGoles=" + diferenciaGoles + ", golesAFavor=" + golesAFavor + ", tarjetas=" + tarjetas + '}';
    }
    
    
}
