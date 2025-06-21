/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// -----------------------  ControladorTPI.java  -----------------------
package controlador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelo.Equipos;
import modelo.Jugadores;
import modelo.Partidos;
import vista.VistaTPI;

/**
 * Controlador principal del campeonato mundial.
 * Gestiona ciclo de vida, carga de datos, fixture y resultados.
 */
public class ControladorTPI {

    /* ===== ESTADO ==== */
    private final VistaTPI vista;
    private final List<Equipos> equipos = new ArrayList<>();
    private final List<Partidos> fixture = new ArrayList<>();

    /* ===== CONSTRUCTOR ==== */
    public ControladorTPI(VistaTPI vista) {
        this.vista = vista;
    }

    /* ===== BUCLE PRINCIPAL ==== */
    public void iniciar() {
        cargarArchivos();           // ← carga inicial de datos
        boolean salir = false;

        while (!salir) {
            switch (vista.menuPrincipal()) {
                case 1 -> generarFixture();   // iniciar campeonato
                case 2 -> verEquipos();
                case 3 -> vista.mostrarFixture(fixture);
                case 4 -> jugarUnPartido();
                case 5 -> vista.mostrarFixture(
                                fixture.stream().filter(Partidos::isJugado).toList());
                case 0 -> salir = true;
                default -> vista.mostrarMensaje("Opción inválida");
            }
        }
        vista.mostrarMensaje("¡Hasta luego!");
    }

    /* ===== CARGA DE ARCHIVOS ==== */
    private void cargarArchivos() {
        // -- Equipos --
        try (BufferedReader br = new BufferedReader(new FileReader("data/equipos.csv"))) {
            br.lines().skip(1) // omite cabecera
              .forEach(line -> {
                  String[] p = line.split(",");
                  Equipos e = new Equipos() {};         // clase anónima para instancia
                  e.nombreEquipo = p[0];
                  equipos.add(e);
              });
        } catch (Exception ex) {
            vista.mostrarMensaje("No se encontró data/equipos.csv. Se crearán equipos demo.");
            Collections.addAll(equipos,
                    crearEquipoDemo("Alemania"), crearEquipoDemo("Brasil"),
                    crearEquipoDemo("Argentina"), crearEquipoDemo("Francia"));
        }

        // -- Resto de archivos (estadios, jugadores, etc.) se cargan de forma similar --
    }

    private Equipos crearEquipoDemo(String nombre) {
        Equipos e = new Equipos(){};
        e.nombreEquipo = nombre;
        return e;
    }

    /* ===== FIXTURE ==== */
    private void generarFixture() {
        fixture.clear();
        if (equipos.size() < 2) {
            vista.mostrarMensaje("Se necesitan al menos dos equipos.");
            return;
        }
        for (int i = 0; i < equipos.size() - 1; i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Partidos p = new Partidos();
                p.setEquipoLocal(equipos.get(i));
                p.setEquipoVisitante(equipos.get(j));
                p.setFechaPartido("Fase de grupos");
                p.setNombreEstadio("Estadio Central");
                fixture.add(p);
            }
        }
        vista.mostrarMensaje("Fixture generado con " + fixture.size() + " partidos.");
    }

    /* ===== VER EQUIPOS/JUGADORES ==== */
    private void verEquipos() {
        int opc = vista.menuSeleccionarEquipo(equipos);
        if (opc <= 0 || opc > equipos.size()) return;
        Equipos seleccionado = equipos.get(opc - 1);
        if (seleccionado instanceof Jugadores jugador) {
            // Un 'Equipo' jugador no tendría plantel, se salta
            vista.mostrarMensaje("El objeto seleccionado es un jugador, no un equipo.");
            return;
        }
        vista.mostrarJugadores(seleccionado.getPlantel());
    }

    /* ===== JUGAR PARTIDO ==== */
    private void jugarUnPartido() {
        List<Partidos> pendientes = fixture.stream()
                                           .filter(p -> !p.isJugado())
                                           .toList();
        if (pendientes.isEmpty()) {
            vista.mostrarMensaje("No hay partidos pendientes.");
            return;
        }
        int idx = vista.menuSeleccionarPartido(pendientes);
        if (idx <= 0 || idx > pendientes.size()) return;

        Partidos partido = pendientes.get(idx - 1);
        int golesLocal  = vista.pedirGoles(partido.getEquipoLocal().nombreEquipo);
        int golesVisit  = vista.pedirGoles(partido.getEquipoVisitante().nombreEquipo);

        partido.setGolesLocal(golesLocal);
        partido.setGolesVisitante(golesVisit);
        partido.setJugado(true);

        vista.mostrarMensaje(
                "Resultado guardado: " + partido.getEquipoLocal().nombreEquipo
                + " " + golesLocal + "-" + golesVisit + " "
                + partido.getEquipoVisitante().nombreEquipo);
    }
}
