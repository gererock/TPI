/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi.Modelo.Jugadores;

import java.util.ArrayList;
import java.util.List;
import tpi.Modelo.Equipos.Equipos;

/**
 *
 * @author Geremias Rocchietti
 */
public class Jugadores extends Equipos {
    private String NombreJugador;
    private String edadJugador;
    private String nacionalidadJugador;
    private int golesJugador;
    private int numeroCamiseta;
    private List<Jugadores> sanciones = new ArrayList<>();

    public Jugadores() {
    }

    public Jugadores(String NombreJugador, String edadJugador, String nacionalidadJugador, int golesJugador, int numeroCamiseta, String nombreEquipo, int puntajeEquipo) {
        super(nombreEquipo, puntajeEquipo);
        this.NombreJugador = NombreJugador;
        this.edadJugador = edadJugador;
        this.nacionalidadJugador = nacionalidadJugador;
        this.golesJugador = golesJugador;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombreJugador() {
        return NombreJugador;
    }

    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    public String getEdadJugador() {
        return edadJugador;
    }

    public void setEdadJugador(String edadJugador) {
        this.edadJugador = edadJugador;
    }

    public String getNacionalidadJugador() {
        return nacionalidadJugador;
    }

    public void setNacionalidadJugador(String nacionalidadJugador) {
        this.nacionalidadJugador = nacionalidadJugador;
    }

    public int getGolesJugador() {
        return golesJugador;
    }

    public void setGolesJugador(int golesJugador) {
        this.golesJugador = golesJugador;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public List<Jugadores> getSanciones() {
        return sanciones;
    }

    public void setSanciones(List<Jugadores> sanciones) {
        this.sanciones = sanciones;
    }
    
    @Override
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    @Override
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    
    
    @Override
    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    @Override
    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "NombreJugador=" + NombreJugador + ", edadJugador=" + edadJugador + 
                ", nacionalidadJugador=" + nacionalidadJugador + ", golesJugador=" + golesJugador +
                ", numeroCamiseta=" + numeroCamiseta + ", sanciones=" + sanciones +
                ", nombreEquipo=" + nombreEquipo + ", puntajeEquipo=" + puntajeEquipo + '}';
    }

    

    
    
    
    
}
