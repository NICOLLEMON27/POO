/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial;


import java.util.ArrayList;
import java.util.List;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class Parcial {

    public static void main(String[] args) {

        Gson gson = new Gson();

        LinkedList<Automovil> automoviles = new LinkedList<>();
        LinkedList<Motocicleta> motos = new LinkedList<>();
        Map<String, Boolean> motosEnParqueadero = new HashMap<>();
        Map<String, Boolean> autosEnParqueadero = new HashMap<>();

        Automovil auto = new Automovil(10, 4, "Mazda", "3", "ZYX987");
        automoviles.add(auto);
        autosEnParqueadero.put("ZYX987", true);

        Motocicleta moto = new Motocicleta(6, 600, "Honda", "CBR600", "XYZ789");
        motos.add(moto);
        motosEnParqueadero.put("XYZ789", true);

        get("/motos", (req, res) -> {
            res.type("application/json");
            return gson.toJson(motos);
        });

        get("/automoviles", (req, res) -> {
            res.type("application/json");
            return gson.toJson(automoviles);
        });

        get("/agregarAutomovil/:marca/:modelo/:placa/:numeroPuertas/:horaDeIngreso", (req, res) -> {
            res.type("application/json");
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            float horaDeIngreso= Float.parseFloat(req.params(":horaDeIngreso"));
            int numeroPuertas = Integer.parseInt(req.params(":numeroPuertas"));
            Automovil nuevoAuto = new Automovil(horaDeIngreso, numeroPuertas, marca, modelo, placa);
            automoviles.add(nuevoAuto);
            autosEnParqueadero.put(placa, true);
            return gson.toJson(nuevoAuto);
        });

        get("/agregarMotos/:marca/:modelo/:placa/:cilindrada/:horaDeIngreso", (req, res) -> {
            res.type("application/json");
            String marca = req.params(":marca");
            String modelo = req.params(":modelo");
            String placa = req.params(":placa");
            float horaDeIngreso= Float.parseFloat(req.params(":horaDeIngreso"));
            int cilindrada = Integer.parseInt(req.params(":cilindrada"));
            Motocicleta nuevaMoto = new Motocicleta(horaDeIngreso, cilindrada, marca, modelo, placa);
            motos.add(nuevaMoto);
            motosEnParqueadero.put(placa, true);
            return gson.toJson(nuevaMoto);
        });

       get("/automoviles/:placa/:salida", (req, res) -> {
        res.type("application/json");
        String placa = req.params(":placa");
        
        String horaDeSalidaStr = req.params(":salida");

    try {
        // Convertir la cadena a float
        float horaDeSalida = Float.parseFloat(horaDeSalidaStr);

        for (Automovil auto2 : automoviles) {
            if (auto2.getPlaca().equals(placa)) {
                // Establecer la hora de salida como float
               auto2.setHoraDeSalida(horaDeSalida);
                
                // Marcar el automóvil como fuera del parqueadero
                autosEnParqueadero.put(placa, false);

                return "Hora de salida registrada para el automóvil con placa: " + placa;
            }
        }
    } catch (NumberFormatException e) {
        // Manejar la excepción si la conversión a float falla
        return "Error al convertir la hora de salida a un número decimal.";
    }

    return "No se encontró ningún automóvil con la placa: " + placa;
});
   
       get("/motos/:placa/:salida", (req, res) -> {
        res.type("application/json");
        String placa = req.params(":placa");
        
        String horaDeSalidaStr = req.params(":salida");

    try {
        // Convertir la cadena a float
        float horaDeSalida = Float.parseFloat(horaDeSalidaStr);

        for (Motocicleta moto2 : motos) {
            if (moto2.getPlaca().equals(placa)) {
                // Establecer la hora de salida como float
                moto2.setHoraDeSalida(horaDeSalida);
                
                // Marcar el automóvil como fuera del parqueadero
                motosEnParqueadero.put(placa, false);

                return "Hora de salida registrada para la moto con placa: " + placa;
            }
        }
    } catch (NumberFormatException e) {
        // Manejar la excepción si la conversión a float falla
        return "Error al convertir la hora de salida a un número decimal.";
    }

    return "No se encontró ningúna moto con la placa: " + placa;
});

     get("/motosActuales", (req, res) -> {
    res.type("application/json");
    List<Motocicleta> motosActuales = new ArrayList<>();

    for (Motocicleta moto1 : motos) {
        if (motosEnParqueadero.getOrDefault(moto1.getPlaca(), false)) {
            motosActuales.add(moto1);
        }
    }

    return gson.toJson(motosActuales);
});

get("/automovilesActuales", (req, res) -> {
    res.type("application/json");
    List<Automovil> autosActuales = new ArrayList<>();

    for (Automovil auto1 : automoviles) {
        if (autosEnParqueadero.getOrDefault(auto1.getPlaca(), false)) {
            autosActuales.add(auto1);
        }
    }

    return gson.toJson(autosActuales);
});

get("/motosReporte", (req, res) -> {
    res.type("application/json");

    Map<String, Double> gananciasMotos = new HashMap<>();

    for (Motocicleta moto1 : motos) {
        if (!motosEnParqueadero.getOrDefault(moto1.getPlaca(), false)) {
            double ganancia = moto1.calcularGanaciaMoto(moto1.getHoraDeSalida(), moto1.getHoraDeIngreso());
            gananciasMotos.put(moto1.getPlaca(), ganancia);
        }
    }

    return gson.toJson(gananciasMotos);
});

// Reporte de ganancias para automoviles
get("/reporteGananciasAutomoviles", (req, res) -> {
    res.type("application/json");

    Map<String, Double> gananciasAutomoviles = new HashMap<>();

    for (Automovil auto1 : automoviles) {
        if (!autosEnParqueadero.getOrDefault(auto1.getPlaca(), false)) {
            double ganancia = auto1.calcularGanaciaAuto(auto1.getHoraDeSalida(), auto1.getHoraDeIngreso());
            gananciasAutomoviles.put(auto1.getPlaca(), ganancia);
        }
    }

    return gson.toJson(gananciasAutomoviles);
});



    }
    
   
    
    
    
}
