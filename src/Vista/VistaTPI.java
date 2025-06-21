/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package Vista;

import java.util.Scanner;
*/
/**
 *
 * @author Geremias Rocchietti
 */
/*public class VistaTPI {
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
}*/

// --------------------------  VistaTPI.java  --------------------------
// --------------------------  VistaTPI.java  --------------------------
package vista;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import modelo.Equipos;
import modelo.Jugadores;
import modelo.Partidos;

public class VistaTPI {

    private final Scanner sc = new Scanner(System.in);

    /* ---------- MENÚS PRINCIPALES ---------- */

    public int menuPrincipal() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Comenzar campeonato");
        System.out.println("2. Ver equipos");
        System.out.println("3. Ver fixture completo");
        System.out.println("4. Jugar un partido");
        System.out.println("5. Ver resultados jugados");
        System.out.println("0. Salir");
        return leerEntero("Opción: ");
    }

    public int menuSeleccionarEquipo(List<Equipos> equipos) {
        System.out.println("\n=== EQUIPOS DISPONIBLES ===");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, equipos.get(i).nombreEquipo);
        }
        System.out.println("0. Volver");
        return leerEntero("Seleccione equipo: ");
    }

    public int menuSeleccionarPartido(List<Partidos> partidos) {
        System.out.println("\n=== PARTIDOS PENDIENTES ===");
        for (int i = 0; i < partidos.size(); i++) {
            System.out.printf("%d. %s vs %s (%s)%n", i + 1,
                    partidos.get(i).getEquipoLocal().nombreEquipo,
                    partidos.get(i).getEquipoVisitante().nombreEquipo,
                    partidos.get(i).getNombreEstadio());
        }
        System.out.println("0. Volver");
        return leerEntero("Seleccione partido: ");
    }

    /* ---------- VISTAS DE DATOS ---------- */

    public void mostrarJugadores(List<Jugadores> jugadores) {
        System.out.println("\n--- Plantel ---");
        jugadores.forEach(j -> System.out.printf("#%d %s - %d goles%n",
                j.getNumeroCamiseta(), j.getNombreJugador(), j.getGolesJugador()));
    }

    public void mostrarFixture(List<Partidos> fixture) {
        System.out.println("\n=== FIXTURE ===");
        fixture.forEach(p -> {
            String marcador = p.isJugado()
                    ? String.format("%d-%d", p.getGolesLocal(), p.getGolesVisitante())
                    : "-";
            System.out.printf("%s\t%s vs %s\t%s (%s)%n",
                    p.getFechaPartido(), p.getEquipoLocal().nombreEquipo,
                    p.getEquipoVisitante().nombreEquipo, marcador,
                    p.getNombreEstadio());
        });
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    /* ---------- ENTRADAS DE RESULTADOS ---------- */

    public int pedirGoles(String equipo) {
        return leerEntero("Goles de " + equipo + ": ");
    }

    /* ---------- UTILIDAD ---------- */

    private int leerEntero(String label) {
        int val;
        while (true) {
            System.out.print(label);
            try {
                val = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
        return val;
    }
}
