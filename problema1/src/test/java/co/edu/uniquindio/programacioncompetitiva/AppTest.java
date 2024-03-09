package co.edu.uniquindio.programacioncompetitiva;

import java.util.Scanner;

public class AppTest{
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        String ruta;
        
        System.out.println("Ingresar la ubicación: ");
        ruta = sc.nextLine();
        
        String[] cadenaSeparada = Proyecto.identificadorSlash(ruta);
        System.out.println(cadenaSeparada[0]);
/**
        public static void recorrrerListaPaquetes(){
            
            var paquetePadre = null;
            for(int i = 1; i <= cadenaSeparada.length(); i++){
                if(paquetePadre == null){
                    paquetePadre = cadenaSeparada[i];
                }
                else{
                    
                }
            }
        }*/
    }
}
//ghgfa/asdfsdf/fdsf