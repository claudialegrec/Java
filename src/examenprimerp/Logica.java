package examenprimerp;

import java.util.ArrayList;
import java.util.List;

public class Logica {
    
    public static List<Alumnos> lista = new ArrayList<Alumnos>();

    public static void Agregar(String nom, String ape, String mat, String sexo, String edad, String peso) {

        Alumnos alumnos;
        
        alumnos = new Alumnos(nom, ape, mat, sexo, edad, peso);
        
        lista.add(alumnos);
        
        Interfaz.Crear();
        
    }
}
