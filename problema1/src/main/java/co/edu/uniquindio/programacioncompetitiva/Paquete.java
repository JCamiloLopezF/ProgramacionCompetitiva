package co.edu.uniquindio.programacioncompetitiva;

import java.util.List;

public class Paquete {
    private String nombre;
    private List<String> paquetesHijos;
    
    public Paquete(String nombre, List<String> paquetesHijos) {
        this.nombre = nombre;
        this.paquetesHijos = paquetesHijos;
    }
}
