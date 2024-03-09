package co.edu.uniquindio.programacioncompetitiva;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Proyecto{
    private String nombre;
    private List<String> listaPaquetes;

    public Proyecto(String nombre, List<String> listaPaquetes) {
        this.nombre = nombre;
        this.listaPaquetes = new ArrayList<>();
    }
    
    public static String[] identificadorSlash(String ruta){
        String[] cadenaFiltrada = ruta.split("/");
        return cadenaFiltrada;
    }
}
