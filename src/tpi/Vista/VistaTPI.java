/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi.Vista;

import java.util.Scanner;

/**
 *
 * @author Geremias Rocchietti
 */
public class VistaTPI {
    Scanner scanner = new Scanner (System.in);
    
    public int menuPrincipal(){
        System.out.println("Menu Principal");
        System.out.println("1. COMENZAR UN CAMPEONATO MUNDIAL");
        System.out.println("2. VER EQUIPOS");
        System.out.println("0. SALIR");
        return Integer.parseInt(scanner.nextLine());
    }   
    public int menuVerEquipos(){
        System.out.println("1. VER JUGADORES");
        System.out.println("0. SALIR");
        return Integer.parseInt(scanner.nextLine());
    }
    public void menuCampeonato(){
        System.out.println("aaaaa");
        
        
    }
}
