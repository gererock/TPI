/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*package Modelo;

import Modelo.Estadios;
*/


/*
 *
 * @author Geremias Rocchietti
 */
/*public class Partidos extends Estadios{
    private String EquipoLocal;
    private String EquipoVisitante;
    private String fechaPartido;
    private String tipoPartido;
    private String EstadoPartido;

    public Partidos(String EquipoLocal, String EquipoVisitante, String fechaPartido, String tipoPartido, String EstadoPartido, String nombreEstadio, String ubicacionEstadio) {
        super(nombreEstadio, ubicacionEstadio);
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        this.fechaPartido = fechaPartido;
        this.tipoPartido = tipoPartido;
        this.EstadoPartido = EstadoPartido;
    }

    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(String EquipoLocal) {
        this.EquipoLocal = EquipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String EquipoVisitante) {
        this.EquipoVisitante = EquipoVisitante;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getTipoPartido() {
        return tipoPartido;
    }

    public void setTipoPartido(String tipoPartido) {
        this.tipoPartido = tipoPartido;
    }

    public String getEstadoPartido() {
        return EstadoPartido;
    }

    public void setEstadoPartido(String EstadoPartido) {
        this.EstadoPartido = EstadoPartido;
    }

    @Override
    public String getNombreEstadio() {
        return nombreEstadio;
    }

    @Override
    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    @Override
    public String getUbicacionEstadio() {
        return ubicacionEstadio;
    }

    @Override
    public void setUbicacionEstadio(String ubicacionEstadio) {
        this.ubicacionEstadio = ubicacionEstadio;
    }

    @Override
    public String toString() {
        return "Partidos{" + "EquipoLocal=" + EquipoLocal + ", EquipoVisitante=" + EquipoVisitante + ", fechaPartido=" + fechaPartido + ", tipoPartido=" + tipoPartido + ", EstadoPartido=" + EstadoPartido + '}';
    }
    
    
    
    
    
    
    
}*/
// ======================  modelo/Partidos.java  ======================
package modelo;

/**
 *  Un partido de fútbol.  Hereda “nombreEstadio” y “ubicacionEstadio”
 *  desde Estadios por indicación del modelo original.
 */
public class Partidos extends Estadios {

    /* Atributos del modelo original */
    private String fechaPartido;
    private String tipoPartido;
    private String estadoPartido;

    /* Atributos añadidos para que funcionen Vista y Controlador */
    private Equipos equipoLocal;
    private Equipos equipoVisitante;
    private int     golesLocal;
    private int     golesVisitante;
    private boolean jugado = false;

    /* ---------- GETTERS / SETTERS ---------- */
    public String getFechaPartido() { return fechaPartido; }
    public void setFechaPartido(String fechaPartido) { this.fechaPartido = fechaPartido; }

    public String getTipoPartido() { return tipoPartido; }
    public void setTipoPartido(String tipoPartido) { this.tipoPartido = tipoPartido; }

    public String getEstadoPartido() { return estadoPartido; }
    public void setEstadoPartido(String estadoPartido) { this.estadoPartido = estadoPartido; }

    public Equipos getEquipoLocal() { return equipoLocal; }
    public void    setEquipoLocal(Equipos equipoLocal) { this.equipoLocal = equipoLocal; }

    public Equipos getEquipoVisitante() { return equipoVisitante; }
    public void    setEquipoVisitante(Equipos equipoVisitante) { this.equipoVisitante = equipoVisitante; }

    public int  getGolesLocal() { return golesLocal; }
    public void setGolesLocal(int golesLocal) { this.golesLocal = golesLocal; }

    public int  getGolesVisitante() { return golesVisitante; }
    public void setGolesVisitante(int golesVisitante) { this.golesVisitante = golesVisitante; }

    public boolean isJugado() { return jugado; }
    public void    setJugado(boolean jugado) { this.jugado = jugado; }
}
