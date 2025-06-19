/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi.Modelo.Grupos;

import java.util.ArrayList;
import java.util.List;
import tpi.Modelo.Equipos.Equipos;

/**
 *
 * @author Geremias Rocchietti
 */
public class Grupos {
    private int letraGrupo;
    private List<Equipos> equipos = new ArrayList<>();
    //private List<> tablas = new ArrayList<>();

    public Grupos(int letraGrupo) {
        this.letraGrupo = letraGrupo;
    }

    public int getLetraGrupo() {
        return letraGrupo;
    }

    public void setLetraGrupo(int letraGrupo) {
        this.letraGrupo = letraGrupo;
    }

    public List<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipos> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Grupos{" + "letraGrupo=" + letraGrupo + ", equipos=" + equipos + '}';
    }
    
    
    
}
